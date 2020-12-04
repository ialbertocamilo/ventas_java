package edu.utp.javadevelop.sales_management.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Users {
    private int id;
    private String name;
    private String username;
    private String password;
    private Integer status;
    private String nDocument;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private Timestamp created;
    private Timestamp modified;
    private UserRoles userRolesByRoleId;

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

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "n_document")
    public String getnDocument() {
        return nDocument;
    }

    public void setnDocument(String nDocument) {
        this.nDocument = nDocument;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "modified")
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(name, users.name) &&
                Objects.equals(username, users.username) &&
                Objects.equals(password, users.password) &&
                Objects.equals(status, users.status) &&
                Objects.equals(nDocument, users.nDocument) &&
                Objects.equals(gender, users.gender) &&
                Objects.equals(phone, users.phone) &&
                Objects.equals(email, users.email) &&
                Objects.equals(address, users.address) &&
                Objects.equals(created, users.created) &&
                Objects.equals(modified, users.modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, status, nDocument, gender, phone, email, address, created, modified);
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public UserRoles getUserRolesByRoleId() {
        return userRolesByRoleId;
    }

    public void setUserRolesByRoleId(UserRoles userRolesByRoleId) {
        this.userRolesByRoleId = userRolesByRoleId;
    }
}
