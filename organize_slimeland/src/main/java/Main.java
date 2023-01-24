import log.HeroLog;
import model.organism.Slime;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Slime[] intArraySlime = createSlime();



        Scanner sc = new Scanner(System.in);
        while(true) {
            menuView();
            switch(sc.nextLine()) {
                case "1" : viewState(intArraySlime);
                    break;
                case "2" : AutoAttact(intArraySlime);
                    break;
                default:
                    System.out.println("다시 입력 해 주세요");
                    break;
            }
        }
    }

    private static void menuView() {
        System.out.println("[Welcome to SlimeLanad]");
        System.out.println("다음 메뉴를 선택 하세요");
        System.out.println("1. 슬라임 정보 보기");
        System.out.println("2. 최적의 자동공격 실행");
    }

    private static void AutoAttact(Slime[] i_slime) {
        System.out.println("공격 알고리즘 출력합니다");
        //공격 알고리즘 생성
        AlgorithmStart();
        
        //콘솔창 출력
        eventView();
    }

    private static void AlgorithmStart() {
    }

    private static void eventView() {
    }

    private static Slime[] createSlime() {
        int slimeCount = (int)((Math.random()*10));
        int slimeSelectNumber;
        String slimeColorName = "red";
        Slime[] arraySlime = new Slime[slimeCount];
        for(int i=0; i<slimeCount; i++) {
            slimeSelectNumber = (int)((Math.random()*2));
            if(slimeSelectNumber == 0) {
                slimeColorName = "red";
            }else if (slimeSelectNumber == 1) {
                slimeColorName = "blue";
            }else if (slimeSelectNumber == 2) {
                slimeColorName = "green";
            }
            arraySlime[i] = new Slime(slimeColorName);
        }
        return arraySlime;
    }

    private static void viewState(Slime[] i_slime) {
        System.out.println("현재 슬라임들의 HP는 다음과 같습니다");
        for (int i=0; i< i_slime.length; i++) {
            System.out.println(i_slime[i].getHp());
        }
//        HeroLog hero = new HeroLog();
//        System.out.println(hero.getHeroState("Hp"));
//        hero.setHeroState("Hp", 50);
//        System.out.println(hero.getHeroState("Hp"));
    }
}
