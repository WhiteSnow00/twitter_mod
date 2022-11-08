import android.app.Dialog;
import android.content.Context;
import android.app.Activity;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsn
{
    public final UserIdentifier a;
    public final Activity b;
    public final mbi<?> c;
    
    public fsn(final UserIdentifier a, final Activity b, final mbi<?> c) {
        zzd.f((Object)a, "userIdentifier");
        zzd.f((Object)b, "activity");
        zzd.f((Object)c, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        if (oio.R("welcome_dialog_consumption", this.a)) {
            ((Dialog)new cjo((Context)this.b, hqn.C0, (grq)null, (mbi)this.c, 4)).show();
        }
        else {
            final UserIdentifier a = this.a;
            zzd.f((Object)a, "userIdentifier");
            final hlv b = dta.b();
            int n = 0;
            if (b.b("android_audio_room_listener_nux_enabled", false)) {
                n = n;
                if (oio.R("listeners_dialog_space", a)) {
                    n = 1;
                }
            }
            if (n != 0) {
                ((Dialog)new npn((Context)this.b, (mbi)this.c)).show();
            }
        }
    }
}
