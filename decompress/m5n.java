import android.app.Dialog;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public m5n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        final wg6 d0 = wg6.D0;
        czd.f((Object)t6n, "$this$distinct");
        final l1n d2 = this.D0;
        final boolean m = t6n.M;
        d2.e2 = m;
        boolean b = true;
        d2.r1.setShouldDisplayIcon(m && t6n.c == d0 && !t6n.n);
        if (t6n.m == wqn.D0 && t6n.c == d0 && t6n.M) {
            final UserIdentifier j0 = this.D0.J0;
            final djo a = djo.a;
            czd.f((Object)j0, "userIdentifier");
            if (!djo.D() || !asa.b().b("android_audio_room_recording_nux_enabled", false) || !djo.R("enter_infinite_recording_space", j0)) {
                b = false;
            }
            if (b && !t6n.W) {
                final l1n d3 = this.D0;
                Objects.requireNonNull(d3);
                ((Dialog)new wwn((Context)d3.E0, false)).show();
            }
        }
        return fzv.a;
    }
}
