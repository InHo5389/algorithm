package recursive;

public class Recursive {

    public static void main(String[] args) {
        Recursive rs = new Recursive();
        int factorial = rs.factorial(5);
        System.out.println(factorial);
    }

    int factorial(int data){
        if (data == 1) {
            return 1;
        } else if (data == 2) {
            return 2;
        } else if (data == 3) {
            return 4;
        }
        return this.factorial(data - 1) + this.factorial(data - 2) + this.factorial(data - 3);

    }
}
