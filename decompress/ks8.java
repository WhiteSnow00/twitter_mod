// 
// Decompiled by Procyon v0.6.0
// 

public final class ks8
{
    public final String a;
    public final ks8.ks8$l b;
    public final ks8.ks8$m c;
    public final ks8.ks8$j d;
    public final ks8.ks8$k e;
    public final ks8.ks8$n f;
    public final p g;
    public final o h;
    
    public ks8(final String a, final ks8.ks8$l b, final ks8.ks8$m c, final ks8.ks8$j d, final ks8.ks8$k e, final ks8.ks8$n f, final p g, final o h) {
        e0e.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ks8)) {
            return false;
        }
        final ks8 ks8 = (ks8)o;
        return e0e.a((Object)this.a, (Object)ks8.a) && e0e.a((Object)this.b, (Object)ks8.b) && e0e.a((Object)this.c, (Object)ks8.c) && e0e.a((Object)this.d, (Object)ks8.d) && e0e.a((Object)this.e, (Object)ks8.e) && e0e.a((Object)this.f, (Object)ks8.f) && e0e.a((Object)this.g, (Object)ks8.g) && e0e.a((Object)this.h, (Object)ks8.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ks8.ks8$l b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ks8.ks8$m c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final ks8.ks8$j d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final ks8.ks8$k e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final ks8.ks8$n f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final p g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final o h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return ((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final ks8.ks8$l b = this.b;
        final ks8.ks8$m c = this.c;
        final ks8.ks8$j d = this.d;
        final ks8.ks8$k e = this.e;
        final ks8.ks8$n f = this.f;
        final p g = this.g;
        final o h = this.h;
        final StringBuilder sb = new StringBuilder();
        sb.append("Destination(__typename=");
        sb.append(a);
        sb.append(", onCardBrowserDestination=");
        sb.append(b);
        sb.append(", onCardBrowserWithDockedMediaDestination=");
        sb.append(c);
        sb.append(", onCardAppStoreDestination=");
        sb.append(d);
        sb.append(", onCardAppStoreWithDockedMediaDestination=");
        sb.append(e);
        sb.append(", onCardPlayableDestination=");
        sb.append(f);
        sb.append(", onCardTweetComposerDestination=");
        sb.append(g);
        sb.append(", onCardProfileDestination=");
        sb.append(h);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class o
    {
        public final String a;
        
        public o(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof o && e0e.a((Object)this.a, (Object)((o)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("OnCardProfileDestination(user_id=", this.a, ")");
        }
    }
    
    public static final class p
    {
        public final Boolean a;
        public final ks8$a b;
        public final String c;
        
        public p(final Boolean a, final ks8$a b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof p)) {
                return false;
            }
            final p p = (p)o;
            return e0e.a((Object)this.a, (Object)p.a) && e0e.a((Object)this.b, (Object)p.b) && e0e.a((Object)this.c, (Object)p.c);
        }
        
        @Override
        public final int hashCode() {
            final Boolean a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final ks8$a b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final Boolean a = this.a;
            final ks8$a b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardTweetComposerDestination(is_prefix=");
            sb.append(a);
            sb.append(", apiMedia=");
            sb.append(b);
            sb.append(", text=");
            return m51.y(sb, c, ")");
        }
    }
    
    public static final class q
    {
        public final String a;
        public final u6w b;
        
        public q(final String a, final u6w b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof q)) {
                return false;
            }
            final q q = (q)o;
            return e0e.a((Object)this.a, (Object)q.a) && e0e.a((Object)this.b, (Object)q.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u6w b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url_data1(__typename=");
            sb.append(a);
            sb.append(", urlElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class r
    {
        public final String a;
        public final u6w b;
        
        public r(final String a, final u6w b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof r)) {
                return false;
            }
            final r r = (r)o;
            return e0e.a((Object)this.a, (Object)r.a) && e0e.a((Object)this.b, (Object)r.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u6w b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url_data(__typename=");
            sb.append(a);
            sb.append(", urlElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class s
    {
        public final String a;
        public final u6w b;
        
        public s(final String a, final u6w b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof s)) {
                return false;
            }
            final s s = (s)o;
            return e0e.a((Object)this.a, (Object)s.a) && e0e.a((Object)this.b, (Object)s.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u6w b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url_data_opt(__typename=");
            sb.append(a);
            sb.append(", urlElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
