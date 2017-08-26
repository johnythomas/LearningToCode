// Problem url: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list?h_r=next-challenge&h_v=zen
'use strict';
/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  var Node = function(data) {
    this.data = data;
    this.next = null;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function insert(head, data, position) {
  let newNode = new Node(data);

  if (position == 0) {
    newNode.next = head;
    head = newNode;
  } else {
    let runner = head;
    for (let i = 1; i < position; i++) {
      runner = runner.next;
    }

    let next = runner.next;
    runner.next = newNode;
    newNode.next = next;
  }

  return head;
}
