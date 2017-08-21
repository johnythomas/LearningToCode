// Problem url: https://www.hackerrank.com/challenges/dynamic-array

'use strict';

function processData(input) {
  let lines = input.split('\n');
  let nq = lines[0].split(' ');
  let n = nq[0];
  let q = nq[1];

  // creating a list of n empty sequences
  let seqList = [];
  for (let i = 0; i < n; i++) {
    seqList.push([]);
  }

  let lastAnswer = 0;
  for (let i = 1; i <= q; i++) {
    let query = lines[i].split(' ');
    let qType = query[0];
    let x = query[1];
    let y = query[2];

    // finding the index
    let index = (x ^ lastAnswer) % n;

    // doing the queries
    if (qType == '1') {
      seqList[index].push(y);
    } else {
      lastAnswer = seqList[index][y % seqList[index].length];
      console.log(lastAnswer);
    }
  }
}
