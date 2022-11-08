import java.util.Iterator;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klp
{
    public static final b Companion;
    public static final alp<klp> g;
    public final UserIdentifier a;
    public final fva b;
    public final String c;
    public final Set<String> d;
    public final Map<String, cua> e;
    public final Map<String, List<cua>> f;
    
    static {
        Companion = new b();
        klp.g = new c();
    }
    
    public klp(final UserIdentifier a, final fva b, final String c, final Set d, final Map e, final Map f, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof klp) {
                final UserIdentifier a = this.a;
                final klp klp = (klp)o;
                if (zzd.a((Object)a, (Object)klp.a) && zzd.a((Object)this.b, (Object)klp.b) && zzd.a((Object)this.c, (Object)klp.c) && zzd.a((Object)this.d, (Object)klp.d) && zzd.a((Object)this.e, (Object)klp.e) && zzd.a((Object)this.f, (Object)klp.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() + dia.p((Set)this.d, l7k.a(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31)) * 31;
    }
    
    public static final class a extends h4j<klp>
    {
        public static final klp.a.a Companion;
        public UserIdentifier a;
        public fva b;
        public String c;
        public Set<String> d;
        public Map<String, cua> e;
        public Map<String, ? extends List<String>> f;
        public Map<String, ? extends List<cua>> g;
        
        static {
            Companion = new klp.a.a();
        }
        
        public a() {
            this.a = UserIdentifier.UNDEFINED;
        }
        
        public a(final klp klp) {
            zzd.f((Object)klp, "config");
            final UserIdentifier undefined = UserIdentifier.UNDEFINED;
            this.a = klp.a;
            this.c = klp.c;
            this.d = klp.d;
            this.b = klp.b;
            this.e = klp.e;
            this.g = klp.f;
        }
        
        public final Object i() {
            final UserIdentifier a = this.a;
            final fva b = this.b;
            zzd.c((Object)b);
            String c;
            if ((c = this.c) == null) {
                c = "";
            }
            Object o;
            if ((o = this.d) == null) {
                o = f3a.C0;
            }
            Object o2;
            if ((o2 = this.e) == null) {
                o2 = a3a.C0;
            }
            Object o3;
            if ((o3 = this.g) == null) {
                o3 = a3a.C0;
            }
            return new klp(a, b, c, (Set)o, (Map)o2, (Map)o3, null);
        }
        
        public final void m() {
            if (this.b == null) {
                this.b = (fva)new fva.a().e();
            }
            if (this.e == null) {
                final ged$b c0 = ged.C0;
                final int a = w4j.a;
                this.e = (Map<String, cua>)c0;
            }
            if (this.g == null) {
                final klp.a.a companion = klp.a.Companion;
                final Map<String, ? extends List<String>> f = this.f;
                final Map<String, cua> e = this.e;
                zzd.c((Object)e);
                Objects.requireNonNull(companion);
                Object c2;
                if (hr4.u((Map)f)) {
                    c2 = ged.C0;
                    final int a2 = w4j.a;
                }
                else {
                    zzd.c((Object)f);
                    final sjg$a sjg$a = new sjg$a(f.size());
                    for (final Map.Entry<String, V> entry : f.entrySet()) {
                        final String s = entry.getKey();
                        final List list = (List)entry.getValue();
                        if (list.isEmpty() ^ true) {
                            final ijf$c ijf$c = new ijf$c(list.size());
                            for (final String s2 : list) {
                                if (e.containsKey(s2)) {
                                    ((ijf)ijf$c).p(e.get(s2));
                                }
                            }
                            ((sjg)sjg$a).w((Object)s, ((h4j)ijf$c).e());
                        }
                    }
                    c2 = ((h4j)sjg$a).e();
                }
                this.g = (Map<String, ? extends List<cua>>)c2;
            }
        }
        
        public final klp.a o(final UserIdentifier a) {
            zzd.f((Object)a, "userIdentifier");
            this.a = a;
            return this;
        }
        
        public static final class a
        {
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends js2<klp, klp.a>
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public c() {
            super(2);
        }
        
        public final void f(final flp flp, final Object o) {
            final klp klp = (klp)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)klp, "configuration");
            Objects.requireNonNull(fva.Companion);
            ((s4j)fva.f).c(flp, (Object)klp.b);
            xq4.r(flp, (Set)klp.d, hx6.i);
            final Map<String, cua> e = klp.e;
            final hx6$m f = hx6.f;
            Objects.requireNonNull(cua.Companion);
            final cua$b d = cua.d;
            xq4.n(flp, (Map)e, (alp)f, (alp)d);
            xq4.n(flp, (Map)klp.f, (alp)f, (alp)new xq4$a((alp)d));
            UserIdentifier.SERIALIZER.c(flp, (Object)klp.a);
            flp.G(klp.c);
        }
        
        public final h4j g() {
            return new klp.a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final klp.a a = (klp.a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)a, "builder");
            Objects.requireNonNull(fva.Companion);
            final Object a2 = ((s4j)fva.f).a(elp);
            zzd.c(a2);
            a.b = (fva)a2;
            a.d = xq4.i(elp, hx6.i);
            final hx6$m f = hx6.f;
            Objects.requireNonNull(cua.Companion);
            final cua$b d = cua.d;
            a.e = xq4.e(elp, (alp)f, (alp)d);
            final Map e = xq4.e(elp, (alp)f, (alp)new xq4$a((alp)d));
            if (a.f == null) {
                a.g = e;
                if (n >= 2) {
                    final Object a3 = UserIdentifier.SERIALIZER.a(elp);
                    zzd.c(a3);
                    a.a = (UserIdentifier)a3;
                }
                else {
                    a.o(UserIdentifier.UNDEFINED);
                }
                String i;
                if ((i = elp.I()) == null) {
                    i = "";
                }
                a.c = i;
                return;
            }
            throw new IllegalStateException("On the builder, you can either set impression pointers map or the impression pointer to impressions map, but not both.".toString());
        }
        
        public static final class a
        {
        }
    }
}
