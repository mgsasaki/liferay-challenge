create index IX_B3FCF3AE on TDL_Task (groupId, taskListId);
create index IX_CA3D0006 on TDL_Task (uuid_);
create index IX_6946E462 on TDL_Task (uuid_, companyId);
create unique index IX_C6A11B64 on TDL_Task (uuid_, groupId);

create index IX_A3D4EAFE on TDL_TaskList (groupId);
create index IX_A8852508 on TDL_TaskList (uuid_);
create index IX_A48EA20 on TDL_TaskList (uuid_, companyId);
create unique index IX_FF4578A2 on TDL_TaskList (uuid_, groupId);