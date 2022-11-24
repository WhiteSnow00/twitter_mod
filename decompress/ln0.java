// 
// Decompiled by Procyon v0.6.0
// 

public final class ln0 extends bur
{
    public final cn0 j;
    public final boolean k;
    
    public ln0(final a a) {
        super((bur$a)a);
        final cn0 k = a.k;
        if (k != null) {
            this.j = k;
            this.k = a.l;
            return;
        }
        e0e.m("locale");
        throw null;
    }
    
    public final qtr b(final String s) {
        e0e.f((Object)s, "subtaskId");
        return (qtr)new dn0(s, this);
    }
    
    public static final class a extends bur$a<ln0, a>
    {
        public cn0 k;
        public boolean l;
        
        public a() {
            this.l = true;
        }
        
        public final Object i() {
            return new ln0(this);
        }
        
        public final boolean k() {
            return this.k != null;
        }
    }
}
