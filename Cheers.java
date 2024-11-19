// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String name = args[0];
                name = name.toUpperCase();
                int times = Integer.parseInt(args[1]);
                System.out.println(name.indexOf(name));
                char spell = 'a';
                String spell2 = "an";


                for(int i=0; i<name.length(); i++ ){
                        if(name.charAt(i) ==('A') ||name.charAt(i) ==('E')||name.charAt(i) ==('F') ||name.charAt(i) ==('H')||name.charAt(i) ==('I')||name.charAt(i) ==('L') ||name.charAt(i) ==('M')||name.charAt(i) ==('N')||name.charAt(i) ==('O')||name.charAt(i) ==('R')||name.charAt(i) ==('S')||name.charAt(i) ==('X')){
                                System.out.println("Give me "+ spell2+ " "+ name.charAt(i)+": " + name.charAt(i) +"!");

                   }
                   else{
                        System.out.println("Give me " +spell +"  " + name.charAt(i)+": " + name.charAt(i) +"!");
                   }
                        
                }
                System.out.println("What does that spell?");

                for(int i=0; i<times; i++){
                        System.out.println(name+"!!!");

                }

        }
}
