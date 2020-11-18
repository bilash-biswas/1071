import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`);
    var x:Int
    var y:Int
    var i:Int
    var c:Int = 0;
    var a = input.nextInt();
    var b = input.nextInt();
    if (a > b) {
        x = b;
        y = a;
        if (x % 2 == 0 ){
            if (x >= 0) {
                for (i in x + 1..y-1 step 2){
                    c = c + i;
                }
            }
            if( x < 0) {
                for (i in x + 1..y-1 step 2) {
                    c = c + i;
                }
            }
        }
        if (x % 2 != 0) {
            if (x > 0) {
                for (i in x + 2..y-1 step 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i in x + 2..y-1 step 2) {
                    c = c + i;
                }
            }
        }
    } else if (b > a) {
        x = a;
        y = b;
        if (x % 2 == 0) {
            if (x >= 0) {
                for (i in x + 1..y-1 step 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i in x + 1..y-1 step 2) {
                    c = c + i;
                }
            }
        }
        if (x % 2 != 0) {
            if (x > 0) {
                for (i in x + 2..y-1 step 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i in x + 2..y-1 step 2) {
                    c = c + i;
                }
            }
        }
    } else if (a == b) {
        c = 0;
    }
    System.out.println(c);
}
