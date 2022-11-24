// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kk
{
    public static final class a extends kk
    {
        public static final kk.a.a Companion;
        public final cej a;
        public final pej b;
        public final pej c;
        
        static {
            Companion = new kk.a.a();
        }
        
        public a(final cej a, final pej b, final pej c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof kk.a)) {
                return false;
            }
            final kk.a a = (kk.a)o;
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b) && e0e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            final cej a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final pej b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final pej c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final cej a = this.a;
            final pej b = this.b;
            final pej c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("HeaderItem(ocfImageConfig=");
            sb.append(a);
            sb.append(", primaryText=");
            sb.append(b);
            sb.append(", secondaryText=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
        
        public static final class a
        {
        }
    }
    
    public static final class b extends kk
    {
        public final nk a;
        public final rk$c b;
        
        public b(final nk a, final rk$c b) {
            e0e.f((Object)a, "actionListLinkData");
            e0e.f((Object)b, "style");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e0e.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final nk a = this.a;
            final rk$c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("LinkItem(actionListLinkData=");
            sb.append(a);
            sb.append(", style=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends kk
    {
        public final sk a;
        public final rk$c b;
        
        public c(final sk a, final rk$c b) {
            e0e.f((Object)a, "actionListTextData");
            e0e.f((Object)b, "style");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return e0e.a((Object)this.a, (Object)c.a) && this.b == c.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final sk a = this.a;
            final rk$c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("TextItem(actionListTextData=");
            sb.append(a);
            sb.append(", style=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
