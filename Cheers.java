//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
         String name = args[0].toUpperCase(); // שכל האויתות שנקלטות יומרו לאות גדולה
         int num = Integer.parseInt(args[1]);
         int NameLength = name.length();

          for (int i=0; i<NameLength; i++){ // לולאה שרצה ככמות האותיות בשם שנקלט
                 char c =  name.charAt(i);
                     if (c == 'A' || c == 'E' || c == 'F' || c == 'H' || c == 'I' || c == 'L' ||
                  c == 'M' ||   c == 'N' ||   c == 'O' ||   c == 'R' || c == 'S' || c == 'X' ){
                      System.out.println("Give"+" "+"me"+" "+"an"+" "+ c+":"+" "+c+"!");
                         }
                         else {
                      System.out.println("Give"+" "+"me"+" "+"a"+"  "+c+":"+" "+c+"!");
                         }
                        
        }
        System.out.println("What does that spell?" );

                for (int j=0; j<num; j++){ // לולאה שרצה ככמות המספר שקלטנו
                System.out.println(name + "!!!" );
        }

  }


}
