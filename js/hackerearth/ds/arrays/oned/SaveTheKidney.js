'use strict';

// Problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/save-rishabhs-kidney/

let findMaxLengthSubArray = function (array) {

  // replace 0 with -1
  for (let i = 0; i < array.length; i++) {
    if (array[i] == 0) {
      array[i] = -1;
    }
  }

  let sumArray = [0];
  for (let i = 1; i <= array.length; i++) {
    sumArray[i] = sumArray[i - 1] + array[i - 1];
  }

  let numberStartIndexMap = {};
  let maxLength = -1;

  // finding the maxLength
  for (let i = 0; i < sumArray.length; i++) {
    let sum = sumArray[i];
    if (!(sum in numberStartIndexMap)) {
      numberStartIndexMap[sum] = i;
    } else if ((i - numberStartIndexMap[sum]) > maxLength) {
      maxLength = i - numberStartIndexMap[sum];
    }
  }

  return maxLength;
};

let findPositionsOfX = function (array) {
  let positionsOfX = [];
  for (let i = 0; i < array.length; i++) {
    if (array[i] == 'x') {
      positionsOfX.push(i);
    }
  }

  return positionsOfX;
};

function main(input) {
  let string = input.split('\n')[1];
  let maxLength = -1;

  // converting string to int array except x
  let array = string.split('').map(function (val) {
    return isNaN(val) ? val : Number(val);
  });

  let positionsOfX = findPositionsOfX(array);

  // generating all the possiblities of binary values in the positions of x
  for (let i = 0; i < (1 << positionsOfX.length); i++) {
    let bit = positionsOfX.length - 1;
    for (let j = 0; j < positionsOfX.length; j++) {
      array[positionsOfX[j]] = (i >> bit) & 1;
      bit--;
    }

    maxLength = Math.max(maxLength, findMaxLengthSubArray(array));
    if (maxLength == array.length) break;
  }

  console.log(maxLength);
}
