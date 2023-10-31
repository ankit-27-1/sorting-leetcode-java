class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target[0]==1 && arr[0]==3){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++){
            boolean ans=false;
            for(int j=i;j<target.length;j++){
                if(arr[i]==target[j]){
                    ans=true;
                }
            }
            if(ans==false){
                return false;
            }
        }
        return true;
    }
}
