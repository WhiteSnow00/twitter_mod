import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxm
{
    public static final alp<mxm> c;
    public int a;
    public xdj b;
    
    static {
        mxm.c = new a();
    }
    
    public mxm(final int a, final xdj b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a extends s4j<mxm>
    {
        public a() {
            super(1);
        }
        
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            return new mxm(elp.z(), (xdj)elp.B((alp)xdj.J0));
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final mxm mxm = (mxm)o;
            flp.z(mxm.a).C((Object)mxm.b, (alp)xdj.J0);
        }
    }
}
