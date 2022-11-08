// 
// Decompiled by Procyon v0.6.0
// 

public final class fo3
{
    public static final b Companion;
    public final vba a;
    
    static {
        Companion = new b();
    }
    
    public fo3(final vba a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fo3 && zzd.a((Object)this.a, (Object)((fo3)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final vba a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("CesAnalyticsServiceLog(event=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends s4j<fo3>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final vba vba = (vba)amy.G(elp, (vqa)eo3.b);
            fo3 fo3;
            if (vba != null) {
                fo3 = new fo3(vba);
            }
            else {
                fo3 = null;
            }
            return fo3;
        }
        
        public final void f(final flp flp, final Object o) {
            final fo3 fo3 = (fo3)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)fo3, "log");
            amy.J(flp, (n5s)fo3.a);
        }
    }
    
    public static final class b
    {
    }
}
