// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rfh
{
    public static final class a extends rfh
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return da8.j("FinishActivity(tag=", this.a, ")");
        }
    }
    
    public static final class b extends rfh
    {
        public final String a;
        public final String b;
        
        public b(final String b) {
            this.a = "";
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
            final int hashCode = this.a.hashCode();
            final String b = this.b;
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
            return zh8.o("FinishActivityWithUrl(url=", this.a, ", tag=", this.b, ")");
        }
    }
    
    public static final class c extends rfh
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
}
