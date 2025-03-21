package config;

public class Session {
    
    private static Session instance;
    
    private int id;  // Changed from String to int
    private String firstname;
    private String lastname;
    private String username;
    private String email;  // Renamed from Email to email
    private String usertype;
    private String status;

    private Session() {
        // Private constructor to prevent direct instantiation
    }

    public static synchronized Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    // Check if session is empty
    public static boolean isSessionInvalid() {
        return instance == null || instance.getId() <= 0;
    }

    // Getter and Setter for ID
    public int getId() {  // Changed return type to int
        return id;
    }

    public void setId(int id) {  // Changed parameter type to int
        this.id = id;
    }

    // Getters and Setters for other fields
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
