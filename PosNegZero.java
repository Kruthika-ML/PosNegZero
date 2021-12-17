public class PosNegZero {
    public static void main(String[] args){
        Answer(3);
        Answer(7);
        Answer(-9);
        Answer(0);
    }
    public static void Answer(int num){
        if(num>0){
            System.out.println("The number is greater than Zero");
        } else if(num<0){
            System.out.println("The number is less than Zero");
        } else{
            System.out.println("It is Zero");
        }
    }
}
