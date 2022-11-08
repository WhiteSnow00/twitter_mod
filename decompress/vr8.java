import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vr8
{
    public final String a;
    public final l b;
    public final m c;
    public final j d;
    public final k e;
    public final n f;
    public final p g;
    public final o h;
    
    public vr8(final String a, final l b, final m c, final j d, final k e, final n f, final p g, final o h) {
        zzd.f((Object)a, "__typename");
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
        if (!(o instanceof vr8)) {
            return false;
        }
        final vr8 vr8 = (vr8)o;
        return zzd.a((Object)this.a, (Object)vr8.a) && zzd.a((Object)this.b, (Object)vr8.b) && zzd.a((Object)this.c, (Object)vr8.c) && zzd.a((Object)this.d, (Object)vr8.d) && zzd.a((Object)this.e, (Object)vr8.e) && zzd.a((Object)this.f, (Object)vr8.f) && zzd.a((Object)this.g, (Object)vr8.g) && zzd.a((Object)this.h, (Object)vr8.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final l b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final m c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final j d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final k e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final n f = this.f;
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
        final l b = this.b;
        final m c = this.c;
        final j d = this.d;
        final k e = this.e;
        final n f = this.f;
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
    
    public static final class a
    {
        public final String a;
        public final vg0 b;
        
        public a(final String a, final vg0 b) {
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ApiMedia(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final po0 b;
        
        public b(final String a, final po0 b) {
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final po0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_store_datum1(__typename=");
            sb.append(a);
            sb.append(", appStoreData=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final po0 b;
        
        public c(final String a, final po0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final po0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_store_datum2(__typename=");
            sb.append(a);
            sb.append(", appStoreData=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final po0 b;
        
        public d(final String a, final po0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final po0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_store_datum3(__typename=");
            sb.append(a);
            sb.append(", appStoreData=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final po0 b;
        
        public e(final String a, final po0 b) {
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
            return zzd.a((Object)this.a, (Object)e.a) && zzd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final po0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_store_datum(__typename=");
            sb.append(a);
            sb.append(", appStoreData=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final String a;
        public final i b;
        
        public f(final String a, final i b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return zzd.a((Object)this.a, (Object)f.a) && zzd.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final i b = this.b;
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
            final i b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Button_destination(__typename=");
            sb.append(a);
            sb.append(", onCardAppStoreDestination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final String a;
        public final vg0 b;
        
        public g(final String a, final vg0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return zzd.a((Object)this.a, (Object)g.a) && zzd.a((Object)this.b, (Object)g.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_results1(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h
    {
        public final String a;
        public final vg0 b;
        
        public h(final String a, final vg0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return zzd.a((Object)this.a, (Object)h.a) && zzd.a((Object)this.b, (Object)h.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_results(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class i
    {
        public final List<d> a;
        
        public i(final List<d> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && zzd.a((Object)this.a, (Object)((i)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return du1.x("OnCardAppStoreDestination1(app_store_data=", (List)this.a, ")");
        }
    }
    
    public static final class j
    {
        public final List<e> a;
        
        public j(final List<e> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof j && zzd.a((Object)this.a, (Object)((j)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return du1.x("OnCardAppStoreDestination(app_store_data=", (List)this.a, ")");
        }
    }
    
    public static final class k
    {
        public final List<b> a;
        public final g b;
        
        public k(final List<b> a, final g b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return zzd.a((Object)this.a, (Object)k.a) && zzd.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final List<b> a = this.a;
            final g b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardAppStoreWithDockedMediaDestination(app_store_data=");
            sb.append(a);
            sb.append(", media_results=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class l
    {
        public final r a;
        
        public l(final r a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof l && zzd.a((Object)this.a, (Object)((l)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final r a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardBrowserDestination(url_data=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class m
    {
        public final h a;
        public final q b;
        
        public m(final h a, final q b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof m)) {
                return false;
            }
            final m m = (m)o;
            return zzd.a((Object)this.a, (Object)m.a) && zzd.a((Object)this.b, (Object)m.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final h a = this.a;
            final q b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardBrowserWithDockedMediaDestination(media_results=");
            sb.append(a);
            sb.append(", url_data=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class n
    {
        public final List<c> a;
        public final f b;
        public final s c;
        
        public n(final List<c> a, final f b, final s c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof n)) {
                return false;
            }
            final n n = (n)o;
            return zzd.a((Object)this.a, (Object)n.a) && zzd.a((Object)this.b, (Object)n.b) && zzd.a((Object)this.c, (Object)n.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final f b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final s c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final List<c> a = this.a;
            final f b = this.b;
            final s c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardPlayableDestination(app_store_data=");
            sb.append(a);
            sb.append(", button_destination=");
            sb.append(b);
            sb.append(", url_data_opt=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class o
    {
        public final String a;
        
        public o(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof o && zzd.a((Object)this.a, (Object)((o)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("OnCardProfileDestination(user_id=", this.a, ")");
        }
    }
    
    public static final class p
    {
        public final Boolean a;
        public final a b;
        public final String c;
        
        public p(final Boolean a, final a b, final String c) {
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
            return zzd.a((Object)this.a, (Object)p.a) && zzd.a((Object)this.b, (Object)p.b) && zzd.a((Object)this.c, (Object)p.c);
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
            final a b = this.b;
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
            final a b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardTweetComposerDestination(is_prefix=");
            sb.append(a);
            sb.append(", apiMedia=");
            sb.append(b);
            sb.append(", text=");
            return hi.I(sb, c, ")");
        }
    }
    
    public static final class q
    {
        public final String a;
        public final u5w b;
        
        public q(final String a, final u5w b) {
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
            return zzd.a((Object)this.a, (Object)q.a) && zzd.a((Object)this.b, (Object)q.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u5w b = this.b;
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
        public final u5w b;
        
        public r(final String a, final u5w b) {
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
            return zzd.a((Object)this.a, (Object)r.a) && zzd.a((Object)this.b, (Object)r.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u5w b = this.b;
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
        public final u5w b;
        
        public s(final String a, final u5w b) {
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
            return zzd.a((Object)this.a, (Object)s.a) && zzd.a((Object)this.b, (Object)s.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u5w b = this.b;
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
