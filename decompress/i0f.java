import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0f
{
    public final xro a;
    public final otb<j0f> b;
    public final Map<Object, a> c;
    
    public i0f(final xro a, final otb<? extends j0f> b) {
        zzd.f((Object)a, "saveableStateHolder");
        this.a = a;
        this.b = (otb<j0f>)b;
        this.c = new LinkedHashMap();
    }
    
    public final gub<m76, Integer, oyv> a(final int n, final Object o) {
        zzd.f(o, "key");
        final a a = this.c.get(o);
        final Object b = ((j0f)this.b.invoke()).b(n);
        gub<m76, Integer, oyv> gub;
        if (a != null && ((Number)((nhq)a.c).getValue()).intValue() == n && zzd.a(a.b, b)) {
            gub = a.a();
        }
        else {
            final a a2 = new a(n, o, b);
            this.c.put(o, a2);
            gub = a2.a();
        }
        return gub;
    }
    
    public final Object b(Object o) {
        final a a = this.c.get(o);
        if (a != null) {
            o = a.b;
        }
        else {
            final j0f j0f = (j0f)this.b.invoke();
            final Integer n = j0f.f().get(o);
            if (n != null) {
                o = j0f.b(n);
            }
            else {
                o = null;
            }
        }
        return o;
    }
    
    public final class a
    {
        public final Object a;
        public final Object b;
        public final cwj c;
        public gub<? super m76, ? super Integer, oyv> d;
        
        public a(final int n, final Object a, final Object b) {
            zzd.f(a, "key");
            this.a = a;
            this.b = b;
            this.c = (cwj)nkz.r((Object)n);
        }
        
        public final gub<m76, Integer, oyv> a() {
            Object d;
            if ((d = this.d) == null) {
                d = m8y.k(1403994769, true, new h0f(i0f.this, this));
                this.d = (gub<? super m76, ? super Integer, oyv>)d;
            }
            return (gub<m76, Integer, oyv>)d;
        }
    }
}
