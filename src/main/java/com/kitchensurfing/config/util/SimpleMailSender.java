package com.kitchensurfing.config.util;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 提供邮件发送的两种方式
 * 
 * @author lsj(李三杰)
 * 
 */
public class SimpleMailSender {
	/**
	 * 发送文本邮件
	 * 
	 * @param mailInfo
	 * @return
	 */
	public boolean sendTextMail(MailSenderInfo mailInfo) {
		AdminAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			authenticator = new AdminAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		Session sendMailSession = Session
				.getDefaultInstance(pro, authenticator);
		try {
			Message mailMessage = new MimeMessage(sendMailSession);
			Address from = new InternetAddress(mailInfo.getFromAddress());
			mailMessage.setFrom(from);
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			mailMessage.setSubject(mailInfo.getSubject());
			mailMessage.setSentDate(new Date());
			String mailContent = mailInfo.getContent();
			mailMessage.setText(mailContent);
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * 发送html邮件
	 * 
	 * @param mailInfo
	 */
	public boolean sendHtmlMail(MailSenderInfo mailInfo) {
		AdminAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			authenticator = new AdminAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		Session sendMailSession = Session
				.getDefaultInstance(pro, authenticator);
		try {
			Message mailMessage = new MimeMessage(sendMailSession);
			Address from = new InternetAddress(mailInfo.getFromAddress());
			mailMessage.setFrom(from);
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			mailMessage.setSubject(mailInfo.getSubject());
			mailMessage.setSentDate(new Date());
			Multipart mainPart = new MimeMultipart();
			BodyPart html = new MimeBodyPart();

			String content = "<h2>亲爱的用户"

					+ ":</h2> "

					+ "<h4>恭喜您成为KitchenSurfing用户！</h4> "

					+ "<p>请点击以下链接激活您绑定的邮箱（链接30分钟内有效）:  "

					+ "<a href="

					+ mailInfo.getHtmlllink()

					+ ">"

					+ mailInfo.getHtmlllink()

					+ "</a>（激活链接)</p><br/>"

					+ "<p>如果点击以上链接没有反应，请将该网址复制并粘贴到新的浏览器窗口中。</p>"

					+ "<p>绑定的邮箱激活后，您即可用绑定的邮箱作为登录账号</p><br/><br/>"

					+ "<p style='font-size: 13px' >（请注意，该电子邮件地址不接受回复邮件，如果您并未发过此请求，则可能是因为其他用户在尝试绑定邮箱时误输入了您的电子邮件地址而使您收到这封邮件，那么您可以放心的忽略此邮件，无需进一步采取任何操作。）</p><br/><br/><br/>"

					+ "<p align='right'>KitchenSurfing管理员</p>"
					+ "<p align='right'>" + new Date() + "</p>";

			// 设置消息体类型
			html.setContent(content, "text/html; charset=utf-8");

			mainPart.addBodyPart(html);

			// 生成html消息部分
			html = new MimeBodyPart();

			mailMessage.setContent(mainPart);
			mailMessage.saveChanges();

			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
