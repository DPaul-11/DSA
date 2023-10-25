public class HeapSort
{
    void heapSort(int[] arr,int n)
    {

        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    void heapify(int[] arr, int n,int i)
    {
        int largest=i;
        int li=2*i+1;
        int ri=2*i+2;

        if(li<n && arr[li]>arr[largest])
        {
            largest=li;
        }
        if(ri<n && arr[ri]>arr[largest])
        {
            largest=ri;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
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
        int arr[]={22,13,17,11,10,14,12};
        int n= arr.length;
        HeapSort ob=new HeapSort();
        ob.heapSort(arr,n);
        System.out.println("Array after heap sort: ");
        ob.display(arr);
    }
}
