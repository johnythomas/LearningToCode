// Problem url: https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
'use strict';
/*
    Get Nth element data from the end in a Linked List
    Number of elements in the list will always be greater than N.
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function getNodeValue(head, position) {
  let runner1 = head;
  let runner2 = head;
  for (var i = 0; i <= position; i++) {
    runner1 = runner1.next;
  }

  while (runner1 != null) {
    runner1 = runner1.next;
    runner2 = runner2.next;
  }

  return runner2.data;
}
