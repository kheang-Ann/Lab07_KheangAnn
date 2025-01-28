import java.util.Scanner;

public class MenuandProductManagementTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n======Menu Product======");
            System.out.println("1. Add Product          ");
            System.out.println("2. Find Product         ");
            System.out.println("3. Remve Product        ");
            System.out.println("4. Update Product       ");
            System.out.println("5. Exit                 ");
            System.out.print("choice: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    //scanner.nextLine();

                    System.out.print("Price: $");
                    double price = scanner.nextDouble();

                    System.out.print("Discount: %");
                    double discount = scanner.nextDouble();
                    if (discount < 0 || discount > 100){
                        productManager.addProduct(name, price);
                    } else {
                        productManager.addProduct(name, price, discount);
                    }
                    break;
                case 2:
                    System.out.print("Enter name of the product to find it: ");
                    String find = scanner.nextLine();
                    productManager.findProduct(find);
                    break;
                case 3: 
                    System.out.print("Enter name product to remove: ");
                    name = scanner.nextLine();
                    productManager.removeProduct(name);
                    break;
                case 4: 
                    System.out.print("Enter old product name: ");
                    String oldname = scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    String newname = scanner.nextLine();
                    System.out.print("Enter new price: $");
                    double newprice = scanner.nextDouble();
                    System.out.print("New Discount: %");
                    double newDiscount = scanner.nextDouble();

                    productManager.updateProduct(oldname, newname, newprice, newDiscount);
                    break;
                case 5: 
                    System.out.println("Thank you for using our system :)");
                    System.out.println("Exit....");
                    return ;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        
    }    
}
