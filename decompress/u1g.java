// 
// Decompiled by Procyon v0.6.0
// 

public final class u1g extends lsr
{
    public final String j;
    public final xdj k;
    public final kdj l;
    
    public u1g(final a a) {
        super((lsr$a)a);
        this.j = a.k;
        this.k = a.l;
        this.l = a.m;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new t1g(s, this);
    }
    
    public static final class a extends lsr$a<u1g, a>
    {
        public String k;
        public xdj l;
        public kdj m;
        
        public final Object i() {
            return new u1g(this);
        }
    }
}
