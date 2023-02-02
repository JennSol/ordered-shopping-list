package model;
import java.util.ArrayList;
/* Autor: Jennifer Panser
   Version: 1.0
   Datum: 2.2.23
 */
public class Shop {
    private Company company;
    private String address;
    private ArrayList<Section> sectionOrder;

    public Shop(Company company, String address, ArrayList<Section> sectionOrder) {
        this.company = company;
        this.address = address;
        this.sectionOrder = sectionOrder;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Section> getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(ArrayList<Section> sectionOrder) {
        this.sectionOrder = sectionOrder;
    }
}
