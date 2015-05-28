package user.model;

/**
 *
 * @author Vladimir Tomic
 */
public class UserType {

    private long id;
    private String name;

    public UserType(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserType() {
        this(0, null);
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
}
