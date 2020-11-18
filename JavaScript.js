var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines=input.split(' ');
var a=parseInt(lines.shift());
var b=parseInt(lines.shift());
	var x, y, i, c=0;
	if (a > b) {
		x = b;
		y = a;
		if (x%2 === 0 ){
			if (x >= 0) {
				for (i = x + 1; i < y; i = i + 2 ){
					c = c + i;
				}
			}
			if( x < 0) {
				for (i = x + 1; i < y; i = i + 2) {
					c = c + i;
				}
			}
		}
		if (x%2 !== 0) {
			if (x > 0) {
				for (i = x + 2; i < y; i = i + 2) {
					c = c + i;
				}
			}
			if (x < 0) {
				for (i = x + 2; i < y; i = i + 2) {
					c = c + i;
				}
			}
		}
	} else if (b > a) {
		x = a;
		y = b;
		if (x%2 === 0) {
			if (x >= 0) {
				for (i = x + 1; i < y; i = i + 2) {
					c = c + i;
				}
			}
			if (x < 0) {
				for (i = x + 1; i < y; i = i + 2) {
					c = c + i;
				}
			}
		}
		if (x%2 !== 0) {
			if (x > 0) {
				for (i = x + 2; i < y; i = i + 2) {
					c = c + i;
				}
			}
			if (x < 0) {
				for (i = x + 2; i < y; i = i + 2) {
					c = c + i;
				}
			}
		}
	} else if (a == b) {
		console.log("0");
	}

    console.log(c);
