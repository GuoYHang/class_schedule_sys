package com.keydousguo.www.model.school;

import lombok.Data;

import java.util.Date;

@Data
public class ClassSemesterInfo {
    private Long id;
    private Long schoolId;
    private Long classId;
    private String name;
    private Integer weekNum;
    private Date startDate;
    private Date endDate;
    private String timeTable;
}
