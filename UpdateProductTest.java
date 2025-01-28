import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UpdateProductTest {
    @Test @DisplayName("Update product correctly (product name exists, new name is not blank)")
    void UpdateCorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 300);
        prod.updateProduct("Car", "Boat", 2000, 20);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Update product incorrectly (product name not exists)")
    void UpdateIncorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 3000);
        prod.updateProduct("Car", "Laptop", 3000, 100);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Update product incorrectly (product name exists but new name is blank)")
    void UpdateIncorrectly_newNameBlank(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 3000);
        prod.updateProduct("Book", " ", 2000, 100);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Update product incorrectly (product name exists but new price is less than 0)")
    void UpdateIncorrectly_Price(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 3000);
        prod.updateProduct("Car", "Book", -100, 200);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Update product incorrectly (product name exists but new discount is less than 0 or greater than 100)")
    void UpdateIncorrectly_Discount(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 3000);
        prod.updateProduct("Car", "Book", 2000, 150);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Check for count is stay the same as before the update")
    void UpdateAndCheck(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 3000);
        int count = prod.getCount();
        prod.updateProduct("Car", "Book",100, 30);
        assertEquals(count, prod.getCount());
    }
}
