package edu.utp.javadevelop.sales_management.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products_vouchers", schema = "sales_management", catalog = "")
public class ProductsVouchers {
    private int id;
    private Integer voucherId;
    private Integer productId;

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
    @Column(name = "voucher_id")
    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsVouchers that = (ProductsVouchers) o;
        return id == that.id &&
                Objects.equals(voucherId, that.voucherId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, voucherId, productId);
    }
}
