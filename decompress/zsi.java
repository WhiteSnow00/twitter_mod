// 
// Decompiled by Procyon v0.6.0
// 

public final class zsi
{
    public static final a Companion;
    public final z50 a;
    
    static {
        Companion = new a();
    }
    
    public zsi(final z50 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zsi && czd.a((Object)this.a, (Object)((zsi)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final z50 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationLayout(androidPushLayout=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends y4j<zsi>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final z50 z50 = (z50)lp.d0(vlp, (spa)pzo.c);
            zsi zsi;
            if (z50 != null) {
                zsi = new zsi(z50);
            }
            else {
                zsi = null;
            }
            return zsi;
        }
        
        public final void f(final wlp wlp, final Object o) {
            final zsi zsi = (zsi)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)zsi, "notificationLayout");
            lp.n0(wlp, (g6s)zsi.a);
        }
    }
}
