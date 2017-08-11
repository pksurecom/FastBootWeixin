package com.example.myproject.controller.invoker.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface WxApiBody {

    Type type() default Type.JSON;

    enum Type {
        JSON, XML
    }

}
