public class TimeCalc {
    public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);

        int Totalminutes = (hours * 60) +  minutes + minutesToAdd;
        int totalHours = Totalminutes/60;
        int newHours = totalHours%24;
        int newMinutes = Totalminutes - (totalHours*60);

        if(newHours<= 11 && newMinutes>=10){
			System.out.println(newHours + ":" + newMinutes + " AM");
		}
		else if(newHours<= 11 && newMinutes<10){
			System.out.println(newHours + ":0" + newMinutes + " AM");
			
		}
		else if(newHours == 12 && newMinutes>=10){
			System.out.println(newHours + ":" + newMinutes + " PM");
			

		}
		else if(newHours == 12 && newMinutes<10){
			System.out.println(newHours + ":0" + newMinutes + " PM");

		}
		else if(newMinutes>=10 ){
			System.out.println(newHours -12 + ":" + newMinutes + " PM");
		}
		else{
			System.out.println(newHours -12 + ":0" + newMinutes + " PM");
		}
    }
}