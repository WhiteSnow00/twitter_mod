// 
// Decompiled by Procyon v0.6.0
// 

public abstract class a6i
{
    public static final class d extends a6i
    {
        public final int a;
        
        public d(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && this.a == ((d)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffe.m("OpenWalletErrorDialog(messageRes=", this.a, ")");
        }
    }
    
    public static final class e extends a6i
    {
        public final String a;
        public final int b;
        
        public e(final String a, final int b) {
            e0e.f((Object)a, "message");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return e0e.a((Object)this.a, (Object)e.a) && this.b == e.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b;
            int g;
            if (b == 0) {
                g = 0;
            }
            else {
                g = lb0.G(b);
            }
            return hashCode * 31 + g;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final int b = this.b;
            final StringBuilder b2 = po.B("SignMessage(message=", a, ", wallet=");
            b2.append(z9a.B(b));
            b2.append(")");
            return b2.toString();
        }
    }
}
