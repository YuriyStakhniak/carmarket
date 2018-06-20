package education.cursor.spring.carmarket.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "CARS")
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CAR_BRAND")
    private String carBrand;
    @Column(name = "CAR_MODEL")
    private String carModel;
    @Column(name = "CAR_TYPE")
    private String carType;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "PRICE")
    private Double price;
}
