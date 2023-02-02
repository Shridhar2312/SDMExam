import java.util.*;

class Exam {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
			
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	void selectionSort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		Exam ob = new Exam();
		int arr[] = { 5, 1, 4, 2, 8 };
		System.out.println("1. Bubble Sort\n2. Insertion Sort\n3. Selection Sort");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num){
			case 1:
				ob.bubbleSort(arr);
				break;
			case 2:
				ob.insertionSort(arr);
				break;
			case 3:
				ob.selectionSort(arr);
			default:
				System.out.println("Enter correct choice");
				break;
		}
		
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}