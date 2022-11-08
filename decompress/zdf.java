// 
// Decompiled by Procyon v0.6.0
// 

public final class zdf implements q7t
{
    public final String b;
    public final fov c;
    
    public zdf(final a a) {
        final String a2 = a.a;
        pf8.r(a2);
        this.b = a2;
        this.c = a.b;
    }
    
    @Override
    public final String a() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && zdf.class == o.getClass()) {
            final zdf zdf = (zdf)o;
            if (!w4j.a((Object)this.b, (Object)zdf.b) || !w4j.a((Object)this.c, (Object)zdf.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Link{url='");
        g.append(this.b);
        g.append('\'');
        g.append('}');
        return g.toString();
    }
    
    public static final class a extends h4j<zdf>
    {
        public String a;
        public fov b;
        
        public final Object i() {
            return new zdf(this);
        }
        
        public final boolean l() {
            return !pjr.e((CharSequence)this.a);
        }
    }
}
