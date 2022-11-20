import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipk
{
    public final Map<gpk, a> a;
    
    public ipk() {
        this.a = new LinkedHashMap();
    }
    
    public final qxd a(final jpk jpk, final yrk yrk) {
        czd.f((Object)yrk, "positionCalculator");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(jpk.a.size());
        final List<kpk> a = jpk.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final kpk kpk = a.get(i);
            final a a2 = this.a.get(new gpk(kpk.a));
            long n;
            long n2;
            boolean c;
            if (a2 == null) {
                n = kpk.b;
                n2 = kpk.d;
                c = false;
            }
            else {
                n = a2.a;
                c = a2.c;
                n2 = yrk.k(a2.b);
            }
            final long a3 = kpk.a;
            linkedHashMap.put(new gpk(a3), new hpk(a3, kpk.b, kpk.d, kpk.e, kpk.f, n, n2, c, kpk.g, (List)kpk.i, kpk.j));
            final boolean e = kpk.e;
            if (e) {
                this.a.put(new gpk(kpk.a), new a(kpk.b, kpk.c, e));
            }
            else {
                this.a.remove(new gpk(kpk.a));
            }
        }
        return new qxd((Map)linkedHashMap, jpk);
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        public final boolean c;
        
        public a(final long a, final long b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
