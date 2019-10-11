package com.lhh.spec.enums.base;

public interface IErrorEnum<T extends Enum<T>> extends ICodeEnum<T, Integer> {
    String configReason();
    Integer configHttpCode();
    String getMessage();
    default String getReason(){
        return this.configReason();
    }
    default Integer getHttpCode(){
        return this.configHttpCode();
    }
}
