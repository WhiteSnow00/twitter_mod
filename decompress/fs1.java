// 
// Decompiled by Procyon v0.6.0
// 

public final class fs1 implements hcf
{
    public static final c Companion;
    public static final js2<fs1, a> d;
    public final xwm<xes> b;
    public final xwm<xes> c;
    
    static {
        Companion = new c();
        fs1.d = new fs1$b();
    }
    
    public fs1(final xwm<xes> b, final xwm<xes> c) {
        zzd.f((Object)b, "headline");
        zzd.f((Object)c, "subText");
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fs1)) {
            return false;
        }
        final fs1 fs1 = (fs1)o;
        return zzd.a((Object)this.b, (Object)fs1.b) && zzd.a((Object)this.c, (Object)fs1.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final xwm<xes> b = this.b;
        final xwm<xes> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("BasicLimitedActionPrompt(headline=");
        sb.append(b);
        sb.append(", subText=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends h4j<fs1>
    {
        public xwm<xes> a;
        public xwm<xes> b;
        
        public final Object i() {
            final xwm<xes> a = this.a;
            if (a == null) {
                zzd.m("headline");
                throw null;
            }
            final xwm<xes> b = this.b;
            if (b != null) {
                return new fs1(a, b);
            }
            zzd.m("subText");
            throw null;
        }
    }
    
    public static final class c
    {
    }
}
