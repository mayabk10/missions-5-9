//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        double d = 1797693134862315708145274257477587564637317048467569.566;
        int i = 2147483647;
        long l = 3402823543454532454L;

        //2
        int i2 =(int) 3402823543454532454d;


        Bicycle b1 = new Bicycle();
        b1.ChangeGear(2);
        b1.Pedal();
        b1.RingBell();
        b1.Stop();
        b1.ChangeGear(3);
        b1.Pedal();
        b1.Stop();


    }
}