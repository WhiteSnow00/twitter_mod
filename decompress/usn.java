import android.app.Dialog;
import android.content.Context;
import android.app.Activity;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class usn
{
    public final UserIdentifier a;
    public final Activity b;
    public final obi<?> c;
    
    public usn(final UserIdentifier a, final Activity b, final obi<?> c) {
        czd.f((Object)a, "userIdentifier");
        czd.f((Object)b, "activity");
        czd.f((Object)c, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        if (djo.R("welcome_dialog_consumption", this.a)) {
            ((Dialog)new rjo((Context)this.b, wqn.D0, (asq)null, (obi)this.c, 4)).show();
        }
        else {
            final UserIdentifier a = this.a;
            czd.f((Object)a, "userIdentifier");
            final fmv b = asa.b();
            int n = 0;
            if (b.b("android_audio_room_listener_nux_enabled", false)) {
                n = n;
                if (djo.R("listeners_dialog_space", a)) {
                    n = 1;
                }
            }
            if (n != 0) {
                ((Dialog)new bqn((Context)this.b, (obi)this.c)).show();
            }
        }
    }
}
