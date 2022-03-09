package classSamples.polymorphism.Firm;

public class Sorting<T> {

	public void selectionSort(Comparable<T>[] list) {
		int min;
		Comparable<T> temp;
		
		for(int index=0; index<list.length-1; index++) {
			min=index;
			for(int scan=index+1;scan<list.length;scan++) {
				//polymorphic compareTo
				if(list[scan].compareTo((T) list[min]) < 0) {
					min = scan;
				}
			}
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	
	public static void insertionSort(Comparable[] list)
	   {
	      for (int index = 1; index < list.length; index++)
	      {
	         Comparable key = list[index];
	         int position = index;
	         while (position > 0 && key.compareTo(list[position-1]) < 0)
	         {
	            list[position] = list[position-1];
	            position--;
	         }
	         list[position] = key;
	      }
	   }
}