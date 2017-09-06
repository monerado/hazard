package cn.hazard.zero.base.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import cn.hazard.tools.GUIDUtils;
import cn.hazard.zero.base.BaseObject;
import cn.hazard.zero.base.Page;

/**
 * 实体基类
 * @author 董天明 2017-4-27
 * @param <T>
 */
public abstract class BaseEntity<T> extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10011001L;

	/**
	 * 删除标记, 未删除
	 */
	public static final String DEL_FLAG_NORMAL = "0";

	/**
	 * 删除标记, 已删除
	 */
	public static final String DEL_FLAG_DELETE = "1";

	/**
	 * 实体主键
	 */
	protected String pkid;
	
	/**
	 * 当前实体分页对象
	 */
	protected Page<T> page;
	
	/**
	 * 自定义SQL(QL标识, SQL内容)
	 */
	protected Map<String, String> sqlMap;
	
	/**
	 * 是否是新记录(默认:false),调用setIsNewRecord()设置新记录,使用自定义ID.
	 * 设置为true后强制执行插入语句,ID不会自动生成,需从手动传入.
	 */
	protected boolean isNewRecord = false;
	
	/**
	 * 备注
	 */
	protected String remarks;

	/**
	 * 创建者
	 */
	protected String createBy;

	/**
	 * 创建日期
	 */
	protected Date createDate; 

	/**
	 * 更新者
	 */
	protected String updateBy;

	/**
	 * 更新日期
	 */
	protected Date updateDate;

	/**
	 * 删除标记(0:正常; 1:删除;)
	 */
	protected String isDeleted;
	
	public BaseEntity() {
		this.isDeleted = DEL_FLAG_NORMAL;
	}
	
	/**
	 * 插入之前执行方法,需要手动调用
	 */
	public void preInsert() {
		if (!this.isNewRecord && StringUtils.isBlank(this.getPkid())) {
			this.setPkid(GUIDUtils.createUUID());
		} // end if 
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	} // end method preInsert 
	
	public void preUpdate() {
		this.updateDate = new Date();
	}

	public BaseEntity(String id) {
		this();
		this.pkid = id;
	}
	
	public Page<T> getPage() {
		if (null == this.page) {
			this.page = new Page<T>();
		} // end if 
		return this.page;
	}
	
	public Page<T> setPage(Page<T> page) {
		this.page = page;
		return page;
	}

	public Map<String, String> getSqlMap() {
		if (null == this.sqlMap) {
			this.sqlMap = new HashMap<String,String>();
		} // end if 
		return this.sqlMap;
	}

	public void setSqlMap(Map<String, String> sqlMap) {
		this.sqlMap = sqlMap;
	}
	
    /**
	 * 是否是新记录(默认:false),调用setIsNewRecord()设置新记录,使用自定义ID�?
	 * 设置为true后强制执行插入语句,ID不会自动生成,需从手动传入.
     * @return
     */
	public boolean getIsNewRecord() {
        return this.isNewRecord || StringUtils.isBlank(this.getPkid());
    }

	/**
	 * 是否是新记录(默认:false),调用setIsNewRecord()设置新记录,使用自定义ID�?
	 * 设置为true后强制执行插入语句,ID不会自动生成,需从手动传入.
	 */
	public void setIsNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}
	
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        } // end if 
        if (this == obj) {
            return true;
        } // end if 
        if (!getClass().equals(obj.getClass())) {
            return false;
        } // end if 
        BaseEntity<?> that = (BaseEntity<?>) obj;
        return null == this.getPkid() ? false : this.getPkid().equals(that.getPkid());
    } // end method equals 
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    } // end method toString 

	public String getPkid() {
		return pkid;
	}

	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}

} // end class BaseEntity 
