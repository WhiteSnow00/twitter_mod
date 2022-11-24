// 
// Decompiled by Procyon v0.6.0
// 

public final class ndj implements kgs
{
    public static final nmp<ndj> I0;
    public final dtv F0;
    public final ttr G0;
    public final yej H0;
    
    static {
        ndj.I0 = new ndj.ndj$b();
    }
    
    public ndj(final a a) {
        this.F0 = a.a;
        this.G0 = a.b;
        this.H0 = a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ndj.class == o.getClass()) {
            final ndj ndj = (ndj)o;
            if (!o5j.a((Object)this.F0, (Object)ndj.F0) || !o5j.a((Object)this.G0, (Object)ndj.G0) || !o5j.a((Object)this.H0, (Object)ndj.H0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.F0, (Object)this.G0, (Object)this.H0);
    }
    
    public static final class a extends z4j<ndj>
    {
        public dtv a;
        public ttr b;
        public yej c;
        
        public final Object i() {
            return new ndj(this);
        }
    }
}
