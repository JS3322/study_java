package model.organism;

public class Slime extends Organism{

    //red는 약한 슬라임, blue는 중간 슬라임, green은 강한 슬라임
    private String[] CheckColor = {"red", "blue", "green"};

    public Slime(String color) {
        for(int i= 0 ; i<CheckColor.length; i++) {
            if(CheckColor[i].equals(color)) {
                this.Hp = (i+10)*(int)(Math.random()*10)+20;
                break;
            }
        }

    }

    public int getHp() {
        return Hp;
    }
}
