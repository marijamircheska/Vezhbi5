package zadaca2;

public class Glavvna {

	public static void main(String[] args) {
		double x=35.15;
		double y=10.5;
		KalkulatorZaDecimalniBroevi calc=new KalkulatorZaDecimalniBroevi();
		System.out.println("Odzemanje: " + calc.odzemanje(x, y));
		System.out.println("Sobiranje: "+ calc.sobiranje(x, y));
        System.out.println("Mnozenje: "+ calc.mnozenje(x, y));
        System.out.println("Delenje: "+calc.delenje(x, y));
        System.out.println("Ostatok: "+calc.ostatok(x, y));
        System.out.println("Stepenuvanje: "+calc.stepenuvanje(x, y));
	}

}
