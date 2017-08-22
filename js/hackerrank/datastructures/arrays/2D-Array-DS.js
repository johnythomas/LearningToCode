// Problem url: https://www.hackerrank.com/challenges/2d-array/problem

'use strict';

process.stdin.resume();
process.stdin.setEncoding('ascii');

var inputStdin = '';
var inputStdinArray = '';
var inputCurrentline = 0;

process.stdin.on('data', function (data) {
  inputStdin += data;
});

process.stdin.on('end', function () {
  inputStdinArray = inputStdin.split('\n');
  main();
});

function readLine() {
  return inputStdinArray[inputCurrentline++];
}

function main() {
  var arr = [];
  for (let i = 0; i < 6; i++) {
    arr[i] = readLine().split(' ');
    arr[i] = arr[i].map(Number);
  }

  let max;
  for (let i = 0; i < 6 - 2; i++) {
    for (let j = 0; j < 6 - 2; j++) {
      let sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
      if (typeof max == 'undefined' || sum > max) {
        max = sum;
      }
    }
  }

  console.log(max);
}
