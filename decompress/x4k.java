import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x4k implements rk6
{
    public final int F0;
    public final i5k G0;
    
    public x4k(final i5k g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                this.G0.K0.setDisplayCutoutTopPx(((u6m)o).b);
                return;
            }
            case 1: {
                final i5k g0 = this.G0;
                final kni kni = (kni)o;
                g0.z2 = null;
                g0.A2 = null;
                g0.P2 = false;
                g0.g1.q();
                return;
            }
            case 0: {
                final i5k g2 = this.G0;
                final rwc rwc = (rwc)o;
                Objects.requireNonNull(g2);
                if (rwc.a.m0() != null) {
                    if (g2.r2 != null) {
                        if (rwc.a.m0() != null) {
                            if (g2.r2 != null) {
                                final int ordinal = ((Enum)rwc.b).ordinal();
                                if (ordinal == 5 || ordinal == 6) {
                                    g2.P0.c(rwc.a);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
