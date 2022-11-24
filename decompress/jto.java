import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jto implements ito
{
    public static final c Companion;
    public static final ouo<jto, ?> d;
    public final Map<Object, Map<String, List<Object>>> a;
    public final Map<Object, d> b;
    public mto c;
    
    static {
        Companion = new c();
        jto.d = (puo.puo$c)puo.a((hub<? super quo, ? super Object, ?>)jto$a.F0, (stb<? super Object, ?>)jto$b.F0);
    }
    
    public jto() {
        this(null, 1, null);
    }
    
    public jto(final Map<Object, Map<String, List<Object>>> a) {
        e0e.f((Object)a, "savedStates");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public jto(final Map map, final int n, final wg8 wg8) {
        final LinkedHashMap a = new LinkedHashMap();
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public final void c(final Object o) {
        e0e.f(o, "key");
        final d d = this.b.get(o);
        if (d != null) {
            d.b = false;
        }
        else {
            this.a.remove(o);
        }
    }
    
    public final void d(final Object o, final hub<? super d86, ? super Integer, vzv> hub, final d86 d86, final int n) {
        e0e.f(o, "key");
        e0e.f((Object)hub, "content");
        final d86 h = d86.h(-1198538093);
        final sa6$b a = sa6.a;
        h.x(444418301);
        h.B(o);
        h.x(-642722479);
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(d86.Companion);
        Object o2 = y;
        if (y == d86$a.b) {
            final mto c = this.c;
            if (c != null && !c.a(o)) {
                throw new IllegalArgumentException(ffe.n("Type of the key ", o, " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            o2 = new d(o);
            h.p(o2);
        }
        h.O();
        final d d87 = (d)o2;
        ef6.a(new nml[] { oto.a.b(d87.c) }, (hub)hub, h, (n & 0x70) | 0x8);
        shw.b((Object)vzv.a, (stb)new jto$e(this, o, d87), h);
        h.O();
        h.w();
        h.O();
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new jto$f(this, o, (hub)hub, n));
        }
    }
    
    public static final class c
    {
    }
    
    public final class d
    {
        public final Object a;
        public boolean b;
        public final nto c;
        
        public d(final jto jto, final Object a) {
            e0e.f(a, "key");
            this.a = a;
            this.b = true;
            this.c = (nto)oto.a((Map)jto.a.get(a), (stb)new jto$d$a(jto));
        }
        
        public final void a(final Map<Object, Map<String, List<Object>>> map) {
            e0e.f((Object)map, "map");
            if (this.b) {
                final Map<String, List<Object>> e = this.c.e();
                if (e.isEmpty()) {
                    map.remove(this.a);
                }
                else {
                    map.put(this.a, e);
                }
            }
        }
    }
}
