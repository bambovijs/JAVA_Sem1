package javasem01;

/**
    Semināra NR.1 uzdevumi, lai praktizētu JAVA
    @author Raivo Bambis
 */

public class JavaSem01 {
    /**
     * @param args
     */
    public static void main(String[] args) {    

        /* EXERCISE 0 - WURMUP */
        // String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
    
        // int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
           
        // if(names.length == times.length){
        //     for(int i = 0; i < names.length; i++){
        //         System.out.println(names[i] +" "+ times[i]);
        //     }
        // }

        /* EXERCISE 1 */
        // position calculator in case of a falling point-like object
        // This is an example with a partial implementation in main method

        // double gravity = -9.81; // Earth's gravity in m/s^2
        // double initialVelocity = 10.0;
        // double fallingTime = 5.0;
        // double initialPosition = 100.0;
        // double finalPosition = 0.0;
        // System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);

        // finalPosition = positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
        // System.out.println(finalPosition + " ");
    
        /* EXERCISE 2 */ 
        // Compute factorial
        // int number = 5;
        // System.out.println("Factorial of number(For loop) " + number + " is: " + factorialForLoop(number));
    
        // Recursive function for factorial compute
        // System.out.println("Factorial of number(Recursive) " + number + " is: " + factorialRecursive(number));

        /* EXERCISE 3 */
        // Working with arrays:
        // Create function that:
           
        // // Create double type array and fills it with N random
        // double[] array = generateArray(10, 2, 10);
        // // Return Mean value
        // System.out.println("Return Mean Value: " + getMean(array));
        // // Return the smallest and biggest values
        // System.out.println("Min Value: " + getMin(array));
        // System.out.println("Max Value: " + getMax(array));

        // // Implement Bubble sort (return sorted array in ascending order)
        // arraySort(array);
  
        // // Check sorted array
        // // for(int i = 0; i < array.length; i++){
        // //     System.out.println("ELEMENT " + i + " :" + array[i]);
        // // }

        /* EXERCISE 4 */
        // //Create a mutlidimentional rectangular matrix (2 dimentional array) of size NxN
        // double[][] matrix = generateMatrix(5);
        // //Output the dot product of i-th row and j-th column
        // System.out.println(getProduct(matrix, 0, 1));

        /* EXERCISE 5 */
        //coinFlip(100);
        //rollDice(10);
        //roll2Dices();

        /* EXERCISE 6 */
        // byte[] bytes = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101, 32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
        // System.out.println("Text: " + getTextFromBytes(bytes));

        /* EXERCISE 7 */
        
    }


    /* FOR EXERCISE 1 - WURMUP */
    // position calculator in case of a falling point-like object
    // This is an example with a partial implementation in main method
    public static double positionCalc(double gravity, double initialVelocity, double
    initialPosition, double fallingTime){       
        return 0.5 * gravity * Math.pow(fallingTime,2) + initialVelocity * fallingTime + initialPosition;
    }


    /* For EXERCISE 2 */ 
    // Compute factorial 
    public static int factorialForLoop(int number){

        if(number > 0){
            int factorial = 1;

            for(int i = 1; i <= number; i++){
                factorial = factorial * i;
            }

            return factorial;
        }

        return 0;
    }
    // Recursive factorial 
    public static int factorialRecursive(int N){
        if(N < 0){
            return 0;
        }
        if(N > 0) {
            return N * factorialRecursive(N-1);
        }

        return 1;
    }

    /* For EXERCISE 3 */
    // Create double type array and fills it with N random
    public static double[] generateArray(int N, double lower, double upper){
        double[] array = new double[N];
        
        for(int i = 0; i < N; i++){
            double rand = lower + (Math.random() * (upper-lower));
            
            array[i] = rand;
        }
        
        // Check array 
        // for(int i = 0; i < N; i++){
        //     System.out.println("ARRAY ELEMENT:" + i + " Value: " + array[i]);
        // }
        
        return array;
    }

    // Return Mean value
    public static double getMean(double[] array){
        double sum = 0;

        if(array != null){
            for(int i = 0; i < array.length; i++){
                sum += array[i];
            }
        }
        
        return sum / array.length;
    };

