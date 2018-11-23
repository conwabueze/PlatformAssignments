import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        ///////////1.Copy an Array///////////
        int[]random = new int[10];
        randomGenerator(random);

        int[] copyRandom = new int[random.length];

        for(int i =0; i<random.length;i++){
            copyRandom[i]= random[i];
        }
        System.out.println("original array");
        printArr(random);
        System.out.println();
        System.out.println("copied array");
        printArr(copyRandom);



        /////////////2.Find a value in an Array/////////////////
        int[]random2 = new int[10];
        randomGenerator(random2);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        int desiredValue = input.nextInt();
        for(int i = 0; i<random2.length;i++){
            if(random2[i]==desiredValue)
                System.out.println("desired value: " + desiredValue + "found in index: " + i);
        }


        ///////////////////3.Largest value//////////////////////
        int[] random3 = new int[10];
        randomGenerator(random3);
        printArr(random3);
        int largest = 0;
        for(int i = 0; i<random3.length;i++){
            if(random3[i]>largest)largest=random3[i];
        }
        System.out.println("largest value is: "+ largest);

        //////////////////4.How many times///////////////
        int[] random4 = new int[10];
        randomGenerator(random4);
        printArr(random4);

        System.out.println("Enter the value you would like to search for: ");
        int search = input.nextInt();
        int count = 0;
        for(int i=0;i<random4.length;i++){
            if(random4[i]==search)count++;
        }
        System.out.println("count: " + count);


        ///////////////////5.comma seperated values///////////
        System.out.println("Please enter words each followed by a comma and space");
        input.nextLine();
        String response = input.nextLine();

        String[] strArr = response.split(", ");
        for(String word: strArr){
            System.out.print(word + " ");
        }
    }

    public static void printArr(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void randomGenerator(int[] arr){
        for(int i =0; i<arr.length;i++){
            arr[i]= (int)(Math.random()*10) + 1;

        }
    }
}
