// Problem url: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list
'use strict';
/*
    Insert Node in a doubly sorted linked list
    After each insertion, the list should be sorted
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function sortedInsert(head, data) {
  let newNode = new Node(data);
  if (head == null) {
    head = newNode;
    return head;
  } else if (head.data >= data) {
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    return head;
  }

  let runner = head;
  while (runner.next != null) {
    if (runner.next.data >= data && runner.data < data) {
      newNode.prev = runner;
      newNode.next = runner.next;
      runner.next = newNode;
      newNode.next.prev = newNode;
      return head;
    }

    runner = runner.next;
  }

  runner.next = newNode;
  newNode.prev = runner;
  return head;
}
