alter table SMS_TEACHER_ASISTANT add constraint FK_SMS_TEACHER_ASISTANT_ON_TEACHER_ID foreign key (TEACHER_ID_ID) references SMS_TEACHER(ID);
create index IDX_SMS_TEACHER_ASISTANT_ON_TEACHER_ID on SMS_TEACHER_ASISTANT (TEACHER_ID_ID);