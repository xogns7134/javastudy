package 부품사용하기;

import 부품만들기.Dog;
import 부품만들기.Telephone;

public class 내방만들기 {
	public static void main(String[] args) {
		Telephone phone = new Telephone();
		phone.카톡();
		phone.인터넷();
		Dog dog = new Dog();
		dog.색();
		dog.사이즈();
		dog.이름();
		dog.품종();
		dog.하는일();
	}
}
