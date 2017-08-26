// Problem url: https://www.hackerrank.com/challenges/the-hurdle-race
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

/////////////// ignore above this line ////////////////////

function main() {
  let nTemp = readLine().split(' ');
  let n = parseInt(nTemp[0]);
  let k = parseInt(nTemp[1]);
  let height = readLine().split(' ');
  height = height.map(Number);

  let maxHeight = -1;
  height.forEach(function (h) {
    maxHeight = Math.max(maxHeight, h);
  });

  console.log(k >= maxHeight ? 0 : maxHeight - k);
}
