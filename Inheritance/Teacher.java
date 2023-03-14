

public class Teacher {
private String name, lastName, id, docType;



public Teacher(String name, String lastName, String id, String docType) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
    this.docType = docType;
}

public String getName() {
    return name;
}

public String getLastName() {
    return lastName;
}

public String getId() {
    return id;
}


public String getDocType() {
    return docType;
}

//setters


public void setName(String name) {
    this.name = name;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setId(String id) {
    this.id = id;
}

public void setDocType(String docType) {
    this.docType = docType;
}



@Override
public String toString() {
    return "Teacher: \n name=" + name + ", lastName=" + lastName + ", id=" + id + ", docType=" + docType;
    }
    
}