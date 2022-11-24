// 
// Decompiled by Procyon v0.6.0
// 

public final class ziy implements Runnable
{
    public final String F0;
    public final long G0;
    public final hty H0;
    
    public ziy(final hty h0, final String f0, final long g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        final hty h0 = this.H0;
        final String f0 = this.F0;
        final long g0 = this.G0;
        ((wxy)h0).g();
        iuk.z(f0);
        final Integer n = (Integer)h0.H0.getOrDefault((Object)f0, (Object)null);
        if (n != null) {
            final rhz n2 = ((ocz)h0).F0.y().n(false);
            final int n3 = n - 1;
            if (n3 == 0) {
                h0.H0.remove((Object)f0);
                final Long n4 = (Long)h0.G0.getOrDefault((Object)f0, (Object)null);
                if (n4 == null) {
                    ((ocz)h0).F0.b().K0.a("First ad unit exposure time was never set");
                }
                else {
                    final long longValue = n4;
                    h0.G0.remove((Object)f0);
                    h0.l(f0, g0 - longValue, n2);
                }
                if (h0.H0.isEmpty()) {
                    final long i0 = h0.I0;
                    if (i0 == 0L) {
                        ((ocz)h0).F0.b().K0.a("First ad exposure time was never set");
                    }
                    else {
                        h0.k(g0 - i0, n2);
                        h0.I0 = 0L;
                    }
                }
            }
            else {
                h0.H0.put((Object)f0, (Object)n3);
            }
        }
        else {
            ((ocz)h0).F0.b().K0.b("Call to endAdUnitExposure for unknown ad unit id", (Object)f0);
        }
    }
}
