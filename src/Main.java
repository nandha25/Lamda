import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
      final  List<BigDecimal> prices = new ArrayList<BigDecimal>();
        prices.add(BigDecimal.valueOf(10));
        prices.add(BigDecimal.valueOf(20));
        prices.add(BigDecimal.valueOf(30));
        prices.add(BigDecimal.valueOf(40));
        prices.add(BigDecimal.valueOf(50));
        prices.add(BigDecimal.valueOf(60));
     final   BigDecimal finalPrice = prices.stream().filter(price -> price.compareTo(BigDecimal.valueOf(50)) > 0)
                            .map(price -> {
                                return (price.multiply(BigDecimal.valueOf(10)));
                            })
                            .reduce(BigDecimal.ZERO, BigDecimal::add );

     System.out.println(finalPrice);

        prices.forEach(System.out::println);

    }
}
