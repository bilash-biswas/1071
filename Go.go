package main

import (
	"fmt"
)

func main() {
	var a, b, x, y, i, c int
	c = 0
	fmt.Scan(&a)
	fmt.Scan(&b)
	if a > b {
		x = b
		y = a
		if x%2 == 0 {
			if x >= 0 {
				for i = x + 1; i < y; i = i + 2 {
					c = c + i
				}
			}
			if x < 0 {
				for i = x + 1; i < y; i = i + 2 {
					c = c + i
				}
			}
		}
		if x%2 != 0 {
			if x > 0 {
				for i = x + 2; i < y; i = i + 2 {
					c = c + i
				}
			}
			if x < 0 {
				for i = x + 2; i < y; i = i + 2 {
					c = c + i
				}
			}
		}
	} else if b > a {
		x = a
		y = b
		if x%2 == 0 {
			if x >= 0 {
				for i = x + 1; i < y; i = i + 2 {
					c = c + i
				}
			}
			if x < 0 {
				for i = x + 1; i < y; i = i + 2 {
					c = c + i
				}
			}
		}
		if x%2 != 0 {
			if x > 0 {
				for i = x + 2; i < y; i = i + 2 {
					c = c + i
				}
			}
			if x < 0 {
				for i = x + 2; i < y; i = i + 2 {
					c = c + i
				}
			}
		}
	} else if a == b {
		fmt.Printf("0\n")
	}

	fmt.Printf("%d\n", c)
}
