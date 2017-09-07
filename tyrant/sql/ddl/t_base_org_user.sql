-- CREATE TABLE
CREATE TABLE t_base_org_user (
  pkid            VARCHAR2(64) NOT NULL,
  org_pk          VARCHAR2(64) NOT NULL,
  user_pk         VARCHAR2(64) NOT NULL, 
  create_by       VARCHAR2(64) NOT NULL,
  create_date     DATE NOT NULL,
  update_by       VARCHAR2(64),
  update_date     DATE,
  is_deleted      VARCHAR2(1) DEFAULT 0 NOT NULL,
  remarks         VARCHAR2(4000)
);

-- ADD COMMENTS TO THE TABLE 
COMMENT ON TABLE t_base_org_user IS '机构人员关系表';

-- ADD COMMENTS TO THE COLUMNS 
COMMENT ON COLUMN t_base_org_user.pkid IS '主键';
COMMENT ON COLUMN t_base_org_user.org_pk IS '机构主键';
COMMENT ON COLUMN t_base_org_user.user_pk IS '人员主键';
COMMENT ON COLUMN t_base_org_user.create_by IS '创建者主键';
COMMENT ON COLUMN t_base_org_user.create_date IS '创建日期';
COMMENT ON COLUMN t_base_org_user.update_by IS '更新者主键';
COMMENT ON COLUMN t_base_org_user.update_date IS '更新日期';
COMMENT ON COLUMN t_base_org_user.is_deleted IS '是否删除,1为删除,0为未删除,默认为0';
COMMENT ON COLUMN t_base_org_user.remarks IS '备注(备用字段)';

ALTER TABLE t_base_org_user ADD CONSTRAINT orgUserPK PRIMARY KEY (pkid);
