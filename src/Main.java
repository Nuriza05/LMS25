import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1,123);
        DataOfCar dataOfCar = new DataOfCar(LocalDate.of(2014,7,8),"MERS","black", BigDecimal.valueOf(150000));
        HashMap <Car, DataOfCar> hashMap = new HashMap<>();
        hashMap.put(car,dataOfCar);

      Iterator<Map.Entry<Car,DataOfCar> >itr =hashMap.entrySet().iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }
    }
}