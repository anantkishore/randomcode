package com.kishore.anant.arm;

import java.util.ArrayList;
import java.util.List;

public class TimesaverLSF {

    public static void main(String[] args) {
        sendEmail("", new ArrayList<String>(), "", "");
    }

    public static void sendEmail(String senderAddress, List<String> recipients, String subject, String msg) {

        /*Properties prop = new Properties();
        prop.put("mail.smtp.host", "nahpc-smtp0.nahpc.arm.com");

        Session session = Session.getInstance(prop);

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderAddress));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse("anant.kishore@arm.com"));
        message.setSubject("Mail Subject");

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);*/

    }
}
