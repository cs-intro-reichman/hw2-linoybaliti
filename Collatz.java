public class Collatz {
   
    public static void calculateAndPrintSequence(int initialSeed) 
    {
       
        // ⚠️ שימוש בארגומנט שהתקבל, ושמירה של הזרע המשתנה
        int currentSeed = initialSeed;
        int counter = 1;

        // שימו לב: ההדפסה לא מותנית במצב 'v' בתיקון זה (כדי לפשט)
        System.out.print(currentSeed); 

        if (currentSeed == 1) {
            currentSeed = currentSeed * 3 + 1; 
            counter++;
            System.out.print(" "+ currentSeed); 
        }

        while (currentSeed != 1) {
            if (currentSeed % 2 == 0 ){
                currentSeed /= 2;
            } else {
                currentSeed = currentSeed*3 + 1;
            }
            counter++;
            System.out.print(" "+ currentSeed);
        }
        
        // שימוש ב-println כדי לסגור את הרצף בשורה נפרדת
        System.out.println(" (" + counter + ")"); 
    }


    public static void main(String args[]) {
        
        // 2. קריאת קלט בתוך main (המקום הנכון)
        int highestSeedN = Integer.parseInt(args[0]);
        String mode = args[1];
	if (mode.charAt(0) == 'v') { 
   		 for (int i = 1; i<= highestSeedN; i++){
			calculateAndPrintSequence(i);
		}
 			System.out.println("Every one of the first "+highestSeedN+" hailstone sequences reached 1.");
	}
     	 else {
			System.out.println("Every one of the first "+highestSeedN+" hailstone sequences reached 1.");
	  }

    }
}