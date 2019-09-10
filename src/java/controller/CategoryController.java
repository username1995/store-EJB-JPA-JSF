package controller;

import entity.Category;
import entity.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import session.CategoryFacade;
import session.OrderManager;

/**
 *
 * @author Szczominik
 */
@ApplicationScoped
@Named("categoryController")
public class CategoryController implements Serializable {

    @EJB
    private OrderManager orderManager;
    @EJB
    private CategoryFacade categoryFacade;

    private Category selectedCategory;

    private String selectedCategoryName;
    
    private List<Category> cats;
    
    private String CategoryName="";
    
    private String newCat="";
    
    List<SelectItem> categoryChoices =  new ArrayList<SelectItem>();

    private Map<String, Category> categryMap;
    
    private String selected;
     private String name="";
    
  
     public String getName() {
        return name;
    }
      public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public List<SelectItem> getCategoryChoices() {
        return categoryChoices;
    }

    public void setCategoryChoices(List<SelectItem> categoryChoices) {
        this.categoryChoices = categoryChoices;
    }
    
    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public CategoryFacade getCategoryFacade() {
        return categoryFacade;
    }

    public void setCategoryFacade(CategoryFacade categoryFacade) {
        this.categoryFacade = categoryFacade;
    }

    public String getNewCat() {
        return newCat;
    }

    public void setNewCat(String newCat) {
        this.newCat = newCat;
    }
    
    

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }


    public CategoryController() {
        
    }

    public Category getSelectedCategory() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String gID = params.get("category");
        selectedCategory = categoryFacade.find(Short.parseShort(gID));
        this.selectedCategoryName = selectedCategory.getName();
        return (selectedCategory);
    }

    public String getSelectedCategoryName() {

        return (selectedCategoryName);
    }

    public List<Category> getCategories() {
        cats=categoryFacade.findAll();
        categryMap=new HashMap<String, Category>();
        categoryChoices.clear();
        CategoryName=cats.get(0).getName();
        selectedCategory=cats.get(0);
        selected=CategoryName;
        for(Category c: cats) {
            SelectItem menuChoice = new SelectItem(c.getName());
            categoryChoices.add(menuChoice);
            categryMap.put(c.getName(), c);
        }
        System.out.println(categoryChoices);
        return (cats);
    }

    public Collection<Product> getcategoryProducts() {
        return (selectedCategory.getProductCollection());
    }

    public void setSelectedCategory(Category selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public void setSelectedCategoryName(String selectedCategoryName) {
        this.selectedCategoryName = selectedCategoryName;
    }
    
    public boolean addCategory(){
 
        cats=categoryFacade.findAll();
        
        for (Category c: cats){
           if (c.getName().equalsIgnoreCase(name)){
             
            System.out.println("Taka kategoria juz istnieje");
            return false;
           }
       }
        orderManager.addCategory(name);
         return true;    
}
    


    public List<Category> getCats() {
        return cats;
    }

    public void setCats(List<Category> cats) {
        this.cats = cats;
    }

    public Map<String, Category> getCategryMap() {
        return categryMap;
    }

    public void setCategryMap(Map<String, Category> categryMap) {
        this.categryMap = categryMap;
    }
    
    public Category getCategory(){
        return categryMap.get(selected);
    }
    
    public synchronized String updateName(Category c){

        if (!newCat.equals("")){
   
              try{
            c.setName(newCat);
            categoryFacade.edit(c);
            wait(1000);
            newCat="";
                return ("updCat");
            } catch (InterruptedException ex) {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        newCat="";
        
        return ("updCat");
     
    }
    
}
