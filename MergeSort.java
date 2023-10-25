public class MergeSort
{
    void merge(int arr[],int beg,int mid,int end)
    {
        int n1=mid-beg+1;
        int n2=end-mid;

        int LArr[]=new int[n1];
        int RArr[]=new int[n2];

        for(int i=0;i<n1;i++)
        {
            LArr[i]=arr[beg+i];
        }
        for(int j=0;j<n2;j++)
        {
            RArr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=beg;

        while (i<n1 && j<n2)
        {
            if(LArr[i]<=RArr[j])
            {
                arr[k]=LArr[i];
                i++;
            }
            else
            {
                arr[k]=RArr[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=LArr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=RArr[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int beg, int end)
    {
        if(beg<end)
        {

            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr,beg,mid,end);
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
        int arr[]={11,30,24,7,31,16,39,41};
        int n= arr.length;
        MergeSort ob=new MergeSort();
        ob.mergeSort(arr,0,n-1);
        System.out.println("Array after merge sort: ");
        ob.display(arr);
    }
}
