package cn.edu.bnu.common.dao.impl;

import org.hibernate.*;

import java.util.List;
import java.io.Serializable;

import cn.edu.bnu.common.dao.*;

/**
 * Description:
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @version 1.0
 */
public class BaseDaoHibernate4<T> implements BaseDao<T>
{
	// DAO组件进行持久化操作底层依赖的SessionFactory组件
	private SessionFactory sessionFactory;
	
	private Session session;
	
	public Session getSession(){
		if (session==null) {
			session=getSessionFactory().openSession();
		}
		return session;
		
	}
	
	// 依赖注入SessionFactory所需的setter方法
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory()
	{
		return this.sessionFactory;
	}
	// 根据ID加载实体
	@SuppressWarnings("unchecked")
	public T get(Class<T> entityClazz , Serializable id)
	{
		 Transaction t = getSession().beginTransaction(); 			
		 T tt=(T)getSession().get(entityClazz , id);
	     t.commit(); 
	     session.close();	
		 return tt;
			
	}
	// 保存实体
	public Serializable save(T entity)
	{
		 Transaction t = getSession().beginTransaction();
		 Serializable serial=getSession().save(entity);
		 t.commit(); 
	     session.close();	
		 return serial;
	}
	// 更新实体
	public void update(T entity)
	{
		Transaction t = getSession().beginTransaction();
		getSession().saveOrUpdate(entity);
		 t.commit(); 
	     session.close();
	}
	// 删除实体
	public void delete(T entity)
	{
		Transaction t = getSession().beginTransaction();
		getSession().delete(entity);
		 t.commit(); 
	     session.close();
	}
	// 根据ID删除实体
	public void delete(Class<T> entityClazz , Serializable id)
	{
		Transaction t = getSession().beginTransaction();
		getSession()
			.createQuery("delete " + entityClazz.getSimpleName()
				+ " en where en.id = ?0")
			.setParameter("0" , id)
			.executeUpdate();
		t.commit(); 
	     session.close();
	}
	// 获取所有实体
	public List<T> findAll(Class<T> entityClazz)
	{
		return find("select en from "
			+ entityClazz.getSimpleName() + " en");
	}
	// 获取实体总数

	public long findCount(Class<T> entityClazz)
	{
		List<?> l = find("select count(*) from "
			+ entityClazz.getSimpleName());
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}

	// 根据HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<T> find(String hql)
	{
		return (List<T>)getSession()
			.createQuery(hql)
			.list();
	}
	// 根据带占位符参数HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<T> find(String hql , Object... params)
	{
		// 创建查询
		Query query = getSession()
			.createQuery(hql);
		// 为包含占位符的HQL语句设置参数
		for(int i = 0 , len = params.length ; i < len ; i++)
		{
			query.setParameter(i + "" , params[i]);
		}
		return (List<T>)query.list();
	}
	/**
	 * 使用hql 语句进行分页查询操作
	 * @param hql 需要查询的hql语句
	 * @param pageNo 查询第pageNo页的记录
	 * @param pageSize 每页需要显示的记录数
	 * @return 当前页的所有记录
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByPage(String hql,
		 int pageNo, int pageSize)
	{
		// 创建查询
		Transaction t = getSession().beginTransaction();
		List<T> tt=getSession()
			.createQuery(hql)
			// 执行分页
			.setFirstResult((pageNo - 1) * pageSize)
			.setMaxResults(pageSize)
			.list();
		 t.commit(); 
	     session.close();
	     return tt;
	}
	/**
	 * 使用hql 语句进行分页查询操作
	 * @param hql 需要查询的hql语句
	 * @param params 如果hql带占位符参数，params用于传入占位符参数
	 * @param pageNo 查询第pageNo页的记录
	 * @param pageSize 每页需要显示的记录数
	 * @return 当前页的所有记录
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByPage(String hql , int pageNo, int pageSize
		, Object... params)
	{
		// 创建查询
		Query query = getSession()
			.createQuery(hql);
		// 为包含占位符的HQL语句设置参数
		for(int i = 0 , len = params.length ; i < len ; i++)
		{
			query.setParameter(i + "" , params[i]);
		}
		// 执行分页，并返回查询结果
		return query.setFirstResult((pageNo - 1) * pageSize)
			.setMaxResults(pageSize)
			.list();
	}
}
