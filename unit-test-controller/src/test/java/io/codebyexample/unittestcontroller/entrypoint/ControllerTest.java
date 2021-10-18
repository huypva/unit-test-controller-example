package io.codebyexample.unittestcontroller.entrypoint;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.codebyexample.unittestcontroller.core.entity.Greeting;
import io.codebyexample.unittestcontroller.core.usecase.GreetUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

/**
 * @author huypva
 */
@WebMvcTest(Controller.class)
class ControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private GreetUseCase greetUseCase;

  @Test
  void greet() throws Exception {
    String api = "/greet?name=World";
    Greeting greeting = new Greeting(1, "Hello World!");

    Mockito.when(greetUseCase.greet("World")).thenReturn(greeting);

    ResultActions resultActions = mockMvc.perform(get(api))
        .andDo(print());

    resultActions.andExpect(status().isOk())
        .andExpect(jsonPath("$.id", is(greeting.getId())))
        .andExpect(jsonPath("$.message", is(greeting.getMessage())));
  }
}