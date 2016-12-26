package com.sunshine.config;

/**
 * ֧�������ò��� ���õ���ģʽ����
 */
public  class ApayConfig {
	private static ApayConfig apay;

	// �����ⲿ��ʼ������
	private ApayConfig() {
		apay = this;
	}
	/**
	 * ��ȡ��ǰ����
	 * @return
	 */
	public static ApayConfig newApayConfig() {
		return apay;
	}
	// ���������ID����2088��ͷ��16λ��������ɵ��ַ���
	public  static String partner;
	// �̻���˽Կ
	public  static String private_key; 
	// ֧�����Ĺ�Կ�������޸ĸ�ֵ
	public  static String ali_public_key;
	// �����ã�����TXT��־�ļ���·��
	public  static  String log_path = "D:\\";
	// �ַ������ʽ Ŀǰ֧�� gbk �� utf-8
	public static String input_charset = "utf-8";
	// ǩ����ʽ �����޸�
	public  static String sign_type = "RSA";

	public static String getPartner() {
		return partner;
	}
	public static void setPartner(String partner) {
		ApayConfig.partner = partner;
	}

	public static String getPrivate_key() {
		return private_key;
	}

	public static void setPrivate_key(String private_key) {
		ApayConfig.private_key = private_key;
	}

	public static String getAli_public_key() {
		return ali_public_key;
	}

	public static void setAli_public_key(String ali_public_key) {
		ApayConfig.ali_public_key = ali_public_key;
	}

	public static String getLog_path() {
		return log_path;
	}

	public static void setLog_path(String log_path) {
		ApayConfig.log_path = log_path;
	}
	public static String getSign_type() {
		return sign_type;
	}

	public static void setSign_type(String sign_type) {
		ApayConfig.sign_type = sign_type;
	}

	public static String getInput_charset() {
		return input_charset;
	}

	public static void setInput_charset(String input_charset) {
		ApayConfig.input_charset = input_charset;
	}
}