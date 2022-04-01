
public class MergeSort {
	
	int[] array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr= {33,54,12,19,52,94,21};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		
		System.out.print("After Sorting : ");
		for(int i:inputArr)
		{
			System.out.print(i+" ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex,middle);
			
			divideArray(middle+1,higherIndex);
			
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex, int middle,int highterIndex)
	{
		for(int i=lowerIndex;i<=highterIndex;i++)
		{
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=highterIndex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
				else
				{
					array[k]=tempMergeArr[j];
					j++;
				}
				k++;
			}
			while(i<=middle) 
			{
				array[k]=tempMergeArr[i];
				k++;
				i++;
			}
		}
	}


