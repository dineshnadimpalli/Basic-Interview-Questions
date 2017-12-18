
import java.util.Arrays;
import java.util.List;

import java.util.*;

public class no1{
	private int[] a= new int[50];
	private int asize = 10;

// Stacks And Queues
	private String[] stackArray;
	private int stacksize;
	private int topOfStack = -1;

//Randon number generator
	public void generateRandomArray(){
			for(int i=0;i<asize;i++){
				a[i]=(int)(Math.random()*10)+10;
			}
	}

//Printing the array
	public void printArray(){
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<asize;i++){
				System.out.print("| " + i + "   ");
			}
			System.out.println();
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<asize;i++){
				System.out.print("| " + a[i] + "  ");
			}
		    System.out.println();
			System.out.println("---------------------------------------------------------");

	}


//To get the index values

	public int getValueAtIndex(int index){
		if(index<asize)  return a[index];
		return 0;
	}


//Searching array for a given value	

	public boolean doesArrayContainThisValue(int searchValue){
		boolean valueInArray = false;
		for(int i=0;i<asize;i++){
				if(a[i]==searchValue){
					valueInArray=true;
				}
			}
		return valueInArray;
	}


//Inserting an element into a static array

	public void insertValue(int value){
		if(asize<50){
			a[asize]=value;
			asize++;
			}
	}

//Deleting an element from an array

	public void deleteIndex(int index){
		if(index<asize){
			for(int i= index;i<asize;i++){
				 	a[i]=a[i+1];
				}
			asize--;
			}
	}


//Linear Searching 

	public String linearSearchForValue(int value){
		boolean valueInArray =false;
		String indexWithValue = "";
		System.out.println("The value was found in: ");
		for(int i=0;i<asize;i++){
				 	if(a[i]==value){
				 		valueInArray = true;
				 		System.out.print(i + " ");
				 		indexWithValue += i + " ";
				 	}
				}
		if(!valueInArray){
			indexWithValue="None";
			System.out.print(indexWithValue);
		}

		System.out.println();
		return indexWithValue;
	}


//Binary Searching
	public void binarySearchValue(int value){
		int lowIndex = 0;
		int highIndex = asize-1;
		while(lowIndex<=highIndex){
			int middleIndex = (highIndex+lowIndex)/2;
			if(a[middleIndex]<value)   lowIndex=middleIndex+1;
			else if(a[middleIndex]>value)   highIndex=middleIndex-1;
			else{
				System.out.println("\nFound a match for "+value);
				break;
			}
		}


	}


//Bubble Sorting

	public void bubbleSort(){
		for(int i=asize-1;i>1;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					swapValues(j,j+1);
					//printHorzArray(i,j);
				}
			}
		}

	}


//Selection Sorting

	public void selectionSort(){
		for(int x=0;x<asize;x++){
			int min=x;
			for(int y=x;y<asize;y++){
				if(a[min]>a[y]){
					min=y;
				}
			}
			swapValues(x,min);
		}
	}


//Insertion Sorting

	public void insertionSort(){
		for(int i=1;i<asize;i++){
			int j=i;
			int toInsert = a[i];
			while((j>0)&&(a[j-1]>toInsert)){
				a[j]=a[j-1];
				j--;
			}
			a[j]=toInsert;
			printArray();
		}
	}





//Swapping two variables

	public void swapValues(int index1, int index2){
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}



//Main function
	public static void main(String[] args){
			no1 newArray = new no1();
			newArray.generateRandomArray();
			newArray.printArray();
			//System.out.println(newArray.getValueAtIndex(3));
			//System.out.println(newArray.doesArrayContainThisValue(20));
			//newArray.deleteIndex(4);
			//newArray.insertValue(30);
			//newArray.linearSearchForValue(17);
			//newArray.binarySearchValue(17);
			//newArray.bubbleSort();
			//newArray.selectionSort();
			newArray.insertionSort();
			newArray.printArray();
	}
}