// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gk
{
    public static final class a extends gk
    {
        public final xrv a;
        
        public a(final xrv a) {
            zzd.f((Object)a, "uiLink");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final xrv a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("LaunchNavLink(uiLink=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends gk
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
