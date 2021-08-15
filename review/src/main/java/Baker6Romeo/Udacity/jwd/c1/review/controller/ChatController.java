package Baker6Romeo.Udacity.jwd.c1.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/chat")


    @PostMapping("/chat")
    public void  addMessage(@ModelAttribute("chatForm") ChatForm chatForm){
        messageService.addMessage(chatForm);
    }
}
