package com.figurine.entity.result;

import com.figurine.entity.enums.UserErrorResultEnum;

/**
 * HongDongwei
 * @param <T>
 */
public class Result<T> {

    /**
     * 请求结果是否成功
     */
    private Boolean status;

    /**
     * 结果返回code
     */
    private String code;

    /**
     * 结果返回信息
     */
    private String message;

    /**
     * 返回时间戳
     */
    private String timeStamp;

    /**
     * 返回结果
     */
    private T data;

    private static final String SUCCESS_CODE = "0000";

    private static final String SUCCESS_MESSAGE = "处理成功";


    /**
     * 私有化构造方法，不允许外部new对象
     */
    private Result(){}

    /**
     * 返回成功结果
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 返回成功结果
     * @param data
     * @return
     */
    public static Result success(Object data){
        return buildResult(true,SUCCESS_CODE,SUCCESS_MESSAGE,data);
    }

    /**
     * 通过自己输入的code和message返回成功结果
     * @param successCode
     * @param successMessage
     * @param data
     * @return
     */
    public static Result success(String successCode,String successMessage,Object data){
        return buildResult(true,successCode,successMessage,data);
    }


    /**
     * 返回错误Result
     * @param errorCode
     * @param errorMessage
     * @return
     */
    public static Result fail(String errorCode,String errorMessage){
        return buildResult(false,errorCode,errorMessage,null);
    }

    /**
     * 返回错误Result
     * @param errorCode
     * @param errorMessage
     * @param data
     * @return
     */
    public static Result fail(String errorCode,String errorMessage,Object data){
        return buildResult(false,errorCode,errorMessage,data);
    }

    /**
     * 通过userErrorResultEnum枚举构造失败结果
     * @param userErrorResultEnum
     * @return
     */

    public static Result fail(UserErrorResultEnum userErrorResultEnum){
        return buildResult(false,userErrorResultEnum.getCode(),userErrorResultEnum.getMessage(),null);
    }

    private static Result buildResult(Boolean status,String code,String message,Object data){
        Result result = new Result();
        result.setData(data);
        result.setStatus(status);
        result.setCode(code);
        result.setMessage(message);
        result.setTimeStamp(String.valueOf(System.currentTimeMillis()));
        return result;
    }


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static String getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getSuccessMessage() {
        return SUCCESS_MESSAGE;
    }
}
