package com.lhh.spec.enums.dto;

import com.lhh.spec.enums.base.ILabelCodeEnum;

import java.util.Arrays;

public enum  EnumDeleted implements ILabelCodeEnum<EnumDeleted, Integer> {
    NORMAL(0,"正常"),
    DELETED(1, "已删除")
    ;

    private String label;
    private Integer code;

    private EnumDeleted(Integer code, String label){
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public EnumDeleted codeOf(Integer var) {
        return (EnumDeleted)Arrays.stream(values()).filter((v) -> {
            return v.getCode().equals(var);}
            ).findFirst().get();
    }
}
