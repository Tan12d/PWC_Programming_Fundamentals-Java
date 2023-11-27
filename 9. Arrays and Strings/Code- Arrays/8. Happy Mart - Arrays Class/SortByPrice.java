import java.util.*;
public class SortByPrice implements Comparator<Product> {
 public int compare(Product a,Product b)
 {
 return (int)(a.price-b.price);
 }

}
