// 
// Decompiled by Procyon v0.6.0
// 

public final class bz
{
    public bz(final ibm ibm, final oiq oiq, final wy wy, final dz dz) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)oiq, "socialInAppMessageHostObserver");
        zzd.f((Object)wy, "notificationSupplier");
        zzd.f((Object)dz, "presenter");
        final rd6 rd6 = new rd6();
        ibm.i((rj)new xqw(rd6, 12));
        rd6.d(new j29[] { oiq.a().subscribe((fk6)new oc6((rtb)new bz$a(dz), 19)), wy.a().subscribe((fk6)new xja((rtb)new bz$b(dz), 24)) });
    }
}
