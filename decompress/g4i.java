// 
// Decompiled by Procyon v0.6.0
// 

public abstract class g4i
{
    public static final class a extends g4i
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends g4i
    {
        public final snj<kvg> a;
        
        public b(final snj<kvg> a) {
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
            final snj<kvg> a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("FinishActivity(profilePhoto=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
