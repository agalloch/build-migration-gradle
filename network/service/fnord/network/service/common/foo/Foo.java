package fnord.network.service.common.foo;

import fnord.network.service.common.charly.Charly;

public abstract class Foo {
    private String fooName;

    public Foo() {
        this.fooName = "foo";
    }

    @Override
    public String toString() {
        return fooName;
    }

    public static void main(String[] args) {
        final Charly ch = new Charly();

        Foo leFoo = new Foo() {
            @Override
            public String toString() {
                return getClass().getSimpleName() + "-foo " + ch;
            }
        };
    }
}
