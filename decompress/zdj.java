import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zdj
{
    public static final rlp<zdj> b;
    public static final zdj c;
    public final int a;
    
    static {
        zdj.b = new a();
        c = new zdj(2);
    }
    
    public zdj(final int a) {
        this.a = a;
    }
    
    public static final class a extends y4j<zdj>
    {
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            return new zdj(vlp.x());
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            wlp.x(((zdj)o).a);
        }
    }
}
