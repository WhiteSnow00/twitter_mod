// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ftl implements qcw
{
    public static final class a extends ftl
    {
        public final dtl a;
        
        public a(final dtl a) {
            this.a = a;
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
            final dtl a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionSelected(quickAction=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public abstract static class b extends ftl
    {
    }
}
