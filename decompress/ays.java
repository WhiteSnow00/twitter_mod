// 
// Decompiled by Procyon v0.6.0
// 

public final class ays implements csj
{
    public static final rlp<ays> c;
    public final String a;
    public final xrs b;
    
    static {
        ays.c = new ays.ays$b();
    }
    
    public ays(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = a.b;
    }
    
    public final xrs a() {
        return this.b;
    }
    
    public static final class a extends n4j<ays>
    {
        public String a;
        public xrs b;
        
        public final Object i() {
            return new ays(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
