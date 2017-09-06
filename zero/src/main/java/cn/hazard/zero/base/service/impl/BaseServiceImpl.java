package cn.hazard.zero.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hazard.zero.base.BaseObject;
import cn.hazard.zero.base.Page;
import cn.hazard.zero.base.dao.BaseDao;
import cn.hazard.zero.base.model.BaseEntity;
import cn.hazard.zero.base.service.BaseService;

/**
 * Service基类
 * @author 董天明 2017-4-27
 */
@Transactional(readOnly = true)
public abstract class BaseServiceImpl<D extends BaseDao<T>, T extends BaseEntity<T>> extends BaseObject implements BaseService<D, T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4324078978205226806L;

	/**
	 * 
	 */
	public final static int COMMIT_SIZE = 500;
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String pkid) {
		return this.dao.get(pkid);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return this.dao.getUnique(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return this.dao.findList(entity);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param entity
	 * @return
	 */
	public Page<T> findPage(Page<T> page, T entity) {
		entity.setPage(page);
		page.setList(this.dao.findList(entity));
		return page;
	}
	
	/**
	 * 查询所有数据
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity){
		return this.dao.findAllList(entity);
	}
	
	/**
	 * 查询总数
	 * @param entity
	 * @return
	 */
	public int count(T entity){
		return this.dao.count(entity);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.getIsNewRecord()){
			entity.preInsert();
			this.dao.insert(entity);
		} else {
			entity.preUpdate();
			this.dao.update(entity);
		} // end if/else block 
	} // end method save 

	/**
	 * 插入
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int insert(T entity) {
		entity.preInsert();
		return this.dao.insert(entity);
	} // end method insert 
	
	/**
	 * 插入
	 * @param list
	 * @return
	 */
	@Transactional(readOnly = false)
	public int insert(List<T> list){
		for (T entity : list) {
			entity.preInsert();
		} // end for each 
		int count = 0;
		if(list.size() > COMMIT_SIZE) {
			for(int i = 0;i < list.size() / COMMIT_SIZE; i++) {
				count = count + dao.insertBatch(list.subList(i * COMMIT_SIZE, i * COMMIT_SIZE + COMMIT_SIZE));
			} // end for each 
			if(list.size() % COMMIT_SIZE > 0) {
				count = count + dao.insertBatch(list.subList(list.size() - list.size() % COMMIT_SIZE, list.size()));
			} // end if 
		} else {
			count = this.dao.insertBatch(list);
		} // end if/else block 
		return count;
	} // end method insert 
	
	/**
	 * 根据ID更新
	 * @param entity
	 * @param flag true： 表示更新非空属性; false： 全部更新 空属性也更新
	 * @return
	 */
	@Transactional(readOnly = false)
	public int update(T entity, boolean flag){
		entity.preUpdate();
		return flag ? this.dao.updateSelective(entity) : this.dao.update(entity);
	} // end method update 
	
	/**
	 * 根据ID更新
	 * @param list
	 * @param flag true： 表示更新非空属性; false： 全部更新 空属性也更新
	 * @return
	 */
	@Transactional(readOnly = false)
	public int update(List<T> list, boolean flag){
		for(T entity : list) {
			entity.preUpdate();
		} // end for each 
		return flag ? this.dao.updateSelectiveBatch(list) : this.dao.updateBatch(list);
	} // end method update 
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int delete(String pkid) {
		return this.dao.delete(pkid);
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int delete(T entity) {
		return this.dao.deleteEntity(entity);
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int delete(List<T> list) {
		return this.dao.deleteBatch(list);
	}

} // end class BaseServiceImpl 
