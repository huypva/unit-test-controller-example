package io.codebyexample.unittestcontroller.core.usecase;


import io.codebyexample.unittestcontroller.core.entity.Greeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author huypva
 */
@SpringBootTest
class GreetUseCaseImplTest {

  @Autowired
  private GreetUseCaseImpl greetUseCaseImpl;

  @Test
  void greet() {
    Greeting expected = new Greeting(1, "Hello World!");

    Greeting actual = greetUseCaseImpl.greet("World");

    Assertions.assertEquals(expected.toString(), actual.toString());
  }
}