import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2p
{
    public static final nmp<p2p> b;
    public final List<o2p> a;
    
    static {
        p2p.b = new p2p.p2p$b();
    }
    
    public p2p(final List<o2p> a) {
        this.a = a;
    }
    
    public p2p(final a a) {
        this.a = a.a;
    }
    
    public static final class a extends z4j<p2p>
    {
        public List<o2p> a;
        
        public final Object i() {
            return new p2p(this);
        }
    }
}
