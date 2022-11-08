// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pdq
{
    public static final class a extends pdq
    {
        public final dtg a;
        public final long b;
        
        public a(final dtg a, final long b) {
            zzd.f((Object)a, "mediaEntity");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            return hashCode * 31 + (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            final dtg a = this.a;
            final long b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("NavigateToFullscreen(mediaEntity=");
            sb.append(a);
            sb.append(", sourceTweetId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
