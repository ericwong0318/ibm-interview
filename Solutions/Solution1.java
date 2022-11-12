import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // size
        int n = Integer.parseInt(scanner.nextLine());
        String[] numbersStr = scanner.nextLine().split(" ");
        List<String> storages = new ArrayList<>(Arrays.asList(numbersStr));
        storages.sort((s1, s2) -> {
            if (toVal(s1) > toVal(s2)) {
                return -1;
            } else if (toVal(s1) < toVal(s2)) {
                return 1;
            }
            return 0;
        });

        // request
        int m = Integer.parseInt(scanner.nextLine());
        String[] numbersStr2 = scanner.nextLine().split(" ");
        List<String> requests = new ArrayList<>(Arrays.asList(numbersStr2));


        for (String r : requests) {
            for (int i = 0; i < storages.size(); i++) {
                if (toVal(storages.get(i)) >= toVal(r)) {
                    storages.set(i, "NULL");
                    continue;
                }
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static int toVal(String s) {
        int n = 0;
        int xNum = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'X') {
                xNum++;
            }
        }

        switch (chars[chars.length - 1]) {
            case 'M':
                break;
            case 'S':
                n = -1;
                break;
            case 'L':
                n = 1;
                break;
            default:
                System.out.println("Err");

        }
        if (xNum != 0)
            return n * xNum;
        else
            return n;
    }

}
