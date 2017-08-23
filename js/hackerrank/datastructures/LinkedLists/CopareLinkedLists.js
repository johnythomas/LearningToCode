// Problem url: https://www.hackerrank.com/challenges/compare-two-linked-lists
'use strict';

/*
    Compare two Linked Lists A and B
    Return 1 if they are identical and 0 if they are not.
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function compareLinkedLists(headA, headB) {
  let runnerA = headA;
  let runnerB = headB;
  while (runnerA != null && runnerB != null) {
    if (runnerA.data != runnerB.data) {
      return 0;
    }

    runnerA = runnerA.next;
    runnerB = runnerB.next;
  }

  return runnerA == null && runnerB == null ? 1 : 0;
}
