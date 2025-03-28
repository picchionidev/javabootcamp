package exercises;

public class equal {
    public static void main(String[] args) {
        boolean condition;
        String nome1="Carlos";
        String nome2="Carlo";
        condition=nome1.equals(nome2);
        if(condition){
            System.out.println("Yes");
        }
        else{
            System.out.println("Noo");
        }
    }
}
