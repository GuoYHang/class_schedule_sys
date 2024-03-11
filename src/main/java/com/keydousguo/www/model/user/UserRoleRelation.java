package com.keydousguo.www.model.user;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class UserRoleRelation extends BaseModel {
    private Long id;
    private Long userId;
    private Long roleId;
}
