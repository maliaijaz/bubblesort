// JS: iterative implementation of bubblesort in JS (runtime = O(n^2))

function bubbleSort(array){
	var length = array.length;
	for (i = 0; i < length; i++){
		for (j = 1; j < length - i; j++){
			if (array[i] > array[j]){
				var temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
}