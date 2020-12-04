package edu.utp.javadevelop.sales_management.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Vouchers {
    private int id;
    private BigDecimal totalPrice;
    private BigDecimal totalIgv;
    private BigDecimal subtotal;
    private Integer voucherTypeId;
    private Integer clientId;
    private Integer userId;

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
    @Column(name = "total_price")
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "total_igv")
    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    @Basic
    @Column(name = "subtotal")
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @Basic
    @Column(name = "voucher_type_id")
    public Integer getVoucherTypeId() {
        return voucherTypeId;
    }

    public void setVoucherTypeId(Integer voucherTypeId) {
        this.voucherTypeId = voucherTypeId;
    }

    @Basic
    @Column(name = "client_id")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vouchers vouchers = (Vouchers) o;
        return id == vouchers.id &&
                Objects.equals(totalPrice, vouchers.totalPrice) &&
                Objects.equals(totalIgv, vouchers.totalIgv) &&
                Objects.equals(subtotal, vouchers.subtotal) &&
                Objects.equals(voucherTypeId, vouchers.voucherTypeId) &&
                Objects.equals(clientId, vouchers.clientId) &&
                Objects.equals(userId, vouchers.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalPrice, totalIgv, subtotal, voucherTypeId, clientId, userId);
    }
}
