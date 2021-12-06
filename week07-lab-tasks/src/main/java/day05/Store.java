package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        if (p.isValidDate()) {
            products.add(p);
        }
        else {
            throw new IllegalArgumentException("Sale date cannot be in the future!");
        }
    }

    public Path writeProducts() {
        Path path = createPath();
        writeProducts(path);
        return path;
    }

    public void writeProducts(Path path) {
        try {
            Files.write(path, toStringList());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unnable to create file: " + path, ioe);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    private Path createPath() {
        StringBuilder sb = new StringBuilder();
        sb.append("src/main/resources/");
        sb.append(LocalDate.now().getMonth().name().toLowerCase());
        sb.append(".csv");
        return Path.of(sb.toString());
    }

    private List<String> toStringList() {
        List<String> result = new ArrayList<>();
        for (Product actual : products) {
            StringBuilder sb = new StringBuilder();
            sb.append(actual.getName()).append(";");
            sb.append(actual.getSaleDate()).append(";");
            sb.append(actual.getPrice()).append(";");
            result.add(sb.toString());
        }
        return result;
    }
}
