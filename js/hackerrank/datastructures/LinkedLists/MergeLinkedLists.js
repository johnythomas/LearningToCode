// Problem url: https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists?h_r=next-challenge&h_v=zen
'use strict';
/*
    Merge two sorted lists A and B as one Linked List and return the head of merged list
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function mergeLinkedLists(headA, headB) {
  if (headA == null) return headB;
  if (headB == null) return headA;

  let head;
  if (headA.data < headB.data) {
    head = headA;
  } else {
    head = headB;
    headB = headA;
    headA = head;
  }

  while (headA.next != null) {
    if (headA.next.data > headB.data) {
      let temp = headA.next;
      headA.next = headB;
      headB = temp;
    }

    headA = headA.next;
  }

  if (headA.next == null) headA.next = headB;
  return head;
}
