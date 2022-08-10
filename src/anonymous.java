public class anonymous {
    public static void main(String[] args) {
        var p=new poly();
        p.poly(new A(){
            @Override
            public void info() {
                System.out.println("HI");
            }
        });
        p.poly(new A(){
            @Override
            public void info() {
                System.out.println("Elsayed");
            }
        });

    }
    static class poly{
        public void poly(A a){
            a.info();
        }

    }
    abstract static class A{
        abstract public void info();
    }
}
