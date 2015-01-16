package modele;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Kylian on 16/01/2015.
 */
@Entity
@Table(name = "image", schema = "", catalog = "freeart")
public class ImageEntity {
    private int id;
    private String image;
    private Date dateajout;
    private String titre;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "dateajout")
    public Date getDateajout() {
        return dateajout;
    }

    public void setDateajout(Date dateajout) {
        this.dateajout = dateajout;
    }

    @Basic
    @Column(name = "titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageEntity that = (ImageEntity) o;

        if (id != that.id) return false;
        if (dateajout != null ? !dateajout.equals(that.dateajout) : that.dateajout != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (titre != null ? !titre.equals(that.titre) : that.titre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (dateajout != null ? dateajout.hashCode() : 0);
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
