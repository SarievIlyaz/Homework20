public class Parallelepiped {
    private double length;
    private double height;
    private double width;

    public Parallelepiped(double length, double height, double width) throws Exception {
       myMethod(length,height,width);
    }
    private void myMethod(double length, double height, double width) throws Exception {
        if (length<0||length>20||height<0||height>20||width<0||width>20){
            throw  new Exception();
        }
        else {
            this.length = length;
            this.height = height;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void checkArea(){
        System.out.println(2*((height * length) + (length * width) + (height * width)));
    }
    public void checkVolume(){
        System.out.println((length*width*height));
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
