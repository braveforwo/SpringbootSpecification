package com.example.demo.CommonConfig;

import com.example.demo.Exception.APIException;
import com.example.demo.domain.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.transform.Result;

@ControllerAdvice
public class GloablExceptionHandler {
    @ResponseBody
    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e){
          return  new ResultVO<String>(ResultCode.FAILED,e.getMsg());
    }
    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    public ResultVO<String> ArithmeticExceptionHandler(ArithmeticException e){
        return  new ResultVO<String>(ResultCode.FAILED,e.getMessage());
    }

}
