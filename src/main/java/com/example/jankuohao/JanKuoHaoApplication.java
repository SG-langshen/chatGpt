package com.example.jankuohao;

import com.unfbx.chatgpt.OpenAiStreamClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class JanKuoHaoApplication {
    @Value("${chatgpt.apiKey}")
    private String apiKey;
    @Value("${chatgpt.apiHost}")
    private String apiHost;
    public static void main(String[] args) {
        SpringApplication.run(JanKuoHaoApplication.class, args);
    }

    @Bean
    public OpenAiStreamClient openAiStreamClient() {
        return OpenAiStreamClient.builder().apiHost(apiHost).apiKey(Arrays.asList(apiKey.split(","))).build();
    }

}
