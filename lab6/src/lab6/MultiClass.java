package lab6;

public class MultiClass {

	public static void main(String[] args) {
		Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(7.0);

        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());

        System.out.println();

        System.out.println("Sphere 2: " + sphere2);
        System.out.println("Volume: " + sphere2.calculateVolume());
        System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());

        System.out.println();
       
        sphere1.setDiameter(8.0);
        sphere2.setDiameter(10.0);
      
        System.out.println("Updated Sphere 1: " + sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());

        System.out.println();

        System.out.println("Updated Sphere 2: " + sphere2);
        System.out.println("Volume: " + sphere2.calculateVolume());
        System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());

	}

}
