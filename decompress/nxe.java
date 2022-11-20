import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxe implements mxe, tze
{
    public final eyd<gxe> a;
    public final boolean b;
    public final di8 c;
    public final lye d;
    
    public nxe(final eyd<gxe> a, final boolean b, final itd itd) {
        czd.f((Object)a, "intervals");
        czd.f((Object)itd, "nearestItemsRange");
        this.a = a;
        this.b = b;
        final o46 a2 = o46.a;
        this.c = (di8)msy.b((eyd)a, itd, (ktb)o46.b);
        this.d = new lye((mxe)this);
    }
    
    public final int a() {
        return this.c.a();
    }
    
    public final Object b(final int n) {
        return this.c.b(n);
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final void e(final int n, final x66 x66, final int n2) {
        final x66 h = x66.h(1355196996);
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
            final n96$b a = n96.a;
            this.c.e(n, h, n5 & 0xE);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new nxe$a(this, n, n2));
        }
    }
    
    public final Map<Object, Integer> f() {
        return this.c.c;
    }
    
    public final Object g(final int n) {
        return this.c.g(n);
    }
    
    public final long i(final int n) {
        final lye$b a = lye$b.a;
        final eyd.a<gxe> value = this.a.get(n);
        return ((u7c)value.c.b.invoke((Object)a, (Object)(n - value.a))).a;
    }
    
    public final lye j() {
        return this.d;
    }
}
