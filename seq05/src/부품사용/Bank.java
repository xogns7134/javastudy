package 부품사용;

import 부품만들기.Account;

public class Bank {
    public static void main(String[] args) {
        // Account 객체 배열 생성
        Account[] accounts = new Account[3];

        // 각 계좌 정보 설정
        accounts[0] = new Account();
        accounts[0].name = "최영태";
        accounts[0].account = "튼튼적금";
        accounts[0].money = 1000;

        accounts[1] = new Account();
        accounts[1].name = "양민주";
        accounts[1].account = "튼튼예금";
        accounts[1].money = 2000;

        accounts[2] = new Account();
        accounts[2].name = "장태훈";
        accounts[2].account = "다음적금";
        accounts[2].money = 3000;

        // 각 계좌 정보 출력
        for (int i = 0; i < accounts.length; i++) {
            System.out.print("이름: " + accounts[i].name);
            System.out.print(" 계좌 이름: " + accounts[i].account);
            System.out.println(" 잔액: " + accounts[i].money);
        }
    }
}