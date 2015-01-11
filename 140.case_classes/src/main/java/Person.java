package javax;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(final String firstName, final String lastName, final int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public int getAge() {
	return age;
    }

    @Override
    public boolean equals(Object object) {
	if(this == object) {
	    return true;
	}
	if(object == null) {
	    return false;
	}
	if(!(object instanceof Person)) {
	    return false;
	}

	Person other = (Person)object;

	return firstName.equals(other.firstName) && lastName.equals(other.lastName) && age == other.age;
    }

    @Override
    public String toString() {
	StringBuilder result = new StringBuilder();
	result.append(getClass().getName());
	result.append("(");
	result.append(firstName);
	result.append(",");
	result.append(lastName);
	result.append(",");
	result.append(age);
	result.append(")");
	return result.toString();
    }

    public static void main(String[] args) {
	final Person kid = new Person("John", "Smith", 9);
	final Person adult = new Person("Martin", "Smith", 47);
	final Person adult2 = new Person("Martin", "Smith", 47);

	System.out.println(kid);
	System.out.println(adult);
	System.out.println(adult == adult2);
	System.out.println(adult.equals(adult2));
    }
}
