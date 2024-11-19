// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed =0;
		int times = 0;

		if(mode.equals("v")){
		for(int i=1; i<=N ; i++){
			seed =i;
		
				if(seed ==1){
					times ++;
					System.out.print(1 + " " );
					seed = seed*3 +1;
				}
			while(seed!=1 ){
				times ++;
				System.out.print(seed);
				System.out.print(" ");
				if(seed%2==0){
					seed = seed/2;
				}
				else{
					seed = seed*3 +1;
				}
			}
			times ++;
			System.out.print(seed +" " +"(" + times + ")");
			times =0;
			System.out.println(" ");
		}
			}
			else{
				for(int i=1; i<=N ; i++){
					seed =i;
				if(seed ==1){
					seed = seed*3 +1;
				}
				while(seed!=1 ){
					if(seed%2==0){
						seed = seed/2;
					}
					else{
						seed = seed*3 +1;
					}
				}
				}

			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

		}
		}
	
