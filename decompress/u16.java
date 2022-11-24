import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u16
{
    public final String a;
    public final r b;
    public final o c;
    public final m d;
    public final u e;
    public final n f;
    public final s g;
    public final t h;
    public final v i;
    public final q j;
    public final p k;
    
    public u16(final String a, final r b, final o c, final m d, final u e, final n f, final s g, final t h, final v i, final q j, final p k) {
        e0e.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u16)) {
            return false;
        }
        final u16 u16 = (u16)o;
        return e0e.a((Object)this.a, (Object)u16.a) && e0e.a((Object)this.b, (Object)u16.b) && e0e.a((Object)this.c, (Object)u16.c) && e0e.a((Object)this.d, (Object)u16.d) && e0e.a((Object)this.e, (Object)u16.e) && e0e.a((Object)this.f, (Object)u16.f) && e0e.a((Object)this.g, (Object)u16.g) && e0e.a((Object)this.h, (Object)u16.h) && e0e.a((Object)this.i, (Object)u16.i) && e0e.a((Object)this.j, (Object)u16.j) && e0e.a((Object)this.k, (Object)u16.k);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final r b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final o c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final m d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final u e = this.e;
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
        final s g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final t h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final v i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final q j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final p k = this.k;
        if (k != null) {
            hashCode2 = k.hashCode();
        }
        return (((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final r b = this.b;
        final o c = this.c;
        final m d = this.d;
        final u e = this.e;
        final n f = this.f;
        final s g = this.g;
        final t h = this.h;
        final v i = this.i;
        final q j = this.j;
        final p k = this.k;
        final StringBuilder sb = new StringBuilder();
        sb.append("Component(__typename=");
        sb.append(a);
        sb.append(", onCardMediaComponent=");
        sb.append(b);
        sb.append(", onCardDetailsComponent=");
        sb.append(c);
        sb.append(", onCardAppStoreDetailsComponent=");
        sb.append(d);
        sb.append(", onCardSwipeableMediaComponent=");
        sb.append(e);
        sb.append(", onCardButtonGroupComponent=");
        sb.append(f);
        sb.append(", onCardMediaWithDetailsHorizontal=");
        sb.append(g);
        sb.append(", onCardProfileComponent=");
        sb.append(h);
        sb.append(", onCardTwitterListDetailsComponent=");
        sb.append(i);
        sb.append(", onCardFollowButtonComponent=");
        sb.append(j);
        sb.append(", onCardFacepileComponent=");
        sb.append(k);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final jo0 b;
        
        public a(final String a, final jo0 b) {
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
            final jo0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_store_datum(__typename=");
            sb.append(a);
            sb.append(", appStoreData=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class a0
    {
        public final String a;
        public final ejw b;
        
        public a0(final String a, final ejw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a0)) {
                return false;
            }
            final a0 a0 = (a0)o;
            return e0e.a((Object)this.a, (Object)a0.a) && e0e.a((Object)this.b, (Object)a0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("UserResults(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final t43 b;
        
        public b(final String a, final t43 b) {
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
            final t43 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Button(__typename=");
            sb.append(a);
            sb.append(", buttonElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b0
    {
        public final String a;
        public final ejw b;
        
        public b0(final String a, final ejw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b0)) {
                return false;
            }
            final b0 b0 = (b0)o;
            return e0e.a((Object)this.a, (Object)b0.a) && e0e.a((Object)this.b, (Object)b0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_results(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final ks8 b;
        
        public c(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)c.a) && e0e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj1(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c0
    {
        public final String a;
        public final ejw b;
        
        public c0(final String a, final ejw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c0)) {
                return false;
            }
            final c0 c0 = (c0)o;
            return e0e.a((Object)this.a, (Object)c0.a) && e0e.a((Object)this.b, (Object)c0.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Users_result(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final ks8 b;
        
        public d(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)d.a) && e0e.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj2(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final ks8 b;
        
        public e(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)e.a) && e0e.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj3(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final String a;
        public final ks8 b;
        
        public f(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)f.a) && e0e.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj4(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final String a;
        public final ks8 b;
        
        public g(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)g.a) && e0e.a((Object)this.b, (Object)g.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj5(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h
    {
        public final String a;
        public final ks8 b;
        
        public h(final String a, final ks8 b) {
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
            return e0e.a((Object)this.a, (Object)h.a) && e0e.a((Object)this.b, (Object)h.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ks8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class i
    {
        public final String a;
        public final vsg b;
        
        public i(final String a, final vsg b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return e0e.a((Object)this.a, (Object)i.a) && e0e.a((Object)this.b, (Object)i.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vsg b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("First_media(__typename=");
            sb.append(a);
            sb.append(", mediaComponent=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j
    {
        public final String a;
        public final vsg b;
        
        public j(final String a, final vsg b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return e0e.a((Object)this.a, (Object)j.a) && e0e.a((Object)this.b, (Object)j.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vsg b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Full_media_list(__typename=");
            sb.append(a);
            sb.append(", mediaComponent=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k
    {
        public final String a;
        public final sg0 b;
        
        public k(final String a, final sg0 b) {
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
            return e0e.a((Object)this.a, (Object)k.a) && e0e.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final sg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_results(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class l
    {
        public final String a;
        public final yy8 b;
        
        public l(final String a, final yy8 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            return e0e.a((Object)this.a, (Object)l.a) && e0e.a((Object)this.b, (Object)l.b);
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
            sb.append("Name(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class m
    {
        public final List<a> a;
        public final c b;
        public final Boolean c;
        
        public m(final List<a> a, final c b, final Boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return e0e.a((Object)this.a, (Object)m.a) && e0e.a((Object)this.b, (Object)m.b) && e0e.a((Object)this.c, (Object)m.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final c b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final Boolean c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final List<a> a = this.a;
            final c b = this.b;
            final Boolean c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardAppStoreDetailsComponent(app_store_data=");
            sb.append(a);
            sb.append(", destination_obj=");
            sb.append(b);
            sb.append(", use_dominant_color=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class n
    {
        public final List<b> a;
        public final Boolean b;
        
        public n(final List<b> a, final Boolean b) {
            this.a = a;
            this.b = b;
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
            return e0e.a((Object)this.a, (Object)n.a) && e0e.a((Object)this.b, (Object)n.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final Boolean b = this.b;
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
            final List<b> a = this.a;
            final Boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardButtonGroupComponent(buttons=");
            sb.append(a);
            sb.append(", use_dominant_color=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class o
    {
        public final x a;
        public final w b;
        public final h c;
        
        public o(final x a, final w b, final h c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof o)) {
                return false;
            }
            final o o2 = (o)o;
            return e0e.a((Object)this.a, (Object)o2.a) && e0e.a((Object)this.b, (Object)o2.b) && e0e.a((Object)this.c, (Object)o2.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int hashCode2 = this.b.hashCode();
            final h c = this.c;
            int hashCode3;
            if (c == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = c.hashCode();
            }
            return (hashCode2 + hashCode * 31) * 31 + hashCode3;
        }
        
        @Override
        public final String toString() {
            final x a = this.a;
            final w b = this.b;
            final h c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardDetailsComponent(title=");
            sb.append(a);
            sb.append(", subtitle=");
            sb.append(b);
            sb.append(", destination_obj=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class p
    {
        public final g a;
        public final Integer b;
        public final ll3 c;
        public final List<c0> d;
        
        public p(final g a, final Integer b, final ll3 c, final List<c0> d) {
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
            if (!(o instanceof p)) {
                return false;
            }
            final p p = (p)o;
            return e0e.a((Object)this.a, (Object)p.a) && e0e.a((Object)this.b, (Object)p.b) && this.c == p.c && e0e.a((Object)this.d, (Object)p.d);
        }
        
        @Override
        public final int hashCode() {
            final g a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Integer b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final ll3 c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return this.d.hashCode() + ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final g a = this.a;
            final Integer b = this.b;
            final ll3 c = this.c;
            final List<c0> d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardFacepileComponent(destination_obj=");
            sb.append(a);
            sb.append(", total_user_count=");
            sb.append(b);
            sb.append(", user_relationship_type=");
            sb.append(c);
            sb.append(", users_results=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class q
    {
        public final z a;
        
        public q(final z a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof q && e0e.a((Object)this.a, (Object)((q)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final z a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardFollowButtonComponent(userResults=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class r
    {
        public final String a;
        public final vsg b;
        
        public r(final String a, final vsg b) {
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
            final vsg b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardMediaComponent(__typename=");
            sb.append(a);
            sb.append(", mediaComponent=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class s
    {
        public final d a;
        public final k b;
        public final y c;
        
        public s(final d a, final k b, final y c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return e0e.a((Object)this.a, (Object)s.a) && e0e.a((Object)this.b, (Object)s.b) && e0e.a((Object)this.c, (Object)s.c);
        }
        
        @Override
        public final int hashCode() {
            final d a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final int hashCode3 = this.b.hashCode();
            final y c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode3 + hashCode2 * 31) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final d a = this.a;
            final k b = this.b;
            final y c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardMediaWithDetailsHorizontal(destination_obj=");
            sb.append(a);
            sb.append(", media_results=");
            sb.append(b);
            sb.append(", topic_detail=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class t
    {
        public final e a;
        public final String b;
        public final a0 c;
        
        public t(final e a, final String b, final a0 c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof t)) {
                return false;
            }
            final t t = (t)o;
            return e0e.a((Object)this.a, (Object)t.a) && e0e.a((Object)this.b, (Object)t.b) && e0e.a((Object)this.c, (Object)t.c);
        }
        
        @Override
        public final int hashCode() {
            final e a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return this.c.hashCode() + (hashCode2 * 31 + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final e a = this.a;
            final String b = this.b;
            final a0 c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardProfileComponent(destination_obj=");
            sb.append(a);
            sb.append(", social_context=");
            sb.append(b);
            sb.append(", userResults=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class u
    {
        public final i a;
        public final List<j> b;
        
        public u(final i a, final List<j> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof u)) {
                return false;
            }
            final u u = (u)o;
            return e0e.a((Object)this.a, (Object)u.a) && e0e.a((Object)this.b, (Object)u.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final List<j> b = this.b;
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
            final i a = this.a;
            final List<j> b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardSwipeableMediaComponent(first_media=");
            sb.append(a);
            sb.append(", full_media_list=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class v
    {
        public final f a;
        public final Integer b;
        public final l c;
        public final Integer d;
        public final b0 e;
        
        public v(final f a, final Integer b, final l c, final Integer d, final b0 e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof v)) {
                return false;
            }
            final v v = (v)o;
            return e0e.a((Object)this.a, (Object)v.a) && e0e.a((Object)this.b, (Object)v.b) && e0e.a((Object)this.c, (Object)v.c) && e0e.a((Object)this.d, (Object)v.d) && e0e.a((Object)this.e, (Object)v.e);
        }
        
        @Override
        public final int hashCode() {
            final f a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Integer b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final l c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Integer d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final b0 e = this.e;
            if (e != null) {
                hashCode = e.hashCode();
            }
            return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final f a = this.a;
            final Integer b = this.b;
            final l c = this.c;
            final Integer d = this.d;
            final b0 e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardTwitterListDetailsComponent(destination_obj=");
            sb.append(a);
            sb.append(", member_count=");
            sb.append(b);
            sb.append(", name=");
            sb.append(c);
            sb.append(", subscriber_count=");
            sb.append(d);
            sb.append(", user_results=");
            sb.append(e);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class w
    {
        public final String a;
        public final yy8 b;
        
        public w(final String a, final yy8 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof w)) {
                return false;
            }
            final w w = (w)o;
            return e0e.a((Object)this.a, (Object)w.a) && e0e.a((Object)this.b, (Object)w.b);
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
    
    public static final class x
    {
        public final String a;
        public final yy8 b;
        
        public x(final String a, final yy8 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof x)) {
                return false;
            }
            final x x = (x)o;
            return e0e.a((Object)this.a, (Object)x.a) && e0e.a((Object)this.b, (Object)x.b);
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
    
    public static final class y
    {
        public final String a;
        public final lmt b;
        
        public y(final String a, final lmt b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof y)) {
                return false;
            }
            final y y = (y)o;
            return e0e.a((Object)this.a, (Object)y.a) && e0e.a((Object)this.b, (Object)y.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final lmt b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Topic_detail(__typename=");
            sb.append(a);
            sb.append(", topicDetail=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class z
    {
        public final String a;
        public final ejw b;
        
        public z(final String a, final ejw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof z)) {
                return false;
            }
            final z z = (z)o;
            return e0e.a((Object)this.a, (Object)z.a) && e0e.a((Object)this.b, (Object)z.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("UserResults1(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
