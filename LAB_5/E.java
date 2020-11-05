public class E extends D
{
    protected String e;

    E(A a, B b, C c, D d, String e) {
        super(a, b, c, d);
        this.e = e;
    }

    E(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.e = e.e;
    }

    public void getValue() {
        super.getValue();
        System.out.print(this.e + " ");
    }
}
