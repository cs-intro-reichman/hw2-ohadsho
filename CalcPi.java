// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int times = Integer.parseInt(args[0]);
        double pi = 1.0;
		double divide = 3.0;



		for (int i=0 ; i<times; i++){
			 if(i%2 ==0){
			pi = (pi-(1.0/divide));
			System.out.println(pi);
		}
		     else{
			pi = (pi+(1.0/divide));
			System.out.println(pi);
		}
			divide = divide +2;
		}
		System.out.println("pi accorrding to Java: " + Math.PI);
		System.out.println("pi, approximated:      " + pi*4.0);
	}
}
