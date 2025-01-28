import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test @DisplayName("set name correctly (name is not blank)")
    void setNameCorrect(){
        Product prod = new Product();
        prod.setName("Grape");
        assertEquals("Grape", prod.getName());
    }

    @Test @DisplayName("Set Name incorrectly (name is blank)")
    void setNameInCorrectly(){
        Product prod = new Product();
        prod.setName(" ");
        assertNull(prod.getName());
    }

    @Test @DisplayName("Set price correctly (price is greater than 0)")
    void setPriceCorrect(){
        Product prod = new Product();
        prod.setPrice(100);
        assertEquals(100, prod.getPrice());
    }

    @Test @DisplayName("Set price incorrectly (price is greater than 0)")
    void setPriceInCorrect(){
        Product prod = new Product();
        prod.setPrice(-1);
        assertEquals(0, prod.getPrice());
    }

    @Test @DisplayName("Set discount correctly (discount is between 0 and 100)")
    void setDiscountCorrect(){
        Product prod = new Product();
        prod.setDiscount(98);
        assertEquals(98, prod.getDiscount());
    }

    @Test @DisplayName("Set discount incorrectly (discount less than 0 or greater than 100)")
    void setDiscountInCorrect(){
        Product prod = new Product();
        prod.setDiscount(110);
        assertEquals(0, prod.getDiscount());
    }

}
