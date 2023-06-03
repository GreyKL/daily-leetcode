package com.kl.easy;

/**
 * @author: kl
 * @date: 2023/6/4  2:19
 */
public class RecursiveLinkedList {
    public static void main(String[] args) {
        // 创建一个空链表
        Node head = null;

        // 创建一个数组
        int[] arr = {1, 2, 3, 4};

        // 使用递归给链表赋值
        head = createLinkedList(arr, 0);

        // 打印链表的值
        printLinkedList(head);
    }

    // 使用递归给链表赋值
    private static Node createLinkedList(int[] arr, int index) {
        if (index == arr.length) {
            return null;
        }

        Node node = new Node(arr[index]);
        node.next = createLinkedList(arr, index + 1);

        return node;
    }

    // 打印链表的值
    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

