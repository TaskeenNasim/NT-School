//Encapsulation
import java.io.*;
import java.util.*;
class Apple{
    int size;
    int color;
    int weight;
    public Apple(int size, int color,int weight){ //public Apple(int a, int b,int c){
        this.size = size;                         // size = a;
        this.color = color;                       //color = b;
        this.weight = weight;                     //weight = c;}
    }
    public int getSize(){
        return size;
    }
    public int getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
}

// get and setter

lass Apple{
	private int size;
	private int color;
	private int weight;
	public Apple(int size,int color,int weight){
		this.size = size;
		this.color = color;
		this.weight = weight;
	}
	public void setSize(int size){
		this.size = size;
	}
	public void setColor(int color ){
		this.color =  color;
	}
	public void setWeight(int weight){
		this.weight= weight;
	}
	public int getSize(){
		return size;
	}
	public int getColor(){
		return color;
	}
	public int getWeight(){
		return weight;
	}
}

