import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    	  int x, y, i, c = 0,a,b;
        a = input.nextInt();
        b = input.nextInt();
	if (a > b) {
		x = b;
		y = a;
		if (x % 2 == 0 ){
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
		if (x % 2 != 0) {
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
		if (x % 2 == 0) {
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
		if (x % 2 != 0) {
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
		c = 0;
	}
    System.out.println(c);  
}
}
