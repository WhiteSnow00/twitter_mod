// 
// Decompiled by Procyon v0.6.0
// 

public final class l9n extends gue implements rtb<y9n, oyv>
{
    public final /* synthetic */ o8n C0;
    
    public l9n(final o8n c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final y9n y9n = (y9n)o;
        zzd.f((Object)y9n, "$this$distinct");
        if (y9n.B != null) {
            final o8n c0 = this.C0;
            final oio a = oio.a;
            if (dta.b().b("android_audio_ukraine_misinfo_label_enabled", false)) {
                c0.K0.a(c0.e1, y9n.B, 0L, (olu$a)new klu$a(), c0.G0, false, false);
            }
        }
        return oyv.a;
    }
}
