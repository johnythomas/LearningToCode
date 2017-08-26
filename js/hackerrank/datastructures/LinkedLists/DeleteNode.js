// Problem url: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
'use strict';
/*
    Delete Node at a given position in a linked list
    head pointer input could be NULL as well for empty list
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function deleteNode(head, position) {
  if (position == 0) {
    let temp = head;
    head = head.next;
    temp.next = null;
  } else {
    let runner = head;
    for (var i = 1; i < position; i++) {
      runner = runner.next;
    }

    let temp = runner.next;
    runner.next = runner.next.next;
    temp.next = null;
  }

  return head;
}
