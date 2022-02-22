public class testRun {
    public static void main(String[] args){
        DisjointQuickFind disjointQuickFind = new DisjointQuickFind(10);
        //1-2-3-5
        //7-8
        disjointQuickFind.union(1,2);
        disjointQuickFind.union(2,3);
        disjointQuickFind.union(3,5);
        disjointQuickFind.union(7,8);
        int root_of_vertex8 = disjointQuickFind.find(8);
        System.out.println("Root of 8 before union "+root_of_vertex8);
        //1-2-3-5-7
        disjointQuickFind.union(1,7);
        boolean connected = disjointQuickFind.connected(1,8);
        System.out.println("Is vertex 8 connected to vertex 1?: "+connected);
    }
}
