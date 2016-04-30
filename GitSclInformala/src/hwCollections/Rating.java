package hwCollections;

/**
 * This class has 3 variables(stars, user_id, description)
 *
 * @author Andrei
 * @version 1.0
 */
public class Rating {

    private int stars;
    private String user_id;
    private String description;

    /**
     * constructor initializing the nr of stars
     *
     */
    public Rating(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
