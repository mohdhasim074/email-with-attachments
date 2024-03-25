package com.mail.entity;

public class Email {

	private String toEmail;
	private String body;
	private String subject;
	private String attachment;
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
//	
	@Override
	public String toString() {
		return "Email [toEmail=" + toEmail + ", body=" + body + ", subject=" + subject + ", attachment=" + attachment
				+ "]";
	}
	
}
