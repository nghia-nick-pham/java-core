package builder_pattern_02;

/**
 * Created by NghiaPV on 10/4/2018.
 */
public class MainTest {
    public static void main(String[] args) {
        Product product = Product.newProduct().id("11")
                .description("TV 46'")
                .value(2000.00)
                .name("TV 46'")
                .build();

        System.out.println(product.toString());
    }
}
