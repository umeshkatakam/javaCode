
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailSender {

	public static void main(String[] args) {
		final String username = "umeshkatakam7@gmail.com";
		final String password = "nmji bmol izcx pejy";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("umeshkatakam7@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("umeshkatakam7@gmail.com"));
			message.setSubject("Subject of the Email");
			message.setText("This is the content of the email.");

			Transport.send(message);

			System.out.println("Email sent successfully.");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
