package com.sunshine.config;

/**
 * ΢��֧�����ò���
 */
public class WeiXinConfig {
	private static WeiXinConfig weixin;
	// �����ⲿ��ʼ������
	WeiXinConfig() {
		weixin = this;
	}
	public static WeiXinConfig newWeiXinConfig() {
		return weixin;
	}
	//��Կ
	public static String aap_key;
	//�̻�ID
	public static String app_id;
	public static String getAap_key() {
		return aap_key;
	}
	public static void setAap_key(String aap_key) {
		WeiXinConfig.aap_key = aap_key;
	}
	public static String getApp_id() {
		return app_id;
	}
	public static void setApp_id(String app_id) {
		WeiXinConfig.app_id = app_id;
	}
}
