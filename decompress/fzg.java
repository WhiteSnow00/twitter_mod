import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzg
{
    public static final rlp<fzg> b;
    public final boolean a;
    
    static {
        fzg.b = new a();
    }
    
    public fzg(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof fzg && ((fzg)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        final int a2 = c5j.a;
        return a ? 1 : 0;
    }
    
    public static final class a extends y4j<fzg>
    {
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            return new fzg(vlp.s());
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            wlp.r(((fzg)o).a);
        }
    }
}
