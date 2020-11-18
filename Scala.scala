import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    
    var c:Int=0;
    var a=input.nextInt();
    var b=input.nextInt();
    if (a > b) {
        var x = b;
        var y = a;
        if (x%2 == 0 ){
            if (x >= 0) {
                for (i <- x+1 to y-1 by 2){
                    c = c + i;
                }
            }
            if( x < 0) {
                for (i <- x+1 to y-1 by 2) {
                    c = c + i;
                }
            }
        }
        if (x%2 != 0) {
            if (x > 0) {
                for (i <- x+2 to y-1 by 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i <- x+2 to y-1 by 2) {
                    c = c + i;
                }
            }
        }
    } else if (b > a) {
        var x = a;
        var y = b;
        if (x%2 == 0) {
            if (x >= 0) {
                for (i <- x+1 to y-1 by 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i <- x+1 to y-1 by 2) {
                    c = c + i;
                }
            }
        }
        if (x%2 != 0) {
            if (x > 0) {
                for (i <- x+2 to y-1 by 2) {
                    c = c + i;
                }
            }
            if (x < 0) {
                for (i <- x+2 to y-1 by 2) {
                    c = c + i;
                }
            }
        }
    } else if (a == b) {
        c=0;
    }
    println(c)
    }
}
