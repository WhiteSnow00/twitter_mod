import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zri
{
    public static final rlp<zri> b;
    public final int a;
    
    static {
        zri.b = new a();
    }
    
    public zri(final int a) {
        this.a = a;
    }
    
    public static final class a extends y4j<zri>
    {
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            return new zri(vlp.x());
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            wlp.x(((zri)o).a);
        }
    }
}
