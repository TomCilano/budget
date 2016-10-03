package com.ironyard.data;

/**
 * Created by Tom on 9/29/16.
 */
public class LineItems {
    private String description;
    private String category;
    private double budgetedAmount;
    private double totalAmount;
    private int id;

    public LineItems() {
        this.description = description;
        this.category = category;
        this.budgetedAmount = budgetedAmount;
        this.totalAmount = totalAmount;
        this.id = id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
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

