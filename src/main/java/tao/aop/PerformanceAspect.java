package tao.aop;

import org.springframework.stereotype.Component;

//@Aspect
@Component
public class PerformanceAspect {
//    @Pointcut("within(@org.springframework.stereotype.Repository *)")
//    public void repositoryClassMethods() {};
// 
//    @Around("repositoryClassMethods()")
//    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) 
//      throws Throwable {
//        long start = System.nanoTime();
//        Object returnValue = joinPoint.proceed();
//        long end = System.nanoTime();
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println(
//          "Execution of " + methodName + " took " + 
//          TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
//        return returnValue;
//    }
}
