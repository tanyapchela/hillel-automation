public class Hw37Product {
    public final String name;
    public final String description;
    public final int size;
    public final String receiver;
    public final int price;
    public final String vendor;
    public final boolean isSold;
    public final int inalcategory;

    public static class Builder {
        public String name = "TV";
        public String description = "TV";
        public int size = 16;
        public String receiver = "FIO";
        public int price = 15000;
        public String vendor = "LG";
        public boolean isSold = true;
        public int inalcategory = 1;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder isSold(boolean isSold) {
            this.isSold = isSold;
            return this;
        }

        public Builder inalcategory(int inalcategory) {
            this.inalcategory = inalcategory;
            return this;
        }

        public Hw37Product build() {
            return new Hw37Product(this);
        }
    }


    private Hw37Product(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.size = builder.size;
        this.receiver = builder.receiver;
        this.price = builder.price;
        this.vendor = builder.vendor;
        this.isSold = builder.isSold;
        this.inalcategory = builder.inalcategory;
    }
}
