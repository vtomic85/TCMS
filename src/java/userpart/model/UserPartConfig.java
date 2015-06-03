package userpart.model;

/**
 *
 * @author Vladimir Tomic
 */
public class UserPartConfig {

    private long id;
    private String name;
    private boolean hasTitle;
    private boolean hasSubtitle;
    private boolean hasLead;
    private boolean hasBody;
    private boolean hasDateCreated;
    private boolean hasDateModified;
    private boolean hasAuthor;
    private boolean hasImage;
    private boolean hasGallery;

    public UserPartConfig(long id, String name, boolean hasTitle, boolean hasSubtitle, boolean hasLead, boolean hasBody, boolean hasDateCreated, boolean hasDateModified, boolean hasAuthor, boolean hasImage, boolean hasGallery) {
        this.id = id;
        this.name = name;
        this.hasTitle = hasTitle;
        this.hasSubtitle = hasSubtitle;
        this.hasLead = hasLead;
        this.hasBody = hasBody;
        this.hasDateCreated = hasDateCreated;
        this.hasDateModified = hasDateModified;
        this.hasAuthor = hasAuthor;
        this.hasImage = hasImage;
        this.hasGallery = hasGallery;
    }

    public UserPartConfig() {
        this(0, null, false, false, false, false, false, false, false, false, false);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasTitle() {
        return hasTitle;
    }

    public void setHasTitle(boolean hasTitle) {
        this.hasTitle = hasTitle;
    }

    public boolean isHasSubtitle() {
        return hasSubtitle;
    }

    public void setHasSubtitle(boolean hasSubtitle) {
        this.hasSubtitle = hasSubtitle;
    }

    public boolean isHasLead() {
        return hasLead;
    }

    public void setHasLead(boolean hasLead) {
        this.hasLead = hasLead;
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public void setHasBody(boolean hasBody) {
        this.hasBody = hasBody;
    }

    public boolean isHasDateCreated() {
        return hasDateCreated;
    }

    public void setHasDateCreated(boolean hasDateCreated) {
        this.hasDateCreated = hasDateCreated;
    }

    public boolean isHasDateModified() {
        return hasDateModified;
    }

    public void setHasDateModified(boolean hasDateModified) {
        this.hasDateModified = hasDateModified;
    }

    public boolean isHasAuthor() {
        return hasAuthor;
    }

    public void setHasAuthor(boolean hasAuthor) {
        this.hasAuthor = hasAuthor;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public boolean isHasGallery() {
        return hasGallery;
    }

    public void setHasGallery(boolean hasGallery) {
        this.hasGallery = hasGallery;
    }
}
