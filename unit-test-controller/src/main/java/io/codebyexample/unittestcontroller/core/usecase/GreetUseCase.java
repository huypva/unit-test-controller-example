package io.codebyexample.unittestcontroller.core.usecase;

import io.codebyexample.unittestcontroller.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
