import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Date;

class Main{

    public static void main(String[] args) {
        int animalCount = 0;
        System.out.println("I own " + animalCount + " " + pluralize("cat", animalCount) + ".");
//        System.out.println(Math.random())
        flipNHeads(3);
//        clock();

    }


    public static String pluralize(String animalName, int animalCount){
        if(animalCount == 0 || animalCount >= 2){
            return animalName+"s";
        }
        else if(animalCount == 1) {
            return  animalName;
        }
        return "";
    }

    public  static void flipNHeads(int num){
        int count=0;
        int i=1;
        while (count != num) {

            Random rand =  new Random();
            String flip="";
            if(rand.nextDouble() >=0.5){
                count++;
                System.out.println("heads");
                if(count==num) {
                    System.out.println("It took " + i + " flips to flip " + num + " head in a row.");
                    break;
                }
            }
            else{
                count =0;
                System.out.println("tails");
            }
            i++;
        }


    }

    public static void clock(){
        int x=0;
        while (x==0){
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            try
            {
                Thread.sleep(1000);

            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}