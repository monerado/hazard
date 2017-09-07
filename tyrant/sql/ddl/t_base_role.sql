-- CREATE TABLE
CREATE TABLE t_base_role (
  pkid   		VARCHAR2(64) NOT NULL,
  role_name		VARCHAR2(512),
  create_by     VARCHAR2(64) NOT NULL,
  create_date   DATE NOT NULL,
  update_by     VARCHAR2(64),
  update_date   DATE,
  is_deleted    VARCHAR2(1) DEFAULT 0 NOT NULL,
  remarks       VARCHAR2(4000) 
);

-- ADD COMMENTS TO THE TABLE 
COMMENT ON TABLE t_base_role IS '角色表';

-- ADD COMMENTS TO THE COLUMNS 
COMMENT ON COLUMN t_base_role.pkid IS '主键';
COMMENT ON COLUMN t_base_role.role_name IS '角色名称';
COMMENT ON COLUMN t_base_role.create_by IS '创建者主键';
COMMENT ON COLUMN t_base_role.create_date IS '创建日期';
COMMENT ON COLUMN t_base_role.update_by IS '更新者主键';
COMMENT ON COLUMN t_base_role.update_date IS '更新日期';
COMMENT ON COLUMN t_base_role.is_deleted IS '是否删除,1为删除,0为未删除,默认为0';
COMMENT ON COLUMN t_base_role.remarks IS '备注(备用字段)';

ALTER TABLE t_base_role ADD CONSTRAINT rolePK PRIMARY KEY (pkid);
