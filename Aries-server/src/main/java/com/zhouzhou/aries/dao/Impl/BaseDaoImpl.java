package com.zhouzhou.aries.dao.Impl;

import java.io.Serializable;  
import java.lang.reflect.ParameterizedType;  
import java.util.List;  

import javax.annotation.Resource;  

import org.hibernate.Query;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;

import com.zhouzhou.aries.dao.BaseDao;
  
/** 
 * BaseDaoImpl 定义DAO的通用操作的实现 
 *  
 * @author zhouzhou 
 */  
@SuppressWarnings("unchecked")  
public class BaseDaoImpl<T> implements BaseDao<T> {  
  
    private Class<T> clazz;  
  
    /** 
     * 通过构造方法指定DAO的具体实现类 
     */  
    public BaseDaoImpl() {  
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();  
        clazz = (Class<T>) type.getActualTypeArguments()[0];  
//        System.out.println("DAO的真实实现类是：" + this.clazz.getName());  
    }  
  
    /** 
     * 向DAO层注入SessionFactory 
     */  
    @Resource  
    private SessionFactory sessionFactory;  
  
    /** 
     * 获取当前工作的Session 
     */  
    protected Session getSession() {  
        return this.sessionFactory.getCurrentSession();  
    }  
  
    @Override
    public T save(T entity) {  
        return (T)this.getSession().save(entity);  
    }  
    
    @Override
    public void update(T entity) {  
    	this.getSession().update(entity); 
        this.getSession().flush();
    }  
  
    @Override
    public void delete(Serializable id) {  
        this.getSession().delete(this.findById(id));  
        this.getSession().flush();
    }  
  
    @Override
    public T findById(Serializable id) {  
        return (T) this.getSession().get(this.clazz, id);  
    }  
  
    @Override
    public List<T> findByHQL(String hql, Object... params) {  
        Query query = this.getSession().createQuery(hql);  
        for (int i = 0; params != null && i < params.length; i++) {  
            query.setParameter(i, params);  
        }  
        return query.list();  
    }

	@Override
	public List<T> findByHQL(String hql, int pagesize, int from,
			Object... params) {
		Query query = this.getSession().createQuery(hql);  
        for (int i = 0; params != null && i < params.length; i++) {  
            query.setParameter(i, params);  
        }  
        query.setFirstResult(from); 
		query.setMaxResults(pagesize);
		
		return query.list();
	}  
}  
