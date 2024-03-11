package com.keydousguo.www.model.school;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class ClassInfo extends BaseModel {
    private Long id;
    private String name;
    private String address;
    private String remark;
}
