import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class weq implements ne6, Iterable<Object>, coe
{
    public int[] C0;
    public int D0;
    public Object[] E0;
    public int F0;
    public int G0;
    public boolean H0;
    public int I0;
    public ArrayList<i10> J0;
    
    public weq() {
        this.C0 = new int[0];
        this.E0 = new Object[0];
        this.J0 = new ArrayList<i10>();
    }
    
    public final i10 e() {
        if (!(this.H0 ^ true)) {
            ea6.d("use active SlotWriter to create an anchor location instead ".toString());
            throw null;
        }
        final int d0 = this.D0;
        if (d0 > 0) {
            final ArrayList<i10> j0 = this.J0;
            final int k0 = tdy.K0((ArrayList)j0, 0, d0);
            i10 i10;
            if (k0 < 0) {
                i10 = new i10(0);
                j0.add(-(k0 + 1), i10);
            }
            else {
                final i10 value = j0.get(k0);
                zzd.e((Object)value, "get(location)");
                i10 = value;
            }
            return i10;
        }
        throw new IllegalArgumentException("Parameter index is out of range".toString());
    }
    
    public final int g(final i10 i10) {
        zzd.f((Object)i10, "anchor");
        if (!(this.H0 ^ true)) {
            ea6.d("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (i10.a()) {
            return i10.a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }
    
    public final boolean i(int n, final i10 i10) {
        final boolean h0 = this.H0;
        boolean b = true;
        if (!(h0 ^ true)) {
            ea6.d("Writer is active".toString());
            throw null;
        }
        if (n >= 0 && n < this.D0) {
            if (this.m(i10)) {
                final int h2 = tdy.h(this.C0, n);
                final int a = i10.a;
                if (n <= a && a < h2 + n) {
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
        ea6.d("Invalid group index".toString());
        throw null;
    }
    
    public final Iterator<Object> iterator() {
        return (Iterator<Object>)new d9c(this, 0, this.D0);
    }
    
    public final veq j() {
        if (!this.H0) {
            ++this.G0;
            return new veq(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }
    
    public final yeq l() {
        if (!(this.H0 ^ true)) {
            ea6.d("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (this.G0 <= 0) {
            this.H0 = true;
            ++this.I0;
            return new yeq(this);
        }
        ea6.d("Cannot start a writer when a reader is pending".toString());
        throw null;
    }
    
    public final boolean m(final i10 i10) {
        final boolean a = i10.a();
        boolean b = false;
        if (a) {
            final int k0 = tdy.K0((ArrayList)this.J0, i10.a, this.D0);
            final boolean b2 = k0 >= 0 && zzd.a((Object)this.J0.get(k0), (Object)i10);
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    public final void o(final int[] c0, final int d0, final Object[] e0, final int f0, final ArrayList<i10> j0) {
        zzd.f((Object)c0, "groups");
        zzd.f((Object)e0, "slots");
        zzd.f((Object)j0, "anchors");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.J0 = j0;
    }
}
