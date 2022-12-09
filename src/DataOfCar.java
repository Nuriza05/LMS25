import java.math.BigDecimal;
import java.time.LocalDate;

public class DataOfCar {
     private LocalDate yearOfIssue;
     private String model, colour;
     private BigDecimal price;

     public DataOfCar(LocalDate yearOfIssue, String model, String colour, BigDecimal price) {
          this.yearOfIssue = yearOfIssue;
          this.model = model;
          this.colour = colour;
          this.price = price;
     }

     @Override
     public String toString() {
          return "DataOfCar{" +
                  "yearOfIssue='" + yearOfIssue + '\'' +
                  ", model='" + model + '\'' +
                  ", colour='" + colour + '\'' +
                  ", price=" + price +
                  '}';
     }
}
