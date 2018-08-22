
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

public class Solution {
    public int JumpFloor(int target) {
        int [] init = {0, 1, 2};
        if(target < 3){
            return init[target];
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}




//非递归
public class Solution {
    public int JumpFloor(int target) {
        int [] init = {0, 1, 2};
        if(target < 3){
            return init[target];
        }
        int firstJump = 1;
        int secondJump = 2;
        int total = 0;
        for(int i = 3; i <= target; i++){
            total = firstJump + secondJump;
            firstJump = secondJump;
            secondJump = total;
        }
        return total;
    }
}
