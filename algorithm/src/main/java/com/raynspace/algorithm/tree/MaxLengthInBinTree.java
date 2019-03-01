package com.raynspace.algorithm.tree;

import java.util.HashMap;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/7/5 上午11:33.
 * Modified By:
 */
public class MaxLengthInBinTree {

    public int getMax(Node head,int sum) {
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        //
        resultMap.put(0,0);
        return preOrder(head,sum,0,0,1,resultMap);
    }

    /**
     * 找到累加和为指定值的最长路径长度
     * @param head
     * @param sum
     * @param preSum
     * @param level
     * @param resultMap
     * @return
     */
    private int preOrder(Node head, int sum, int preSum,int maxLength, int level, HashMap<Integer,Integer> resultMap) {
        if(head == null) {
            return maxLength;
        }
        int curSum = preSum + head.data;

//        if(!resultMap.containsKey(curSum)) {
//            resultMap.put(curSum,level);
//        }
        resultMap.put(curSum,level);

        //
//        if(resultMap.containsKey(curSum-sum)){
//            maxLength = Math.max(maxLength, level-resultMap.get(curSum-sum));
//        }
        if(sum - curSum == 0) {
            maxLength = Math.max(maxLength,level);
        }

        preSum=curSum;
        maxLength = preOrder(head.left,sum,preSum,maxLength,level+1,resultMap);
        maxLength = preOrder(head.right,sum,preSum,maxLength,level+1,resultMap);

//        if(level==resultMap.get(curSum)){
//            resultMap.remove(curSum);
//        }

        return maxLength;
    }

    public static void main(String[] args) {
        MaxLengthInBinTree maxLengthInBinTree = new MaxLengthInBinTree();
        Node l3_1 = new Node(4);
        Node l3_2 = new Node(1);
        Node l2_1 = new Node(3);
        l2_1.left = l3_1;l2_1.right = l3_2;
        Node l3_3 = new Node(5);
        Node l3_4 = new Node(2);
        Node l2_2 = new Node(7);
        l2_2.left = l3_3;l2_2.right = l3_4;
        Node head = new Node(8);

        Node l4_1 = new Node(3);
        Node l4_2 = new Node(2);
        l3_2.left = l4_1;l3_2.right = l4_2;

        head.left = l2_1;head.right = l2_2;

        System.out.println("最大路径结果:" + maxLengthInBinTree.getMax(head,17)); //3
        System.out.println("最大路径结果:" + maxLengthInBinTree.getMax(head,15)); //4
        System.out.println("最大路径结果:" + maxLengthInBinTree.getMax(head,12)); //3
    }
}
