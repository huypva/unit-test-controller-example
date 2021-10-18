package io.codebyexample.unittestsonarqube.core.usecase;

import io.codebyexample.unittestsonarqube.core.entity.Greeting;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class GreetUseCaseImpl implements GreetUseCase {

  @Override
  public Greeting greet(String name) {

    return new Greeting(1, String.format("Hello %s!", name));
  }
}
