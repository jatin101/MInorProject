package process_Implement;
import java.util.ArrayList;
import java.util.Iterator;
public class Node extends Process {
    public Node(int pn, ArrayList<Resource> rs, int cn) {
        super(pn, rs);
        color_Node = cn;
// TODO Auto­generated constructor stub
    }
    public static void request_Send(Node n1, Node n2, Resource r){
// Send ACK[activate]­­­receive[activate]
//check for grant
        Iterator<Resource> ri = n2.resources_owned.iterator();
//Iterator<Resource> ri2 = n2.current_resources.iterator();
        while(ri.hasNext())
        {
            Resource res = ri.next();
            System.out.println(res + " " + r);
            if(res.resource_number == r.resource_number ){
//if its owned, check for the availability
                if(n2.getAvailable() == 1){
//if available, grant resource
                    System.out.println("Resource Available");
// grantResource(n1,n2,r);
                    System.out.println("Grant Received");
                    n2.resource_Queue.add(n1);
                    System.out.print("Resource Queue Of P"+n2.process_number+" = {");
                    for(Process n : n2.resource_Queue) {
                        System.out.print("P"+n.process_number+" ");
                    }
                    System.out.println("}");
                    n1.color_Node = n2.process_number;
                    System.out.print(n1.getColor_Node());
                    n2.setAvailable(0);
                }
                else{
                    if(!n2.resource_Queue.isEmpty()){
                        n2.resource_Queue.add(n1);
                    }
                    if(n2.getColor_Node()==n1.getColor_Node()){
                        System.out.println("Ack Received");
                        break;
                    }
                    else{
                        if(n2.getAvailable()==1){
                            System.out.println("ACK Received");
                        }
                        if(n2.getColor_Node()<n1.getColor_Node()) {
                            n2.resource_Queue.add(n1);
//Adding tuple to waitset
                            ArrayList<Process_Pair>tuple=new
                                    ArrayList<>();
                            Process_Pair p=new Process_Pair(n1, n2);
                            tuple.add(p);
                            n1.setWait_Set(tuple);
                        }
                        else{
                            System.out.println("NACK Received");
                        }
                    }
                }
            }//if_end
        }//while_end
    }//Request_Send(end)
    public void request_Resource(){
    }
    public void grantResource(Node n1, Node n2, Resource r) {
        // n2.current_resources.remove(r);
    }
    public int color_Node;
    public int getColor_Node() {
        return color_Node;
    }
    public void setColor_Node(int color_Node) {
        this.color_Node = color_Node;
    }
    public Boolean hasColor(){
        return true;
    }
}