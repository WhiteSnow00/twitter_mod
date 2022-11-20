// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rqo implements cdw
{
    public static final class a extends rqo
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends rqo
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends rqo
    {
        public final kqo a;
        public final boolean b;
        
        public c(final kqo a, final boolean b) {
            czd.f((Object)a, "duration");
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
            return this.a == c.a && this.b == c.b;
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
            final kqo a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("DurationSelected(duration=");
            sb.append(a);
            sb.append(", update=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends rqo
    {
        public final boolean a;
        public final boolean b;
        
        public d(final boolean a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return this.a == d.a && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            final int a = this.a ? 1 : 0;
            int n = 1;
            int n2 = a;
            if (a != 0) {
                n2 = 1;
            }
            final int b = this.b ? 1 : 0;
            if (b == 0) {
                n = b;
            }
            return n2 * 31 + n;
        }
        
        @Override
        public final String toString() {
            return da8.k("EnabledToggled(enabled=", this.a, ", update=", this.b, ")");
        }
    }
    
    public static final class e extends rqo
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends rqo
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
}
