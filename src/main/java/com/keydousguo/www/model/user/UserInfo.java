package com.keydousguo.www.model.user;

import com.keydousguo.www.model.BaseModel;
import lombok.Data;

@Data
public class UserInfo extends BaseModel {
    private Long id;
    private String name;
    private String phoneNumber;

    //微信用户
    private String unionId;
    private String openId;
    private String wechatName;
    private String wechatAvatarUrl;
}
