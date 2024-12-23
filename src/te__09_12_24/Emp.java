package te__09_12_24;

public class Emp {

	    private String firstName;
	    private String lastName;

	    // Constructor
	    public Emp(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    // Overriding equals method for meaningful comparison
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true; // Same reference
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false; // Null or different class
	        }
	        Emp emp = (Emp) obj;
	        return firstName.equals(emp.firstName) && lastName.equals(emp.lastName);
	    }

	    // Optional: Overriding hashCode if equals is overridden
	    @Override
	    public int hashCode() {
	        return firstName.hashCode() + lastName.hashCode();
	    }
	}

		