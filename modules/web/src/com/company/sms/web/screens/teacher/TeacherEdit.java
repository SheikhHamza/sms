package com.company.sms.web.screens.teacher;

import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.*;
import com.company.sms.entity.Teacher;

@UiController("sms_Teacher.edit")
@UiDescriptor("teacher-edit.xml")
@EditedEntityContainer("teacherDc")
@LoadDataBeforeShow
public class TeacherEdit extends StandardEditor<Teacher> {

}