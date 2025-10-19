import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubClass objs = new SubClass();       
        MyProcess objp = new MyProcess();

        objs.summary();
        
        for(int i = 0; i < 8; i++){
            System.out.print("Enter number: ");
            objs.numbers[i] = sc.nextInt();
        }
        for(int num : objs.numbers){
            if (objp.Positive(num) && objp.Whole(num)){
                objs.positive++;
            }
            else if (objp.Negative(num) && objp.Whole(num)){
                objs.negative++;
            }


            
        }

        System.out.println("Positive whole numbers: " + objs.positive());
        System.out.println("Negative whole numbers: " + objs.negative());


    }
}