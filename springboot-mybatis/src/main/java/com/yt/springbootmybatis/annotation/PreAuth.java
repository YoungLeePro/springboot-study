package com.yt.springbootmybatis.annotation;

import org.omg.CORBA.StringHolder;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PreAuth {
    String value() default "....";
}
