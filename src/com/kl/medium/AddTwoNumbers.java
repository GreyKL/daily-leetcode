package com.kl.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 两数相加
 * @author: kl
 * @date: 2023/5/10  14:00
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3,null);
        ListNode n2 = new ListNode(4,n1);
        ListNode n3 = new ListNode(2,n2);
        ListNode n4 = new ListNode(5,n3);

        ListNode l1 = new ListNode(4,null);
        ListNode l2 = new ListNode(6,l1);
        ListNode l3 = new ListNode(5,l2);
        //n4=5243 ->3425'
        //l3=564 ->465
        //3425+465=3890
//        ListNode node = addTwoNumbers(n3,l3);
        ListNode k1 = new ListNode(9,null);
        ListNode k2 = new ListNode(9,k1);
        ListNode k3 = new ListNode(9,k2);
        ListNode k4 = new ListNode(9,k3);
        ListNode k5 = new ListNode(9,k4);
        ListNode k6 = new ListNode(9,k5);
        ListNode k7 = new ListNode(9,k6);

        ListNode q1 = new ListNode(9,null);
        ListNode q2 = new ListNode(9,q1);
        ListNode q3 = new ListNode(9,q2);
        ListNode q4 = new ListNode(9,q3);

        ListNode node = addTwoNumbers(k7,q4);
        System.out.println(1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> all1 = new LinkedList<>();
        List<Integer> all2 = new LinkedList<>();
        List<Integer> all3 = new LinkedList<>();
        getVal(l1,all1);
        getVal(l2,all2);
        int type = 0;
        if(all1.size()>all2.size()){
            type =1;
        }else if(all1.size()<all2.size()){
            type =2;
        }else {
            type =3;
        }
        int res = 0;
        if(type ==1){
            int size = all2.size()-1;
            for (int i = all1.size()-1; i >=0; i--) {
                if(size>=0){
                    res = all1.get(i)+all2.get(size);
                    if(res>=10){
                        res=res%10;
                        all1.set(i-1,all1.get(i-1)+1);
                    }
                    size--;
                }else{
                    res= all1.get(i);
                    if(all1.get(i)>=10&&i>0){
                        res=res%10;
                        all1.set(i-1,all1.get(i-1)+1);
                    }
                }
                if(all1.get(0)>=10&&i==0){
                    all3.add(res%10);
                    all3.add(1);
                }else{
                    all3.add(res);
                }
            }
        }
        if(type ==2){
            int size = all1.size()-1;
            for (int i = all2.size()-1; i >=0; i--) {
                if(size>=0){
                    res = all2.get(i)+all1.get(size);
                    if(res>=10){
                        res=res%10;
                        all2.set(i-1,all2.get(i-1)+1);
                    }
                    size--;
                }else{
                    res= all2.get(i);
                    if(all2.get(i)>=10&&i>0){
                        res=res%10;
                        all2.set(i-1,all2.get(i-1)+1);
                    }
                }
                if(all2.get(0)>=10&&i==0){
                    all3.add(res%10);
                    all3.add(1);
                }else{
                    all3.add(res);
                }
            }
        }
        if(type ==3){
            for (int i = all2.size()-1; i >=0; i--) {
                res = all2.get(i)+all1.get(i);
                if(res>=10&&i>0){
                    res=res%10;
                    all2.set(i-1,all2.get(i-1)+1);
                }
                if(res>=10){
                    all3.add(res%10);
                    all3.add(1);
                }else{
                    all3.add(res);
                }
            }
        }

        ListNode node = new ListNode(all3.get(all3.size()-1),null);
        for (int j = all3.size()-2; j >=0  ; j--) {
            node = new ListNode(all3.get(j),node);
        }
        return node;
    }

  public static int getVal(ListNode node,List<Integer> all){
      if(node.next != null){
          getVal(node.next,all);
      }
      all.add(node.val);
      return node.val;
  }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
