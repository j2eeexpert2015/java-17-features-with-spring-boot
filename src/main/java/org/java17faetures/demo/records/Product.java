package org.java17faetures.demo.records;

public record Product(long id, String name, String description) {

    private  static int DUMMY_VALUE=100;

    public boolean hasDescription()
    {
        return description!=null && !description.isBlank();
    }

    /**
     * Can override auto generated constructor,called as "Canonical Constructor"
     */

    public Product(long id, String name, String description)
    {
        if(name==null)
            throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Simpler way use "Compact Constructor"
     */
   /* public Product
    {
        if(name==null)
            throw new IllegalArgumentException();

    }*/
}
