package com.aaron.mybatis.enums;

/**
 * @author Administrator
 */
public enum BusinessScopeEnum {

    /** 手机 */
    PHONE(1, "手机"),
    /** 电脑 */
    COMPUTER(2, "电脑"),
    /** 相机 */
    CAMERA(3, "相机"),
    /** 平板 */
    TABLET(4, "平板");

    private int code;
    private String name;

    BusinessScopeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public static BusinessScopeEnum getByCode(int code) {
        for (BusinessScopeEnum value : BusinessScopeEnum.values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }

    public static BusinessScopeEnum getByCode(String code) {
        for (BusinessScopeEnum value : BusinessScopeEnum.values()) {
            if (String.valueOf(value.code).equals(code)) {
                return value;
            }
        }
        return null;
    }

    public static String getNameByCode(int code) {

        for (BusinessScopeEnum value : BusinessScopeEnum.values()) {
            if (value.code == code) {
                return value.name;
            }
        }
        return null;
    }

    public static String getNameByCode(String code) {

        for (BusinessScopeEnum value : BusinessScopeEnum.values()) {
            if (String.valueOf(value.code).equals(code)) {
                return value.name;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
