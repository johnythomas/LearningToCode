// Problem url: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list?h_r=next-challenge&h_v=zen
'use strict';

/*
  Node is defined as
  var Node = function(data) {
      this.data = data;
      this.next = null;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function insert(head, data) {
  let newNode = new Node(data);
  if (head == null) return newNode;
  let runner = head;
  while (runner.next != null) {
    runner = runner.next;
  }

  runner.next = newNode;
  return head;
}
