import java.util.Scanner;

public class temp {


    public static void main (String[] args){


        double avg = 0, counter = 0;
        double[] measure = new double[7];

        Scanner keyboard = new Scanner(System.in);

        for(int i = 8; i < 15; ++i){

            System.out.printf("enter the themp at %d:00 hours", i);

            measure[i- 8] = keyboard.nextDouble();
        }

        for(int i = 0; i < 7; ++i){

            larger_temp = 0;

            if(measure[i] > larger_temp){

                larger_temp = measure[i];
            }
        }

        for(int i = 0; i < 7; ++i){

            lower_temp = 1000;

            if(measure[i] < lower_temp){

                lower_temp= measure[i];
            }
        }

        for(int i = 0; i < 7; ++i){

            
       counter += measure[i];

    }

            avg = counter/(measure.lenght());
            System.out.printf("the highest temperature is: %.2f \nthe lower temperature is: %.2f \n",larger_temp,lower_temp);
            System.out.println("the average ois "+ avg);

        }
    }
