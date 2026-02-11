package stackforg.dev.consumer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "endpoints")
public class Endpoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long endpointsId;
    private String endpointsName;
    private String endpointUrl;

    @ManyToOne
    @JoinColumn(name = "systemId")
    private System systemId;

    public Endpoint(Long endpointsId, String endpointsName, String endpointUrl, System systemId) {
        this.endpointsId = endpointsId;
        this.endpointsName = endpointsName;
        this.endpointUrl = endpointUrl;
        this.systemId = systemId;
    }

    public Endpoint() {
    }


}
