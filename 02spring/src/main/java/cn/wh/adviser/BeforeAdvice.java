package cn.wh.adviser;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法的增强 Befores");
    }
}
