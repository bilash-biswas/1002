var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
const pi = 3.14159;
var A = parseFloat(lines.shift());
console.log("A=" + (pi * A * A).toFixed(4));
