import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qm9
{
    public static final rlp<qm9> d;
    public final String a;
    public final String b;
    public final long c;
    
    static {
        qm9.d = new b();
    }
    
    public qm9(final a a) {
        this.b = a.b;
        this.a = a.a;
        this.c = a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qm9.class == o.getClass()) {
            final qm9 qm9 = (qm9)o;
            if (!c5j.a((Object)this.a, (Object)qm9.a) || this.c != qm9.c || !c5j.a((Object)this.b, (Object)qm9.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.c, (Object)this.b);
    }
    
    public static final class a extends n4j<qm9>
    {
        public String a;
        public String b;
        public long c;
        
        public final Object i() {
            return new qm9(this);
        }
    }
    
    public static final class b extends zr2<qm9, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final qm9 qm9 = (qm9)o;
            wlp.E(qm9.a).E(qm9.b).y(qm9.c);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            a.a = vlp.G();
            a.b = vlp.G();
            a.c = vlp.y();
        }
    }
}
