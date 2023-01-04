/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=0;
        int h=n;
        while(i<h)
        {
            int mid=i+(h-i)/2;
            if(isBadVersion(mid))
            {
                h=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
}