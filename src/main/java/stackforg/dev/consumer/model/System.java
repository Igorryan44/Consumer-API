package stackforg.dev.consumer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "systems")
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemId;
    private String systemName;

    @OneToMany(mappedBy = "systemId")
    private List<Endpoint> endpoints;

    public System(Long systemId, String systemName, List<Endpoint> endpoints) {
        this.systemId = systemId;
        this.systemName = systemName;
        this.endpoints = endpoints;
    }

    public System() {
    }
}
