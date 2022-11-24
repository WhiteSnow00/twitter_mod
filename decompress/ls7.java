import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ls7 extends jvb implements stb<is7, vzv>
{
    public ls7(final Object o) {
        super(1, o, (Class)ks7.class, "onAction", "onAction(Lcom/twitter/app/dm/search/modular/DMModularSearchAction;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final is7 is7 = (is7)o;
        e0e.f((Object)is7, "p0");
        final ks7 ks7 = (ks7)((ea3)this).receiver;
        Objects.requireNonNull(ks7);
        if (is7 instanceof is7$c) {
            ks7.d((stb)new os7(is7, ks7));
        }
        else if (e0e.a((Object)is7, (Object)is7$b.a)) {
            ks7.g.c(ks7.a.a().p());
        }
        else if (e0e.a((Object)is7, (Object)is7$d.a)) {
            final xs7 xs7 = (xs7)ks7.c.f();
            Object o2 = null;
            String a;
            if (xs7 != null) {
                a = xs7.a;
            }
            else {
                a = null;
            }
            if (a != null) {
                if (slr.k1((CharSequence)a) ^ true) {
                    o2 = a;
                }
                if (o2 != null) {
                    ks7.f.onNext(o2);
                }
            }
            ks7.e.onNext((Object)rs7$a.a.a);
        }
        else if (e0e.a((Object)is7, (Object)is7$e.a)) {
            ks7.e.onNext((Object)rs7$b.a.a);
        }
        else if (is7 instanceof is7$a) {
            ks7.d((stb)new ps7(is7));
        }
        return vzv.a;
    }
}
