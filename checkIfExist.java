ublic boolean checkIfExist(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((2*i)==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
