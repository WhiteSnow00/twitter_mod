// 
// Decompiled by Procyon v0.6.0
// 

public final class fiy implements Runnable
{
    public final String D0;
    public final long E0;
    public final ksy F0;
    
    public fiy(final ksy f0, final String d0, final long e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final ksy f0 = this.F0;
        final String d0 = this.D0;
        final long e0 = this.E0;
        ((axy)f0).g();
        eli.n(d0);
        final Integer n = ((d8q<K, Integer>)f0.F0).getOrDefault(d0, null);
        if (n != null) {
            final sgz n2 = ((pbz)f0).D0.y().n(false);
            final int n3 = n - 1;
            if (n3 == 0) {
                ((d8q<Object, Object>)f0.F0).remove(d0);
                final Long n4 = ((d8q<K, Long>)f0.E0).getOrDefault(d0, null);
                if (n4 == null) {
                    ((pbz)f0).D0.b().I0.a("First ad unit exposure time was never set");
                }
                else {
                    final long longValue = n4;
                    ((d8q<Object, Object>)f0.E0).remove(d0);
                    f0.l(d0, e0 - longValue, n2);
                }
                if (((d8q)f0.F0).isEmpty()) {
                    final long g0 = f0.G0;
                    if (g0 == 0L) {
                        ((pbz)f0).D0.b().I0.a("First ad exposure time was never set");
                    }
                    else {
                        f0.k(e0 - g0, n2);
                        f0.G0 = 0L;
                    }
                }
            }
            else {
                ((d8q<String, Integer>)f0.F0).put(d0, Integer.valueOf(n3));
            }
        }
        else {
            ((pbz)f0).D0.b().I0.b("Call to endAdUnitExposure for unknown ad unit id", (Object)d0);
        }
    }
}
