public  class NBody {
    public static double readRadius(String loc) {
    In in =new In(loc);

            int N = in.readInt();
            double radius=in.readDouble();
            String[] planets = new String[N];
            for (int i=0; i<N; i++){
                planets[i]=in.readString();
            }
            return radius;
    }

    public static double readPlanets(String loc) {
        In in =new In(loc);

        int N = in.readInt();
        int M=6;
        double radius=in.readDouble();
        String[] planets = new String[N];
        for (int i=0; i<N; i++){
            planets[i][1]=in.readDouble();
        }
        return radius;
    }
}
