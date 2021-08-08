//package com.yt.springbootmybatis.utils.handler;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.support.DefaultMessageSourceResolvable;
//import org.springframework.validation.BindException;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
///**
// * @USER: Young
// * @DATETIME: 2021/2/26
// * @DESCRIPTION: 全局异常处理
// **/
//@RestControllerAdvice
//@Slf4j
//public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    public Result handelBadRequest(Exception e) {
//        //参数异常处理
//        if (e instanceof BindException) {
//            BindException bindException = (BindException) e;
//            List<Map<String, Object>> result = Lists.newArrayList();
//            //修改返回结构方便前端解析
//            String msg = null;
//            if (bindException.hasErrors()) {
//                msg = bindException.getFieldErrors().stream().findFirst().map(FieldError::getDefaultMessage).orElse("参数异常");
//            }
//            log.error("参数校验异常[{}]", result);
//            return Result.fail(msg);
//        } else if (e instanceof MethodArgumentNotValidException) {
//            String error;
//            MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException) e;
//            BindingResult bindingResult = methodArgumentNotValidException.getBindingResult();
//            error = bindingResult.getAllErrors().stream().findFirst().map(DefaultMessageSourceResolvable::getDefaultMessage).orElse("参数异常");
//            log.error("参数校验异常[{}]", error);
//            return Result.fail(error);
//        } else if (e instanceof ConstraintViolationException) {
//            String error;
//            ConstraintViolationException constraintViolationException = (ConstraintViolationException) e;
//            Set<ConstraintViolation<?>> constraintViolations = constraintViolationException.getConstraintViolations();
//            error = constraintViolations.stream().findFirst().map(ConstraintViolation::getMessageTemplate).orElse("参数异常");
//            log.error("参数校验异常[{}]", error);
//            return Result.fail(error);
//        } else if (e instanceof UnifiedException) {
//            UnifiedException unifiedException = (UnifiedException) e;
//            log.info("发生业务异常[{}]", e.getMessage());
//            log.error(e.getMessage(),e);
//            return Result.fail(unifiedException.getIEnum() == null ? unifiedException.getMessage() : unifiedException.getIEnum().getMessage());
//        }
//        //其他异常处理
//        log.error("exception happend [{}]" + e.getMessage(),e);
//        //打印堆栈信息方便调错
//        e.printStackTrace();
//        return Result.fail(e.getMessage());
//    }
//}
