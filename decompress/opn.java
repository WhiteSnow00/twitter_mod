import com.twitter.analytics.tracking.a;
import android.os.Parcelable;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opn implements vro<opn.opn$a>
{
    public final grq C0;
    public String D0;
    
    public opn(final grq c0, final yl1 yl1, final sso sso, final ibm ibm) {
        zzd.f((Object)c0, "spacesLauncher");
        zzd.f((Object)sso, "savedStateHandler");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        sso.a((vro)this);
        final gn gn = new gn() {
            public final /* synthetic */ opn a;
            
            public final void a(final Activity activity, final Intent intent) {
                zzd.f((Object)activity, "activity");
                zzd.f((Object)intent, "newIntent");
                this.a.a(intent);
            }
        };
        yl1.L((gn)gn);
        final Intent intent = ((Activity)yl1).getIntent();
        zzd.e((Object)intent, "baseFragmentActivity.intent");
        this.a(intent);
        ibm.i((rj)new pj4((Object)yl1, (Object)gn, 9));
    }
    
    @Override
    public final Parcelable C3() {
        return (Parcelable)new opn.opn$a(this.D0);
    }
    
    public final void a(final Intent intent) {
        final String d0 = (String)yvj.b(((dj1)new vfg(intent)).mIntent, "audio_space_id", (alp)hx6.f);
        if (d0 == null) {
            return;
        }
        if (zzd.a((Object)this.D0, (Object)d0) && zzd.a((Object)this.C0.s(), (Object)d0)) {
            return;
        }
        this.D0 = d0;
        yqh.q(this.C0, d0, true, sba.Companion.a((taa)taa.a, "audiospace_url"), !a.d(intent) && oio.o(), false, 16, (Object)null);
    }
    
    @Override
    public final String getId() {
        return opn.class.getName();
    }
    
    @Override
    public final void v(final Parcelable parcelable) {
        this.D0 = ((opn.opn$a)parcelable).C0;
    }
}
