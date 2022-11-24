// 
// Decompiled by Procyon v0.6.0
// 

public final class lcf
{
    public final ycf a;
    public final a b;
    
    public lcf(final ycf a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lcf)) {
            return false;
        }
        final lcf lcf = (lcf)o;
        return this.a == lcf.a && e0e.a((Object)this.b, (Object)lcf.b);
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
        final ycf a = this.a;
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("LimitedAction(gqlLimitedActionType=");
        sb.append(a);
        sb.append(", gqlPrompt=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final qcf b;
        
        public a(final String a, final qcf b) {
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final qcf b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("GqlPrompt(__typename=");
            sb.append(a);
            sb.append(", limitedActionPrompt=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
