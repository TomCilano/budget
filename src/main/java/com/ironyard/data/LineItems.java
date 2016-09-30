package com.ironyard.data;

/**
 * Created by Tom on 9/29/16.
 */
public class LineItems {
    private String Description;
    private String Category;
    private double budgetedAmount;
    private double totalAmount;
    private int id;

    public LineItems() {
        Description = Description;
        Category = Category;
        this.budgetedAmount = budgetedAmount;
        this.totalAmount = totalAmount;
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getBudgetedAmount() {
        return budgetedAmount;
    }

    public void setBudgetedAmount(double budgetedAmount) {
        this.budgetedAmount = budgetedAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

