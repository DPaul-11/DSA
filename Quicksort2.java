public class Quicksort2 {
    int partition(int[] arr,int low, int high)
    {
        int pivot=arr[low];
        int start=low;
        int end=high;
        while(start<end)
        {
            while(arr[start]<=pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[end];
        arr[end]=temp;
        return end;
    }
    void quicksort(int[] arr, int low, int high)
    {
        while(low<high)
        {
            int pi=partition(arr, low, high);
            quicksort(arr, low,pi-1);
            quicksort(arr,pi+1, high);
        }
    }
    void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,6,10,5,9,2,1,15,7};
        int n= arr.length;;
        Quicksort2 ob=new Quicksort2();
        ob.print(arr);
        ob.quicksort(arr,0,n-1);
        ob.print(arr);
    }
}
