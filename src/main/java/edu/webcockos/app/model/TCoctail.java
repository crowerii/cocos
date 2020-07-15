package edu.webcockos.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_coctaile", schema = "CO")
public class TCoctail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_coctaile_pkey")
    @SequenceGenerator(name = "t_coctaile_pkey", sequenceName = "co.t_coctaile_coctail_id_seq", allocationSize = 1, initialValue = 0)
    @Column(name =  "coctail_id", nullable = false)
    private Long    coctail_id;

    @Column(name =  "name", nullable = false)
    private String    name;

    @Column(name =  "url", nullable = false)
    private String 	  url;

    public TCoctail() {
        super();
    }

    public Long getCoctail_id() {
        return coctail_id;
    }

    public void setCoctail_id(Long coctail_id) {
        this.coctail_id = coctail_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

