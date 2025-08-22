package classWork;

public class StringArrays {
    public static String findLongestName(String[] names) {
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }
    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        letter = Character.toLowerCase(letter);
        for (String name : names) {
            if (!name.isEmpty() && Character.toLowerCase(name.charAt(0)) == letter) {
                count++;
            }
        }
        return count;
    }
    public static String[] formatNames(String[] names) {
        String[] formatted = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            if (parts.length >= 2) {
                formatted[i] = parts[1] + ", " + parts[0];
            } else {
                formatted[i] = names[i];
            }
        }
        return formatted;
    }
    public static void main(String[] args) {
        String[] students = {"John Smith", "Alice Johnson", "Bob Brown", "Carol Davis", "David Wilson"};

        System.out.println("Longest Name: " + findLongestName(students));
        System.out.println("Names starting with 'A': " + countNamesStartingWith(students, 'A'));

        String[] formattedNames = formatNames(students);
        System.out.println("\nFormatted Names:");
        for (String name : formattedNames) {
            System.out.println(name);
        }
    }
}
