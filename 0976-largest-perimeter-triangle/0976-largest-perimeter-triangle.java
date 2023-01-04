class Solution {
public int largestPerimeter(int[] arr) {

    Arrays.sort(arr);
    
    int index=arr.length-1;
    while(index>=2){
        if(arr[index-2]+arr[index-1]>arr[index]){
            return arr[index]+arr[index-1]+arr[index-2];
        }
        else{
            index--;
        }
        
    }
    return 0;
}
}