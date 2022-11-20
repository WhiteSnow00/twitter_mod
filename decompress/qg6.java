// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qg6
{
    public static final class a extends qg6
    {
        public final j5r a;
        
        public a(final j5r a) {
            czd.f((Object)a, "ssoProvider");
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
            final j5r a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("DisconnectAccount(ssoProvider=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
