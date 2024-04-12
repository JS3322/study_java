package kr.cleancode.s520_generic;

//import lombok.Data;

import lombok.Data;

@Data
public class APIJobStart2VO {

  private String dataSource2;
  private String start2;

  public APIJobStart2VO() {
    this.dataSource2 = "2222";
    this.start2 = "22221";
  }
}
