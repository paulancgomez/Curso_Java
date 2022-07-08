package ejercicio19;

/*	Ejercicio Nro 19

	Dado un conjunto A de números enteros y un elemento “e” determina si “e“
	pertenece a A.*/

public class Test {

	public static void main(String[] args) {
		

	}
	
	public static int pertenece(int [] A,int i, int elem) {	
    	if(i<A.length) {
    		if(A[i]!=elem) {
    			return pertenece(A,i+1,elem);
    		}
    		else return i;
    	}
    	else return -1;
    }

}
