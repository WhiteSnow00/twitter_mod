import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfu extends fym<r7a> implements v7a
{
    public static final ss2<rfu, rfu.rfu$a> L0;
    public static final rfu M0;
    public final qku K0;
    
    static {
        rfu.L0 = new rfu.rfu$b();
        M0 = new rfu("", null, null);
    }
    
    public rfu(final String s, final qku qku, Map<r7a, fxl> c) {
        qku h = qku.h;
        if (qku != null) {
            h = qku;
        }
        if (c == null) {
            final Iterable c2 = qku.c(h);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final Iterator iterator = ((w5e)c2).iterator();
            while (((y5e)iterator).hasNext()) {
                final r7a r7a = (r7a)((ohz)iterator).next();
                linkedHashMap.put(r7a, new fxl(r7a.G0, r7a.H0));
            }
            c = ked.c((Map)linkedHashMap);
        }
        super(s, c);
        final qku h2 = qku.h;
        qku k0 = qku;
        if (qku == null) {
            k0 = h2;
        }
        this.K0 = k0;
    }
    
    public rfu(final px9 px9) {
        super((bvh)px9);
        this.K0 = px9.J0;
    }
    
    public rfu(final rfu.rfu$a rfu$a) {
        super((fym$a)rfu$a);
        final qku d = rfu$a.d;
        final qku h = qku.h;
        qku k0 = d;
        if (d == null) {
            k0 = h;
        }
        this.K0 = k0;
    }
    
    public final CharSequence e() {
        return super.F0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rfu && o.toString().equals(super.F0));
    }
    
    public final int hashCode() {
        return o5j.f((Object)super.F0);
    }
    
    public final qku j() {
        return this.K0;
    }
}
