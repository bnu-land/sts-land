

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

//import cn.edu.bnu.land.domain.Xzqh;
import cn.edu.bnu.land.domain.XzqhDao;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@WebServlet(urlPatterns={"/WEB-INF/content/authImg.jsp"})
public class GetUserAction extends HttpServlet
{

	// 重写service方法，生成对客户端的响应
	public void service(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException
		{
		// 设置禁止缓存
		long startTime = System.currentTimeMillis(); 
		
		//ServletContext application = ServletActionContext.getServletContext();
        ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
	//	ApplicationContext ctx=ApplicationContext.;
		XzqhDao user = (XzqhDao) ctx.getBean("xzqh"); 
	//	List<Xzqh> list =user.findAll(cn.edu.bnu.land.domain.Xzqh.class);
		
		long endTime = System.currentTimeMillis();  
		System.out.println("用时："+(endTime-startTime));
		
	// response.getWriter().write(list.toString());
		
		
		
	}
	
}