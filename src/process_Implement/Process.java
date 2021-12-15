package process_Implement;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
public class Process {
    public int process_number ;
    public ArrayList<Resource> resources_owned;
    //To keep track of currently used resource
    public ArrayList<Resource> current_resources;
    //To check the owned resource is available
    public static int available=1;
    public ArrayList<Resource> getCurrent_resources() {
        return current_resources;
    }
    public void setCurrent_resources(ArrayList<Resource> current_resources) {
        this.current_resources = current_resources;
    }
    public Queue<Process> getResource_Queue() {
        return resource_Queue;
    }
    public void setResource_Queue(Queue<Process> resource_Queue) {
        this.resource_Queue = resource_Queue;
    }
    public ArrayList<Process_Pair> getWait_Set() {
        return wait_Set;
    }
    public void setWait_Set(ArrayList<Process_Pair> wait_Set) {
        this.wait_Set = wait_Set;
    }
    public ArrayList<Process> getDependent_Set() {
        return dependent_Set;
    }
    public void setDependent_Set(ArrayList<Process> dependent_Set) {
        this.dependent_Set = dependent_Set;
    }
    public Queue<Process> resource_Queue = new ArrayDeque<>();
    public ArrayList<Process_Pair> wait_Set;
    public ArrayList<Process> dependent_Set;
    //Constructor
    public Process(int pn, ArrayList<Resource> rs){
        process_number = pn;
        resources_owned = rs;
        available = 1;
    }
    public int getAvailable() {
        return available;
    }
    public void setAvailable(int available) {
        this.available = available;
    }
    public int getProcess_number() {
        return process_number;
    }
    public void setProcess_number(int process_number) {
        this.process_number = process_number;
    }
    public ArrayList<Resource> getResources_owned() {
        return resources_owned;
    }
    public void setResources_owned(ArrayList<Resource> resources_owned) {
        this.resources_owned = resources_owned;
    }
}