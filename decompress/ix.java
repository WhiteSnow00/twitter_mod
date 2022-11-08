// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ix
{
    public abstract int a(final qgk p0);
    
    public static final class a extends ix
    {
        public final ex a;
        
        public a(final ex a) {
            zzd.f((Object)a, "alignmentLine");
            this.a = a;
        }
        
        @Override
        public final int a(final qgk qgk) {
            return ((kqg)qgk).i0(this.a);
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
            final StringBuilder g = w48.g("Value(alignmentLine=");
            g.append(this.a);
            g.append(')');
            return g.toString();
        }
    }
}
