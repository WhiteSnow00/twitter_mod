import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w6i
{
    public static final class a extends w6i
    {
        public final String a;
        
        public a(final String a) {
            e0e.f((Object)a, "message");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("NFTUnverifiedWallet(message=", this.a, ")");
        }
    }
    
    public static final class b extends w6i
    {
        public final List<u4i> a;
        public final qfq b;
        
        public b(final List<u4i> a, final qfq b) {
            e0e.f((Object)a, "items");
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
            return e0e.a((Object)this.a, (Object)b.a) && e0e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final qfq b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final List<u4i> a = this.a;
            final qfq b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("NFTsSlice(items=");
            sb.append(a);
            sb.append(", sliceInfo=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
