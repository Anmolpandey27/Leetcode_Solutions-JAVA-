class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int finalarr[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                finalarr[k++]=nums1[i++];

            }
            else
            finalarr[k++]=nums2[j++];

        }
        if(i<m){
            while(i<m){
                finalarr[k++]=nums1[i++];
            }
        
        }
        if(j<n){
            while(j<n){
                finalarr[k++]=nums2[j++];
            }
        }
        n=n+m;
        if(n%2==1)
            return finalarr[((n+1)/2)-1];
        
            else
            return((double)finalarr[(n/2)-1]+(double)finalarr[(n/2)])/2.0;

        }
     
        }
    