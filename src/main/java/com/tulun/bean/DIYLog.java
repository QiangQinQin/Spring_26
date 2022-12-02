package com.tulun.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


@Aspect//说明是增强类
public class DIYLog {

//    @Before(value = "execution(* com.tulun.bean.Student.addStudent(..))")//    作用的位置
//   public void writeLog1(){
//        System.out.println("DIYLog.writeLog1");
//    }

//    即给addStudent方法添加后置通知
    @AfterReturning(value = "execution(* com.tulun.bean.Student.addStudent(..))")
@AfterThrowing(value = "execution(* com.tulun.bean.Student.addStudent(..))")
    public void writeLog2(){
        System.out.println("DIYLog.writeLog2");
    }

//    /**
//     * 环绕通知，必须有ProceedingJoinPoint类型的参数，该参数调用proceed表示执行真正的实现
//     * */
//    @Around(value = "execution(* com.tulun.bean.Student.addStudent(..))")//环绕通知
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("方法之前执行");
//        //表示执行真正的实现方法
//        joinPoint.proceed();//可能会抛出异常
//        System.out.println("方法之后执行");
//    }
}
