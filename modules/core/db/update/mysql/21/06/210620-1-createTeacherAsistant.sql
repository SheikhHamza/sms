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
    TEACHER_ID_ID varchar(32) not null,
    AGE integer not null,
    --
    primary key (ID)
);