
import enselab2.ListElement;
import java.util.*;

public class LinkedList

{

    ListElement head;

    ListElement tail;

    int size;

   

    LinkedList()

    {

        head = null;

        tail = null;

        size = 0;

    }

    public void addElement(ListElement le)

    {

        ListElement temp = new ListElement(le.getData());

        temp.setNext(head);

       

        if(head != null)

            head.setPrevious(temp);

       

        head = temp;

       

        if(tail == null)

            tail = temp;

       

        size++;

    }

   

    public ListElement getElement(int index)

    {

        if (index < 0 || index >= size)

            throw new IndexOutOfBoundsException("DLinkedList::elementAt - invalid position");

        else

        {

            int i;

           

            ListElement trav = head;


            for( i = 1 ; i < index ; i++ )

                trav = trav.getNext();

            return trav;

        }

    }

   

    public ListElement deleteElement(int index)

    {

        if (index < 0 || index >= size)

            throw new IndexOutOfBoundsException("DLinkedList::elementAt - invalid position");

        else

        {  

            if(index == 0)

            {

                ListElement ans = head;

               

                head = head.getNext();

               

                if(head != null)

                    head.setPrevious(null);

               

                size--;

               

                return ans;

            }

           

            ListElement trav = head;

           

            int i;

            for(i = 1 ; i < index ; i++)

                trav = trav.getNext();

           

            ListElement ans = trav.getNext();

          

            trav.setNext(trav.getNext().getNext());

           

            if(trav.getNext() != null)

                trav.getNext().setPrevious(trav);

           

            size--;

           

            return ans;

        }

    }

   

    public void printLinkedListHead()

    {

        ListElement trav = head;


        while(trav != null)

        {


            System.out.print(trav.getData() + " ");


            trav = trav.getNext();

        }

       

        System.out.println();

    }

   

    public void printLinkedListTail()

    {

        ListElement trav = tail;


        while(trav != null)

        {


            System.out.print(trav.getData() + " ");


            trav = trav.getPrevious();

        }

       

        System.out.println();

    }

   

    public static void main(String[] args)

    {

        LinkedList ad = new LinkedList();


        ad.addElement(new ListElement(1));

        ad.addElement(new ListElement(2));

        ad.addElement(new ListElement(3));

        ad.addElement(new ListElement(4));

        ad.addElement(new ListElement(5));

       

        System.out.print("\nList Forward : ");

        ad.printLinkedListHead();

       

        System.out.print("\nList backward : ");

        ad.printLinkedListTail();
        
       

        int a;
        @SuppressWarnings("resource")
       Scanner s = new Scanner(System.in);
        System.out.print("\nWhich element do you want to delete between 1-5 : ");
        a = s.nextInt();

       

        ad.deleteElement(a);

       

        System.out.print("\nList after deleting element at index "+a+ ":");

        ad.printLinkedListHead();

    }

   

}
   