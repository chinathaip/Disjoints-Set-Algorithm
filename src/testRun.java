public class testRun {
    public static void main(String[] args){
        DisjointSetAlgo disjointSetAlgo = new DisjointSetAlgo(10);
        //1-2-3-5
        //7-8
        disjointSetAlgo.union(1,2);
        disjointSetAlgo.union(2,3);
        disjointSetAlgo.union(3,5);
        disjointSetAlgo.union(7,8);
        int root_of_vertex8 = disjointSetAlgo.find(8);
        System.out.println("Root of 8 before union "+root_of_vertex8);
        //1-2-3-5-7
        disjointSetAlgo.union(1,7);
        boolean connected = disjointSetAlgo.connected(1,8);
        System.out.println("Is vertex 8 connected to vertex 1?: "+connected);
    }
}
