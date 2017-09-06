package cn.hazard.zero.base.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO支持类实现
 * @author 董天明 2017-4-25
 */
@Transactional(readOnly = true)
public interface BaseDao<T> {
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id);
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T getUnique(T entity);
	
	/**
	 * 查询数据列表,如果需要分页,请设置分页对象,如：entity.setPage(new Page<T>());
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);

	/**
	 * 查询所有数据列表
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity);
	
	/**
	 * 查询数量
	 * @param entity
	 * @return
	 */
	public int count(T entity);
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int insert(T entity);
	
	/**
	 * 插入数据
	 * @param list
	 * @return
	 */
	public int insertBatch(List<T> list);
	
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	
	/**
	 * 更新数据
	 * @param list
	 * @return
	 */
	public int updateBatch(List<T> list);
	
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int updateSelective(T entity);
	
	/**
	 * 更新数据
	 * @param list
	 * @return
	 */
	public int updateSelectiveBatch(List<T> list);
	
	/**
	 * 删除数据(一般为逻辑删除,更新del_flag字段为1)
	 * @param id
	 * @return
	 */
	public int delete(String pkid);
	
	/**
	 * 删除数据(一般为逻辑删除,更新del_flag字段为1)
	 * @param entity
	 * @return
	 */
	public int deleteEntity(T entity);
	
	/**
	 * 批量删除
	 * @param list
	 * @return
	 */
	public int deleteBatch(List<T> list);
	


} // end interface BaseDao 
