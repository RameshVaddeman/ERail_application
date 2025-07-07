package in.ashokit.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    // Method to send email
    public void sendEmail(String to, String subject, String text) {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setFrom();  // Sender's email
            helper.setTo(to);  // Recipient's email
            helper.setSubject(subject);  // Email subject
            helper.setText(text);  // Email body content

            emailSender.send(message);  // Send email

            System.out.println("Email sent successfully!");

        } catch (MessagingException | MailException e) {
            e.printStackTrace();
            System.out.println("Failed to send email.");
        }
    }
}
