// 
// Decompiled by Procyon v0.6.0
// 

public final class g73 implements ls6<b>
{
    public static final a Companion;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final b g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final alp<b> l;
    
    static {
        Companion = new a();
    }
    
    public g73(final long c, final String d, final long e, final long f, final b g) {
        zzd.f((Object)d, "conversationId");
        zzd.f((Object)g, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = g.c;
        this.i = g.a;
        this.j = g.b;
        this.k = 21;
        this.l = i73$a.b;
    }
    
    @Override
    public final long a() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g73)) {
            return false;
        }
        final g73 g73 = (g73)o;
        return this.c == g73.c && zzd.a((Object)this.d, (Object)g73.d) && this.e == g73.e && this.f == g73.f && zzd.a((Object)this.g, (Object)g73.g);
    }
    
    @Override
    public final String getConversationId() {
        return this.d;
    }
    
    @Override
    public final Object getData() {
        return this.g;
    }
    
    @Override
    public final long getId() {
        return this.c;
    }
    
    @Override
    public final int getType() {
        return this.k;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int a = l7k.a(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        return this.g.hashCode() + ((a + n) * 31 + (int)(f >>> 32 ^ f)) * 31;
    }
    
    @Override
    public final long m() {
        return this.f;
    }
    
    @Override
    public final long t() {
        return ls6.b;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final b g = this.g;
        final StringBuilder h = w48.h("CSFeedbackSubmittedEntry(id=", c, ", conversationId=", d);
        c0.G(h, ", date=", e, ", senderId=");
        h.append(f);
        h.append(", data=");
        h.append(g);
        h.append(")");
        return h.toString();
    }
    
    @Override
    public final alp<b> v() {
        return (alp<b>)this.l;
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        public final String c;
        
        public b(final String a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)b.a) && this.b == b.b && zzd.a((Object)this.c, (Object)b.c);
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final int b = this.b;
            final String c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + b) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final int b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Metadata(feedbackType=");
            sb.append(a);
            sb.append(", score=");
            sb.append(b);
            sb.append(", surveyFromUserName=");
            return hi.I(sb, c, ")");
        }
    }
}
