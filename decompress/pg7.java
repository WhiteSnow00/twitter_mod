// 
// Decompiled by Procyon v0.6.0
// 

public final class pg7
{
    public final String a;
    public final long b;
    public final b c;
    public final a d;
    
    public pg7(final String a, final long b, final b c, final a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pg7)) {
            return false;
        }
        final pg7 pg7 = (pg7)o;
        return czd.a((Object)this.a, (Object)pg7.a) && this.b == pg7.b && czd.a((Object)this.c, (Object)pg7.c) && czd.a((Object)this.d, (Object)pg7.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final b c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final a d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + n) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final b c = this.c;
        final a d = this.d;
        final StringBuilder l = fu8.l("DMChatEvent(id=", a, ", rest_id=", b);
        l.append(", reactions=");
        l.append(c);
        l.append(", legacy=");
        l.append(d);
        l.append(")");
        return l.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final tg7 b;
        
        public a(final String a, final tg7 b) {
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
            final tg7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Legacy(__typename=");
            sb.append(a);
            sb.append(", dMChatEventMetadata=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final wt7 b;
        
        public b(final String a, final wt7 b) {
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
            final wt7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reactions(__typename=");
            sb.append(a);
            sb.append(", dMReactionSliceResult=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
