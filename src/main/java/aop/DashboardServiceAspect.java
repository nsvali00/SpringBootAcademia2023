package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DashboardServiceAspect {

    Logger logger = LoggerFactory.getLogger(DashboardServiceAspect.class);
    @Before(value = "execution(* hr.kingict.springbootakademija2023_2.service.DashboardService.getDashboard(..))")
    private void beforeDashboardServiceGetDashboard(JoinPoint joinPoint){
        // it will start before getDasboard()
        logger.info("beforeDashboardServiceGetDashboard : " + joinPoint.getTarget().getClass().getSimpleName());
    }
}
