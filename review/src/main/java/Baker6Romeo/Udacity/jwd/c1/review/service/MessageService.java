package Baker6Romeo.Udacity.jwd.c1.review;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageService {

    private String message;
    private List<ChatMessage> chatMessages;

    MessageService(String message){
        this.message = message;
    }

    public void addMessage(ChatForm chatForm){
        this.chatMessages.add(chatForm);
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating Message Service Bean");
    }
}
