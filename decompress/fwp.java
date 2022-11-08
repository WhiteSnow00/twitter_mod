// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fwp
{
    public static final class a extends fwp
    {
        public final ewp a;
        
        public a(final ewp a) {
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
            final ewp a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("DeleteSharedContent(content=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
