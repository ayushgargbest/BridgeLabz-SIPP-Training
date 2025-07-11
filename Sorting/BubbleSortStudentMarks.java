public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swapped) break;
        }
    }
}
