package Operators;

public class Example4 {
	public static void  updateScore() {
		int score=50;
		int bonus=10;
		System.out.println("Score :"+score);
		System.out.println("bonus :"+ bonus);
		
		System.out.println("after applies score+=bonus :"+(score+=bonus));
		System.out.println("after applies score-=bonus :"+(score-=bonus));
		System.out.println("after applies score*=bonus :"+(score*=bonus));
		System.out.println("after applies score/=bonus :"+(score/=bonus));
		System.out.println("after applies score%=bonus :"+(score%=bonus));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             updateScore();
	}

}
