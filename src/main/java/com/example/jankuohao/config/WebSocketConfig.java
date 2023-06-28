package com.example.jankuohao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


/**
 * 描述：用于扫描带有@ServerEndpoint的注解成为websocket
 *
 * @author langshen
 * @since 2023-03-23
 */
@Configuration
public class WebSocketConfig {
    /**
     * 这个bean的注册,用于扫描带有@ServerEndpoint的注解成为websocket
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
