package com.sun.product.pro;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@MapperScan(basePackages = "com.sun.product.pro.db.mapper")
@EnableScheduling
public class ProApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(httpRequestFactory());
    }


    @Bean
    public ClientHttpRequestFactory httpRequestFactory() {

        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", SSLConnectionSocketFactory.getSocketFactory())
                .build();
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(registry);
        //设置整个连接池最大连接数
        connectionManager.setMaxTotal(12000);

        //路由是对maxTotal的细分
        connectionManager.setDefaultMaxPerRoute(500);
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(40000)  //返回数据的超时时间
                .setConnectTimeout(40000) //连接上服务器的超时时间
                .setConnectionRequestTimeout(2000) //从连接池中获取连接的超时时间
                .build();

        CloseableHttpClient client = HttpClientBuilder
                .create()
                .setDefaultRequestConfig(requestConfig)
                .setConnectionManager(connectionManager)
                .build();

        return new HttpComponentsClientHttpRequestFactory(client);
    }


    @Bean
    public CloseableHttpClient httpClient(){
        int timeout = 5;
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000)
                .setSocketTimeout(timeout * 1000).build();
        CloseableHttpClient client = HttpClientBuilder.create()
                .setMaxConnPerRoute(10000)
                .setMaxConnTotal(50000)
                .setConnectionTimeToLive(30L, TimeUnit.SECONDS)
                .setDefaultRequestConfig(config).build();
        return client;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProApplication.class, args);
    }

}
