package model;
/* Autor: Jennifer Panser
   Version: 1.0
   Datum: 2.2.23
 */

public class Product {
    private String name;
    private Section section;

    public Product ( String name, Section section){
        this.name = name;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
