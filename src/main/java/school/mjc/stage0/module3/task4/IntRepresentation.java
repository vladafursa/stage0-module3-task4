package school.mjc.stage0.module3.task4;

public class IntRepresentation {
    public static void main(String[] args) {
        char[] chars = {'c', 'h', 'a', 'r'};


        for (char c : chars) {
            int intValue = (int) c;
            char charvalue=(char)intValue;
            System.out.print(charvalue);
        }
    }
}
