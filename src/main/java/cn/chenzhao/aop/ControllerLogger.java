package cn.chenzhao.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

public class ControllerLogger {
    private static final Logger logger=Logger.getLogger("ControllerLogger");
    //代表前置增强的方法
    public void before(JoinPoint jp){
        //获取目标对象jp.getTarget();
        //获取方法jp.getSignature();
        //获取方法入参jp.getArgs();
        logger.info("before 调用"+jp.getTarget()+"类的"+jp.getSignature().getName()+"方法。方法入参："+ Arrays.toString(jp.getArgs()));

    }
    //代表后置增强的方法
    public void after(JoinPoint jp ,Object result){
        logger.info("after 调用："+jp.getTarget()+"类的"+jp.getSignature().getName()+"方法。返回值："+result);
    }
}
