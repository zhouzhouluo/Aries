package com.zhouzhou.aries.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	public T save(T entity);  
	  
    public void update(T entity);  
  
    public void delete(Serializable id);  
  
    public T findById(Serializable id);  
  
    public List<T> findByHQL(String hql, Object... params);  
    
    public List<T> findByHQL(String hql,int pagesize ,int from, Object... params);
}
