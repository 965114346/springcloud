package com.zyy.serviceribbon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Created by yangyang.zhang on 2018/9/8 17:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo {

    /**
     * 状态码
     */
    private String code;

    private String status;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo success(Object data){
        return service(HttpStatus.OK, "成功", data);
    }

    private static ResultVo service(HttpStatus status,String msg, Object data){
        return new ResultVo(status.toString(), status.getReasonPhrase(), msg, data);
    }

    public static ResultVo failure(){
        return failure(null);
    }

    public static ResultVo failure(Object data){
        return service(HttpStatus.OK, "失败", data);
    }

    public static ResultVo error(HttpStatus status){
        return error(status, "错误");
    }

    public static ResultVo error(HttpStatus status, String msg){
        return service(status, msg, null);
    }
}
