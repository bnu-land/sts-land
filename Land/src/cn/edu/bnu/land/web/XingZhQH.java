package cn.edu.bnu.land.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.edu.bnu.land.domain.DcgjDao;
import cn.edu.bnu.land.domain.XzqhDao;

@Controller
public class XingZhQH {
	
	XzqhDao xzqhDao;
	DcgjDao dcgjDao;
	@Autowired
	public XingZhQH(XzqhDao xzqhDao,DcgjDao dcgjDao) {
		this.xzqhDao=xzqhDao;
		this.dcgjDao=dcgjDao;
	}

	@RequestMapping(value = "/getQH")
	@ResponseBody
	public List<HashMap<String, Object>> confirm() throws IOException{
	
		ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		
		
		long startTime = System.currentTimeMillis(); 
		List<HashMap<String, Object>> map =(List<HashMap<String, Object>>) xzqhDao.getQh();
		
		long endTime = System.currentTimeMillis();  
		System.out.println("用时："+(endTime-startTime));
		
		
		return map;

	}
	@RequestMapping(value = "/getGuiJi")
	@ResponseBody
//	public HashMap<String, Object> handle(@RequestParam("startTime") Date start,
//			@RequestParam("endTime") Date end) throws IOException {
	public HashMap<String, Object> handle() throws IOException {	
		 
		Date start=new Date();
		Date end=new Date();
		HashMap<String, Object> map=new HashMap<String,Object>();
		map.put("success", true);
		map.put("info", dcgjDao.handler(start, end));

		return map;
		//return "{success:true,info:'修改个人客户 - 日常收入信息成功!'}";
	}
	@RequestMapping(value="/getQhArray")
	@ResponseBody
	public List<HashMap<String,Object>> handle2() throws IOException{
		
		return xzqhDao.getQhArray();
	}
	
	
	
}




