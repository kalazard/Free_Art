package modele;

import javax.persistence.*;

/**
 * Created by Kylian on 16/01/2015.
 */
@Entity
@Table(name = "categorie", schema = "", catalog = "freeart")
public class CategorieEntity {
    private int id;
    private String label;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategorieEntity that = (CategorieEntity) o;

        if (id != that.id) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
