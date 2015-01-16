package modele;

import javax.persistence.*;

/**
 * Created by Kylian on 16/01/2015.
 */
@Entity
@Table(name = "imagetag", schema = "", catalog = "freeart")
@IdClass(ImagetagEntityPK.class)
public class ImagetagEntity {
    private int imageid;
    private int tagid;

    @Id
    @Column(name = "imageid")
    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    @Id
    @Column(name = "tagid")
    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImagetagEntity that = (ImagetagEntity) o;

        if (imageid != that.imageid) return false;
        if (tagid != that.tagid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageid;
        result = 31 * result + tagid;
        return result;
    }
}
