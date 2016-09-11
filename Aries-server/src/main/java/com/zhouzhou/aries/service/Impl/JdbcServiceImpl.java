package com.zhouzhou.aries.service.Impl;

import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.lob.LobHandler;
import com.zhouzhou.aries.service.JdbcService;
import com.zhouzhou.aries.util.ApplicationContextManagement;

/**
 * 
 * @author zhouzhou
 * 
 */
public class JdbcServiceImpl extends JdbcDaoSupport implements JdbcService{
	private LobHandler lobHandler;

	/**
	 * 分页查询
	 */
	public List pagedQuery(String sql, Object[] args, int[] argsType,
			int pageNum, int pageSize) {
		if(0>=pageNum){
			throw new RuntimeException("pageNum start from 1.");
		}
		int startIndex = (pageNum - 1) * pageSize;
		int lastIndex = startIndex + pageSize;
		StringBuffer paginationSQL = new StringBuffer(" SELECT * FROM ( ");
		paginationSQL.append(" SELECT temp.* ,ROWNUM num FROM ( ");
		paginationSQL.append(sql);
		paginationSQL.append("　) temp where ROWNUM <= " + lastIndex);
		paginationSQL.append(" ) WHERE　num >= " + startIndex);
		return getJdbcTemplate().queryForList(paginationSQL.toString(), args,
				argsType);
	}
	
	/**
	 * 支持大对象更新
	 */
	public int update(String sql,Object[] args, int[] argsType){
		return 0;
	}
	
   /**
    * 重写上方法，对于分页传入的是当前页的最开始数据量，以及结束数据量
    * @param sql
    * @param args
    * @param argsType
    * @param startIndex
    * @param lastIndex
    * @return
    */
	public List queryPage(String sql, Object[] args, int[] argsType,
			int startIndex, int lastIndex) {
		StringBuffer paginationSQL = new StringBuffer(" SELECT * FROM ( ");
		paginationSQL.append(" SELECT temp.* ,ROWNUM num FROM ( ");
		paginationSQL.append(sql);
		paginationSQL.append("　) temp where ROWNUM <= " + lastIndex);
		paginationSQL.append(" ) WHERE　num >= " + startIndex);
		return getJdbcTemplate().queryForList(paginationSQL.toString(), args,
				argsType);
	} 
	
	
	/**
	 * 用于返回所有数据量的操作 
	 * @param sql：sql语句
	 * @param args：参数
	 * @param argsType：参数类型
	 * @return
	 */
	public int getCntQuery(String sql, Object[] args, int[] argsType) {
		return getJdbcTemplate().queryForInt(sql, args,argsType);
	}
	
	/**
	 * 找单个对象
	 */
	public Map queryForSingle(String sql,Object[] args, int[] argsType){
		Map map = null;
		List list = getJdbcTemplate().queryForList(sql, args, argsType);
		if(list.size()>0){
			map = (Map)list.get(0);
		}
		return map;
	}
	
	/**
	 * 按列表返回查找结果
	 */
	public List queryForList(String sql,Object[] args, int[] argsType){
		return getJdbcTemplate().queryForList(sql, args, argsType);
	}

	public LobHandler getLobHandler() {
		return lobHandler;
	}

	public void setLobHandler(LobHandler lobHandler) {
		this.lobHandler = lobHandler;
	}
	
	public static JdbcService getInstance(){
		ApplicationContext context = ApplicationContextManagement.getApplicationContext();
		return (JdbcService)context.getBean("jdbcService");
	}
}
