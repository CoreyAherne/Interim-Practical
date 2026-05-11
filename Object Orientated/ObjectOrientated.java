class ObjectOrientated {
    public static void main(String[] args) {
      Product product1 = new Product(1, "Coffee", "Latte");
      System.out.println("Product ID: " + product1.ValueID);

      Product prod2 = new Product();
      System.out.println("Product Name: " + prod2.ProductNamevalue);
    }

    static class Product {
        int ValueID;
        String ProductNamevalue;
        String TypeValueID;
        int initStock() {return 20;}

        Product(int value, String productname, String typevalue){
                ValueID = value;
                ProductNamevalue = productname;
                TypeValueID = typevalue;

        }

        Product(){
            this(3, "tea", "black");
        }
        
    }

    static class Coffee extends Product{
    String flavor;
    @Override
    int initStock() {return 10;}

        Coffee(int value, String productname, String typevalue){
                ValueID = value;
                ProductNamevalue = productname;
                TypeValueID = typevalue;

        }

    }


    public static int initStock(){
        return 20;
    }
}
