package ru.lookBag;

public class Author {
    String firstName;
    String secondName;
    String fullName;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fullName = firstName + " " + secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Author author = (Author) obj;
        return fullName.equals(author.fullName);
    }
}
