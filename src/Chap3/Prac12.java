package Chap3;

public class Prac12 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < args.length; ++i) {
            try {
                int var3 = Integer.parseInt(args[i]);
            } catch (NumberFormatException var4) {
                continue;
            }

            sum += Integer.parseInt(args[i]);
        }

        System.out.println(sum);
    }
}


    }
}
