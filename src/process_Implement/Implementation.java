package process_Implement;
import java.util.ArrayList;
public class Implementation {
    public static void createEnvironment(){
    }
    public static void main(String[] args)
    {
//Process creation,Allocating resources to processes
//create resources
        Resource r1 = new Resource(1);
        Resource r2 = new Resource(2);
        Resource r3 = new Resource(3);
        Resource r4 = new Resource(4);
//Arraylist for resources
        ArrayList<Resource> rs_P1 = new ArrayList<Resource>();
        ArrayList<Resource> rs_P2 = new ArrayList<Resource>();
        ArrayList<Resource> rs_P3 = new ArrayList<Resource>();
        ArrayList<Resource> rs_P4 = new ArrayList<Resource>();
//Adding elements
        rs_P1.add(r1);
        rs_P2.add(r2);
        rs_P3.add(r3);
        rs_P4.add(r4);
//create processes
        Process p1 = new Process(1, rs_P1);
        Process p2 = new Process(2, rs_P2);
        Process p3 = new Process(3, rs_P3);
        Process p4 = new Process(4,rs_P4);
        Node n1= new Node(1, rs_P1,1);
        Node n2= new Node(2, rs_P2,2);
        Node n3= new Node(3, rs_P3,3);
        Node n4= new Node(4, rs_P4,4);
        System.out.println("Process P1 requests P4 for resource R4 ");
        Node.request_Send(n1, n4, r4);
        System.out.println("Process P2 requests P4 for resource R4 ");
        Node.request_Send(n2, n4, r4);
        System.out.println("Process P3 requests P4 for resource R4 ");
        Node.request_Send(n3, n4, r4);
        System.out.println("Process P1 requests P4 for resource R4 ");
        Node.request_Send(n1, n3, r3);
    }
}