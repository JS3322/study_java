package kr.cleancode.s520_generic;

import lombok.Data;

@Data
public class APIJobStart1VO {

    private String dataSource;
    private String start;

    public APIJobStart1VO() {
        this.dataSource = "1111";
        this.start = "111122";
    }
}
