package edu.webcockos.app.model;

import javax.persistence.*;

@Entity
@Table(name = "t_ingradients", schema = "CO")
public class Tingradient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_ingradients_pkey")
    @SequenceGenerator(name = "t_ingradients_pkey", sequenceName = "co.t_ingradients_ngradient_ID_seq", allocationSize = 1, initialValue = 0)
    @Column(name =  "ingradient_ID", nullable = false)
    private Long    ingradient_ID;

    @Column(name =  "name", nullable = false)
    private String    name;

    public Tingradient() {
        super();
    }

    public Long getIngradient_ID() {
        return ingradient_ID;
    }

    public void setIngradient_ID(Long ingradient_ID) {
        this.ingradient_ID = ingradient_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
