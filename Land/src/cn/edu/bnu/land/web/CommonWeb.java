package cn.edu.bnu.land.web;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Controller
public class CommonWeb {
	
	ComboPooledDataSource datasource;
	
	Connection conn=null;
	Statement sts=null;
	ResultSet rs=null;

	/**
	 * 返回执法单位列表
	 * @return
	 * @throws IOException
	 */
	@Autowired
	public CommonWeb(ComboPooledDataSource datasource){
		this.datasource=datasource;
	}
	
	@RequestMapping(value="/getZfdw")
	@ResponseBody
	public List<HashMap<String,Object>>handle3() throws IOException{
		//ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		//	ApplicationContext ctx=ApplicationContext.;
		// = (ComboPooledDataSource) ctx.getBean("dataSource"); 

		List<HashMap<String,Object>> list =new ArrayList<HashMap<String,Object>>();
		try {
			conn = datasource.getConnection();
			sts=conn.createStatement();
			rs=sts.executeQuery("select * from ZFDW");
			  while(rs.next()){
				    HashMap<String,Object> map=new HashMap<String,Object>();
				    map.put("name", rs.getString("zfdwmc"));
				    map.put("dm", rs.getString("zfdwdm"));
				    list.add(map);
				    //list.add(rs);
				    }
			    rs.close();
			    sts.close();
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
    }
	
	@RequestMapping(value="/getZfry")
	@ResponseBody
	//public List<HashMap<String,Object>>handle4(@RequestParam("dm") String dm) throws IOException{
    public List<HashMap<String,Object>>handle4() throws IOException{
		//ApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
		//	ApplicationContext ctx=ApplicationContext.;
		// = (ComboPooledDataSource) ctx.getBean("dataSource"); 

		List<HashMap<String,Object>> list =new ArrayList<HashMap<String,Object>>();
		try {
			conn = datasource.getConnection();
			sts=conn.createStatement();
			rs=sts.executeQuery("select zfryxm from ZFRY");
			//rs=sts.executeQuery("select zfryxm from ZFRY where zhdwdm="+dm);
			  while(rs.next()){
				    HashMap<String,Object> map=new HashMap<String,Object>();
				    map.put("name", rs.getString("zfryxm"));
				    list.add(map);
				    //list.add(rs);
				    }
			    rs.close();
			    sts.close();
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
    }
			
}





