package com.mailsender.app.controller;

import com.mailsender.app.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RegistrationController {

  @Autowired
  private NotificationService notificationService;

  /**
   * http://localhost:8082/email
   *
   * @return String
   */
  @GetMapping("/email")
  public String success() {
    try {
      notificationService.sendNotification();
      return "email success!";
    } catch (MailException ex) {
      System.out.println("Mail cannot be able to send!");
      System.out.println("ERROR: " + ex);
      return "failure";
    }
  }

}