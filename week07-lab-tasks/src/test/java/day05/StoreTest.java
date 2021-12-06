package day05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void testCreate() {
        Store store = new Store();
        assertEquals(0, store.getProducts().size());
    }

    @Test
    void testAddProduct() {
        Store store = new Store();
        store.addProduct(new Product("pöttyös labda", 2200,
                LocalDate.of(2021, 12, 1)));
        store.addProduct(new Product("lufi", 330,
                LocalDate.of(2021, 11, 30)));
        store.addProduct(new Product("fogkefe", 850,
                LocalDate.of(2021, 10, 20)));
        assertEquals(3, store.getProducts().size());
    }

    @Test
    void testWriteProducts() {
        Store store = new Store();
        store.addProduct(new Product("pöttyös labda", 2200,
                LocalDate.of(2021, 10, 31)));
        store.addProduct(new Product("lufi", 330,
                LocalDate.of(2021, 11, 3)));
        store.addProduct(new Product("fogkefe", 850,
                LocalDate.of(2021, 11, 20)));
        Path path = store.writeProducts();
        assertEquals(Path.of("src/main/resources/december.csv"), path);
    }

}