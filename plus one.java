public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int idx = 0; idx < size; idx++) 
            arr[idx] = sc.nextInt();  
        
        int x = sc.nextInt();
        
        int[] res = addOne(arr, x);
        
        for(int idx = 0; idx < res.length; idx++){
            System.out.print(res[idx] + " ");
        }    
    }

    public static int[] addOne(int[] arr, int x){
        int idx = arr.length-1;
        int carry = 0;
        while(idx >= 0){
            int sum = arr[idx] + x + carry;
            if(sum > 9){
                arr[idx] = sum % 10;
                carry = sum / 10;
                x= 0;
            }else{
                arr[idx] += carry;
                carry = 0;
            }
            if(carry == 0) break;
            idx--;
        }
        if(carry > 0){
            int[] res = new int[arr.length + 1];
            res[0] = carry;
            for(int jdx = 1; jdx < arr.length; jdx++) {
                res[jdx + 1] = arr[jdx];
            }
            return res;
        }
        return arr;
    }
}