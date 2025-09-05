public class main2 {
    public static void main(String[] args) {
        //
        int number1 = 3;
        int number2 = 4;
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();

        changeGearAndNumber(number1,number2,bicycle,bicycle2);
        System.out.println(bicycle.describe());
        System.out.println(bicycle2.describe());
        System.out.println( "הוא המספר " + number1 );
        System.out.println( "הוא המספר " + number2 );
    }
    static void changeGearAndNumber(int i,int i2,Bicycle a, Bicycle b ){
        i = 20;
        i2 = 25;
        a.ChangeColor("שקוף");
        b.ChangeColor("כחול פייסבוק");
    }


}
