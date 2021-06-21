package com.sinensia.pedigest.backend.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAspect {

	private Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Before(value = "execution(* com.sinensia.pedigest.backend.business.services.impl.*.*(..))") //AspectJ
	public void logBusiness (JoinPoint joinPoint) {
		
		String clase = joinPoint.getTarget().getClass().getSimpleName();
		Signature signature = joinPoint.getSignature();
		
		logger.info("Business class: {} Method: {}" , clase, signature);	
	}
	

}
