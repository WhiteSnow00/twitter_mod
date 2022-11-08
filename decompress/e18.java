import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e18 implements oax
{
    public final int a;
    public final String b;
    public final List<wx7$h> c;
    
    public e18(final int a, final String b, final List c, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static e18 l(final e18 e18, int m, String n, List o, final int n2, final Object o2) {
        if ((n2 & 0x1) != 0x0) {
            m = e18.m();
        }
        if ((n2 & 0x2) != 0x0) {
            n = e18.n();
        }
        if ((n2 & 0x4) != 0x0) {
            o = e18.o();
        }
        Objects.requireNonNull(e18);
        k1b.i(m, "loadingType");
        zzd.f((Object)n, "query");
        zzd.f((Object)o, "recentSearches");
        e18 e19;
        if (e18 instanceof a) {
            final a a = (a)e18;
            final List<wx7> g = a.g;
            final String h = a.h;
            zzd.f((Object)g, "results");
            e19 = new a(m, n, (List)o, (List)g, h);
        }
        else if (e18 instanceof b) {
            final b b = (b)e18;
            e19 = new b(m, n, (List)o);
        }
        else {
            if (!(e18 instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            final c c = (c)e18;
            e19 = new c(m, n, (List)o);
        }
        return e19;
    }
    
    public int m() {
        return this.a;
    }
    
    public String n() {
        return this.b;
    }
    
    public List<wx7$h> o() {
        return this.c;
    }
    
    public static final class a extends e18
    {
        public final int d;
        public final String e;
        public final List<wx7$h> f;
        public final List<wx7> g;
        public final String h;
        
        public a(final Object d, final String e, final List<wx7$h> f, final List<? extends wx7> g, final String h) {
            k1b.i((int)d, "loadingType");
            zzd.f((Object)e, "query");
            zzd.f((Object)f, "recentSearches");
            zzd.f((Object)g, "results");
            super((int)d, e, f, null);
            this.d = (int)d;
            this.e = e;
            this.f = f;
            this.g = (List<wx7>)g;
            this.h = h;
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
            return this.d == a.d && zzd.a((Object)this.e, (Object)a.e) && zzd.a((Object)this.f, (Object)a.f) && zzd.a((Object)this.g, (Object)a.g) && zzd.a((Object)this.h, (Object)a.h);
        }
        
        @Override
        public final int hashCode() {
            final int m = hy8.m((List)this.g, hy8.m((List)this.f, l7k.a(this.e, nb0.D(this.d) * 31, 31), 31), 31);
            final String h = this.h;
            int hashCode;
            if (h == null) {
                hashCode = 0;
            }
            else {
                hashCode = h.hashCode();
            }
            return m + hashCode;
        }
        
        @Override
        public final int m() {
            return this.d;
        }
        
        @Override
        public final String n() {
            return this.e;
        }
        
        @Override
        public final List<wx7$h> o() {
            return this.f;
        }
        
        @Override
        public final String toString() {
            final int d = this.d;
            final String e = this.e;
            final List<wx7$h> f = this.f;
            final List<wx7> g = this.g;
            final String h = this.h;
            final StringBuilder g2 = w48.g("Content(loadingType=");
            g2.append(wa.C(d));
            g2.append(", query=");
            g2.append(e);
            g2.append(", recentSearches=");
            g2.append(f);
            g2.append(", results=");
            g2.append(g);
            g2.append(", cursor=");
            g2.append(h);
            g2.append(")");
            return g2.toString();
        }
    }
    
    public static final class b extends e18
    {
        public final int d;
        public final String e;
        public final List<wx7$h> f;
        
        public b(final Object d, final String e, final List<wx7$h> f) {
            k1b.i((int)d, "loadingType");
            zzd.f((Object)e, "query");
            zzd.f((Object)f, "recentSearches");
            super((int)d, e, f, null);
            this.d = (int)d;
            this.e = e;
            this.f = f;
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
            return this.d == b.d && zzd.a((Object)this.e, (Object)b.e) && zzd.a((Object)this.f, (Object)b.f);
        }
        
        @Override
        public final int hashCode() {
            return this.f.hashCode() + l7k.a(this.e, nb0.D(this.d) * 31, 31);
        }
        
        @Override
        public final int m() {
            return this.d;
        }
        
        @Override
        public final String n() {
            return this.e;
        }
        
        @Override
        public final List<wx7$h> o() {
            return this.f;
        }
        
        @Override
        public final String toString() {
            final int d = this.d;
            final String e = this.e;
            final List<wx7$h> f = this.f;
            final StringBuilder g = w48.g("Empty(loadingType=");
            g.append(wa.C(d));
            g.append(", query=");
            g.append(e);
            g.append(", recentSearches=");
            g.append(f);
            g.append(")");
            return g.toString();
        }
    }
    
    public static final class c extends e18
    {
        public final int d;
        public final String e;
        public final List<wx7$h> f;
        
        public c(final Object d, final String e, final List<wx7$h> f) {
            k1b.i((int)d, "loadingType");
            zzd.f((Object)e, "query");
            zzd.f((Object)f, "recentSearches");
            super((int)d, e, f, null);
            this.d = (int)d;
            this.e = e;
            this.f = f;
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
            return this.d == c.d && zzd.a((Object)this.e, (Object)c.e) && zzd.a((Object)this.f, (Object)c.f);
        }
        
        @Override
        public final int hashCode() {
            return this.f.hashCode() + l7k.a(this.e, nb0.D(this.d) * 31, 31);
        }
        
        @Override
        public final int m() {
            return this.d;
        }
        
        @Override
        public final String n() {
            return this.e;
        }
        
        @Override
        public final List<wx7$h> o() {
            return this.f;
        }
        
        @Override
        public final String toString() {
            final int d = this.d;
            final String e = this.e;
            final List<wx7$h> f = this.f;
            final StringBuilder g = w48.g("Error(loadingType=");
            g.append(wa.C(d));
            g.append(", query=");
            g.append(e);
            g.append(", recentSearches=");
            g.append(f);
            g.append(")");
            return g.toString();
        }
    }
}
