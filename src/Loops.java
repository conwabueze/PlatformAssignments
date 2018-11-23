import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.println(0);


        int a = 0;
        int b=1;
        for(int i = 0; i<9; i++){

           int c=a+b;
           a=b;
           b=c;

           System.out.println(a+b);
        }

        System.out.println();
        /////////1.The legendary FizzBuzz////////////
        for(int i=1;i<=100;i++){

            if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }

        /////////2.The Halving Machine//////////////
        Scanner input =new Scanner(System.in);
        System.out.println("Enter value:");
        int value = input.nextInt();
        for(int i = value; i>=1; i--){
            if(i%2==0) System.out.println(i/2); //even
            else  System.out.println((i+1)/2);//odd
        }



        /////////3.Letter at a time//////////////
        System.out.println("Enter String:");
        input.nextLine();
        String dissect = input.nextLine();
        for(int index = 0; index<dissect.length(); index++){
            System.out.println(index+": '"+dissect.charAt(index)+"'");
        }

        /////////4.Coordinates in a plane//////////////
        System.out.println("What is the maximum x?");
        int xMax = input.nextInt();
        System.out.println("What is the maximum y?");
        int yMax = input.nextInt();

        for(int x = 0; x<=xMax; x++){
            for(int y = 0; y<=yMax; y++){
                System.out.println("("+x+","+y+")");
            }
        }

        /////////5.Coordinates in a plane//////////////
        for(int i = 10; i<=20;i=i+2){
            if(i==16)continue;
            else
            System.out.println(i);
        }
        System.out.println();
        for(int i = 10; i<=20;i++){
            if(i%2!=0) continue;
            else System.out.println(i);
        }
        System.out.println();
        for(int i = 10; i>9;i=i+2){
            if(i%2!=0) continue;
            else if(i==20){ System.out.println(i); break; }
            else System.out.println(i);
        }

        /////////6.Evaluate Simple Expressions//////////////
        boolean stop = false;

        while(stop==false){
            System.out.println("Enter a expression");
            String expression = input.nextLine();
            if(expression.equals("0")) stop = true;
            double num1 = 0;
            double num2 = 0;
            int index = 0;
            if(expression.indexOf("+")!=-1){
                index = expression.indexOf("+");
                num1 = Double.parseDouble(expression.substring(0,index));
                num2 = Double.parseDouble(expression.substring(index+1));
                System.out.println(num1 + num2);
            }
            else if(expression.indexOf("-")!=-1){
                index = expression.indexOf("-");
                num1 = Double.parseDouble(expression.substring(0,index));
                num2 = Double.parseDouble(expression.substring(index+1));
                System.out.println(num1 - num2);
            }
            else if(expression.indexOf("*")!=-1){
                index = expression.indexOf("*");
                num1 = Double.parseDouble(expression.substring(0,index));
                num2 = Double.parseDouble(expression.substring(index+1));
                System.out.println(num1 * num2);
            }
            else if(expression.indexOf("/")!=-1){
                index = expression.indexOf("/");
                num1 = Double.parseDouble(expression.substring(0,index));
                num2 = Double.parseDouble(expression.substring(index+1));
                System.out.println(num1 / num2);
            }

        }


        ///////////////8 Patterns////////////////
        System.out.println("Pattern 1");
        for(int i = 1; i<=5; i++){

            for(int x = 1; x<=8; x++){
                System.out.print("8");
            }

            System.out.println();

        }
        System.out.println("Pattern 2");
        int count=4;
        for(int i = 1; i<=4; i++){

            for(int x = count; x>=1; x--){
                System.out.print("8");
            }
            count--;
            System.out.println();

        }
        System.out.println("Pattern 3");
        int count2=6;

        for(int i = 1; i<=7; i++){

            for(int x = count2; x>=1; x--){
                System.out.print(" ");
            }
            System.out.println("8");
            count2--;
            System.out.println();

        }

    }
}
