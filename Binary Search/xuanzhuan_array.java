import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){return 0;}
        int start = 0;
        int end = array.length - 1;
        int mid = start;
        while(start <= end){
            if(end - start == 1){
                mid = end;
                return array[end];
            }
            mid = (start + end) / 2;
            
            //如果第一个数字，最后一个数，和中间数相等
            if(array[start] == array[end] && array[mid] == array[start]){
                int min = 0;
                for(int i = 0; i < array.length; i++){
                    if(array[i] < min){
                        min = array[i];
                    }
                }
                 return min;
                
            }
            //中间数在第一个升序子序列
            if(array[mid] >= array[start]){
                start = mid;
            //中间数在第二个升序子序列
            } else if(array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[mid];
    }
}
