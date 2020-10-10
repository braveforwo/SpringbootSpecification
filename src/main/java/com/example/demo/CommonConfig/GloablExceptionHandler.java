package com.example.demo.CommonConfig;

import com.example.demo.Exception.APIException;
import com.example.demo.domain.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.transform.Result;

@ControllerAdvice
public class GloablExceptionHandler {
    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e){
          return  new ResultVO<String>(ResultCode.FAILED,e.getMsg());
    }

}
