import android.os.SystemClock;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rez implements Runnable
{
    public final int F0;
    public final long G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    
    public rez(final ahz k0, final String h0, final String i0, final Object j0, final long g0) {
        this.F0 = 0;
        this.K0 = k0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.G0 = g0;
    }
    
    public rez(final isa h0, final long g0, final List i0, final List j0, final List k0) {
        this.F0 = 1;
        this.H0 = h0;
        this.G0 = g0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final isa isa = (isa)this.H0;
                final long g0 = this.G0;
                final List list = (List)this.I0;
                final List list2 = (List)this.J0;
                final List list3 = (List)this.K0;
                Objects.requireNonNull(isa);
                final long n = g0 / 3L;
                long min = 0L;
                int i = 0;
                while (i < 3) {
                    min = Math.min(g0, min + n);
                    isa.m(2, 0, Long.valueOf(min), Long.valueOf(g0), (List)null, (Integer)null, (List)null);
                    SystemClock.sleep(isa.o);
                    final n3r g2 = isa.g();
                    if (g2.h() != 9 && g2.h() != 7) {
                        if (g2.h() != 6) {
                            ++i;
                            continue;
                        }
                    }
                    return;
                }
                isa.h.execute((Runnable)new cyy(isa, list, list2, list3, g0));
                return;
            }
            case 0: {
                ((ahz)this.K0).D((String)this.H0, (String)this.I0, this.J0, this.G0);
            }
        }
    }
}
