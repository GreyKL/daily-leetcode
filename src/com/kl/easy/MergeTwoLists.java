package com.kl.easy;

import com.kl.medium.AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 26-合并两个有序链表
 * @author: kl
 * @date: 2023/6/3  23:42
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        /*
        将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
        两个链表的节点数目范围是 [0, 50]
        -100 <= Node.val <= 100
        l1 和 l2 均按 非递减顺序 排列
        * */
        ListNode k1 = new ListNode(9,null);
        ListNode k2 = new ListNode(8,k1);
        ListNode k3 = new ListNode(7,k2);
        ListNode k4 = new ListNode(6,k3);
        ListNode k5 = new ListNode(5,k4);
        ListNode k6 = new ListNode(4,k5);
        ListNode k7 = new ListNode(3,k6);

        ListNode q1 = new ListNode(4,null);
        ListNode q2 = new ListNode(3,q1);
        ListNode q3 = new ListNode(2,q2);
        ListNode q4 = new ListNode(1,q3);
        System.out.println(mergeTwoLists(k7,q4));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        List<Integer> al3 = new ArrayList<>();
        ListNode node = new ListNode();
        getVal(list1,al1);
        getVal(list2,al2);
        for (int i = 0,j=0; i < al1.size() || j< al2.size();) {
            if(i>= al1.size()){
                al3.addAll(al2.subList(j,al2.size()));
                break;
            }else if(j>= al2.size()){
                al3.addAll(al1.subList(i,al1.size()));
                break;
            }
            if(al1.get(i)>=al2.get(j)){
                al3.add(al2.get(j));
                j++;
            }else{
                al3.add(al1.get(i));
                i++;
            }
        }
        node = setVal(al3,0);
        return node;
    }

    public static void getVal(ListNode node, List<Integer> all){
        if(node != null){
            all.add(node.val);
            if( node.next == null){
                return ;
            }
            getVal(node.next,all);
        }
    }

    public static ListNode setVal(List<Integer> al3,int k){
        /*k++;
        if(k<al3.size()){
            node.val = al3.get(k);
            System.out.println(node.val);
            node.next = setVal(node,al3,k);
            return node;
        }
        return null;*/

        if (k == al3.size()) {
            return null;
        }

        ListNode node = new ListNode(al3.get(k));
        System.out.println(node.val);
        node.next = setVal(al3, k +1);

        return node;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
