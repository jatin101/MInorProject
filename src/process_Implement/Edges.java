package process_Implement;
import java.util.ArrayList;
import java.util.Iterator;
public class Edges {
    public ArrayList<Edges_Pair> Edges_WFG;
    public boolean hasEdge(Process p1, Process p2 ){
        Iterator<Edges_Pair> it = Edges_WFG.iterator();
        while(it.hasNext())
        {
            Edges_Pair obj = it.next();
            if (obj.edge_Pair[0] == p1 && obj.edge_Pair[1] == p2){
                return true;
            }
            else
                return false;
        }
        return false;
    }
}