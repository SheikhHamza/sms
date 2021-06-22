package com.company.sms.web.screens.teacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.sms.entity.Teacher;

@UiController("sms_Teacher.browse")
@UiDescriptor("teacher-browse.xml")
@LookupComponent("teachersTable")
@LoadDataBeforeShow
public class TeacherBrowse extends StandardLookup<Teacher> {
}