package com;

class Box {
    int width;
	int height;
	int depth;
    
    public  Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    public Box(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public Box(int height)
    {
        this.height=height;
        width=height;
        depth=height;
    }

    int volume() {
		return width * height * depth;
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		int vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
	}

}
