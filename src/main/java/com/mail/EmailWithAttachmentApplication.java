package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.mail.service.EmailService;

@SpringBootApplication
public class EmailWithAttachmentApplication {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailWithAttachmentApplication.class, args);
		System.out.println("End...");
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() {
		emailService.sendMailWithAttachment("mohdhasim0074@gmail.com", "This is body", "This is subject",
				"J:\\Spring with All modules\\sts-projects\\email-with-attachment\\src\\main\\java\\com\\mail\\git.png");
	}
}
