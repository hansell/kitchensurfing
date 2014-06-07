package com.kitchensurfing.config.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 邮件发送帮助类
 * 
 * @author lsj(李三杰)
 * 
 */
public class SendMailUtil {

	// 向用户发送激活邮件(目前主要通过126邮箱)
	public static String sendRegisterToUser(HttpServletRequest req) {

		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.126.com");
		mailInfo.setValidate(true);
		mailInfo.setUserName("javapolo@126.com");
		mailInfo.setPassword("543jjj");
		mailInfo.setFromAddress("javapolo@126.com");
		// mailInfo.setToAddress("919183005@qq.com");
		mailInfo.setToAddress("376474510@qq.com");
		mailInfo.setSubject("KitchenSurfing用户注册");
		// 设置激活的url
		String link = constractUrl(req);
		mailInfo.setHtmlllink(link);
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendHtmlMail(mailInfo);

		return link;
	}

	/**
	 * 构建url
	 * 
	 * @param req
	 * @return
	 */
	public static String constractUrl(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		StringBuffer sb = new StringBuffer();
		sb.append(username + "&");
		sb.append(password + "&");
		sb.append(email + "&");
		sb.append(System.currentTimeMillis());
		String key = com.sun.org.apache.xml.internal.security.utils.Base64
				.encode(sb.toString().getBytes());
		SystemCache.addKey(key);
		String link = "www.cKitchenSurfing.com/KitchenSurfing/usercontrol/activeuser.do?key="
				+ key;
		return link;

	}

}
