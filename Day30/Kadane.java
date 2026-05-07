package Day30;

public class Kadane {
    int maxSubarraySum(int[] arr) {
        // Code here
          int n=arr.length;
          int maxi=arr[0];
          int maxe=arr[0];
          for(int i=1;i<n;i++){
              maxi=Math.max(arr[i],maxi+arr[i]);
              maxe=Math.max(maxi,maxe);
          }
          return maxe;
    }
}

