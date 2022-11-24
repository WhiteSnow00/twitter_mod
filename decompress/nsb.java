import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nsb implements hub
{
    public final int F0;
    public final Object G0;
    
    public nsb(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final int f0 = this.F0;
        boolean b = true;
        final boolean b2 = true;
        switch (f0) {
            default: {
                final lv9 lv9 = (lv9)this.G0;
                final xzu xzu = (xzu)o;
                final Integer n = (Integer)o2;
                if (!lv9.l(xzu.a.F0) || lv9.r((vxs)xzu.f)) {
                    b = false;
                }
                return b;
            }
            case 0: {
                final osb osb = (osb)this.G0;
                final View view = (View)o;
                final Integer n2 = (Integer)o2;
                Objects.requireNonNull(osb);
                if (n2 != null) {
                    boolean b3;
                    if (n2 != ((qsb)((tj1)osb).F0).N0) {
                        if (ma7.A()) {
                            ((qsb)((tj1)osb).F0).q0((int)n2, false);
                        }
                        else {
                            final qsb qsb = (qsb)((tj1)osb).F0;
                            final int intValue = n2;
                            qsb.L0.set(false);
                            qsb.H0.z0(intValue);
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    if (b3) {
                        return b2;
                    }
                }
                return false;
            }
        }
    }
}
