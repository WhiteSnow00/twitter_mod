import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cx9 extends jx9<dz0>
{
    public static final cx9.cx9$a Companion;
    public final int J0;
    public final int K0;
    public final boolean L0;
    public final j01 M0;
    
    static {
        Companion = new cx9.cx9$a();
    }
    
    public cx9(final int j0, final int k0, final boolean l0, final dz0 dz0, final Uri uri, final n0h n0h) {
        e0e.f((Object)dz0, "audioFile");
        e0e.f((Object)uri, "key");
        e0e.f((Object)n0h, "source");
        super((dwg)dz0, uri, n0h);
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = dz0.j;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof cx9)) {
                return b2;
            }
            final cx9 cx9 = (cx9)o;
            e0e.f((Object)cx9, "editableAudio");
            final boolean b3 = this == cx9 || (this.i((jx9)cx9) && cx9.J0 == this.J0 && cx9.K0 == this.K0 && cx9.L0 == this.L0 && e0e.a((Object)cx9.M0, (Object)this.M0));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final jx9<?> f() {
        final int j0 = this.J0;
        final int k0 = this.K0;
        final boolean l0 = this.L0;
        final dwg f0 = super.F0;
        e0e.e((Object)f0, "mediaFile");
        final dz0 dz0 = (dz0)f0;
        final Uri g0 = super.G0;
        e0e.e((Object)g0, "key");
        final n0h h0 = super.H0;
        e0e.e((Object)h0, "source");
        return new cx9(j0, k0, l0, dz0, g0, h0);
    }
    
    public final int hashCode() {
        final int hashCode = super.hashCode();
        final int j0 = this.J0;
        final int k0 = this.K0;
        int n;
        if (this.L0) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return this.M0.hashCode() + (((hashCode * 31 + j0) * 31 + k0) * 31 + n) * 31;
    }
    
    public final float l() {
        return ((dwg)super.F0).b.h();
    }
}
