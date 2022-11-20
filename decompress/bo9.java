import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bo9
{
    public static final class a extends bo9
    {
        public final Locale a;
        
        public a(final Locale a) {
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
            final Locale a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Locale(locale=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends bo9
    {
        public final String a;
        public final String b;
        
        public b(final String a, final String b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return zh8.o("Module(moduleName=", this.a, ", binaryName=", this.b, ")");
        }
    }
}
