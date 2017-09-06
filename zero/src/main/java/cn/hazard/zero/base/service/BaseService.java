package cn.hazard.zero.base.service;

import java.util.List;

import cn.hazard.zero.base.Page;
import cn.hazard.zero.base.dao.BaseDao;
import cn.hazard.zero.base.model.BaseEntity;

/**
 * Service接口
 * @author ChenG 2017-09-06
 */
public interface BaseService<D extends BaseDao<T>, T extends BaseEntity<T>> {
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String pkid);
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity);
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param entity
	 * @return
	 */
	public Page<T> findPage(Page<T> page, T entity);
	
	/**
	 * 查询所有数据
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity);
	
	/**
	 * 查询总数
	 * @param entity
	 * @return
	 */
	public int count(T entity);

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * 插入
	 * @param entity
	 */
	public int insert(T entity);
	
	/**
	 * 插入
	 * @param list
	 * @return
	 */
	public int insert(List<T> list);
	
	/**
	 * 根据ID更新
	 * @param entity
	 * @param flag true： 表示更新非空属性; false： 全部更新 空属性也更新
	 * @return
	 */
	public int update(T entity, boolean flag);
	
	/**
	 * 根据ID更新
	 * @param list
	 * @param flag true： 表示更新非空属性; false： 全部更新 空属性也更新
	 * @return
	 */
	public int update(List<T> list, boolean flag);
	
	/**
	 * 删除数据
	 * @param entity
	 */
	public int delete(String pkid);
	
	/**
	 * 删除数据
	 * @param entity
	 */
	public int delete(T entity);
	
	/**
	 * 删除数据
	 * @param entity
	 */
	public int delete(List<T> list);

} // end class BaseService 
