import java.util.Arrays;

public class Sort{
	public void bubbleSort(int array[]){						//пузырьковая сортировка для целочисленного массива
        for(int i = array.length; i > 1; i--){
                for(int j = 0; j < i - 1; j++){
                        if(array[j]>array[j+1]){
                                        int temp = array[j];
                                        array[j] = array[j+1];
                                        array[j+1] = temp;
                                }
                }
           }
        }


  	public <T extends Comparable<T>> void bubbleSort(T[] array){			 //пузырьковая сортировка для массива любого типа
    		for(int i = array.length; i > 1; i--){
      			for(int j = 0; j < i - 1; j++){
        			if(array[j].compareTo(array[j+1]) > 0){
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
      			}
		}
  	}

 	public void insertionSort(int array[]){						 //сортировка вставка для целочисленного массива
                for (int i = 1; i < array.length; i++) {
                        int temp = array[i];
                        int j;
                        for (j = i - 1; j >= 0 && array[j]>temp; j --) {
                                array[j + 1] = array[j];
                        }
                        array[j+1] = temp;
                }
        }

	
	public <T extends Comparable<T>> void insertionSort(T[] array){			 //сортировка вставками для массива массива любого типа
		for (int i = 1; i < array.length; i++) {
			T temp = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j].compareTo(temp)>0; j --) {
				array[j + 1] = array[j];
			}
			array[j+1] = temp;
		}
	}

	public void selectionSort(int array[]){						 //сортировка выбором для целочисленного массива
                for (int i = 0; i < array.length - 1; i ++){
                        int currenMinIndex = i;
                        for (int j = i + 1; j < array.length; j++){
                                if (array[currenMinIndex]>array[j])
                                        currenMinIndex = j;
                        }
                        if (currenMinIndex != i){
                                int temp = array[i];
                                array[i] = array[currenMinIndex];
                                array[currenMinIndex] = temp;
                        }
                }
        }
	

	public <T extends Comparable<T>> void selectionSort(T[] array){			 //сортировка выбором для массива любого типа
		for (int i = 0; i < array.length - 1; i ++){
			int currenMinIndex = i;
			for (int j = i + 1; j < array.length; j++){
				if (array[currenMinIndex].compareTo(array[j])>0)
					currenMinIndex = j;
			}
			if (currenMinIndex != i){
				T temp = array[i];
				array[i] = array[currenMinIndex];
				array[currenMinIndex] = temp;
			}
		}
	}
}
