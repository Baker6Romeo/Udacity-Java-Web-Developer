package baker6romeo.udacity.jwdnd.c1.review.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private String message;

    MessageService(String message){
        this.message = message;
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    public void postConstruct() {
        System.out.println("Creating Message Service Bean");
    }
}
