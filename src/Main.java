//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ageCheck(int age) {
        int LIMIT = 18;
        boolean isAdult = age >= LIMIT;
        System.out.println("IS ADULT:" + isAdult);
    }

    public static void main(String[] args) {
        ageCheck(8);
        //COMPARISON OPERATORS
        System.out.println(25 >= 21); //greater than or equal
        System.out.println(25 <= 21); //less than or equal
        System.out.println(25 < 21); //less than
        System.out.println(25 > 21); //greater than
        System.out.println(25 == 21); //exactly equal
        System.out.println(25 != 21); //Not equal

        boolean IsDiabetic = true;
        boolean likesCake = true;
        if (likesCake && !IsDiabetic) { //if likes cake AND is NOT diabetic
            System.out.println("eats cake");
        }
        boolean isCat = false;
        boolean isDog = true;
        if (isCat || isDog) { // if is a cat OR is a dog then pet it.  || means or
            System.out.println("Pet it");
        }else{
            System.out.println("Don't pet it.");
        }
    }
}