import org.apache.commons.lang.RandomStringUtils;

import com.sunshine.util.MD5Util;

public class test {
	//����������
	public static String getRandomChar(){
		String randChar = "";
		for (int i = 0; i < 6; i++) {
			int index = (int) Math.round(Math.random() * 1);
			switch (index) {
			case 0:// ��д�ַ�
				randChar += String
						.valueOf((char) Math.round(Math.random() * 25 + 65));
				break;
			default:// ����
				randChar += String.valueOf(Math.round(Math.random() * 9));
				break;
			}
		}
		return randChar;
	}
	//����
	public static void main(String[] args) {
		//md5����
		String password="123456";
		System.out.println(MD5Util.encode(password));
		//����6λ��
		System.out.println(getRandomChar());
		//���������(6)
		String code=RandomStringUtils.randomNumeric(6);
		System.out.println(code);
	}
}
