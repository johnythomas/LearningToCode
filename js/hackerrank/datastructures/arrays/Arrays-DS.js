// Problem url: https://www.hackerrank.com/challenges/arrays-ds/problem

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
  let n = parseInt(readLine());
  let arr = readLine().split(' ');
  arr = arr.map(Number);
  let result = '';
  for (let i = arr.length - 1; i >= 0; i--) {
    result += (arr[i] + ' ');
  }

  console.log(result);
}