    // Return the smallest and biggest values 
    public static double getMin(double[] array){
        double min = array[0];
            
        if(array != null){
            for(int i = 0; i < array.length; i++){
                if(array[i] < min){
                    min = array[i];
                }
            }
        }
            
        return min;
    };

    public static double getMax(double[] array){
        double max = array[0];
        if(array != null){
            for(int i = 0; i < array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }
            }
            
        }

        return max;
    }

    // Implement Bubble sort (return sorted array in ascending order)
    public static double[] arraySort(double[] array){
        double temp = array[0];
        
        if(array != null){
            //access each array element
            for(int i = 0; i < array.length-1; i++){
                //loop to compare array elements
                for(int j = 0; j < array.length-i-1; j++){
                    //compare array elements
                    if(array[j] > array[j+1]){
                        //swap them
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

           
        }

        return array;
    }

    /* For EXERCISE 4 */
    //Create a multidimensional rectangular matrix (2 dimensional array) of size NxN
    public static double[][] generateMatrix(int N){
        double[][] array = new double[N][N];
     
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                array[i][j] = Math.random() * 10;
            }
        }
        
        return array;
    };

    //Output the dot product of i-th row and j-th column
    public static double getProduct(double[][] matrix, int i, int j){
        
        //Check value
        //System.out.println(matrix[0][1]);
        
        if(matrix != null){
            return matrix[i][j];
        }

        return 0;
    }

    /* For EXERCISE 5 */
    // Coin Flip
    // The method returns an array of three elements where:
    // element at index 0 - number of heads
    // element at index 1 - number of tails
    // element at index 2 - ratio: nheads/ntails
    public static double[] coinFlip(int N){
        double[] coinFlip = new double[3];
        
        for(int i = 0; i < N; i++){
            double randomNum = Math.round(Math.random());
            
            if(randomNum == 0){
                coinFlip[0] += 1;
                // System.out.println(coinFlip[0] + " Heads");
            }
            else if(randomNum == 1){
                coinFlip[1] += 1;
                // System.out.println(coinFlip[1] + " Tails");
            }  
        }
        
        coinFlip[2] = coinFlip[0] / coinFlip[1];

        for(int i = 0; i < coinFlip.length; i++){
            System.out.println("HEADS: " + coinFlip[0] + " " + "TAILS: " + coinFlip[1] + " " + "RATIO: " + coinFlip[2] );
        }
        
        return coinFlip;
    }

    // Roll Dice 
    // Simulate N rolls and count the number of each occurrence (histogram).
    public static int[] rollDice(int N){
        int[] rollDice = new int[6];
        
        for(int i = 0; i < N; i++){
            int randomNum = (int)Math.round((Math.random() * (6-1)) + 1);
            
            switch(randomNum){
                case 1 -> rollDice[0] += 1;
                case 2 -> rollDice[1] += 1;
                case 3 -> rollDice[2] += 1;
                case 4 -> rollDice[3] += 1;
                case 5 -> rollDice[4] += 1;
                case 6 -> rollDice[5] += 1;
            }
        }

        System.out.println("1:" + rollDice[0] + " 2:" + rollDice[1] + " 3:" + rollDice[2] + " 4:" + rollDice[3] + " 5:" + rollDice[4] + " 6:" + rollDice[5] );
        
        return rollDice;
    }

    // Roll 2 Dices
    // Roll two dices until both are 6 (12 together). Output the number of tries until the desired
    // combination became true
    public static int roll2Dices(){
        int attempts = 0;
        boolean flag = true;

        while(flag){
            int randomNumDice1 = (int)Math.round(Math.random() * (6-1) + 1);
            int randomNumDice2 = (int)Math.round(Math.random() * (6-1) + 1);
            attempts++;
            
            if(randomNumDice1 + randomNumDice2 == 12){
                attempts++;
                flag = false;
                
                System.out.println("Attempts till both dices are 6: " + attempts);
            }
        }
        
        return attempts;
    }

    /* For EXERCISE 6 */
    // Output the corresponding char values as a string!
    public static String getTextFromBytes(byte[] array){
        String str = new String(array);

        return str;
    }

    /* For EXERCISE 7 */
}