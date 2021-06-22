package com.company.sms.web.screens.teacherasistant;

import com.haulmont.cuba.gui.screen.*;
import com.company.sms.entity.TeacherAsistant;

@UiController("sms_TeacherAsistant.browse")
@UiDescriptor("teacher-asistant-browse.xml")
@LookupComponent("teacherAsistantsTable")
@LoadDataBeforeShow
public class TeacherAsistantBrowse extends StandardLookup<TeacherAsistant> {

    @Subscribe
    public void onInit(InitEvent event) {

    }
}