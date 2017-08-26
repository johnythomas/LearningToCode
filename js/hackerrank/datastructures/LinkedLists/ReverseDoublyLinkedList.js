// Problem url: https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list
'use strict';
/*
    Reverse a doubly linked list, input list may also be empty
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function reverse(head) {
  if (head == null) return head;
  let runner = head;
  while (runner != null) {
    let temp = runner.next;
    runner.next = runner.prev;
    runner.prev = temp;
    if (temp == null) {
      head = runner;
    }

    runner = temp;
  }

  return head;
}
