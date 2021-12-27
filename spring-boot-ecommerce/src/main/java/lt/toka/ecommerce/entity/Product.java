package lt.toka.ecommerce.entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "active")
    private boolean active;
    @Column(name = "units_in_stock")
    private int unitsInStock;
    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;
    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
    
    public Long getId() {
        return this.id;
    }
    
    public ProductCategory getCategory() {
        return this.category;
    }
    
    public String getSku() {
        return this.sku;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public boolean isActive() {
        return this.active;
    }
    
    public int getUnitsInStock() {
        return this.unitsInStock;
    }
    
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setCategory(final ProductCategory category) {
        this.category = category;
    }
    
    public void setSku(final String sku) {
        this.sku = sku;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setUnitPrice(final BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public void setActive(final boolean active) {
        this.active = active;
    }
    
    public void setUnitsInStock(final int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    
    public void setDateCreated(final Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        final Product other = (Product)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isActive() != other.isActive()) {
            return false;
        }
        if (this.getUnitsInStock() != other.getUnitsInStock()) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0091: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0091;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0091;
            }
            return false;
        }
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        Label_0128: {
            if (this$category == null) {
                if (other$category == null) {
                    break Label_0128;
                }
            }
            else if (this$category.equals(other$category)) {
                break Label_0128;
            }
            return false;
        }
        final Object this$sku = this.getSku();
        final Object other$sku = other.getSku();
        Label_0165: {
            if (this$sku == null) {
                if (other$sku == null) {
                    break Label_0165;
                }
            }
            else if (this$sku.equals(other$sku)) {
                break Label_0165;
            }
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0202: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0202;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0202;
            }
            return false;
        }
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        Label_0239: {
            if (this$description == null) {
                if (other$description == null) {
                    break Label_0239;
                }
            }
            else if (this$description.equals(other$description)) {
                break Label_0239;
            }
            return false;
        }
        final Object this$unitPrice = this.getUnitPrice();
        final Object other$unitPrice = other.getUnitPrice();
        Label_0276: {
            if (this$unitPrice == null) {
                if (other$unitPrice == null) {
                    break Label_0276;
                }
            }
            else if (this$unitPrice.equals(other$unitPrice)) {
                break Label_0276;
            }
            return false;
        }
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        Label_0313: {
            if (this$imageUrl == null) {
                if (other$imageUrl == null) {
                    break Label_0313;
                }
            }
            else if (this$imageUrl.equals(other$imageUrl)) {
                break Label_0313;
            }
            return false;
        }
        final Object this$dateCreated = this.getDateCreated();
        final Object other$dateCreated = other.getDateCreated();
        Label_0350: {
            if (this$dateCreated == null) {
                if (other$dateCreated == null) {
                    break Label_0350;
                }
            }
            else if (this$dateCreated.equals(other$dateCreated)) {
                break Label_0350;
            }
            return false;
        }
        final Object this$lastUpdated = this.getLastUpdated();
        final Object other$lastUpdated = other.getLastUpdated();
        if (this$lastUpdated == null) {
            if (other$lastUpdated == null) {
                return true;
            }
        }
        else if (this$lastUpdated.equals(other$lastUpdated)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isActive() ? 79 : 97);
        result = result * 59 + this.getUnitsInStock();
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $category = this.getCategory();
        result = result * 59 + (($category == null) ? 43 : $category.hashCode());
        final Object $sku = this.getSku();
        result = result * 59 + (($sku == null) ? 43 : $sku.hashCode());
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        final Object $unitPrice = this.getUnitPrice();
        result = result * 59 + (($unitPrice == null) ? 43 : $unitPrice.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * 59 + (($imageUrl == null) ? 43 : $imageUrl.hashCode());
        final Object $dateCreated = this.getDateCreated();
        result = result * 59 + (($dateCreated == null) ? 43 : $dateCreated.hashCode());
        final Object $lastUpdated = this.getLastUpdated();
        result = result * 59 + (($lastUpdated == null) ? 43 : $lastUpdated.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Product(id=" + this.getId() + ", category=" + this.getCategory() + ", sku=" + this.getSku() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", unitPrice=" + this.getUnitPrice() + ", imageUrl=" + this.getImageUrl() + ", active=" + this.isActive() + ", unitsInStock=" + this.getUnitsInStock() + ", dateCreated=" + this.getDateCreated() + ", lastUpdated=" + this.getLastUpdated() + ")";
    }
}