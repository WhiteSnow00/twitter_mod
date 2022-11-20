import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i2o
{
    public final nnl<a> a;
    
    public i2o() {
        this.a = (nnl<a>)new nnl();
    }
    
    public static void a(final i2o i2o, final v47 v47) {
        Objects.requireNonNull(i2o);
        czd.f((Object)v47, "createdBroadcast");
        i2o.a.onNext((Object)new a(v47, false));
    }
    
    public static final class a
    {
        public final v47 a;
        public final boolean b;
        
        public a(final v47 a, final boolean b) {
            czd.f((Object)a, "createdBroadcast");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return czd.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            return hashCode * 31 + b;
        }
        
        @Override
        public final String toString() {
            final v47 a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScheduledBroadcast(createdBroadcast=");
            sb.append(a);
            sb.append(", showQuickActions=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
