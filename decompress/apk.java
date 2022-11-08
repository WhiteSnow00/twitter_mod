import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apk
{
    public final Map<yok, a> a;
    
    public apk() {
        this.a = new LinkedHashMap();
    }
    
    public final nyd a(final bpk bpk, final qrk qrk) {
        zzd.f((Object)qrk, "positionCalculator");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(bpk.a.size());
        final List a = bpk.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final cpk cpk = a.get(i);
            final a a2 = this.a.get(new yok(cpk.a));
            long n;
            long n2;
            boolean c;
            if (a2 == null) {
                n = cpk.b;
                n2 = cpk.d;
                c = false;
            }
            else {
                n = a2.a;
                c = a2.c;
                n2 = qrk.h(a2.b);
            }
            final long a3 = cpk.a;
            linkedHashMap.put(new yok(a3), new zok(a3, cpk.b, cpk.d, cpk.e, cpk.f, n, n2, c, cpk.g, cpk.i, cpk.j));
            final boolean e = cpk.e;
            if (e) {
                this.a.put(new yok(cpk.a), new a(cpk.b, cpk.c, e));
            }
            else {
                this.a.remove(new yok(cpk.a));
            }
        }
        return new nyd((Map)linkedHashMap, bpk);
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
