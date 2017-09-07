-- CREATE TABLE
CREATE TABLE tb_base_user (
  pkid        VARCHAR2(64) NOT NULL,
  username    VARCHAR2(128) NOT NULL,
  account     VARCHAR2(128),
  password    VARCHAR2(32),
  phone       VARCHAR2(32) NOT NULL,
  email       VARCHAR2(64),
  id_card     VARCHAR2(32) NOT NULL,
  sex         VARCHAR2(1) DEFAULT 1 NOT NULL,
  create_by   VARCHAR2(64) NOT NULL,
  create_date DATE NOT NULL,
  update_by   VARCHAR2(64),
  update_date DATE,
  is_deleted  VARCHAR2(1) DEFAULT 0 NOT NULL,
  remarks     VARCHAR2(4000)
) TABLESPACE platform_base;

-- ADD COMMENTS TO THE TABLE 
COMMENT ON TABLE tb_base_user IS '用户表';

-- ADD COMMENTS TO THE COLUMNS 
COMMENT ON COLUMN tb_base_user.pkid IS '主键';
COMMENT ON COLUMN tb_base_user.username IS '用户名';
COMMENT ON COLUMN tb_base_user.account IS '账号';
COMMENT ON COLUMN tb_base_user.password IS '密码';
COMMENT ON COLUMN tb_base_user.phone IS '手机号';
COMMENT ON COLUMN tb_base_user.id_card IS '身份证号';
COMMENT ON COLUMN tb_base_user.sex IS '性别,1代表男,0代表女,默认为1';
COMMENT ON COLUMN tb_base_user.email IS '邮箱';
COMMENT ON COLUMN tb_base_user.create_by IS '创建者主键';
COMMENT ON COLUMN tb_base_user.create_date IS '创建日期';
COMMENT ON COLUMN tb_base_user.update_by IS '更新者主键';
COMMENT ON COLUMN tb_base_user.update_date IS '更新日期';
COMMENT ON COLUMN tb_base_user.is_deleted IS '是否删除,1为删除,0为未删除,默认为0';
COMMENT ON COLUMN tb_base_user.remarks IS '备注(备用字段)';

ALTER TABLE tb_base_user ADD CONSTRAINT userPK PRIMARY KEY (pkid);

