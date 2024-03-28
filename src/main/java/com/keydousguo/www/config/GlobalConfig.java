package com.keydousguo.www.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 */

@Setter
@Component
@ConfigurationProperties(prefix = "sys")
public class GlobalConfig {
    /**
     * 项目名称
     */
    @Getter
    private String name;

    /**
     * 版本
     */
    @Getter
    private String version;

    /**
     * 版权年份
     */
    @Getter
    private String copyrightYear;

    /**
     * 上传路径
     */
    @Getter
    private static String profile;

    /**
     * 获取地址开关
     */
    @Getter
    private static boolean addressEnabled;

    /**
     * 验证码类型
     */
    @Getter
    private static String captchaType;

    public void setProfile(String profile) {
        GlobalConfig.profile = profile;
    }

    public void setAddressEnabled(boolean addressEnabled) {
        GlobalConfig.addressEnabled = addressEnabled;
    }

    public void setCaptchaType(String captchaType) {
        GlobalConfig.captchaType = captchaType;
    }

    /**
     * 获取导入上传路径
     */
    public static String getImportPath() {
        return getProfile() + "/import";
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public static String getDownloadPath() {
        return getProfile() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath() {
        return getProfile() + "/upload";
    }
}
