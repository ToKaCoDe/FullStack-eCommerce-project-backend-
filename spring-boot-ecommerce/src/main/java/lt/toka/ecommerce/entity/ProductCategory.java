package lt.toka.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "product_category")
public class ProductCategory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "category")
    private Set<Product> products;
    
    public Long getId() {
        return this.id;
    }
    
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }
    
    public void setProducts(final Set<Product> products) {
        this.products = products;
    }
}