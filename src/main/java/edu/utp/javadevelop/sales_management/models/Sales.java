package edu.utp.javadevelop.sales_management.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sales {
    private int id;
    private Integer created;
    private Integer modified;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created")
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    @Basic
    @Column(name = "modified")
    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return id == sales.id &&
                Objects.equals(created, sales.created) &&
                Objects.equals(modified, sales.modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, modified);
    }
}
