a = int(input())
b = int(input())
c = 0
if a > b :
	x = b
	y = a
	if x % 2 == 0 :
		if x >= 0 :
			for i in range(x + 1,y,2):
			    c = c + i
		if x < 0 :
			for i in range(x + 1,y,2):
				c = c + i
	if x % 2 != 0 :
		if x > 0 :
			for i in range(x + 2,y,2):
					c = c + i
		if x < 0 :
			for i in range(x + 2,y,2):
					c = c + i
elif b > a :
	x = a
	y = b
	if x % 2 == 0 :
		if x >= 0 :
			for i in range(x + 1,y,2):
				c = c + i
		if x < 0 :
			for i in range(x + 1,y,2):
				c = c + i
	if x % 2 != 0 :
		if x > 0 :
			for i in range(x + 2,y,2):
				c = c + i
		if x < 0 :
		    for i in range(x + 2,y,2):
			    c = c + i
elif a == b :
	print("0")
print(c)
