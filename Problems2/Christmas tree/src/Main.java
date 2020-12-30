class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    void putTreeTopper(String color) {
        TreeTopper tt = new TreeTopper(color);
        tt.sparkle();

    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        void sparkle() {
            System.out.println("Sparkling " + color + " tree topper looks stunning with " +
                   ChristmasTree.this.color + " Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}