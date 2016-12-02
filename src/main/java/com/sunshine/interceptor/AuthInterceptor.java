package com.sunshine.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.sunshine.util.DateUtil;
import com.sunshine.util.MD5Util;
/**
 * �ӿڰ�ȫ��֤������
 */
public class AuthInterceptor implements HandlerInterceptor {
	@Value("${token}")
	private String token;
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		 
		
		if(!request.getMethod().equalsIgnoreCase("post")){
			return false;
		}
		//�õ�token
		String token=request.getParameter("paramkey"); 
		if(token==null){
			//return false;
			return true;
		}
		//����token�����ж�
		String m_token=MD5Util.GetMD5Code(this.token+DateUtil.getDate("dd"));
		//�Ƚ�
		if(m_token.equalsIgnoreCase(token)){
			return true;
		}
		return true;
	}
}
