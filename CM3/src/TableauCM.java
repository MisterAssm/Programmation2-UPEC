import fr.zemouchi.tm2.MyTableau;

public class TableauCM extends MyTableau {

    public TableauCM(int size) {
        super(size);
    }

    public void insert(int position, int value) {
        int[] newElements = new int[(Math.max(position, numberOfElements)) * 2];

        for (int i = 0; i < numberOfElements; i++) {
            newElements[(position < numberOfElements) && (i >= position) ? i + 1 : i] = elements[i];
        }

        newElements[position] = value;
        numberOfElements = (Math.max(position + 1, numberOfElements));
        elements = newElements;
    }

    public static void main(String[] args) {

        TableauCM tableauCM = new TableauCM(1);

        tableauCM.add(10);
        tableauCM.insert(2, 20);

        System.out.println(tableauCM);
        System.out.println(tableauCM.numberOfElements);

        tableauCM.insert(1, 40);

        System.out.println(tableauCM);
        System.out.println(tableauCM.numberOfElements);

        tableauCM.insert(5, 50);
        System.out.println(tableauCM);
        System.out.println(tableauCM.numberOfElements);

        tableauCM.add(31);
        System.out.println(tableauCM);
        System.out.println(tableauCM.numberOfElements);
    }
}
