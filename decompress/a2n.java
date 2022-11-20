// 
// Decompiled by Procyon v0.6.0
// 

public final class a2n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public a2n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        if (t6n.Y != null) {
            final l1n d0 = this.D0;
            final djo a = djo.a;
            if (asa.b().b("android_audio_ukraine_misinfo_label_enabled", false)) {
                d0.W0.a(d0.T1, t6n.Y, 0L, (imu$a)new emu$a(), d0.I0, false, false);
            }
        }
        return fzv.a;
    }
}
