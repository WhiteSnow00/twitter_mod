import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqt
{
    public static final alp<fqt> d;
    public final List<String> a;
    public final xdj b;
    public final xdj c;
    
    static {
        fqt.d = new fqt.fqt$b();
    }
    
    public fqt(final a a) {
        Object a2;
        if ((a2 = a.a) == null) {
            a2 = v2a.C0;
        }
        this.a = (List<String>)a2;
        this.b = a.b;
        this.c = a.c;
    }
    
    public static final class a extends h4j<fqt>
    {
        public List<String> a;
        public xdj b;
        public xdj c;
        
        public final Object i() {
            return new fqt(this);
        }
    }
}
