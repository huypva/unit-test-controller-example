package io.codebyexample.unittestsonarqube.core.usecase;

import io.codebyexample.unittestsonarqube.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
