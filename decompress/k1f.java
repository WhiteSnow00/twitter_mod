import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1f implements i1f, j0f
{
    public final List<Integer> a;
    public final hze b;
    public final /* synthetic */ ui8 c;
    
    public k1f(final bzd<d1f> bzd, final fud fud, final List<Integer> b, final hze hze) {
        final v2a c0 = v2a.C0;
        zzd.f((Object)bzd, "intervals");
        zzd.f((Object)fud, "nearestItemsRange");
        zzd.f((Object)b, "itemScope");
        this.a = (List<Integer>)c0;
        this.b = (hze)b;
        this.c = (ui8)asy.g((bzd)bzd, fud, (lub)m8y.k(-1230121334, true, new j1f((hze)b)));
    }
    
    public final int a() {
        return this.c.a();
    }
    
    public final Object b(final int n) {
        return this.c.b(n);
    }
    
    public final hze d() {
        return this.b;
    }
    
    public final void e(final int n, final m76 m76, final int n2) {
        final m76 h = m76.h(-1645068522);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (h.d(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (h.P((Object)this)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        if ((n5 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            this.c.e(n, h, n5 & 0xE);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new k1f$a(this, n, n2));
        }
    }
    
    public final Map<Object, Integer> f() {
        return this.c.c;
    }
    
    public final Object g(final int n) {
        return this.c.g(n);
    }
    
    public final List<Integer> h() {
        return this.a;
    }
}
