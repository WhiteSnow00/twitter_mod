import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fom implements oax
{
    public static final class a extends fom
    {
        public final List<yp7$c> a;
        public final boolean b;
        
        public a() {
            this((List<? extends yp7$c>)v2a.C0, false);
        }
        
        public a(final List<? extends yp7$c> a, final boolean b) {
            zzd.f((Object)a, "inboxItems");
            this.a = (List<yp7$c>)a;
            this.b = b;
        }
        
        public static a l(final a a, final boolean b) {
            final List<yp7$c> a2 = a.a;
            Objects.requireNonNull(a);
            zzd.f((Object)a2, "inboxItems");
            return new a(a2, b);
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
            return zzd.a((Object)this.a, (Object)a.a) && this.b == a.b;
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
            final List<yp7$c> a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Content(inboxItems=");
            sb.append(a);
            sb.append(", isRefreshing=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends fom
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
