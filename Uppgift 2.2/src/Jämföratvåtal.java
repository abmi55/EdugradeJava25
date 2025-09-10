public class Jämföratvåtal {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        System.out.println("a = "+ a +", b = "+ b);
        System.out.println("-----------------");

        // jämför om a är lika med b
        boolean isEqual = (a == b);
        System.out.println("är a lika med b? "+ isEqual);

        // jämför om a är större än b
        boolean isGreater = (a > b);
        System.out.println("är a större än b? "+ isGreater);

        // jämför om a är mindre eller lika med b
        boolean isLesserorEqual = (a <= b);
        System.out.println("är a mindre eller lika med b? "+ isLesserorEqual);
    }
}
