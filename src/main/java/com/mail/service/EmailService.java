package com.mail.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service

public class EmailService {
//	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMailWithAttachment(String toEmail, String body, String subject, String attachment) {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setFrom("myjio0189@gmail.com");
			messageHelper.setTo(toEmail);
			messageHelper.setText(body);
			messageHelper.setSubject(subject);

//			for attachment

			FileSystemResource systemResource = new FileSystemResource(new File(attachment));
			messageHelper.addAttachment(systemResource.getFilename(), systemResource);
			javaMailSender.send(mimeMessage);
			System.out.println("message sent successfully...");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
