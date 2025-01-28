import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddProductTest {
    @Test @DisplayName("Add product correctly (product name not exists)")
    void AddProductCorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 2000);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Add product incorrectly (product name duplicated)")
    void AddProductInCorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 2000);
        prod.addProduct("Car", 2000);
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Check for count is increased by 1 or not")
    void Count(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 2000);
        prod.addProduct("boat", 500);
        prod.addProduct("laptop", 10, 2);
        assertEquals(3, prod.getCount());
    }
    
}
