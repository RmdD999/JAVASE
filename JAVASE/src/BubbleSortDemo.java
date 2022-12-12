public class BubbleSortDemo {

    public static void main(String[] args) {
        int arr[] = {1,6,0,-1,-9,-10,9,-90,39,20,95,48,39,-39,30};
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }

            }
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
