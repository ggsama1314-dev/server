
package com.example.ecommerce.exception;

import com.example.ecommerce.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handle(Exception e){
        return Result.success(e.getMessage());
    }
}
