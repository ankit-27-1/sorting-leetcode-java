class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum=0;
        int j=(arr.length*5)/100;
        for(int i=j;i<arr.length-j;i++){
            sum=sum+arr[i];
        }
        
        return sum/(arr.length-(2*j));
        //sum/(arr.length-2);
    }
}
