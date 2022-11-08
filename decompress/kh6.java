// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kh6
{
    public static final class a extends kh6
    {
        public final q4r a;
        
        public a(final q4r a) {
            zzd.f((Object)a, "ssoProvider");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && this.a == ((a)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final q4r a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("DisconnectAccount(ssoProvider=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
