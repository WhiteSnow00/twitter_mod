// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vp2
{
    public static final class a extends vp2
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends vp2
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends vp2
    {
        public final xp2.c a;
        public final faa b;
        
        public c(final xp2.c a, final faa b) {
            czd.f((Object)a, "destination");
            czd.f((Object)b, "sourceComponent");
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
            return czd.a((Object)this.a, (Object)c.a) && this.b == c.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final xp2.c a = this.a;
            final faa b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("NavigateToDestination(destination=");
            sb.append(a);
            sb.append(", sourceComponent=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends vp2
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
}
