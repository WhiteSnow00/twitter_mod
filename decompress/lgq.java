import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgq implements ze6, Iterable<Object>, koe
{
    public int[] F0;
    public int G0;
    public Object[] H0;
    public int I0;
    public int J0;
    public boolean K0;
    public int L0;
    public ArrayList<j10> M0;
    
    public lgq() {
        this.F0 = new int[0];
        this.H0 = new Object[0];
        this.M0 = new ArrayList<j10>();
    }
    
    public final j10 e() {
        if (!(this.K0 ^ true)) {
            sa6.d("use active SlotWriter to create an anchor location instead ".toString());
            throw null;
        }
        final int g0 = this.G0;
        if (g0 > 0) {
            final ArrayList<j10> m0 = this.M0;
            final int o0 = kqe.o0(m0, 0, g0);
            j10 j10;
            if (o0 < 0) {
                j10 = new j10(0);
                m0.add(-(o0 + 1), j10);
            }
            else {
                final j10 value = m0.get(o0);
                e0e.e((Object)value, "get(location)");
                j10 = value;
            }
            return j10;
        }
        throw new IllegalArgumentException("Parameter index is out of range".toString());
    }
    
    public final int g(final j10 j10) {
        e0e.f((Object)j10, "anchor");
        if (!(this.K0 ^ true)) {
            sa6.d("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (j10.a()) {
            return j10.a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }
    
    public final boolean i(int n, final j10 j10) {
        final boolean k0 = this.K0;
        boolean b = true;
        if (!(k0 ^ true)) {
            sa6.d("Writer is active".toString());
            throw null;
        }
        if (n >= 0 && n < this.G0) {
            if (this.n(j10)) {
                final int m = kqe.m(this.F0, n);
                final int a = j10.a;
                if (n <= a && a < m + n) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        sa6.d("Invalid group index".toString());
        throw null;
    }
    
    public final Iterator<Object> iterator() {
        return new g9c(this, 0, this.G0);
    }
    
    public final kgq j() {
        if (!this.K0) {
            ++this.J0;
            return new kgq(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }
    
    public final ngq k() {
        if (!(this.K0 ^ true)) {
            sa6.d("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (this.J0 <= 0) {
            this.K0 = true;
            ++this.L0;
            return new ngq(this);
        }
        sa6.d("Cannot start a writer when a reader is pending".toString());
        throw null;
    }
    
    public final boolean n(final j10 j10) {
        final boolean a = j10.a();
        boolean b = false;
        if (a) {
            final int o0 = kqe.o0(this.M0, j10.a, this.G0);
            final boolean b2 = o0 >= 0 && e0e.a((Object)this.M0.get(o0), (Object)j10);
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    public final void o(final int[] f0, final int g0, final Object[] h0, final int i0, final ArrayList<j10> m0) {
        e0e.f((Object)f0, "groups");
        e0e.f((Object)h0, "slots");
        e0e.f((Object)m0, "anchors");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.M0 = m0;
    }
}
