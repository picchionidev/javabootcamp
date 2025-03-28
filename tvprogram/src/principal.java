public class principal {
    public static void main(String[] args) {
        SmarTv minhatv = new SmarTv();
        System.out.println(minhatv.ligada);
        System.out.println(minhatv.volume);
        System.out.println(minhatv.canal);

        minhatv.ligar();
        System.out.println(minhatv.ligada);
    }

}