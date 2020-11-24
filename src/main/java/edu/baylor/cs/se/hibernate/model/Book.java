package edu.baylor.cs.se.hibernate.model;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    @Column
    private Double price;

    @Column
    private Timestamp createdtime;

    public Book() {

    }

    public Book(String title, String description, Double price, Timestamp createdtime ,boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.price = price;
        this.createdtime = createdtime;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Timestamp createdtime) {
        this.createdtime = createdtime;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }

}
