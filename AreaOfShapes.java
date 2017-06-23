package com;

class Box1 {
    int width;
	int height;
	int depth;
    
    public  Box1()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    public Box1(int width,int height,int depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public Box1(int height)
    {
        this.height=height;
        width=height;
        depth=height;
    }

    int volume() {
		return width * height * depth;
	}
}

class AreaOfShapes {
	public static void main(String args[]) {
		Box1 mybox1 = new Box1(10, 20, 15);
		Box1 mybox2 = new Box1();
		Box1 mycube = new Box1(7);
		int vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
	}
}



