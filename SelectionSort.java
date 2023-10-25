public class SelectionSort {
    void selectionSort(int arr[])
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            int index=i;
            for(int j=i+1;j<l;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
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
    public static void main(String[] args) {
        int arr[]={9,14,3,2,345,12,65};
        SelectionSort ob=new SelectionSort();
        ob.selectionSort(arr);
        System.out.println("Array after selection sort: ");
        ob.display(arr);

    }
}
