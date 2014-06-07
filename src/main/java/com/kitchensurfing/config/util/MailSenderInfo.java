package com.kitchensurfing.config.util;

import java.util.Properties;

/**
 * @author lsj(李三杰)
 * @date 2014/5/24 
 * @classinfo 邮件发送所需的必要信息
 */
public class MailSenderInfo {
	//邮件服务主机地址
	private String mailServerHost;
	//邮件服务端口
	private String mailServerPort = "25";
	//发送地址
	private String fromAddress;
	//接收地址
	private String toAddress;
	
	//mailServer授权用户名
	private String userName;
	//mailServer授权密码
	private String password;
	
	private boolean validate = false;
	//邮件主题
	private String subject;
	//邮件内容
	private String content;
	
	//附件名称
	private String[] attachFileNames;
	
	//激活url地址(用户激活地址)
	private String htmlllink;

	public Properties getProperties() {
		Properties p = new Properties();
		p.put("mail.smtp.host", this.mailServerHost);
		p.put("mail.smtp.port", this.mailServerPort);
		p.put("mail.smtp.auth", validate ? "true" : "false");
		return p;
	}

	public String getHtmlllink() {
		return htmlllink;
	}

	public void setHtmlllink(String htmlllink) {
		this.htmlllink = htmlllink;
	}

	public String getMailServerHost() {
		return mailServerHost;
	}

	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}

	public String getMailServerPort() {
		return mailServerPort;
	}

	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getAttachFileNames() {
		return attachFileNames;
	}

	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}

}
