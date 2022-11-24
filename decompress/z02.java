import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z02 extends wvj
{
    public final m6d K0;
    public final long L0;
    public final long M0;
    public int N0;
    public final long O0;
    public float P0;
    public vr4 Q0;
    
    public z02(final m6d k0) {
        Objects.requireNonNull(hud.Companion);
        final long b = hud.b;
        final long f = shw.f(k0.getWidth(), k0.getHeight());
        this.K0 = k0;
        this.L0 = b;
        this.M0 = f;
        Objects.requireNonNull(h0b.Companion);
        boolean b2 = true;
        this.N0 = 1;
        final hud$a companion = hud.Companion;
        Label_0134: {
            if ((int)(b >> 32) >= 0 && hud.c(b) >= 0) {
                final int n = (int)(f >> 32);
                if (n >= 0 && nud.b(f) >= 0 && n <= k0.getWidth() && nud.b(f) <= k0.getHeight()) {
                    break Label_0134;
                }
            }
            b2 = false;
        }
        if (b2) {
            this.O0 = f;
            this.P0 = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean b(final float p) {
        this.P0 = p;
        return true;
    }
    
    public final boolean e(final vr4 q0) {
        this.Q0 = q0;
        return true;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z02)) {
            return false;
        }
        final m6d k0 = this.K0;
        final z02 z02 = (z02)o;
        return e0e.a((Object)k0, (Object)z02.K0) && hud.b(this.L0, z02.L0) && nud.a(this.M0, z02.M0) && this.N0 == z02.N0;
    }
    
    public final long h() {
        return shw.Z0(this.O0);
    }
    
    public final int hashCode() {
        final int hashCode = this.K0.hashCode();
        final long l0 = this.L0;
        final hud$a companion = hud.Companion;
        return (nud.c(this.M0) + (hashCode * 31 + (int)(l0 ^ l0 >>> 32)) * 31) * 31 + this.N0;
    }
    
    public final void j(final wd9 wd9) {
        e0e.f((Object)wd9, "<this>");
        vd9.d(wd9, this.K0, this.L0, this.M0, 0L, shw.f(jb2.B0(aeq.d(wd9.c())), jb2.B0(aeq.b(wd9.c()))), this.P0, null, this.Q0, 0, this.N0, 328, null);
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("BitmapPainter(image=");
        f.append(this.K0);
        f.append(", srcOffset=");
        f.append((Object)hud.d(this.L0));
        f.append(", srcSize=");
        f.append((Object)nud.d(this.M0));
        f.append(", filterQuality=");
        final int n0 = this.N0;
        final int n2 = 0;
        String s;
        if (n0 == 0) {
            s = "None";
        }
        else if (n0 == 1) {
            s = "Low";
        }
        else if (n0 == 2) {
            s = "Medium";
        }
        else {
            int n3 = n2;
            if (n0 == 3) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "High";
            }
            else {
                s = "Unknown";
            }
        }
        f.append((Object)s);
        f.append(')');
        return f.toString();
    }
}
