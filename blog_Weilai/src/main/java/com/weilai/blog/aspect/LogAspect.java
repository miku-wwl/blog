package com.weilai.blog.aspect;


import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;



@Aspect
@Component
public class LogAspect {
    private final Logger logger =  LoggerFactory.getLogger(this.getClass());

 //   private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

  //  private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.weilai.blog.web.*.*(..))")
    public void log() {}

    @Before("log()")
    public void doBefore(){
        logger.info("----------doBefore-------------");
    }
    @After("log()")
    public void doAfter(){
        logger.info("----------doAfter-------------");
    }
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        logger.info("Result:{}" +result);
    }
}
