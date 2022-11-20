// 
// Decompiled by Procyon v0.6.0
// 

public final class awv implements zvv<q6t>
{
    public final String a;
    public final String b;
    public final cwv c;
    
    public awv(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = a.b;
        this.c = a.c;
    }
    
    @Override
    public final /* bridge */ Object a(final w3c w3c, final wrm wrm) {
        return this.b(w3c, wrm);
    }
    
    public final q6t b(final w3c w3c, final wrm wrm) {
        final q6t.a a = new q6t.a();
        a.a = w3c.e(this.a);
        a.b = this.b;
        a.c = zvv.a.a(this.c, w3c, wrm);
        return (q6t)a.e();
    }
    
    public static final class a extends n4j<awv>
    {
        public String a;
        public String b;
        public cwv c;
        
        public final Object i() {
            return new awv(this);
        }
        
        public final boolean l() {
            return ikr.g((CharSequence)this.a);
        }
    }
}
