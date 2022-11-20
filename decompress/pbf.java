// 
// Decompiled by Procyon v0.6.0
// 

public final class pbf
{
    public final bcf a;
    public final a b;
    
    public pbf(final bcf a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pbf)) {
            return false;
        }
        final pbf pbf = (pbf)o;
        return this.a == pbf.a && czd.a((Object)this.b, (Object)pbf.b);
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
        final bcf a = this.a;
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
        public final ubf b;
        
        public a(final String a, final ubf b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ubf b = this.b;
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
