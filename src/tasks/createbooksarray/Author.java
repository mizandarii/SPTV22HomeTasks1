package tasks.createbooksarray;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class Author {
    private String lastname;
    private String firstname;

    public Author() {
    }

    public Author(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.lastname);
        hash = 59 * hash + Objects.hashCode(this.firstname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{"
                + "lastname=" + lastname 
                + ", firstname=" + firstname 
                + '}';
    }
    
}