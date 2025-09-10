//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 30;  //Heltal
        double height = 1.75;  //Decimal tal
        char initial = 'A';  //Ett täcken
        String name = "ALice"; //En text
        boolean isStudent = true;  //Sant/falskt värde

        //Nu skriver vi ut variablerna
        System.out.println("Variabeln age har värdet: "+ age+" och är av typen: int");
        System.out.println("Variabeln height har värdet: "+ height+" och är av typen: double");
        System.out.println("variabeln initial har värdet: " + initial+" och är av typen: char");
        System.out.println("variabeln name har värdet: "+ name+" och är av typen: "+((Object) name).getClass().getName());
        System.out.println("Variabeln isStudent har värdet: "+ isStudent+" och är av typen: bolean");
    }
}