package builder;

public class Cake {

    private int sugar;
    private int flour;
    private int butter;
    private int chocolate;

    private Cake(CakeBuilder b) {
        this.sugar = b.sugar;
        this.flour = b.flour;
        this.butter = b.butter;
        this.chocolate = b.chocolate;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", flour=" + flour +
                ", butter=" + butter +
                ", chocolate=" + chocolate +
                '}';
    }

    static class CakeBuilder {

        private int sugar;
        private int flour;

        private int butter = 0; // optional
        private int chocolate = 0; // optional

        public CakeBuilder(int sugar, int flour) {
            this.sugar = sugar;
            this.flour = flour;
        }

        public CakeBuilder butter(int butter) {
            this.butter = butter;
            return this;
        }

        public CakeBuilder chocolate(int chocolate) {
            this.chocolate = chocolate;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }
}
