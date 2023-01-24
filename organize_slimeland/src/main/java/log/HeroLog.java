package log;

import java.util.HashMap;

//로그인된 계정을 토대로 여러 로그를 저장
public class HeroLog {
    final private String Name;
    final private HashMap<String, Integer> stateData = new HashMap<>();

    public HeroLog() {
        Name = "알수없음";
        stateData.put("MaxHp",20);
        stateData.put("MaxMp",30);
        stateData.put("Hp",40);
        stateData.put("Mp",50);
        stateData.put("exp",0);
    }
    public int getHeroState(String key) {
        if(stateData.containsKey(key)) {
            return stateData.get(key);
        }else {
            return 0;
        }
    }
    public void setHeroState(String key, int value) {
        stateData.put(key, value);
    }
}
