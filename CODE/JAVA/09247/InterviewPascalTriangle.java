package 09247;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InterviewPascalTriangle {

    protected List<List<Integer>> generatePascalTriangle(int nbRows){
	// Input Validation
	if ( nbRows < 0 )
	    throw new IllegalArgumentException( "The number of rows cannot be negative." );
	
	// The object to return
	List<List<Integer>> toReturn = new LinkedList<List<Integer>>();

	// Save the previous row.
	List<Integer> previousRow = Collections.emptyList();

	// Process all the rows
	for( int i = 0 ; i <= nbRows ; i++ ){
	    // Create the current row
	    List<Integer> currentRow = new LinkedList<Integer>();
	    toReturn.add( currentRow );

	    // Define the previous value
	    int previousValue = 0;
	    // Loop on all the values
	    for(int c : previousRow){
		currentRow.add( c + previousValue );
		
		// Set the current value as the previous one
		previousValue = c;
	    }


	    // Add the last value
	    currentRow.add( 1 );
	    
	    // Save the current row.
	    previousRow = currentRow;
	}
	
	return toReturn;
    }
    
   public static void main(String[] argv) throws Exception {
	InterviewPascalTriangle t = new InterviewPascalTriangle();

	
	List<List<Integer>> res = t.generatePascalTriangle(7);
	
	System.out.println( "Result:" );
	String tmp = res.get( res.size() -1 ).toString();
	
	int max = (int) tmp.length();
	
	for(List<Integer> c : res ){
	    String toDisplay = c.toString();
	    int padding = ( max - toDisplay.length()) / 2 ;
	    StringBuilder sb = new StringBuilder();
	    for(int i=0; i < padding; i++){
		sb.append( " " );
	    }
	    
	    sb.append( toDisplay );
	    
	    System.out.println( sb.toString() );
	}

    }



}