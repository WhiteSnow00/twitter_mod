import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frg
{
    public static final rlp<frg> d;
    public final String a;
    public final String b;
    public final o1h c;
    
    static {
        frg.d = new a();
    }
    
    public frg(final String a, final String b, final o1h c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof frg)) {
            return false;
        }
        final frg frg = (frg)o;
        if (!c5j.a((Object)this.a, (Object)frg.a) || !c5j.a((Object)this.b, (Object)frg.b) || !c5j.a((Object)this.c, (Object)frg.c)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends y4j<frg>
    {
        public a() {
            super(1);
        }
        
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            frg frg;
            if (n < 1) {
                frg = new frg(vlp.A(), vlp.G(), null);
            }
            else {
                frg = new frg(vlp.A(), vlp.G(), (o1h)((y4j)o1h.b).a(vlp));
            }
            return frg;
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final frg frg = (frg)o;
            wlp.E(frg.a);
            wlp.E(frg.b);
            ((y4j)new o1h$b()).c(wlp, (Object)frg.c);
            final int a = c5j.a;
        }
    }
}
