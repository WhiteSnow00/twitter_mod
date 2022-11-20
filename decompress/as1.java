// 
// Decompiled by Procyon v0.6.0
// 

public final class as1
{
    public final a a;
    public final b b;
    
    public as1(final a a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof as1)) {
            return false;
        }
        final as1 as1 = (as1)o;
        return czd.a((Object)this.a, (Object)as1.a) && czd.a((Object)this.b, (Object)as1.b);
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
        public final f3t b;
        
        public a(final String a, final f3t b) {
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
            final f3t b = this.b;
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
        public final f3t b;
        
        public b(final String a, final f3t b) {
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
            final String a = this.a;
            final f3t b = this.b;
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
