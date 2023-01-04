/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=0;
        while(i<n)
        {
            int mid=i+(n-i)/2;
            if(isBadVersion(mid))
            {
                n=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
}