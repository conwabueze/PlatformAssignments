import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        ////////What if..../////////

        //int people = 1;
        //int cats = 1;
//        int dogs = 1;

//        int people = 1;
//        int cats = 2;
//        int dogs = 3;

        int people = 4;
        int cats = 1;
        int dogs = 8;

        if(people<cats) System.out.println("Too many cats! The world is doomed!");
        else if(people>cats) System.out.println("Too few cats! The world is saved for another day!");
        else if(people<dogs) System.out.println("The world is drooled on!");
        else if(people>dogs) System.out.println("The world is dry!");

        ///////Legal Problems////////

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hey! " + name + " what is your age?");
        int age = input.nextInt();

        if(age<16) System.out.println(name + " you can't drive");
        if(age<18) System.out.println(name + " you can't vote");
        if(age<25) System.out.println(name + " you can't rent a car");
        if(age>25) System.out.println(name + " you can do anything that's legal");

        ////////Legal Problems//////////
        int people2 = 1;
        int cars = 2;
        int buses = 3;

        if(cars>people2) System.out.println("We should take the cars");
        else if(cars<people2) System.out.println("We should not take the cars.");
        else System.out.println("We can't decide");

        if(buses>cars) System.out.println("That's too many buses.");
        else if(buses<cars) System.out.println("Maybe we should take the buses.");
        else System.out.println("We still can't decide");

        if(people2>cars) System.out.println("Alright, let's just take the buses");
        else System.out.println("Let's just take the cars");

        /*
           1. The else if is for further conditioning if the first if statement is't met.
              Else is basically the default if all else fails.

           2. If I remove the else from my else if there is no longer a default.

        */


        /////////////Specific legal problems//////////////
        input.nextLine();
        System.out.println("What is your name? ");
        String name2 = input.nextLine();
        System.out.println("Hey! " + name2 + " what is your age?");
        int age2 = input.nextInt();

        if(age2<16) System.out.println(name2 + " you can't drive");
        else if(age2<18) System.out.println(name2 + " you can't vote");
        else if(age2<25) System.out.println(name2 + " you can't rent a car");
        else if(age2>25) System.out.println(name2 + " you can do anything that's legal");



        //////////Day of the week////////////
        System.out.println("Please enter an integer");
        int dayOfWeek = input.nextInt();
        switch (dayOfWeek){
            case 1:
                System.out.println("Weekday " + dayOfWeek + " is Monday!"); break;
            case 2:
                System.out.println("Weekday " + dayOfWeek + " is Tuesday!"); break;
            case 3:
                System.out.println("Weekday " + dayOfWeek + " is Wednesday!"); break;
            case 4:
                System.out.println("Weekday " + dayOfWeek + " is Thursday!"); break;
            case 5:
                System.out.println("Weekday " + dayOfWeek + " is Friday!"); break;
            case 6:
                System.out.println("Weekday " + dayOfWeek + " is Saturday!"); break;
            case 7:
                System.out.println("Weekday " + dayOfWeek + " is Sunday!"); break;
            default:
                System.out.println("Error"); break;
        }
        ///////////Space Weight//////////////

        System.out.println("Please enter your current weight");
        int weight = input.nextInt();

        System.out.println("I have information for the following planets");
        String[] planets= {"","Venus","Mars","Jupiter","Saturn","Uranus","Neptune"};
        for(int i = 1; i<planets.length;i++){
            System.out.println(i + ". " + planets[i]);
        }

        System.out.println("Which planet are you visiting?");
        int planet = input.nextInt();
        double planetWeight = 0;
        switch(planet){
            case 1: planetWeight=weight * 0.78;
            case 2: planetWeight=weight * 0.39;
            case 3: planetWeight=weight * 2.65;
            case 4: planetWeight=weight * 1.17;
            case 5: planetWeight=weight * 1.05;
            case 6: planetWeight=weight * 1.23;

        }

        System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");


    }

}
