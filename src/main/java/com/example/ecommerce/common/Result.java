
package com.example.ecommerce.common;

import lombok.Data;

@Data
public class Result {

    private Integer code;
    private String message;
    private Object data;

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return result;
    }
}
