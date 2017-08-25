// Problem url: https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
'use strict';
/*
    Detect a cycle in a Linked List.
    Note that the head may be 'null' if the list is empty.
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.next = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function hasCycle(head) {

  if (head == null) return 0;
  let runner1 = head;
  let runner2 = head.next;
  while (runner1.next && runner2.next && runner2.next.next) {
    if (runner1 == runner2) {
      return 1;
    }

    runner1 = runner1.next;
    runner2 = runner2.next.next;
  }

  return 0;
}
