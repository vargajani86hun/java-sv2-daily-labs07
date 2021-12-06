package day05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreate() {
        Product product = new Product("pöttyös labda", 2200, LocalDate.of(2021, 11, 30));
        assertEquals("pöttyös labda", product.getName());
        assertEquals(2200, product.getPrice());
        assertEquals(LocalDate.of(2021, 11, 30), product.getSaleDate());
    }

    @Test
    void testIsValidDate() {
        Product validProduct = new Product("pöttyös labda", 2200, LocalDate.of(2021, 11, 30));
        Product invalidProduct = new Product("lufi", 330, LocalDate.of(2022, 01, 13));
        assertTrue(validProduct.isValidDate());
        assertFalse(invalidProduct.isValidDate());
    }

}