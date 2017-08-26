// Problem url: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
'use strict';
/* Node is defined as
var Node = function(data) {
    this.data = data;
    this.next = null;
}
*/

// This is a "method-only" submission.
// You only need to complete this method.

function print(head) {
  let runner = head;
  while (runner != null) {
    console.log(runner.data);
    runner = runner.next;
  }
}
