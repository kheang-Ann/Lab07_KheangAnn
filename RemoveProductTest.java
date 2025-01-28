import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveProductTest {
    @Test @DisplayName("Remove product correctly (product name exists)")
    void removeCorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 2000);
        prod.removeProduct("Car");
        assertEquals(0, prod.getCount());
    }

    @Test @DisplayName("Remove product incorrectly (product name not exists)")
    void removeInCorrectly(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Car", 2000);
        prod.removeProduct("Boat");
        assertEquals(1, prod.getCount());
    }

    @Test @DisplayName("Check for count is decreased by 1 or not")
    void CheckForCount(){
        ProductManager prod = new ProductManager();
        prod.addProduct("Laptop", 500);
        prod.addProduct("SmartPhone", 400);
        prod.addProduct("Car", 20000);
        prod.removeProduct("Laptop");
        assertEquals(2, prod.getCount());
    }
}
