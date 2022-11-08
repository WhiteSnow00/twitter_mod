import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfb
{
    public static final nll<pfb> a;
    
    static {
        a = ri4.Q((otb)mfb$a.C0);
    }
    
    public static final jkh a(final jkh jkh, final rtb<? super kfb, oyv> rtb) {
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)rtb, "scope");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E(new pfb((rtb)rtb));
    }
    
    public static final void b(final efb efb) {
        zzd.f((Object)efb, "<this>");
        final vmi o0 = efb.O0;
        if (o0 == null) {
            return;
        }
        final lfb m0 = efb.M0;
        zzd.f((Object)m0, "<this>");
        m0.a = true;
        Objects.requireNonNull(rfb.Companion);
        final rfb b = rfb.b;
        m0.d(b);
        m0.c = b;
        m0.d = b;
        m0.e = b;
        m0.f = b;
        m0.g = b;
        m0.h = b;
        m0.i = b;
        m0.b((rtb<? super teb, rfb>)nfb.C0);
        m0.c((rtb<? super teb, rfb>)ofb.C0);
        final uqj j0 = o0.I0.J0;
        if (j0 != null) {
            final xqj snapshotObserver = j0.getSnapshotObserver();
            if (snapshotObserver != null) {
                Objects.requireNonNull(efb.Companion);
                final efb$b companion = efb.Companion;
                snapshotObserver.d(efb, (rtb<? super efb, oyv>)efb.S0, (otb<oyv>)new mfb$b(efb));
            }
        }
        final lfb m2 = efb.M0;
        zzd.f((Object)m2, "properties");
        if (m2.a) {
            yfb.a(efb);
        }
        else {
            yfb.d(efb);
        }
    }
}
