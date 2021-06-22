package com.company.sms.web.screens.teacherasistant;

import com.company.sms.entity.TeacherAsistant;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("sms_TeacherAsistant.edit")
@UiDescriptor("teacher-asistant-edit.xml")
@EditedEntityContainer("teacherAsistantDc")
@LoadDataBeforeShow
public class TeacherAsistantEdit extends StandardEditor<TeacherAsistant> {
    @Inject
    private TextField<String> nameField;
    @Inject
    private DataContext dataContext;


}