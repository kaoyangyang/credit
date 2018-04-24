package com.ly.credit.util;


public class PushServerConfig {
	/**
	 * 推送服务器配置
	 */
	private static PropertiesLoader propertiesLoader = new PropertiesLoader("classpath:config/config.properties");
    public static final String pushServerIp = propertiesLoader.getProperty("pushServerIp");
}
