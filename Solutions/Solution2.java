import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        /*
        Read data from input file
        allValid = true
        errorCodes = []
        for each record in input file:
            allValid = record.isValid
            if record.isValid is not true:
                errorCodes append error message

        if allValid is true:
            print "Yes"
        else:
            print "No"
            print errorCodes sepearated by space character

         */

        /*
3
1 false ERR_OOM
2 true
3 false ERR_TIME_OUT

        No
        ERR_OOM ERR_TIME_OUT
         */
        Scanner scanner = new Scanner(System.in);

        // size
        int n = Integer.parseInt(scanner.nextLine());
        boolean allValid = true;
        List<String> errorCodes = new ArrayList<>();
        for (int in = 0; in < n; in++) {
            String[] numbersStr = scanner.nextLine().split(" ");
            List<String> line = new ArrayList<>(Arrays.asList(numbersStr));
//            System.out.println(line);
            if (!Objects.equals(line.get(1), "true")) {
                allValid = false;
                errorCodes.add(line.get(2));
            }
        }
        if (allValid) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            for (String s : errorCodes) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }
}
