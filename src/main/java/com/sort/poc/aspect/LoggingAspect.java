package com.sort.poc.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


/*
 * LoggingAspect  class responsible for logging at various functionalities of application.
 * And if any method thrws any error.
 * */
@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {
	private final static Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());
	/*
	 * Loggs information before execution of methods specified in respective packages
	 * */
	@Before("execution(* com.sort.poc.*.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {

		LOGGER.info("  logBefore Class : " + joinPoint.getTarget().getClass().getName() + "  Method : "
				+ joinPoint.getSignature().getName());
		Object[] signatureArgs = joinPoint.getArgs();
		for (Object signatureArg : signatureArgs) {
			LOGGER.info("Arg: " + signatureArg);
		}

	}
	/*
	 * Loggs information after returning result  of methods specified in respective packages
	 * */
	@AfterReturning(pointcut = "execution(* com.sort.poc.*.*.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		LOGGER.info("  logAfter Class : " + joinPoint.getTarget().getClass().getName() + "  Method : "
				+ joinPoint.getSignature().getName());

		LOGGER.info("Method returned value is : " + result);

	}
	/*
	 * Logs information if any methods throws exception 
	 * */
	@AfterThrowing(pointcut = "execution(* com.sort.poc.*.*.*(..))",
	        throwing="ex")
	public void logAfterThrowingAllMethods(JoinPoint joinPoint,Exception ex) {
		
		LOGGER.error("  AfterThrowing Class : " + joinPoint.getTarget().getClass().getName() + "  Method : "
				+ joinPoint.getSignature().getName());
		LOGGER.error("Exception  : " + ex.getMessage());

	} 
 

}