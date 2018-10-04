package singleton_pattern;

import factory_pattern.Client;

/**
 * Created by NghiaPV on 10/3/2018.
 */
public class MainTest {

    public static void main(String[] args) {
       OnlyOneInstance instance1 =  OnlyOneInstance.getInstance();
//       instance1.setProp("hello");
//       System.out.println(instance1.getProp());
       OnlyOneInstance instance2 =  OnlyOneInstance.getInstance();
//       instance2.setProp("bonjour");
       System.out.println("instance1 : " + instance1.hashCode());
       System.out.println("instance2 : " + instance2.hashCode());

        Client client1 = new Client("A","B","C");
        Client client2 = new Client("A","B","C");

        System.out.println("client1 : " + client1.hashCode());
        System.out.println("client2 : " + client2.hashCode());


    }

}
