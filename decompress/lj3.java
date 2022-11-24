import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lj3 extends rrp
{
    public List<? extends rrp> f;
    
    public lj3(final a a) {
        e0e.f((Object)a, "builder");
        super((rrp.a)a);
        final List<? extends rrp> e = a.e;
        if (e != null) {
            this.f = e;
            return;
        }
        e0e.m("components");
        throw null;
    }
    
    public static final class a extends rrp.a<lj3, a>
    {
        public List<? extends rrp> e;
        
        public final Object i() {
            return new lj3(this);
        }
        
        @Override
        public final boolean k() {
            final boolean k = super.k();
            boolean b = true;
            if (k) {
                final List<? extends rrp> e = this.e;
                if (e == null) {
                    e0e.m("components");
                    throw null;
                }
                if (e.isEmpty() ^ true) {
                    return b;
                }
            }
            b = false;
            return b;
        }
    }
}
