// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wh6
{
    public static final class a extends wh6
    {
        public final i6r a;
        
        public a(final i6r a) {
            e0e.f((Object)a, "ssoProvider");
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
            final i6r a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("DisconnectAccount(ssoProvider=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
