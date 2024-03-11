package com.keydousguo.www.model.school;

import lombok.Data;

@Data
public class ClassTeacherCourseRelation {
    private Long id;
    private Long schoolId;
    private Long classId;
    private Long userId;
    private Long courseId;
}
