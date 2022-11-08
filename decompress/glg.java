import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glg implements mwm<gxd, pwm>
{
    public final Resources C0;
    public final hih D0;
    
    public glg(final Resources c0, final hih d0) {
        zzd.f((Object)c0, "resources");
        zzd.f((Object)d0, "modelReader");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final String a(final gxd gxd) {
        final String string = this.C0.getString(2131957254, new Object[] { gxd.c });
        zzd.e((Object)string, "resources.getString(\n   \u2026\n        topic.name\n    )");
        return string;
    }
    
    @Override
    public final uov c(final Object o) {
        final gxd gxd = (gxd)o;
        return uov.E0;
    }
    
    @Override
    public final String d(final Object o) {
        final gxd gxd = (gxd)o;
        final String string = this.C0.getString(2131957255);
        zzd.e((Object)string, "resources.getString(\n   \u2026rested_confirmation\n    )");
        return string;
    }
    
    @Override
    public final gvj e(final nwm nwm) {
        final pwm pwm = (pwm)nwm;
        zzd.f((Object)pwm, "<this>");
        final hih d0 = this.D0;
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).s(tsl.b("topic_id", (Object)pwm.b));
        final gxd b = (gxd)d0.d((Class)fxd.class, (zrl)((h4j)zrl$a).e(), (Class)gxd.class);
        final pwm$a pwm$a = new pwm$a();
        pwm$a.a = pwm.b;
        pwm$a.b = b;
        return new gvj(((h4j)pwm$a).e(), (Object)b);
    }
}
