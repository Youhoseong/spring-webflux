package web.flux.webflux.aop.annotations;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Validations {

    String failMethod() default "";
}
