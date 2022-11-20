// 
// Decompiled by Procyon v0.6.0
// 

public final class rg0
{
    public final String a;
    public final a b;
    
    public rg0(final String a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rg0)) {
            return false;
        }
        final rg0 rg0 = (rg0)o;
        return czd.a((Object)this.a, (Object)rg0.a) && czd.a((Object)this.b, (Object)rg0.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final a b = this.b;
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
        final String a = this.a;
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiMediaResults(id=");
        sb.append(a);
        sb.append(", result=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final tf0 b;
        
        public a(final String a, final tf0 b) {
            czd.f((Object)a, "__typename");
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
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final tf0 b = this.b;
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
            final String a = this.a;
            final tf0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", apiMedia=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
