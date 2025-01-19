package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
    @Basic
    @Column(name = "Cat_id")
    private String catId;
    @Basic
    @Column(name = "Cat_name")
    private String catName;
    @Id
    private Long id;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categories that = (Categories) o;

        if (catId != null ? !catId.equals(that.catId) : that.catId != null) return false;
        if (catName != null ? !catName.equals(that.catName) : that.catName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catId != null ? catId.hashCode() : 0;
        result = 31 * result + (catName != null ? catName.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
