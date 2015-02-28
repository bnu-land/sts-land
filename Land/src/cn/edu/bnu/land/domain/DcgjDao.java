package cn.edu.bnu.land.domain;

// Generated 2015-1-26 20:20:05 by Hibernate Tools 3.4.0.CR1

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.edu.bnu.common.dao.impl.BaseDaoHibernate4;

/**
 * Home object for domain model class Dcgj.
 * @see cn.edu.bnu.land.domain.Dcgj
 * @author Hibernate Tools
 */

public class DcgjDao extends BaseDaoHibernate4<DcgjId>{

	public List<DcgjId> getUsers(){
		return findAll(DcgjId.class);
	//	return find("select * from users");
	}
  //获取各行政区划名称，返回结果为json格式
  public List<HashMap<String, Object>> handler(Date start,Date end){
	  
	  String hql = " select new map(id.gjid as guijihao,id.rwid as renwuhao,"
	  		+ "id.sj as time) from Dcgj"; 
	  Session session=getSession();
        Query query = session.createQuery(hql);   
        List<HashMap<String, Object>> list = query.list();  
        for (HashMap<String, Object> hashMap : list) {
        	Date currentTime=(Date) hashMap.get("time");
        	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	   String dateString = formatter.format(currentTime);
        	   hashMap.put("time", dateString);
        	   }
	  
	  return list;
  }
}
