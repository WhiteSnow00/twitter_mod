// 
// Decompiled by Procyon v0.6.0
// 

public final class dlt
{
    public final String a;
    public final String b;
    public final wr8 c;
    
    public dlt(final String a, final String b, final wr8 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dlt)) {
            return false;
        }
        final dlt dlt = (dlt)o;
        return zzd.a((Object)this.a, (Object)dlt.a) && zzd.a((Object)this.b, (Object)dlt.b) && zzd.a((Object)this.c, (Object)dlt.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final wr8 c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final wr8 c = this.c;
        final StringBuilder y = mb0.y("TopicDetailComponentItem(title=", a, ", subtitle=", b, ", destination=");
        y.append(c);
        y.append(")");
        return y.toString();
    }
    
    public static final class b extends js2<dlt, dlt$a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) {
            final dlt dlt = (dlt)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)dlt, "detailComponent");
            flp.G(dlt.a);
            flp.G(dlt.b);
        }
        
        public final h4j g() {
            return (h4j)new dlt$a((String)null, (String)null, 3, (hg8)null);
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final dlt$a dlt$a = (dlt$a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)dlt$a, "builder");
            final String c = elp.C();
            zzd.e((Object)c, "input.readNotNullString()");
            dlt$a.b = c;
            dlt$a.c = elp.I();
        }
    }
}
