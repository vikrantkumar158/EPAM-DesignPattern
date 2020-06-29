package com.vikrantkumar158.structural;

interface IteratorDemo{
    boolean hasNext();
    Object next();
}

interface Container
{
    IteratorDemo getIterator();
}

class NameCollection implements Container {
    public String[] name = {"Anil", "Ajay", "Hardik", "Manish", "Harjeet"};
    @Override
    public IteratorDemo getIterator() { return new IterateNameCollection(); }
    private class IterateNameCollection implements IteratorDemo
    {
        int i;
        @Override
        public boolean hasNext()
        {
            return i < name.length;
        }
        @Override
        public Object next() {
            if (this.hasNext())
                return name[i++];
            else
                return null;
        }
    }
}

public class nameiterator
{
    public static void main(String[] args)
    {
        NameCollection companyRepository = new NameCollection();
        for (IteratorDemo iter = companyRepository.getIterator(); iter.hasNext(); )
        {
            String name = (String) iter.next();
            System.out.println("NAME : " + name);
        }
    }
}