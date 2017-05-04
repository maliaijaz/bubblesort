// Iterative implementation of bubblesort algorithm in Java
// time complexity in average and worst case: O (n^2)
public static void bubbleSort(int[] array){
	int n = array.length;
	for (int i = 0; i < n; i++){
		for (int j = 1; j < n - i; j++){
			if (array[i] > array[j]){
				swap(array,array[i],array[j]);
			}
		}
	}
}

public static void swap(int[] array, int first, int second){
	int temp = array[first];
	array[first] = array[second];
	array[second] = temp;
}