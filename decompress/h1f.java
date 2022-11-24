import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1f implements rxe
{
    public final p2f a;
    public final int b;
    
    public h1f(final p2f a) {
        e0e.f((Object)a, "state");
        this.a = a;
        this.b = 100;
    }
    
    public final int a() {
        return this.a.g().a();
    }
    
    public final int b() {
        final l1f l1f = (l1f)rr4.L1(this.a.g().b());
        int index;
        if (l1f != null) {
            index = l1f.getIndex();
        }
        else {
            index = 0;
        }
        return index;
    }
    
    public final float c(final int n, final int n2) {
        final List b = this.a.g().b();
        final int size = b.size();
        int i = 0;
        int n3 = 0;
        while (i < size) {
            n3 += b.get(i).getSize();
            ++i;
        }
        return (n - this.i()) * (n3 / b.size()) + (float)n2 - this.h();
    }
    
    public final Integer d(final int n) {
        final List b = this.a.g().b();
        final int size = b.size();
        int n2 = 0;
        Integer n3;
        Object value;
        while (true) {
            n3 = null;
            if (n2 >= size) {
                value = null;
                break;
            }
            value = b.get(n2);
            if (((l1f)value).getIndex() == n) {
                break;
            }
            ++n2;
        }
        final l1f l1f = (l1f)value;
        Integer value2 = n3;
        if (l1f != null) {
            value2 = l1f.a();
        }
        return value2;
    }
    
    public final void e(final g4p g4p, final int n, final int n2) {
        e0e.f((Object)g4p, "<this>");
        this.a.j(n, n2);
    }
    
    public final Object f(final hub<? super g4p, ? super mp6<? super vzv>, ?> hub, final mp6<? super vzv> mp6) {
        final Object y = m58.y((a5p)this.a, (jvh)null, (hub)hub, (mp6)mp6, 1, (Object)null);
        if (y == jz6.F0) {
            return y;
        }
        return vzv.a;
    }
    
    public final int g() {
        return this.b;
    }
    
    public final rp8 getDensity() {
        return ((cjq<rp8>)this.a.f).getValue();
    }
    
    public final int h() {
        return this.a.f();
    }
    
    public final int i() {
        return this.a.e();
    }
}
