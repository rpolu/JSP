package com.elegant;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class AuthenticateUser extends TagSupport {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int doEndTag() throws JspException {

		System.out.println(username);

		String username = pageContext.getRequest().getParameter("username");

		String password = pageContext.getRequest().getParameter("password");

		if (username.equals(password))
			try {
				pageContext.getOut().println("Logged In");
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			try {
				pageContext.getOut().println("Not a valid User");
			} catch (IOException e) {
				e.printStackTrace();
			}

		return Tag.EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		return super.doStartTag();
	}

}