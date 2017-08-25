// Problem url: https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
'use strict';
/*
    Remove all duplicate elements from a sorted Linked List
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function removeDuplicates(head) {

  if (head == null) return head;
  let runner = head;
  while (runner.next) {
    if (runner.data == runner.next.data) {
      runner.next = runner.next.next;
    } else {
      runner = runner.next;
    }
  }

  return head;
}
