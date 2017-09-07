-- CREATE TABLE
CREATE TABLE T_base_role_user (
  pkid            VARCHAR2(64) NOT NULL,
  role_pk         VARCHAR2(64) NOT NULL,
  user_pk         VARCHAR2(64) NOT NULL, 
  create_by       VARCHAR2(64) NOT NULL,
  create_date     DATE NOT NULL,
  update_by       VARCHAR2(64),
  update_date     DATE,
  is_deleted      VARCHAR2(1) DEFAULT 0 NOT NULL,
  remarks         VARCHAR2(4000)
);

-- ADD COMMENTS TO THE TABLE 
COMMENT ON TABLE T_base_role_user IS '角色人员关系表';

-- ADD COMMENTS TO THE COLUMNS 
COMMENT ON COLUMN T_base_role_user.pkid IS '主键';
COMMENT ON COLUMN T_base_role_user.role_pk IS '角色主键';
COMMENT ON COLUMN T_base_role_user.user_pk IS '人员主键';
COMMENT ON COLUMN T_base_role_user.create_by IS '创建者主键';
COMMENT ON COLUMN T_base_role_user.create_date IS '创建日期';
COMMENT ON COLUMN T_base_role_user.update_by IS '更新者主键';
COMMENT ON COLUMN T_base_role_user.update_date IS '更新日期';
COMMENT ON COLUMN T_base_role_user.is_deleted IS '是否删除,1为删除,0为未删除,默认为0';
COMMENT ON COLUMN T_base_role_user.remarks IS '备注(备用字段)';

ALTER TABLE T_base_role_user ADD CONSTRAINT roleUserPK PRIMARY KEY (pkid);
