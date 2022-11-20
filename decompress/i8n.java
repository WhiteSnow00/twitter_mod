// 
// Decompiled by Procyon v0.6.0
// 

public abstract class i8n
{
    public static final class a extends i8n
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends i8n
    {
        public final lsi a;
        public final String b;
        
        public b(final lsi a, final String b) {
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
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            final lsi a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.b.hashCode() + hashCode * 31;
        }
        
        @Override
        public final String toString() {
            final lsi a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowCohostInviteToast(info=");
            sb.append(a);
            sb.append(", text=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends i8n
    {
        public final String a;
        
        public c(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && czd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("ShowCohostNotification(text=", this.a, ")");
        }
    }
}
