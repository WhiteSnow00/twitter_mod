// 
// Decompiled by Procyon v0.6.0
// 

public final class lmt
{
    public final a a;
    public final b b;
    
    public lmt(final a a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lmt)) {
            return false;
        }
        final lmt lmt = (lmt)o;
        return e0e.a((Object)this.a, (Object)lmt.a) && e0e.a((Object)this.b, (Object)lmt.b);
    }
    
    @Override
    public final int hashCode() {
        final a a = this.a;
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
        final a a = this.a;
        final b b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TopicDetail(subtitle=");
        sb.append(a);
        sb.append(", title=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final yy8 b;
        
        public a(final String a, final yy8 b) {
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
            final yy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Subtitle(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final yy8 b;
        
        public b(final String a, final yy8 b) {
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
            final yy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Title(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
