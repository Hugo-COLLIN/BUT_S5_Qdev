public class PatternSealed {

	public static void main(String[] args) {
		System.out.println("circle = " + surface(new Circle(1)));
	}

//    public static double surface(Shape shape) {
//        if (shape instanceof Circle) {
//            var circle = (Circle) shape;
//            return Math.PI * circle.radius() * circle.radius();
//        }
//
//        if (shape instanceof Square) {
//            var square = (Square) shape;
//            return square.edge() * square.edge();
//        }
//
//		return 0d; // code mort
//	}

    public static double surface(Shape shape) {
        return switch (shape) {
            case Circle circle -> Math.PI * circle.radius() * circle.radius();
            case Square square when square.edge() == 0d -> 0d; // tjrs spécificité avant le cas général
            case Square square -> square.edge() * square.edge();
        };
    }

 
}