import com.twitter.app.common.args.ContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d0i
{
    public static final class a extends d0i
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends d0i
    {
        public final ContentViewArgs a;
        
        public b(final ContentViewArgs a) {
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
            final ContentViewArgs a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Navigate(args=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends d0i
    {
        public final String a;
        
        public c(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return zi.y("OpenUrl(url=", this.a, ")");
        }
    }
}
