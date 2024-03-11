package com.keydousguo.www.model.school;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class ClassScheduleAdjustRecord extends BaseModel {
    private Long id;
    private Long sourceCourseId;
    private Long sourceUserId;
    private String sourceRemark;
    private Long targetCourseId;
    private Long targetUserId;
    private String targetRemark;
    private Long approveUserId;
    private String approveRemark;
    private Integer status;
}
