/*
Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.
*/

public static void removeEvenLength (ArrayList <String> array) {
    for (int i = 0; i < array.size(); i++) {
        String str = array.get(i);
        if (str.length() % 2 == 0) {
            array.remove(i);
            i--;
        }
    }
}
