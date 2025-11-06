// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	  
	int counter = Integer.parseInt(args[0]);
	double pai = Math.PI;
	double sumPlus = 0; 
	double sumMinus = 0;
	
	if (counter %2 == 0 ){
		double x = 1; 
		double y = 1; 
		for (int i = 0; i<counter/2; i++){
		sumPlus += x/y;
		y = y+4;
}
		double xx = 1; 
		double yy = 3; 
		for (int i = 0; i<counter/2; i++){
		sumMinus += xx/yy;
		yy = yy+4;
}
	}
else {
		double x = 1; 
		double y = 1; 
		for (int i = 0; i<counter/2 +1; i++){
		sumPlus += x/y;
		y = y+4;
}
		double xx = 1; 
		double yy = 3; 
		for (int i = 0; i<counter/2; i++){
		sumMinus += xx/yy;
		yy = yy+4;
}

}
double FinalSum = (sumPlus - sumMinus)*4;
//pi according to Java:
//pi, approximated:
System.out.println("pi according to Java:"+" "+pai);
System.out.println("pi, approximated:"+" "+FinalSum);

	}
}
