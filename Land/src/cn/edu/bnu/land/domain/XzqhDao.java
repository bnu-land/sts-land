package cn.edu.bnu.land.domain;

// Generated 2015-1-24 15:18:31 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.edu.bnu.common.dao.impl.BaseDaoHibernate4;

/**
 * Home object for domain model class Xzqh.返回行政区划数据，定义两个方法，返回数据分别是treeJson，和arrayJson
 * @see cn.edu.bnu.land.domain.Xzqh
 * @author Hibernate Tools
 */
public class XzqhDao extends BaseDaoHibernate4<Xzqh> {

	  public List<Xzqh> getUsers(){
			return findAll(Xzqh.class);
		//	return find("select * from users");
		}
	  //获取各行政区划名称，返回结果为json格式
	  /**
	   * 返回treeStore所需格式的json
	   * @return
	   */
	  public List<HashMap<String, Object>> getQh(){
		  
		 
		  String hql = " select new map(xzqm as mc,qhdm as dm) from Xzqh"; 
		  Session session=getSession();
	        Query query = session.createQuery(hql);   
	        //默认查询出来的list里存放的是一个Object数组，但是在这里list里存放的不再是默认的Object数组了，而是List集合了   
			HashMap<String, Object> rootMap=new HashMap<String, Object>();
			rootMap.put("expanded", true);
	        List<Map> list = query.list();   

			//各市list
			List<HashMap<String, Object>> cityList=new ArrayList<HashMap<String, Object>>();
			//各区
			List<HashMap<String, Object>> areaList=new ArrayList<HashMap<String, Object>>();
			//各乡镇
			List<HashMap<String, Object>> townList=new ArrayList<HashMap<String, Object>>();
			//各村
			List<HashMap<String, Object>> villageList=new ArrayList<HashMap<String, Object>>();		
			
			HashMap<String, Object> temCityMap=null;
			HashMap<String, Object> temAreaMap=null;
			HashMap<String, Object> temTownMap=null;
			HashMap<String, Object> temVillageMap=null;
			
			
	        for(Map recorde : list){   
	            String name = (String) recorde.get("mc");   
	            String dm = (String) recorde.get("dm");
	            
	            switch(dm.length()){
	            case 4://市
	            	if (temCityMap!=null) {
	            		
//	            		temAreaMap.put("children", townList);
//		            	areaList.add(temAreaMap);
//						townList=null;
	            		
		            	temCityMap.put("children",areaList);
		            	areaList=new ArrayList<HashMap<String, Object>>();
					}
	            	temCityMap=new HashMap<String, Object>();
	            	temCityMap.put("text",name);
	            	temCityMap.put("dm", dm);
	            	temCityMap.put("expanded", false);
	            	cityList.add(temCityMap);
	            	break;
	            case 6://区
	            	if (temAreaMap!=null) {
						temAreaMap.put("children", townList);
						townList=new ArrayList<HashMap<String, Object>>();
					}
	            	temAreaMap=new HashMap<String, Object>();
	            	temAreaMap.put("text", name);
	            	temAreaMap.put("dm", dm);
	            	areaList.add(temAreaMap);
	                break;
	            case  9://乡镇
	            	if (temTownMap!=null) {
	            		temTownMap.put("children", villageList);
	            		villageList=new ArrayList<HashMap<String, Object>>();
						
					}
	            	temTownMap=new HashMap<String, Object>();
	            	temTownMap.put("text", name);
	            	temTownMap.put("dm", dm);
	            	townList.add(temTownMap);
	                break;
	             default://村
	            	 temVillageMap=new HashMap<String, Object>();
	            	 temVillageMap.put("text", name);
	            	 temVillageMap.put("leaf", true);
	            	 temVillageMap.put("dm", dm);
	            	 villageList.add(temVillageMap);
	                break;
	            }
	            
	           System.out.println(name + " : " + dm);   
	        } 
	        
	        temTownMap.put("children", villageList);
	        temAreaMap.put("children",townList);
        	temCityMap.put("children",areaList);
        	
	        rootMap.put("children", cityList);	 	  
		return cityList;
		  
		  
		  
	  }
	  /**
	   * 行政区划返回arryStore所需要的json
	   * @return
	   */
	   public List<HashMap<String, Object>> getQhArray(){
		  String hql = " select new map(xzqm as mc,qhdm as dm) from Xzqh"; 
		  Session session=getSession();
	        Query query = session.createQuery(hql);   
	        //默认查询出来的list里存放的是一个Object数组，但是在这里list里存放的不再是默认的Object数组了，而是List集合了   
	        List<HashMap<String, Object>> list = query.list();   
			List<HashMap<String, Object>> areaList=new ArrayList<HashMap<String, Object>>();
			HashMap<String, Object> temMap;
	        for(HashMap<String, Object> recorde : list){   
	            String name = (String) recorde.get("mc");   
	            String dm = (String) recorde.get("dm");
	            
	            switch(dm.length()){
	           case 4://市
	            	temMap=new HashMap<String, Object>();
	            	temMap.put("name",name);
	            	temMap.put("dm",dm);
                    areaList.add(temMap);
	            	break;
	            case 6://区
	            	temMap=new HashMap<String, Object>();
	            	temMap.put("name",name);
	            	temMap.put("dm",dm);
                    areaList.add(temMap);
	                break;	       
	             default://村
	                break;
	            }
	           System.out.println(name + " : " + dm);   
	        }      	 	  
		return areaList;
	  }

}
