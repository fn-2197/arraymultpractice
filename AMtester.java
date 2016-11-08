
public class AMtester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {5, 9, 6, 7, 4, 6};
		ArrayMethods alph = new ArrayMethods(a);
		System.out.println();
		alph.evenfront();
		for(int i = 0; i < a.length; i++){
			System.out.print(alph.inval[i] + ", ");
			}
	System.out.println();
	alph.evenrep();
	for(int i = 0; i < a.length; i++){
		System.out.print(alph.inval[i] + ", ");
		}
	System.out.println();
	alph.swapFirstAndLast();
	for(int i = 0; i < a.length; i++){
		System.out.print(alph.inval[i] + ", ");
		}
	System.out.println();
	alph.shiftright();;
	for(int i = 0; i < a.length; i++){
		System.out.print(alph.inval[i] + ", ");
		}
	System.out.println();
	alph.largest();
	for(int i = 0; i < a.length; i++){
		System.out.print(alph.inval[i] + ", ");
		}
		System.out.println();
		alph.remove();
		for(int i = 0; i < a.length; i++){
			System.out.print(alph.inval[i] + ", ");
		}
		
		System.out.println();
			System.out.println(alph.ndlarg());
			
		System.out.println(alph.goesup());
		System.out.println(alph.duplicate());
		System.out.println(alph.duplicatena());
		}	
	}

