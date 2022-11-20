// 
// Decompiled by Procyon v0.6.0
// 

public final class i77
{
    public static final a Companion;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    static {
        Companion = new a();
    }
    
    public i77(final String a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i77)) {
            return false;
        }
        final i77 i77 = (i77)o;
        return czd.a((Object)this.a, (Object)i77.a) && czd.a((Object)this.b, (Object)i77.b) && czd.a((Object)this.c, (Object)i77.c) && czd.a((Object)this.d, (Object)i77.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return mb0.C(tqf.q("CtaSuffix(copyCompact=", this.a, ", colorCompact=", this.b, ", copyExpanded="), this.c, ", colorExpanded=", this.d, ")");
    }
    
    public static final class a
    {
    }
    
    public static final class b extends y4j<i77>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            return new i77(vlp.G(), vlp.G(), vlp.G(), vlp.G());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final i77 i77 = (i77)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)i77, "ctaSuffix");
            wlp.E(i77.a).E(i77.b).E(i77.c).E(i77.d);
        }
    }
}
