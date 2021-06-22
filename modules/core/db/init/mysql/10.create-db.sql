-- begin SMS_TEACHER
create table SMS_TEACHER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    QUALIFICATION varchar(255) not null,
    AGE integer not null,
    DEPARTMENT varchar(255) not null,
    --
    primary key (ID)
)^
-- end SMS_TEACHER
-- begin SMS_TEACHER_ASISTANT
create table SMS_TEACHER_ASISTANT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    GRADE integer not null,
    AGE integer not null,
    --
    primary key (ID)
)^
-- end SMS_TEACHER_ASISTANT
