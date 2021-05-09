package java.Thought.greedy;
/**
 * 605.种花问题
 * 相邻的位置不能种花，输入一个数组表示花坛，欲种入的花的数量n，返回true或false代表是否成功种植
 *
 * 输入：flowerbed = [1,0,0,0,1], n = 1
 * 输出：true
 *
 * 思路：
 *      相邻问题比较特殊，针对单个数组的不相邻问题可以分成三个区域：即最左端到第一个占位点，第一个占位点l到第二个占位点，r最后一个占位点到最右端，
 *      其中中间的部分是可以找到共性的，即两个占位点中间最多可以有几个占位点。假设只有两个占位点，根据此三个区域：
 *      第一个区域，最多可有l/2个占位点
 *      第二个区域，最多可有（r-l-2）/2个占位点
 *      第三个区域，最多可有（length-r-1）/2个占位点
 *      最后，如果本身一个占位点都没有，那么最多可以有(length+1)/2个占位点
 *
 * 记：相邻问题要分三个区域进行讨论
 * */
public class Plant_flowers {
    public boolean isPlantN(int[] flowerbed, int n){
        int count = 0;
        int tail = -1, m = flowerbed.length;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i]==1){
                if (tail<0){
                    count+=i/2;
                }else {
                    count+=(i-tail-2)/2;
                }
                tail = i;
            }
        }
        //遍历结束后，分两种情况一个是空的花坛种花，另一个是种的最后一束花和结尾点之间能种几朵花
        if (tail<0){
            count+=(m+1)/2;
        }else {
            count+=(m-tail-1)/2;
        }
        return count>=n;
    }
}
