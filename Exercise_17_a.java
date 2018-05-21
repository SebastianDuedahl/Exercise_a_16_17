package Chapter_16_a_01;
/*
Write a method called removeRange that accepts a starting and ending index as parameters and removes the
elements at those indexes (inclusive) from the list. For example, if a variable list stores the values
[8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92], the call of listRange.removeRange(3, 8); should remove values
between index 3 and index 8 (the values 4 and 7), leaving the list of [8, 13, 17, 23, 0, 92].
The method should throw an IllegalArgumentException if either of the positions is negative. Otherwise you may assume
that the positions represent a legal range of the list (0  start  end  size).
 */

public class Exercise_17_a
{
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(8);
        list.add(13);
        list.add(17);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(98);
        list.add(41);
        list.add(7);
        list.add(23);
        list.add(0);
        list.add(92);
        removeRange(list,3,8);

    }

    public static void removeRange (LinkedIntList list,int delete1, int delete2){
        System.out.println(list);

        for (int i = delete1; i < delete2; i++) {
            list.remove(delete1);

        }
        System.out.println(list);
    }
}

