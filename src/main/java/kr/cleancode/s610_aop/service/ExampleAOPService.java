package kr.cleancode.s610_aop.service;

import kr.cleancode.s610_aop.model.LogException;
import org.springframework.stereotype.Service;

@Service
public class ExampleAOPService {

  @LogException
  public void riskyMethod() {
    if(true) {
      throw new RuntimeException("Something went wrong!");
    }
  }

}
