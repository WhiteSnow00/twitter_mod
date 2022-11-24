import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsb implements Serializable
{
    public static final nmp<dsb> G0;
    public final Map<Long, Integer> F0;
    
    static {
        dsb.G0 = new dsb.dsb$a();
    }
    
    public dsb() {
        this.F0 = (nuh$a)nuh.a(0);
    }
    
    public dsb(final int n) {
        this.F0 = (nuh$a)nuh.a(n);
    }
    
    public final void a(final long n) {
        this.j(n, 16384);
    }
    
    public final void b(final long n) {
        this.j(n, 8192);
    }
    
    public final boolean c(final long n) {
        return ((HashMap)this.F0).containsKey(n);
    }
    
    public final boolean d(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.F0).get(n);
        return n3 != null && n3 == n2;
    }
    
    public final Integer e(final long n) {
        return ((HashMap<K, Integer>)this.F0).get(n);
    }
    
    public final boolean f(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.F0).get(n);
        return n3 != null && (n3 & n2) != 0x0;
    }
    
    public final void g(final long n, final int n2) {
        ((HashMap<Long, Integer>)this.F0).put(Long.valueOf(n), Integer.valueOf(n2));
    }
    
    public final void h(final long n) {
        this.k(n, 16384);
    }
    
    public final void i(final long n) {
        this.k(n, 8192);
    }
    
    public final void j(final long n, int d0) {
        final Integer n2 = ((HashMap<K, Integer>)this.F0).get(n);
        int intValue;
        if (n2 == null) {
            intValue = 0;
        }
        else {
            intValue = n2;
        }
        d0 = fbx.d0(intValue, d0);
        ((HashMap<Long, Integer>)this.F0).put(Long.valueOf(n), Integer.valueOf(d0));
    }
    
    public final void k(final long n, int j0) {
        final Integer n2 = ((HashMap<K, Integer>)this.F0).get(n);
        int intValue;
        if (n2 == null) {
            intValue = 0;
        }
        else {
            intValue = n2;
        }
        j0 = fbx.j0(intValue, j0);
        ((HashMap<Long, Integer>)this.F0).put(Long.valueOf(n), Integer.valueOf(j0));
    }
    
    public final void l(final long n, int n2) {
        if (this.c(n)) {
            if ((n2 & 0x80) != 0x0) {
                return;
            }
            final int intValue = this.e(n);
            int n3;
            if ((n2 & 0x1) != 0x0) {
                n3 = (intValue | 0x1);
            }
            else {
                n3 = (intValue & 0xFFFFFFFE);
            }
            if ((n2 & 0x4000) != 0x0) {
                n2 = (n3 | 0x4000);
            }
            else {
                n2 = (n3 & 0xFFFFBFFF);
            }
            this.g(n, n2 & 0xFFFFFF7F);
        }
        else {
            this.g(n, n2);
        }
    }
    
    public final void m(final hp6 hp6) {
        this.l(hp6.w(), hp6.n());
    }
    
    public final void n(final qgv qgv) {
        this.l(qgv.F0, qgv.K1);
        if (fbx.E(qgv.K1)) {
            this.j(qgv.F0, 4);
        }
        else {
            this.k(qgv.F0, 4);
        }
        if (fbx.N(qgv.K1)) {
            this.b(qgv.F0);
        }
        else {
            this.i(qgv.F0);
        }
    }
    
    public interface b
    {
        dsb d4();
    }
}
