drop table if exists conversation;
create table conversation (
    id int8 primary key not null, -- 会话ID
    type int2 not null not null, -- 类型
    name varchar(255), -- 群名 可为空
    avatar varchar(255), -- 头像 可为空
    owner_id int8 not null,  -- 群主/创建者
    extra_information jsonb default '{}' not null, --  额外信息 比如pin消息
    status int2 not null, -- 会话状态
	creator varchar(64) default ''::character varying null,
	create_time timestamp default current_timestamp not null,
	updater varchar(64) default ''::character varying null,
	update_time timestamp default current_timestamp not null,
	deleted int2 default 0 not null,
	tenant_id int8 default 0 not null
);
drop sequence if exists conversation_seq;
create sequence conversation_seq start 1;

drop table if exists member;
create table member (
	id int8 primary key, -- 成员ID
	conversation_id int8 not null, -- 会话ID
	member_id int8 not null, -- 用户ID
	type int2 not null, -- 成员类型
	status intw not null, -- 成员状态
	creator varchar(64) default ''::character varying null,
	create_time timestamp default current_timestamp not null,
	updater varchar(64) default ''::character varying null,
	update_time timestamp default current_timestamp not null,
	deleted int2 default 0 not null,
	tenant_id int8 default 0 not null
);
drop sequence if exists member_seq;
create sequence member_seq start 1;

drop table if exists message;
create table message (
	id int8 primary key, -- 消息ID
	conversation_id int8 not null, -- 会话ID
	sender_id int8 not null, -- 发送方ID
	content jsonb default '{}' not null, -- json文本 便于扩展
	quote int8 null, -- 引用消息ID
	status int2 not null, -- 消息状态
	creator varchar(64) default ''::character varying null,
	create_time timestamp default current_timestamp not null,
	updater varchar(64) default ''::character varying null,
	update_time timestamp default current_timestamp not null,
	deleted int2 default 0 not null,
	tenant_id int8 default 0 not null
);
drop sequence if exists message_seq;
create sequence message_seq start 1;
