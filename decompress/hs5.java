// 
// Decompiled by Procyon v0.6.0
// 

public interface hs5
{
    public static final class a implements hs5
    {
        public final tg5 a;
        
        public a(final tg5 a) {
            czd.f((Object)a, "community");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return g4k.E("OpenCommunityDetails(community=", this.a, ")");
        }
    }
    
    public static final class b implements hs5
    {
        public final tg5 a;
        public final boolean b;
        
        public b(final tg5 a, final boolean b) {
            czd.f((Object)a, "community");
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
            return czd.a((Object)this.a, (Object)b.a) && this.b == b.b;
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
            final tg5 a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OpenJoinCommunityDialog(community=");
            sb.append(a);
            sb.append(", requestToJoin=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
