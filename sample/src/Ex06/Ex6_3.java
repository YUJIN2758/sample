package Ex06;

public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Card Width= " + Card.width);
		 System.out.println("Card Width= " + Card.height);
		 
		 Card c1 = new Card();
	     c1.kind ="Heart";
		 c1.number =7;
		 
		 Card c2 = new Card();
		 c2.kind ="Space";
		 c2.number =4;
		 
		 System.out.println("c1은 " + c1.kind +"," +c1.number +"이며, 크기는 (" + Card.width + ","+ Card.height +")");
		 System.out.println("c2은 " + c2.kind +"," +c2.number +"이며, 크기는 (" + Card.width + ","+ Card.height +")");
		 System.out.println("c1의 width와 height를 변경합니다.");
		 
		 Card.height =50;//cv
		 Card.width =80;
		 System.out.println("c1은 " + c1.kind +"," +c1.number +"이며, 크기는 (" + Card.width + ","+ Card.height +")");
		 System.out.println("c2은 " + c2.kind +"," +c2.number +"이며, 크기는 (" + Card.width + ","+ Card.height +")");
	}

}


class Card {
	
	static int width =100;
	static int height =250;
	String kind;
	int number;
}