package huy.module4course14.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Data
public class AppRole implements GrantedAuthority {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
