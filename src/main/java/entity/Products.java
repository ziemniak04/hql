package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
    @Basic
    @Column(name = "Category")
    private String category;
    @Basic
    @Column(name = "Item")
    private String item;
    @Basic
    @Column(name = "Serving_size_oz")
    private Double servingSizeOz;
    @Basic
    @Column(name = "Calories")
    private Integer calories;
    @Basic
    @Column(name = "Calories from Fat")
    private Integer caloriesFromFat;
    @Basic
    @Column(name = "Total Fat")
    private Integer totalFat;
    @Basic
    @Column(name = "Saturated Fat")
    private Integer saturatedFat;
    @Basic
    @Column(name = "Cholesterol")
    private Integer cholesterol;
    @Basic
    @Column(name = "Sodium")
    private Integer sodium;
    @Basic
    @Column(name = "Carbohydrates")
    private Integer carbohydrates;
    @Basic
    @Column(name = "Dietary Fiber")
    private Integer dietaryFiber;
    @Basic
    @Column(name = "Sugars")
    private Integer sugars;
    @Basic
    @Column(name = "Protein")
    private Integer protein;
    @Basic
    @Column(name = "Vitamin A")
    private Integer vitaminA;
    @Basic
    @Column(name = "Vitamin C")
    private Integer vitaminC;
    @Basic
    @Column(name = "Calcium")
    private Integer calcium;
    @Basic
    @Column(name = "Iron")
    private Integer iron;
    @Id
    private Long id;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getServingSizeOz() {
        return servingSizeOz;
    }

    public void setServingSizeOz(Double servingSizeOz) {
        this.servingSizeOz = servingSizeOz;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getCaloriesFromFat() {
        return caloriesFromFat;
    }

    public void setCaloriesFromFat(Integer caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    public Integer getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(Integer totalFat) {
        this.totalFat = totalFat;
    }

    public Integer getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(Integer saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public Integer getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Integer cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Integer getSodium() {
        return sodium;
    }

    public void setSodium(Integer sodium) {
        this.sodium = sodium;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(Integer dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public Integer getSugars() {
        return sugars;
    }

    public void setSugars(Integer sugars) {
        this.sugars = sugars;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(Integer vitaminA) {
        this.vitaminA = vitaminA;
    }

    public Integer getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(Integer vitaminC) {
        this.vitaminC = vitaminC;
    }

    public Integer getCalcium() {
        return calcium;
    }

    public void setCalcium(Integer calcium) {
        this.calcium = calcium;
    }

    public Integer getIron() {
        return iron;
    }

    public void setIron(Integer iron) {
        this.iron = iron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (category != null ? !category.equals(products.category) : products.category != null) return false;
        if (item != null ? !item.equals(products.item) : products.item != null) return false;
        if (servingSizeOz != null ? !servingSizeOz.equals(products.servingSizeOz) : products.servingSizeOz != null)
            return false;
        if (calories != null ? !calories.equals(products.calories) : products.calories != null) return false;
        if (caloriesFromFat != null ? !caloriesFromFat.equals(products.caloriesFromFat) : products.caloriesFromFat != null)
            return false;
        if (totalFat != null ? !totalFat.equals(products.totalFat) : products.totalFat != null) return false;
        if (saturatedFat != null ? !saturatedFat.equals(products.saturatedFat) : products.saturatedFat != null)
            return false;
        if (cholesterol != null ? !cholesterol.equals(products.cholesterol) : products.cholesterol != null)
            return false;
        if (sodium != null ? !sodium.equals(products.sodium) : products.sodium != null) return false;
        if (carbohydrates != null ? !carbohydrates.equals(products.carbohydrates) : products.carbohydrates != null)
            return false;
        if (dietaryFiber != null ? !dietaryFiber.equals(products.dietaryFiber) : products.dietaryFiber != null)
            return false;
        if (sugars != null ? !sugars.equals(products.sugars) : products.sugars != null) return false;
        if (protein != null ? !protein.equals(products.protein) : products.protein != null) return false;
        if (vitaminA != null ? !vitaminA.equals(products.vitaminA) : products.vitaminA != null) return false;
        if (vitaminC != null ? !vitaminC.equals(products.vitaminC) : products.vitaminC != null) return false;
        if (calcium != null ? !calcium.equals(products.calcium) : products.calcium != null) return false;
        if (iron != null ? !iron.equals(products.iron) : products.iron != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (servingSizeOz != null ? servingSizeOz.hashCode() : 0);
        result = 31 * result + (calories != null ? calories.hashCode() : 0);
        result = 31 * result + (caloriesFromFat != null ? caloriesFromFat.hashCode() : 0);
        result = 31 * result + (totalFat != null ? totalFat.hashCode() : 0);
        result = 31 * result + (saturatedFat != null ? saturatedFat.hashCode() : 0);
        result = 31 * result + (cholesterol != null ? cholesterol.hashCode() : 0);
        result = 31 * result + (sodium != null ? sodium.hashCode() : 0);
        result = 31 * result + (carbohydrates != null ? carbohydrates.hashCode() : 0);
        result = 31 * result + (dietaryFiber != null ? dietaryFiber.hashCode() : 0);
        result = 31 * result + (sugars != null ? sugars.hashCode() : 0);
        result = 31 * result + (protein != null ? protein.hashCode() : 0);
        result = 31 * result + (vitaminA != null ? vitaminA.hashCode() : 0);
        result = 31 * result + (vitaminC != null ? vitaminC.hashCode() : 0);
        result = 31 * result + (calcium != null ? calcium.hashCode() : 0);
        result = 31 * result + (iron != null ? iron.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
