package Ex07;

public class Ex7_8 {

	public static void main(String[] args) {
		
	   Buyer b = new Buyer();
	   
	   Product p = new Tv1();
	   b.buy(p);
	//   b.buy(new Tv1()); // buy(Product p)
	   
	   
	   b.buy(new Computer()); // buy (Product p)
	   
	   System.out.println("현재 남은 돈은" + b.money + "만원입니다");
	   System.out.println("현재 보너스 점수는" + b.bonusPoint + "점입니다.");
	}
	}

class Product {
	int price; //제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스
	
	Product(int price){
		this.price =price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1(){ //조상클래스의 생성자 Product 
		super(100); // Tv의 가격을 100만원으로 함 조상의 생성자를 호출
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {super(200);}
	
	public String toString() { return "Computer";}}


class Buyer {
	int money =1000;
	int bonusPoint =0;
	
	void buy (Product p) { // new Tv1(); new Computer();
		if (money <p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString()+"을/를 구입하셨습니다.");
	}
}