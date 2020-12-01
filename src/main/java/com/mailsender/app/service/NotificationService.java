package com.mailsender.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

  @Autowired
  private JavaMailSender javaMailSender;

  public void sendNotification() throws MailException {
    SimpleMailMessage mail = new SimpleMailMessage();

    mail.setTo("elvintaghiyev184@gmail.com");
    mail.setFrom("elvintaghiyev184@gmail.com");
    mail.setSubject("Mail with Java-Spring");
    mail.setText("This mail sends via spring boot - java");
    javaMailSender.send(mail);
  }
}