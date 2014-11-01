class headOrTails{
	
}
public class HeadOrTailsMainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numberGenerator = Math.random()*10;
		System.out.println("You flipped a coin! ");
		if(numberGenerator > 4.3){
			System.out.println("You got heads!");
		}else{
			System.out.println("You got tails!");
		}
	}

}
