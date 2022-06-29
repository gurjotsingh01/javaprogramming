class Timeconversion{
public static void main(String args[]){

	
        long milliseconds =100000;
 
       
        long minutes = (milliseconds / 1000) / 60;
 
       
        long seconds = (milliseconds / 1000)%60;
 
        // Printing the output
        System.out.println(milliseconds + " Milliseconds = "
                           + minutes + " minutes and "
                           + seconds + " seconds");
    }
}

