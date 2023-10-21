package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PageSuffixAfterAspect {
    Logger logger = LoggerFactory.getLogger(PageSuffixAfterAspect.class);
    @AfterReturning(value = "execution(* hr.kingict.springbootakademija2023_2.service.PageSuffixService.getSuffix())",returning="result")
    private void afterPageSuffixServiceGetSuffix(String result){
        logger.error("afterPageSuffixServiceGetSuffix " + result);

    }
}
