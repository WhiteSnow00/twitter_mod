import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qi2
{
    public static final rlp<qi2> b;
    public final String a;
    
    static {
        qi2.b = new a();
    }
    
    public qi2(final b b) {
        final String a = b.a;
        jee.l((Object)a);
        this.a = a;
    }
    
    public static final class a extends zr2<qi2, b>
    {
        public a() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            wlp.E(((qi2)o).a);
        }
        
        public final n4j g() {
            return new b();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            ((b)n4j).a = vlp.G();
        }
    }
    
    public static final class b extends n4j<qi2>
    {
        public String a;
        
        public final Object i() {
            return new qi2(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
