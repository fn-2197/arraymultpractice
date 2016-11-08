
public class ArrayMethods {
public int[] inval;
	public ArrayMethods (int[] invalu){
		inval = invalu;

}
	public int[] swapFirstAndLast(){
		int a = inval[0];
		int b = inval[inval.length-1];
		inval[0] = b;
		inval[inval.length-1] = a;
		return inval;
	}
	public void shiftright(){
		int a = inval[inval.length-1];
		for(int i = inval.length-1; i > 1; i--){
		 inval[i] = inval[i-1];
		}
		inval[0] = a;
	}
	public void evenrep(){
		for(int i = 0; i < inval.length; i++){
			if(inval[i]%2 == 0)
				inval[i] = 0;
		}
	}
	public void largest(){
		for(int i = 1; i < inval.length-2; i++){
			if(inval[i-1] > inval[i+1])
				inval[i] = inval[i-1];
			else
				inval[i] = inval[i+1];
		}
	}
	public void remove(){
		if(inval.length%2 == 0){
			inval[inval.length/2-1] = 0;
			inval[inval.length/2] = 0;
		}
		else{
			inval[inval.length/2] = 0;
		}
	}
	
	public void evenfront(){
		int a = 0;
		for(int i=0; i<inval.length; i++){
			if(inval[i] % 2 != 1){
				a = inval[i];
				for(int ii = inval[i]; ii<inval.length; ii++){
					if( inval[ii] % 2 ==0){
						inval[i] = inval[ii];
						inval[ii] = a;
					}
				}
			}
		}
	}
	public int ndlarg(){
		int a = 0;
		int b = 0;
		for(int i = 0;i <inval.length-1; i++){
			if(inval[i] > b){
				a =b;
				b = inval[i];
			}
			else if(inval[i] > a){
				a = inval[i];
			}
		}
		return a;
	}
	public boolean goesup(){
		boolean a = true;
		for(int i = 1; i<inval.length-1; i++){
			if(inval[i] < inval[i-1])
				a = false;
		}
		return a;
	}
	
	public boolean duplicate(){
		boolean a = false;
		for(int i = 1; i<inval.length-1; i++){
			if(inval[i] == inval[i-1])
				a = true;
		}
		return a;
	}
	public boolean duplicatena(){
		boolean a = false;
		for(int i = 1; i<inval.length-1; i++){
			for(int ii = 0; ii<inval.length-1; ii++)
			if(inval[i] == inval[ii])
				a = true;
		}
		return a;
	}
}
