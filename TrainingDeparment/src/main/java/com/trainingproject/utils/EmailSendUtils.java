package com.trainingproject.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSendUtils {

	public void SendEmail(String to, String course) {

		String[] coursearray = course.split("\\(");
		String coureName = coursearray[0];
		String info = coursearray[coursearray.length - 1].split("\\)")[0];
		String schduleTime = "9.00 Am to 11.00 Am";

		if (info.equalsIgnoreCase("evening"))
			schduleTime = "6.00 Pm to 9.00Pm";

		final String username = "yellminnaing5@gmail.com";
		final String password = "nmzzficypwemygxw"; // app code copy and past here

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); // TLS
		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("yellminnaing5@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Information About the Registered Session ");
			message.setText("Hello , This is the Training Department. Thank You for Registering to Attend Course  "
					+ "\n Your Select Course : " + coureName + "\n Since You Choose to Attend " + info + " session"
					+ "\n Your Schedule is from " + schduleTime + " in the " + info);

			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();

		}
	}
}