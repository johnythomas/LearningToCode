// Problem url: https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
'use strict';
/*
    Find merge point of two linked lists
    Note that the head may be 'null' for the empty list.
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function findMergeNode(headA, headB) {
  let runner1 = headA;
  let runner2 = headB;
  while (runner1 != runner2) {
    if (runner1 == null) {
      runner1 = headB;
    } else if (runner2 == null) {
      runner2 = headA;
    }

    runner1 = runner1.next;
    runner2 = runner2.next;
  }

  return runner1.data;
}
