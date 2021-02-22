package com.bankapp.service.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingAspect {
	private static Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	@Around("@annotation(Loggable)")
	public Object logging(ProceedingJoinPoint pjp) throws Throwable {
		long start=System.currentTimeMillis();
		Object val=pjp.proceed();
		long end=System.currentTimeMillis();
		String methodName=pjp.getSignature().getName();
		logger.info("method "+methodName +" take "+ (end-start));
		return val;
	}
}
