create index IX_983F0F27 on Counted_Counted (groupId);
create index IX_E0CA6417 on Counted_Counted (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6CFB0459 on Counted_Counted (uuid_[$COLUMN_LENGTH:75$], groupId);