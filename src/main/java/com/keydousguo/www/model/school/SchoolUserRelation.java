package com.keydousguo.www.model.school;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class SchoolUserRelation extends BaseModel {
    private Long id;
    private Long schoolId;
    private Long userId;
}
