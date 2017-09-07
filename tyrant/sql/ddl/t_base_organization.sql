-- CREATE TABLE
CREATE TABLE t_base_organization (
  pkid           VARCHAR2(64) NOT NULL,
  org_name       VARCHAR2(512) NOT NULL,
  org_short_name VARCHAR2(256),
  is_root        VARCHAR2(1) NOT NULL,
  parent_id      VARCHAR2(64) NOT NULL,
  genealogy_path VARCHAR2(4000),
  sort_flag      VARCHAR2(512),
  district		 VARCHAR2(64) NOT NULL,
  create_by      VARCHAR2(64) NOT NULL,
  create_date    DATE NOT NULL,
  update_by      VARCHAR2(64),
  update_date    DATE,
  is_deleted     VARCHAR2(1) DEFAULT 0 NOT NULL,
  remarks        VARCHAR2(4000)
);

-- ADD COMMENTS TO THE TABLE 
COMMENT ON TABLE t_base_organization IS '机构表';

-- ADD COMMENTS TO THE COLUMNS 
COMMENT ON COLUMN t_base_organization.pkid IS '主键';
COMMENT ON COLUMN t_base_organization.org_name IS '机构名称';
COMMENT ON COLUMN t_base_organization.org_short_name IS '机构简称';
COMMENT ON COLUMN t_base_organization.is_root IS '是否为根节点,1代表根节点,0代表非根节点';
COMMENT ON COLUMN t_base_organization.parent_id IS '父节点主键';
COMMENT ON COLUMN t_base_organization.genealogy_path IS '族谱描述,记录根至叶子的每个节点主键以逗号分隔';
COMMENT ON COLUMN t_base_organization.sort_flag IS '排序标识';
COMMENT ON COLUMN t_base_organization.district IS '区域标识';
COMMENT ON COLUMN t_base_organization.create_by IS '创建者主键';
COMMENT ON COLUMN t_base_organization.create_date IS '创建日期';
COMMENT ON COLUMN t_base_organization.update_by IS '更新者主键';
COMMENT ON COLUMN t_base_organization.update_date IS '更新日期';
COMMENT ON COLUMN t_base_organization.is_deleted IS '是否删除,1为删除,0为未删除,默认为0';
COMMENT ON COLUMN t_base_organization.remarks IS '备注(备用字段)';

ALTER TABLE t_base_organization ADD CONSTRAINT organizationPK PRIMARY KEY (pkid);

-- INIT DATA
INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('21', '中国移动辽宁分公司', '辽宁移动', '1', NULL, NULL, '1', '1', SYSDATE, NULL, NULL, '0', NULL, '21');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('240', '辽宁移动沈阳分公司', '沈阳移动', '0', '21', '21,240', '2', '1', SYSDATE, NULL, NULL, '0', NULL, '240');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('410', '辽宁移动铁岭分公司', '铁岭移动', '0', '21', '21,410', '3', '1', SYSDATE, NULL, NULL, '0', NULL, '410');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('411', '辽宁移动大连分公司', '大连移动', '0', '21', '21,411', '4', '1', SYSDATE, NULL, NULL, '0', NULL, '411');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('412', '辽宁移动鞍山分公司', '鞍山移动', '0', '21', '21,412', '5', '1', SYSDATE, NULL, NULL, '0', NULL, '412');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('413', '辽宁移动抚顺分公司', '抚顺移动', '0', '21', '21,413', '6', '1', SYSDATE, NULL, NULL, '0', NULL, '413');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('414', '辽宁移动本溪分公司', '本溪移动', '0', '21', '21,414', '7', '1', SYSDATE, NULL, NULL, '0', NULL, '414');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('415', '辽宁移动丹东分公司', '丹东移动', '0', '21', '21,415', '8', '1', SYSDATE, NULL, NULL, '0', NULL, '415');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('416', '辽宁移动锦州分公司', '锦州移动', '0', '21', '21,416', '9', '1', SYSDATE, NULL, NULL, '0', NULL, '416');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('417', '辽宁移动营口分公司', '营口移动', '0', '21', '21,417', '10', '1', SYSDATE, NULL, NULL, '0', NULL, '417');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('418', '辽宁移动阜新分公司', '阜新移动', '0', '21', '21,418', '11', '1', SYSDATE, NULL, NULL, '0', NULL, '418');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('419', '辽宁移动辽阳分公司', '辽阳移动', '0', '21', '21,419', '12', '1', SYSDATE, NULL, NULL, '0', NULL, '419');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('421', '辽宁移动朝阳分公司', '朝阳移动', '0', '21', '21,421', '13', '1', SYSDATE, NULL, NULL, '0', NULL, '421');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('427', '辽宁移动盘锦分公司', '盘锦移动', '0', '21', '21,427', '14', '1', SYSDATE, NULL, NULL, '0', NULL, '427');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('429', '辽宁移动葫芦岛分公司', '葫芦岛移动', '0', '21', '21,429', '15', '1', SYSDATE, NULL, NULL, '0', NULL, '429');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('33', '中国移动浙江分公司', '浙江移动', '1', NULL, NULL, '1', '1', SYSDATE, NULL, NULL, '0', NULL, '33');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('571', '浙江移动杭州分公司', '杭州移动', '0', '33', '33,571', '2', '1', SYSDATE, '1', NULL, '0', NULL, '571');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('570', '浙江移动衢州分公司', '衢州移动', '0', '33', '33,570', '3', '1', SYSDATE, '1', NULL, '0', NULL, '570');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('572', '浙江移动湖州分公司', '湖州移动', '0', '33', '33,571', '4', '1', SYSDATE, '1', NULL, '0', NULL, '572');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('573', '浙江移动嘉兴分公司', '嘉兴移动', '0', '33', '33,573', '5', '1', SYSDATE, '1', NULL, '0', NULL, '573');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('574', '浙江移动宁波分公司', '宁波移动', '0', '33', '33,574', '6', '1', SYSDATE, '1', NULL, '0', NULL, '574');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('575', '浙江移动绍兴分公司', '绍兴移动', '0', '33', '33,575', '7', '1', SYSDATE, '1', NULL, '0', NULL, '575');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('576', '浙江移动台州分公司', '台州移动', '0', '33', '33,576', '8', '1', SYSDATE, '1', NULL, '0', NULL, '576');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('577', '浙江移动温州分公司', '温州移动', '0', '33', '33,577', '9', '1', SYSDATE, '1', NULL, '0', NULL, '577');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('578', '浙江移动丽水分公司', '丽水移动', '0', '33', '33,578', '10', '1', SYSDATE, '1', NULL, '0', NULL, '578');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('579', '浙江移动金华分公司', '金华移动', '0', '33', '33,579', '11', '1', SYSDATE, '1', NULL, '0', NULL, '579');

INSERT INTO t_base_organization (pkid, org_name, org_short_name, is_root, parent_id, genealogy_path, sort_flag, create_by, create_date, update_by, update_date, is_deleted, remarks, district)
VALUES ('580', '浙江移动舟山分公司', '舟山移动', '0', '33', '33,580', '12', '1', SYSDATE, '1', NULL, '0', NULL, '580');
