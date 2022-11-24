// 
// Decompiled by Procyon v0.6.0
// 

public final class hs1
{
    public final a a;
    public final b b;
    
    public hs1(final a a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hs1)) {
            return false;
        }
        final hs1 hs1 = (hs1)o;
        return e0e.a((Object)this.a, (Object)hs1.a) && e0e.a((Object)this.b, (Object)hs1.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final b b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BasicLimitedActionPrompt(headline=");
        sb.append(a);
        sb.append(", subtext=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final z3t b;
        
        public a(final String a, final z3t b) {
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
            final z3t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Headline(__typename=");
            sb.append(a);
            sb.append(", timelineRichText=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final z3t b;
        
        public b(final String a, final z3t b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final z3t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Subtext(__typename=");
            sb.append(a);
            sb.append(", timelineRichText=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
