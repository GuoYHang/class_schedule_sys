package com.keydousguo.www.model.school;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class ClassScheduleCourseInfo extends BaseModel {
    private Long id;
    private Long schoolId;
    private Long classId;
    private Long userId;
    private Long courseId;
    private String courseName;
    private Long classSemesterId;
    private Integer weekNo;
    private Integer dayNo;
    private Integer courseNo;
    private Integer sectionNum;
    private String address;
    private String remark;
    private Integer status;
}
