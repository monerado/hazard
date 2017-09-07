package cn.hazard.platform.base.module.user.dao.entity;

import cn.hazard.zero.base.model.BaseEntity;

/**
 * The persistent class for the T_BASE_USER database table.
 */
public class User extends BaseEntity<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2834751049090177546L;

	/**
	 * 账号
	 */
	private String account;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 身份证号
	 */
	private String idCard;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 性别,1代表男,0代表女,默认为1
	 */
	private String sex;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 部门
	 */
	private String dept;

	/**
	 * 公司
	 */
	private String org;

	/**
	 * 角色
	 */
	private String role;
	
	/**
	 * 是否锁定, 0代表未锁定, 1代表锁定, 默认为未锁定
	 */
	private String isLocked;

	public User() {
		
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the idCard
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * @param org the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the isLocked
	 */
	public String getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

} // end class User 
