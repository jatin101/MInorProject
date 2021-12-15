package process_Implement;
public class Process_Pair {
    public Process[] tuple_process = new Process[2];
    public Process[] getTuple_process() {
        return tuple_process;
    }
    public void setTuple_process(Process[] tuple_process) {
        this.tuple_process = tuple_process;
    }
    public Process_Pair(Process p1, Process p2){
        tuple_process[0] = p1;
        tuple_process[1] = p2;
    }
}