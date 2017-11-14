package com.TeRe.Utils;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.mail.HtmlEmail;

public class BaseUtils {

	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String enCode(String password) {
		return DigestUtils.sha1Hex(password);
	}

	
}
