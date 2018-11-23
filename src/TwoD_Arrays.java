import java.util.ArrayList;
import java.util.Scanner;

public class TwoD_Arrays {
    public static void main(String[] args) {
       ////////////1.Max value//////////////
        System.out.println("1. Max value");
        System.out.println();
        //Array creation
        int[][] heyyy = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //Array print out
        for(int row = 0; row<heyyy.length; row++){
            for(int col = 0; col<heyyy[row].length; col++){
                System.out.print(heyyy[row][col]+ " ");
            }
            System.out.println();
        }
        //Array find max
        int max = 0;
        for(int row = 0; row<heyyy.length; row++){
            for(int col = 0; col<heyyy[row].length; col++){
                if(heyyy[row][col]>max) max = heyyy[row][col];
            }

        }
        System.out.println("Max value: " +max);



        ////////////////2.sum of a column////////////////
        System.out.println();
        System.out.println("2.Sum of a column");
        int[][] yerrr = new int[3][3];

        //inputing random data
        for(int row = 0; row<yerrr.length; row++){
            for(int col = 0; col<yerrr[row].length; col++){
                yerrr[row][col]=(int)(Math.random()*100)+1;
            }

        }
        //array print out
        for(int row = 0; row<yerrr.length; row++){
            for(int col = 0; col<yerrr[row].length; col++){
                System.out.print(yerrr[row][col]+" ");
            }
            System.out.println();
        }
        //suming column
        Scanner input = new Scanner(System.in);
        System.out.println("Which column would like summed?");
        int selected = input.nextInt();
        selected-=1;

        int sum = 0;

        for(int row = 0; row<yerrr.length; row++){
            for(int col = 0; col<yerrr[row].length; col++){
                if(col==selected) sum+=yerrr[row][col];
            }
        }

        System.out.println("selected col sum: " + sum);

        /////////////////////Tic Tac Toe//////////////////////
        System.out.println();
        System.out.println("3. Tic Tac Toe");
        char[][] ticTac = new char[3][3];

        //print out space
        for(int row=0; row<ticTac.length;row++){
            for(int col=0; col<ticTac[row].length;col++ ){
                ticTac[row][col]=' ';
            }
        }

        boolean play = true;
        input.nextLine();
        ///loop
        int openSpotCount = 9;
        int turns = 1;
         ArrayList<String> confirmedSpaces = new ArrayList<>();
        while(play==true) {




            if (openSpotCount==0){
                System.out.println("We've reached the end");
                break;
            }
            //check if board is full and post what is available
            System.out.println("positions left"); //header

            for (int row = 0; row < ticTac.length; row++) {
                for (int col = 0; col < ticTac[row].length; col++) {
                    if(ticTac[row][col]!=' '){
                        continue;
                    }
                    else System.out.println("("+row + "," + col+")");
                }
            }

            if(openSpotCount==0) break;

            System.out.print(openSpotCount + " open spots left");

            System.out.println("Make a move in format x,y: ");

            String coordinate = input.nextLine();
            int comma= coordinate.indexOf(",");
            int x = Integer.parseInt(coordinate.substring(0,comma));
            int y = Integer.parseInt(coordinate.substring(comma+1));

            if(turns%2==0){
                ticTac[x][y]='y';
            }else{
                ticTac[x][y]='x';
            }
            turns++;

            for (int row = 0; row < ticTac.length; row++) {
                for (int col = 0; col < ticTac[row].length; col++) {
                    System.out.print(ticTac[row][col]+" ");
                }
                System.out.println();
            }

            openSpotCount--;
            if(openSpotCount == 0) break;

        }

        /////////////////////4.Movement on a 2D Plane//////////////////////
        char[][] plane = new char[5][5];
        for (int row = 0; row < plane.length; row++) {
            for (int col = 0; col < plane[row].length; col++) {
                plane[row][col]='0';
            }
        }

        int x = 2;
        int y = 2;
        plane[x][y]='X';


        //print out
        for (int row = 0; row < plane.length; row++) {
            for (int col = 0; col < plane[row].length; col++) {
                System.out.print(plane[row][col]+" ");
            }
            System.out.println();
        }


        while(true) {
            System.out.println("Enter direct(up,down,left,right)");
            String direct = input.nextLine();

            if (direct.equals("up".toLowerCase()) && x != 0) {
                plane[x][y] = '0';
                x -= 1;
                plane[x][y] = 'X';

            } else if (direct.equals("down".toLowerCase()) && x != 4) {
                plane[x][y] = '0';
                x += 1;
                plane[x][y] = 'X';
            } else if (direct.equals("left".toLowerCase()) && y != 0) {
                plane[x][y] = '0';
                y -= 1;
                plane[x][y] = 'X';
            } else if (direct.equals("right".toLowerCase()) && y != 4) {
                plane[x][y] = '0';
                y += 1;
                plane[x][y] = 'X';
            } else {
                System.out.println("Error: You cannot move there from your current position");
                System.out.println("Exiting program...");
                break;
            }


            for (int row = 0; row < plane.length; row++) {
                for (int col = 0; col < plane[row].length; col++) {
                    System.out.print(plane[row][col] + " ");
                }
                System.out.println();
            }

        }








    }


}
