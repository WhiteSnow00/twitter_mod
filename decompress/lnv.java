import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnv
{
    public static final alp<lnv> b;
    public final String a;
    
    static {
        lnv.b = new a();
    }
    
    public lnv(final String a) {
        this.a = a;
    }
    
    public static final class a extends s4j<lnv>
    {
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            return new lnv(elp.C());
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            flp.G(((lnv)o).a);
        }
    }
}
