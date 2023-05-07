package com.jmg.checkagro.check.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MessageCode {
    CHECK_NOT_FOUND("The customer not found"),
    ;

    String msg;


}
