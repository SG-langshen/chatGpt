package com.example.jankuohao.controller;

import com.unfbx.chatgpt.OpenAiStreamClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author  langshen
 * @date 2023-03-01
 */
@Controller
@Slf4j
public class ChatController {

    private final OpenAiStreamClient openAiStreamClient;

    public ChatController(OpenAiStreamClient openAiStreamClient) {
        this.openAiStreamClient = openAiStreamClient;
    }
    @GetMapping("/")
    public String websocket() {
        return "miniPetChat.html";
    }

}
