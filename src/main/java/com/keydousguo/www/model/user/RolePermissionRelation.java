package com.keydousguo.www.model.user;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class RolePermissionRelation extends BaseModel {
    private Long id;
    private Long roleId;
    private Long permissionId;
}
