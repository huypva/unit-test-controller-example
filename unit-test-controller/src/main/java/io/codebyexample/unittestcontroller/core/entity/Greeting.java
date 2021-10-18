package io.codebyexample.unittestcontroller.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author huypva
 */
@ToString
@Setter
@Getter
@AllArgsConstructor
public class Greeting {

  private int id;
  private String message;

}
