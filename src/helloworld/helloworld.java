package helloworld;
import java.util.Arrays;
public class helloworld {

	
	 

	    public static void main(String[] args) {
	    	int a[][] = new int [5][8];
	    	for(int i=0; i<a.length;i++){
	    		for(int j=0; j<a[i].length;j++){
	    			a[i][j]=(int)(Math.random()*100);
	    			System.out.print(a[i][j]+" ");
	    		}
	    		System.out.println();
	    		Arrays.sort(a[i]);
	    	}
	    	System.out.println("ÅÅÐòÖ®ºó£º");
	    	for(int i=0; i<a.length;i++){
	    		for(int j=0; j<a[i].length;j++){
	    			System.out.print(a[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    }
	}
	

   

