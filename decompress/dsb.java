import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsb implements Serializable
{
    public static final alp<dsb> D0;
    public final Map<Long, Integer> C0;
    
    static {
        dsb.D0 = new dsb.dsb$a();
    }
    
    public dsb() {
        this.C0 = (tth$a)tth.a(0);
    }
    
    public dsb(final int n) {
        this.C0 = (tth$a)tth.a(n);
    }
    
    public final void a(final long n) {
        this.j(n, 16384);
    }
    
    public final void b(final long n) {
        this.j(n, 8192);
    }
    
    public final boolean c(final long n) {
        return ((HashMap)this.C0).containsKey(n);
    }
    
    public final boolean d(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.C0).get(n);
        return n3 != null && n3 == n2;
    }
    
    public final Integer e(final long n) {
        return ((HashMap<K, Integer>)this.C0).get(n);
    }
    
    public final boolean f(final long n, final int n2) {
        final Integer n3 = ((HashMap<K, Integer>)this.C0).get(n);
        return n3 != null && (n3 & n2) != 0x0;
    }
    
    public final void g(final long n, final int n2) {
        ((HashMap<Long, Integer>)this.C0).put(Long.valueOf(n), Integer.valueOf(n2));
    }
    
    public final void h(final long n) {
        this.k(n, 16384);
    }
    
    public final void i(final long n) {
        this.k(n, 8192);
    }
    
    public final void j(final long n, int l0) {
        final Integer n2 = ((HashMap<K, Integer>)this.C0).get(n);
        int intValue;
        if (n2 == null) {
            intValue = 0;
        }
        else {
            intValue = n2;
        }
        l0 = tdy.L0(intValue, l0);
        ((HashMap<Long, Integer>)this.C0).put(Long.valueOf(n), Integer.valueOf(l0));
    }
    
    public final void k(final long n, int y0) {
        final Integer n2 = ((HashMap<K, Integer>)this.C0).get(n);
        int intValue;
        if (n2 == null) {
            intValue = 0;
        }
        else {
            intValue = n2;
        }
        y0 = tdy.Y0(intValue, y0);
        ((HashMap<Long, Integer>)this.C0).put(Long.valueOf(n), Integer.valueOf(y0));
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
    
    public final void m(final vo6 vo6) {
        this.l(vo6.w(), vo6.n());
    }
    
    public final void n(final hfv hfv) {
        this.l(hfv.C0, hfv.H1);
        if (tdy.Y(hfv.H1)) {
            this.j(hfv.C0, 4);
        }
        else {
            this.k(hfv.C0, 4);
        }
        if (tdy.k0(hfv.H1)) {
            this.b(hfv.C0);
        }
        else {
            this.i(hfv.C0);
        }
    }
    
    public interface b
    {
        dsb d4();
    }
}
