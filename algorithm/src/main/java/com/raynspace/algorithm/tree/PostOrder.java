package com.raynspace.algorithm.tree;

import java.util.Stack;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/6/28 下午4:55.
 * Modified By:
 */
public class PostOrder {

    /**
     * 后序遍历：左 -》 右 -》 根
     * @param head
     */
    public void postOrderRecursion(Node head) {
        if(head == null) {
            return;
        }
        postOrderRecursion(head.left);
        postOrderRecursion(head.right);
        System.out.print(head.data + "->");
    }

    /**
     * 关键步骤：
     * 1. while 循环时，是从stack中peek数据而不是pop数据.
     * 2. 循环体中，是 if else 关系而不是 if if 。
     * @param head
     */
    public void postOrderUnRecursion1(Node head) {
        System.out.println();
        System.out.print("后序非递归遍历1：");
        if(head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        Node c = head ;
        while (!stack.isEmpty()) {
            head = stack.peek();
            if(head.left != null && c != head.left && c != head.right) {
                stack.push(head.left);
            } else if(head.right != null && c != head.right) {
                stack.push(head.right);
            } else {
                System.out.print(stack.pop().data + "->");
                c = head;
            }
        }
        System.out.println();
    }

    public void postOrderunRecursion2(Node head) {
        System.out.print("非递归后序遍历2：");
        if(head == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(head);

        while (!stack1.isEmpty()) {
            head = stack1.pop();
            stack2.push(head);
            if(head.left != null) {
                stack1.push(head.left);
            } if (head.right != null) {
                stack1.push(head.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + "->");
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

        PostOrder postOrder = new PostOrder();
        postOrder.postOrderRecursion(head);
        postOrder.postOrderUnRecursion1(head);
        postOrder.postOrderunRecursion2(head);
    }
}
