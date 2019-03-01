package com.raynspace.algorithm.tree;

import java.util.Stack;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/6/28 下午4:26.
 * Modified By:
 */
public class InOrder {

    /**
     * 中序遍历： 左 -》 根 -》 右
     * @param head
     */
    public void inOrderRecursion(Node head) {
         if(head == null) {
             return;
         }
         inOrderRecursion(head.left);
         System.out.print(head.data + "->");
         inOrderRecursion(head.right);
    }

    /**
     * 根据中序特性，先把根节点和根节点的左节点入栈，直至左节点为空，再一次弹出栈顶节点，输出，并遍历右节点。
     * @param head
     */
    public void inOrderUnRecursion(Node head) {
        System.out.println("非递归中序遍历。");
        if(head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty() || head != null) {
//            if(head.right != null) {
//                stack.push(head.right);
//            } else if (head.left != null) {
//                stack.push(head.left);
//            } else {
//                System.out.println(stack.pop().data + "->");
//            }
            if(head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                System.out.print(head.data + "->");
                head = head.right;
            }
        }
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

        InOrder inOrder = new InOrder();

        inOrder.inOrderRecursion(head);
        inOrder.inOrderUnRecursion(head);
    }
}
