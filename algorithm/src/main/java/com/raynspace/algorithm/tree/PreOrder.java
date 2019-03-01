package com.raynspace.algorithm.tree;

import java.util.Stack;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/6/28 下午4:09.
 * Modified By:
 */
public class PreOrder {

    /**
     * 前序显示： 根 -》左 -》 右
     * @param head
     */
    public void preOrderRecursion(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + "->");
        preOrderRecursion(head.left);
        preOrderRecursion(head.right);
    }

    public void preOrderUnRecursion(Node head) {
        System.out.println("非递归前序遍历开始：");
        if(head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            head = stack.pop();
            System.out.print(head.data + "->");
            if(head.right != null) {
                stack.push(head.right);
            }
            if(head.left != null) {
                stack.push(head.left);
            }
        }
        System.out.println("非递归前序遍历结束.");
    }

    public static void main(String[] args) {
        Node l3_1 = new Node(4);
        Node l3_2 = new Node(1);
        Node l2_1 = new Node(3);
        l2_1.left = l3_1;l2_1.right = l3_2;
        Node l3_3 = new Node(5);
        Node l3_4 = new Node(2);
        Node l2_2 = new Node(7);
        l2_2.left = l3_3;l2_2.right = l3_4;
        Node head = new Node(8);
        head.left = l2_1;head.right = l2_2;

        PreOrder preOrder = new PreOrder();
        preOrder.preOrderRecursion(head);
        preOrder.preOrderUnRecursion(head);
    }
}
