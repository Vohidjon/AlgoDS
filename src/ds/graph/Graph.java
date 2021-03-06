package ds.graph;

import java.util.Collection;

/**
 * Created by sherxon on 1/1/17.
 */
public interface Graph<T, E extends Number> {
     void addVertex(T t);
     void addEdge(T t1, T t2);
     void removeVertex(T t);
     void removeEdge(T t1, T t2);
     Collection<Vertex<T>> getVertices();

     Collection<Edge<E, T>> getEdges();
     int size();
     Vertex<T> getVertex(T t);
}