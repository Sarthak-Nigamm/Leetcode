class Solution {
    public String frequencySort(String s) {
        int arr[] = new int[256];
        for(int i =0; i<s.length(); i++){
            int a = s.charAt(i);
            arr[a]++;
        }
        String str = "";
        while(str.length()!=s.length()){
        int max = 0;
        int idx = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        if(idx!=-1){
            arr[idx] = 0;
            char ch = (char)idx;
            while(max!=0){
            str+= ch;
            max--;}
        }

    }
    return str;}
}