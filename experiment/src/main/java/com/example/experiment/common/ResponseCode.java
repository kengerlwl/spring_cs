package com.example.experiment.common;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR");
    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
