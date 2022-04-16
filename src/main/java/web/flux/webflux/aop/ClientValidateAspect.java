package web.flux.webflux.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ClientValidateAspect {

    @Around("@annotation(web.flux.webflux.aop.annotations.Validations)")
    public Object validate(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("Client validation starting...");
        Object proceed = joinPoint.proceed();

        return proceed;
    }



}
