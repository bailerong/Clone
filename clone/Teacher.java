package com.lele.clone;

public class Teacher  {
    private String name;
    private String direction;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }

    public Teacher(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    /*protected Object clone() throws CloneNotSupportedException {
        Teacher teacher=null;
        teacher=(Teacher)super.clone();
        return teacher;
    }
*/
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
