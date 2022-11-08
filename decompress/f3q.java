// 
// Decompiled by Procyon v0.6.0
// 

public abstract class f3q implements qcw
{
    public static final class a extends f3q
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends f3q
    {
        public final xrv a;
        
        public b(final xrv a) {
            zzd.f((Object)a, "link");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final xrv a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("LinkNavigated(link=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
