package edu.utp.javadevelop.sales_management.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_roles", schema = "sales_management", catalog = "")
public class UserRoles {
    private int id;
    private String name;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoles userRoles = (UserRoles) o;
        return id == userRoles.id &&
                Objects.equals(name, userRoles.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
