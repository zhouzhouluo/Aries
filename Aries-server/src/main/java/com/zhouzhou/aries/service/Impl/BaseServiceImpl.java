package com.zhouzhou.aries.service.Impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.zhouzhou.aries.dao.BaseDao;
import com.zhouzhou.aries.service.BaseService;

/**
 * BaseServiceImpl 定义Service的通用操作的实现
 * 
 * @author Monday
 */
@Transactional
public class BaseServiceImpl<T, D extends BaseDao<T>> implements BaseService<T> {
	
	/**
	 * 注入BaseDao
	 */
	public D dao;
	
	@Resource
	public void setDao(D dao) {
		this.dao = dao;
	}
	public T save(T entity) {
		return dao.save(entity);
	}

	public void update(T entity) {
		dao.update(entity);
	}

	public void delete(Serializable id) {
		dao.delete(id);
	}

	public T getById(Serializable id) {
		return dao.findById(id);
	}

	public List<T> getByHQL(String hql, Object... params) {
		return dao.findByHQL(hql, params);
	}
}
