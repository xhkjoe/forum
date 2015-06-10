package com.forum.comment;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class AllCharacterSetFilter implements Filter {
	private FilterConfig filterConfig;
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		String encoding = filterConfig.getInitParameter("encoding");
		if(encoding==null)
			encoding = "UTF-8";
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		request.setCharacterEncoding(encoding);//POST����ʽ����������
		response.setCharacterEncoding(encoding);
		response.setContentType("text/html;charset="+encoding);//�������ʱľ������
		
		
		MyHttpServletRequest1 mrequest = new MyHttpServletRequest1(request);
		
		chain.doFilter(mrequest, response);
	}

	public void destroy() {

	}

}
class MyHttpServletRequest1 extends HttpServletRequestWrapper{
	
	public MyHttpServletRequest1(HttpServletRequest request){
		super(request);
	}
	//��дgetParameter����

	public String getParameter(String name) {
		String value = super.getParameter(name);
		if(value==null)
			return null;
		//�ж��Ƿ���get����ʽ������ǣ��ֹ�����
		if("get".equalsIgnoreCase(super.getMethod())){//���get��ʽ���ֹ�����
			try {
				value = new String(value.getBytes("ISO-8859-1"),super.getCharacterEncoding());
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	
}
