
/*@(#) Analyst.java 1.0 14 Nov 2011
 *
 *Copyright (c) School of Geography.
 *University of Leeds, Leeds, West Yorkshire, UK. LS2 9JT.
 *All rights reserved.
 *
 *This code is provided under the Academic Academic Free License v. 3.0.
 *For details, please see the site http://www.opensource.org/licenses/AFL-3.0.
 */ 

 /**
 *The Analyst class can be used to process geographical image data held within a 2D array. 
 *
 *The class calls the data array from another class (getData), and calls upon methods 
 *in other classes to perform tasks on this data; for example to display the original image 
 *from the 2D array using the Display class, and to apply the ‘mean filter’ image processing method (calculateMeanfilters). 
 *
 *@author Nicholas Addis <gy11nja@leeds.ac.uk>
 *@version 1.0 14 Nov 2011
 */

//Declares the public Analyst class.
public class Analyst {


	/**
	*This is the Analyst method which calls upon other methods from other classes to perform the 
	*mean filtering method to a data array.
	*
	*This method calls upon the DataReader and Processing classes to create a new 300 by 300 'resultsArray' from the original 300 by 300 data array 
	*using the mean filtering method. This is applied to the original image ('OriginalImage') to create a new 'mean filtered' 
	*('MeanFilteredImage'), which is called upon by the Processing class and displayed in a display window by the Display class. 
	*
	*@param void no input parameters.
	*@return no return values. 
	*/ 
	
	//Declares the public Analyst method. 	
	public Analyst() {
		//Creates a 'datanew' object of the DataReader class. 
		DataReader datanew = new DataReader(); 
		//Create a 'process' object of the Processing class.
		Processing process = new Processing (); 
		/*
		 *This calls the array data (using the 'getData' method) from the DataReader class through 
		 *the 'datanew' object, labelling this as 'e' and type double. 
		 */
		double[][] e = datanew.getData();
		/*
		 *This creates a new display object of the 'Display' class and calls the display window 
		 *titled "OriginalImage", which is made up from the original 'data' array in the DataReader class.
		 */
		Display a = new Display("OriginalImage", e);
		//This calls the calculateMeanfilters method from the Processing class. 
		process.calculateMeanfilters();	
	
	}
			
							
	/**
	 *This is the main method.
	 *
	 *The main method enables the Java program to run. 
	 *
	 *@param an array of String objects. 
	 *@return no return values.
	 */ 
		
	public static void main(String args[]) {
		new Analyst();	
	}
}
		
		