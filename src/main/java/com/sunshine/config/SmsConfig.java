package com.sunshine.config;

import java.util.Map;

/**
 * ∂Ã–≈≈‰÷√
 */
public class SmsConfig {
	@SuppressWarnings("unused")
	private static SmsConfig sms;

	SmsConfig() {
		sms = this;
	}
	private static Map<String, String> valueMap;

	public static Map<String, String> getValueMap() {
		return valueMap;
	}
	public static void setValueMap(Map<String, String> valueMap) {
		SmsConfig.valueMap = valueMap;
	}
}
