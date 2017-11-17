package figures.d2;

public class Square {
    int a;
    int x_s;
    int y_s;

    public Square(Point p, int a ) {
        this.x_s = p.getX();
        this.y_s = p.getY();
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getX_s() {
        return x_s;
    }

    public void setX_s(int x_s) {
        this.x_s = x_s;
    }

    public int getY_s() {
        return y_s;
    }

    public void setY_s(int y_s) {
        this.y_s = y_s;
    }

    public Point getPoint() {
        return new Point();
    }

    public static class Point {
        protected int x;
        protected int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public static class Point3D extends Point {
        int z;

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }

        @Override
        public String toString() {
            return "Point3D{" + "x_s=" + x + ", y_s=" + y + ", z=" + z + '}';
        }
    }
}

