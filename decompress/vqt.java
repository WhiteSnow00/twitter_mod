import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vqt
{
    public static final rlp<vqt> d;
    public final List<String> a;
    public final cej b;
    public final cej c;
    
    static {
        vqt.d = new vqt.vqt$b();
    }
    
    public vqt(final a a) {
        Object a2;
        if ((a2 = a.a) == null) {
            a2 = f2a.D0;
        }
        this.a = (List<String>)a2;
        this.b = a.b;
        this.c = a.c;
    }
    
    public static final class a extends n4j<vqt>
    {
        public List<String> a;
        public cej b;
        public cej c;
        
        public final Object i() {
            return new vqt(this);
        }
    }
}
