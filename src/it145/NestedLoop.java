/*
 * Nested loop example
 *
 * IT-145 Foundations of Application Development
 *
 * College of Online and Continuing Education
 * Southern New Hampshire University
 *
 * @author John Watson <john.watson@snhu.edu>
 *
 * Compile command:
 *   > javac NestedLoop.java
 *
 * Run command:
 *   > java -cp . NestedLoop
 *
 * Output:
 *   [1:1] +
 *   [2:4] ++++
 *   [3:9] +++++++++
 *   [4:16] ++++++++++++++++
 *   [5:25] +++++++++++++++++++++++++
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // outer loop - print index and index^2
        for (int i = 1; i <= 5; i++) {
            System.out.print("[" + i + ":" + i*i + "] ");

            // inner loop - print i^2 "+"
            for (int k = 1; k <= (i*i); k++) {
                System.out.print("+");
            }

            // after inner loop, print a linefeed
            System.out.println();
        }
    }   
}