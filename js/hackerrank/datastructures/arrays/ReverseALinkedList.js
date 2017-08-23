'use strict';
/*
    Reverse a linked list and return the head
    The input list will have at least one element
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function reverseLinkedList(head) {
  let runner = head;
  let prev = null;
  while (runner != null) {
    let tmp = runner.next;
    runner.next = prev;
    prev = runner;
    runner = tmp;
  }

  head = prev;
  return head;
}
