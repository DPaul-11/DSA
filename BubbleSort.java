public class BubbleSort {
    static void bubbleSort(int[] arr)
    {
        int l=arr.length;
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=1;j<(l-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
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
        int arr[]={2,7,5,3,11,21};
        BubbleSort ob=new BubbleSort();
        ob.bubbleSort(arr);
        System.out.println("Array after Bubble sort: ");
        ob.display(arr);

    }
}
