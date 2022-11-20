import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brb implements Serializable
{
    public static final rlp<brb> E0;
    public final Map<Long, Integer> D0;
    
    static {
        brb.E0 = new brb.brb$a();
    }
    
    public brb() {
        this.D0 = (xth$a)xth.a(0);
    }
    
    public brb(final int n) {
        this.D0 = (xth$a)xth.a(n);
    }
    
    public final void a(final long n) {
        this.j(n, 16384);
    }
    
    public final void b(final long n) {
        this.j(n, 8192);
    }
    
    public final boolean c(final long n) {
        return ((HashMap)this.D0).containsKey(n);
    }
    
    public final boolean d(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.D0).get(n);
        return n3 != null && n3 == n2;
    }
    
    public final Integer e(final long n) {
        return ((HashMap<K, Integer>)this.D0).get(n);
    }
    
    public final boolean f(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.D0).get(n);
        return n3 != null && (n3 & n2) != 0x0;
    }
    
    public final void g(final long n, final int n2) {
        ((HashMap<Long, Integer>)this.D0).put(Long.valueOf(n), Integer.valueOf(n2));
    }
    
    public final void h(final long n) {
        this.k(n, 16384);
    }
    
    public final void i(final long n) {
        this.k(n, 8192);
    }
    
    public final void j(final long n, int f0) {
        final Integer n2 = ((HashMap<K, Integer>)this.D0).get(n);
        int intValue;
        if (n2 == null) {
            intValue = 0;
        }
        else {
            intValue = n2;
        }
        f0 = chw.F0(intValue, f0);
        ((HashMap<Long, Integer>)this.D0).put(Long.valueOf(n), Integer.valueOf(f0));
    }
    
    public final void k(final long n, int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.D0).get(n);
        int intValue;
        if (n3 == null) {
            intValue = 0;
        }
        else {
            intValue = n3;
        }
        n2 = chw.N0(intValue, n2);
        ((HashMap<Long, Integer>)this.D0).put(Long.valueOf(n), Integer.valueOf(n2));
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
    
    public final void m(final bo6 bo6) {
        this.l(bo6.w(), bo6.n());
    }
    
    public final void n(final cgv cgv) {
        this.l(cgv.D0, cgv.I1);
        if (chw.Y(cgv.I1)) {
            this.j(cgv.D0, 4);
        }
        else {
            this.k(cgv.D0, 4);
        }
        if (chw.h0(cgv.I1)) {
            this.b(cgv.D0);
        }
        else {
            this.i(cgv.D0);
        }
    }
    
    public interface b
    {
        brb d4();
    }
}
