package baker6romeo.udacity.jwdnd.c1.review;

import baker6romeo.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message() {
		System.out.println("Creating message bean");
		return "Hello, Spring";
	}

	@Bean
	public String uppercaseMessage(MessageService aMessageService){
		System.out.println("Bean uppercaseMessage created");
		return aMessageService.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService aMessageService){
		System.out.println("Bean lowercaseMessage created");
		return aMessageService.lowercase();
	}
}
