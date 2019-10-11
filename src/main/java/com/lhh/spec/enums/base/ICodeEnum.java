package com.lhh.spec.enums.base;

public interface ICodeEnum<T extends Enum<T>, C> {
    C getCode();
    T codeOf(C var);
}
