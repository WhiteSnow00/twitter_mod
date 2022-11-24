// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wln
{
    public static final class a extends wln
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends wln
    {
        public final xsk a;
        
        public b(final xsk a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e0e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final xsk a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("LaunchPostSurvey(event=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
