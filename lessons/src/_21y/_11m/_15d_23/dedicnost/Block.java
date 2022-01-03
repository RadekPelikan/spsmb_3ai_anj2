package _21y._11m._15d_23.dedicnost;

public class Block extends Rectangle {
    private double depth;

    public Block(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(
                Math.pow(this.getWidth(), 2) +
                        Math.pow(this.getHeight(), 2) +
                        Math.pow(this.depth, 2)
        );
    }

//    public double getDiagonal() {
//        return Math.sqrt(
//                Math.pow(super.calculateDiagonal(), 2) +
//                        Math.pow(this.depth, 2)
//        );
//    }
}
