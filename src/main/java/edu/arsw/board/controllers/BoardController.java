package edu.arsw.board.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "http://localhost:5173")
public class BoardController {

    @MessageMapping("/draw")
    @SendTo("/topic/board")
    public String broadcastDraw(String message) {
        return message;
    }
}