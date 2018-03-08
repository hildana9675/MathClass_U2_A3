/* Hildana.M
 * MathClass_U2_A3.java
 * This program includes three additional math methods  
 * March/09/2018
 */

package mathclass_u2_a3;

public class MathClass_U2_A3 {

    public static void main(String[] args) {
        
        double myNumber= Math.max(20.5, 10); //chooses the largest interger 
        int myNumberRounded = (int) Math.round(myNumber); //rounding 
      
        myNumber = Math.pow (myNumber,2); //rasing myNumber to the exponent 2
        myNumber += 10; 
        myNumber += Math.sqrt (25); //add the square root of 25 to myNumber 
        myNumber *= Math.PI; //multiply myNumber with PI
        
        myNumberRounded =(int)(myNumber);
        
        System.out.println(myNumberRounded);
    }
    
}
    