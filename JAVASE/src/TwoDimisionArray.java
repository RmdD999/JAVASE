public class TwoDimisionArray {
    public static void main(String[] args){

        DiverseArray();
        int[][] nums= new int[4][6];

        System.out.println();
        System.out.println(nums.length);
        nums[0][0] = 0;
        nums[0][1] = 0;
        nums[0][2] = 0;
        nums[0][3] = 0;
        nums[0][4] = 0;
        nums[0][5] = 0;

        nums[1][0] = 0;
        nums[1][1] = 0;
        nums[1][2] = 1;
        nums[1][3] = 0;
        nums[1][4] = 0;
        nums[1][5] = 0;

        nums[2][0] = 0;
        nums[2][1] = 2;
        nums[2][2] = 0;
        nums[2][3] = 3;
        nums[2][4] = 0;
        nums[2][5] = 0;

        nums[3][0] = 0;
        nums[3][1] = 0;
        nums[3][2] = 0;
        nums[3][3] = 0;
        nums[3][4] = 0;
        nums[3][5] = 0;

        //循环第一层
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }

    public static void DiverseArray(){
        int[][] nums= new int[4][6];

        nums[0][0] = 0;
        nums[0][1] = 0;
        nums[0][2] = 0;
        nums[0][3] = 0;
        nums[0][4] = 0;
        nums[0][5] = 0;

        nums[1][0] = 0;
        nums[1][1] = 0;
        nums[1][2] = 1;
        nums[1][3] = 0;
        nums[1][4] = 0;
        nums[1][5] = 0;

        nums[2][0] = 0;
        nums[2][1] = 2;
        nums[2][2] = 0;
        nums[2][3] = 3;
        nums[2][4] = 0;
        nums[2][5] = 0;

        nums[3][0] = 0;
        nums[3][1] = 0;
        nums[3][2] = 0;
        nums[3][3] = 0;
        nums[3][4] = 0;
        nums[3][5] = 0;

        //转置思路
        //第一个和最后一个换
        //循环到中间数字

        int mid =(nums.length*nums[0].length)/2;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[nums.length-i-1][nums[i][nums[i].length-j-1]];
                nums[nums.length-i-1][nums[i][nums[i].length-j-1]] = temp;
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
