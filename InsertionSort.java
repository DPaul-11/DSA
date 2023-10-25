import java.util.Stack;

public class InsertionSort {
    void insertionSort(int arr[])
    {
        int l= arr.length;
        for(int i=1;i<l;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    void display(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={9,14,3,2,345,12,65};
        InsertionSort ob=new InsertionSort();
        ob.insertionSort(arr);
        System.out.println("Array after insertion sort: ");
        ob.display(arr);

    }
}
