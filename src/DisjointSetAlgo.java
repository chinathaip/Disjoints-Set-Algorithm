public class DisjointSetAlgo {
    public int[] rootArray;
    public DisjointSetAlgo(int size){
        rootArray=new int[size];
        for(int i=0;i<size;i++){
            rootArray[i]=i;
        }
    }

    public int find(int vertex){ //find root of vertex
        return rootArray[vertex];
    }
    public void union(int vertex1, int vertex2){ //connect vertex2 to vertex1

        //find root of each vertex
        int RootOfVer1 = find(vertex1);
        int RootOfVer2 = find(vertex2);

        //check if they're already connected or not
        //if they share the same root vertex, that means they're connected
        if(RootOfVer1!=RootOfVer2){ //if they're different, they're not connected
            //traverse the whole array change the root node
            for(int i =0;i<rootArray.length;i++){
                if(rootArray[i]==RootOfVer2){// if vertex i is connected to vertex2 (have the same root)
                    //change its root to the root of vertex1
                    rootArray[i]=RootOfVer1;
                }
            }
        }
    }

    public boolean connected(int vertex1, int vertex2){
        return find(vertex1)==find(vertex2);
    }
}
