import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rtj implements rsj
{
    public static final nmp<rtj> d;
    public static final rtj e;
    public final List<qtj> a;
    public final String b;
    public final qtj c;
    
    static {
        rtj.d = new rtj.rtj$b();
        e = (rtj)new a().e();
    }
    
    public rtj(final a a) {
        Object a2;
        if ((a2 = a.a) == null) {
            a2 = h3a.F0;
        }
        this.a = (List<qtj>)a2;
        this.b = a.b;
        this.c = a.c;
    }
    
    public final rss a() {
        final qtj c = this.c;
        if (c != null) {
            final tys d = c.d;
            if (d != null) {
                return d.b;
            }
        }
        return null;
    }
    
    public static final class a extends z4j<rtj>
    {
        public List<qtj> a;
        public String b;
        public qtj c;
        
        public final Object i() {
            return new rtj(this);
        }
        
        public final void m() {
            if (this.b == null) {
                final qtj c = this.c;
                if (c != null) {
                    this.b = c.a;
                }
            }
        }
    }
}
