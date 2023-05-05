package com.example.experiment.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {
    private final int status;
    private String message;
    private T data;

    private CommonResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private CommonResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private CommonResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    @JsonIgnore
    public boolean isSuccess(){
        return this.status==ResponseCode.SUCCESS.getCode();
    }
    public static <T>CommonResponse<T> createForSuccess(){
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc());
    }

    public static <T>CommonResponse<T> createForSuccessMessage(String message){
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(),message);
    }

    public static <T>CommonResponse<T> createForSuccess(T data){
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(),data);
    }

    public static <T>CommonResponse<T> createForError(){
        return new CommonResponse<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }
    public static <T>CommonResponse<T> createForError(String message){
        return new CommonResponse<>(ResponseCode.ERROR.getCode(),message);
    }

    public static <T>CommonResponse<T> createForError(int code,String message){
        return new CommonResponse<>(code, message);
    }
}
