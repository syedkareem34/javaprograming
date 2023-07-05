class HelloWorld {
    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        int sum2 = 0;
        int arr[] = {2,10,5,7,20};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int j=0;j<arr.length;j++){
            arr[j] = arr[j] + max;
            System.out.println(arr[j]);
        }
        for(int k=0;k<arr.length;k=k+2){
            sum = sum + arr[k];
        }
        System.out.println(""+sum);    
        for(int l=1;l<arr.length;l=l+2){
            sum2 = sum2 + arr[l];
        }
        System.out.println(""+sum2);
    }
}