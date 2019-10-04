
package enselab2;
public class ListElement

{

     ListElement next;

     ListElement previous;

     int data;

    ListElement()

    {

        this.data = 0;

        this.next = null;

        this.previous = null ;

    }

   

    public ListElement(int data)

    {

        this.data = data;

        this.next = null;

        this.previous = null ;

    }


    public void setData(int data)

    {

        this.data = data;

    }


    public int getData()

    {

        return this.data ;

    }


    public void setNext(ListElement next)

    {

        this.next = next;

    }


    public ListElement getNext()

    {

        return this.next;

    }


    public void setPrevious(ListElement previous)

    {

        this.previous = previous;

    }


    public ListElement getPrevious()

    {

        return this.previous;

    }}

   





