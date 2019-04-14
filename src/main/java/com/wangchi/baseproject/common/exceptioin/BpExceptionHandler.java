package com.wangchi.baseproject.common.exceptioin;

import com.wangchi.baseproject.common.utils.BPResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 异常处理器
 */
@RestControllerAdvice
public class BpExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(NoHandlerFoundException.class)
    public BPResponseBody handlerNoHandlerFoundException(Exception e){
        logger.error(e.getMessage(), e);
        return BPResponseBody.error(404,"找不到访问的路径，请确认路径是否正确");
    }

  /*  @ExceptionHandler(NullPointerException.class)
    public BPResponseBody handlernullPoint(Exception e){
        logger.error(e.getMessage(), e);
        return BPResponseBody.error(404,"空指针异常");
    }*/

    @ExceptionHandler(Exception.class)
    public BPResponseBody handleException(Exception e){
        logger.error(e.getMessage(), e);
        return BPResponseBody.error();
    }
}
