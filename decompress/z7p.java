import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z7p
{
    public static final rlp<z7p> c;
    public static final z7p d;
    public final boolean a;
    public final boolean b;
    
    static {
        z7p.c = new b();
        d = (z7p)((n4j)new z7p$a()).e();
    }
    
    public z7p(final z7p$a z7p$a) {
        this.a = z7p$a.a;
        this.b = z7p$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || z7p.class != o.getClass()) {
            return false;
        }
        final z7p z7p = (z7p)o;
        if (this.a != z7p.a) {
            return false;
        }
        if (this.b != z7p.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
    
    public static final class b extends zr2<z7p, z7p$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final z7p z7p = (z7p)o;
            wlp.r(z7p.a).r(z7p.b);
        }
        
        public final n4j g() {
            return (n4j)new z7p$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final z7p$a z7p$a = (z7p$a)n4j;
            z7p$a.a = vlp.s();
            z7p$a.b = vlp.s();
        }
    }
}
