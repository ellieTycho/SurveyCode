public class Example1{

private int changeState(char input, int state){

	int newState;
	
	if( state == 0 ){
	
		if( input == 'A' ){
			newState = 3;
		}		
		else if( input == 'B' ){
			newState = 2;		
		}
		else{
			 newState = 1;
		}		
	}
	else if( state == 1 ){
		
	    if( input == 'A' ){
			newState = 2;
		}		
		else if( input == 'B' ){
			newState = 3;		
		}
		else{
			 newState = -1;
		}
	}
	else{
		
		if( input == 'C' ){
			newState = 3;
		}
		else{
			newState = -1;
		}
	}
	
	return newState;
}

}
