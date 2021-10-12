/**
 * N.B. Part has to implement Comparable if it is
 * going to be stored in a TreeMap!
 */
public class Part implements Comparable<Part> {
    private String make;
    private String model;
    private String leftOver;
    private int year;

    /**
     * Creates a part object
     */
    public Part(String line) {
        String[] partPieces = line.split(" ");
        int length = partPieces.length;

        // Instantiate make, model, and leftOver
        // year has been instantiated for you!
        make = partPieces[length - 3];
        model = partPieces[length - 2];
        year = Integer.parseInt(partPieces[length - 1]);
        leftOver = "";

        for (int i = 0; i < length - 3; i++) {
            leftOver += " " + partPieces[i];
        }
    }

    // Have to have compareTo if it implements Comparable
    @Override
    public int compareTo(Part other) {
        int mkC = make.compareTo(other.make);

        if (mkC != 0) return mkC;

        else {
            int mdlC = model.compareTo(other.model);

            if (mdlC != 0) return mdlC;

            else {
                int yrC = year - other.year;

                if (yrC != 0) return yrC;

                else {
                    return leftOver.compareTo(other.leftOver);
                }
            }
        }
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + leftOver;
    }
}
