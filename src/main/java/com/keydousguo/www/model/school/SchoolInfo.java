package com.keydousguo.www.model.school;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class SchoolInfo extends BaseModel {

    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String remark;
}
