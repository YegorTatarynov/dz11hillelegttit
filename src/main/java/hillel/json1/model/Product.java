package hillel.json1.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

/**
 * @author Serhii Klunniy
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

   // int id;
    public String name;
    public Double price;
   // String description;
   LocalDateTime localDateTime;



}

