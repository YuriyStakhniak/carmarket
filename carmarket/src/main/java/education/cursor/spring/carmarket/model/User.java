package education.cursor.spring.carmarket.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SITE_USERS")
@Getter
@Setter
public class User {
    public User(String firstName, String lastName, Long timeOnApp, Long mobilePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.timeOnApp = System.currentTimeMillis();
        this.mobilePhone = mobilePhone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Email(message = "INVALID EMAIL")
    @Column(unique = true)
    private String email;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "TIME_ON_APP")
    private Long timeOnApp;
    @Column(name = "MOBILE_PHONE")
    private Long mobilePhone;
}
