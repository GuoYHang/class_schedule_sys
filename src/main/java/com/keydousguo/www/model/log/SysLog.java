package com.keydousguo.www.model.log;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class SysLog extends BaseModel {
    private Long id;
    private Long userId;
    private Integer operationType;
    private String operationContext;
}
