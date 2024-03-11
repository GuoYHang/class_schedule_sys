package com.keydousguo.www.model.notify;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class NotifyInfo extends BaseModel {
    private Long id;
    private Integer notifyType;
    private Integer rangeType;
    private Long schoolId;
    private Long classId;
    private Long userId;
    private String title;
    private String context;
    private String picUrls;
    private Integer status;
}
