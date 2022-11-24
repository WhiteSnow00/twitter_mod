import android.app.Dialog;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e6n extends pue implements stb<l7n, vzv>
{
    public final d2n F0;
    
    public e6n(final d2n f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final l7n l7n = (l7n)o;
        final ci6 f0 = ci6.F0;
        e0e.f((Object)l7n, "$this$distinct");
        final d2n f2 = this.F0;
        final boolean m = l7n.M;
        f2.g2 = m;
        boolean b = true;
        f2.t1.setShouldDisplayIcon(m && l7n.c == f0 && !l7n.n);
        if (l7n.m == mrn.F0 && l7n.c == f0 && l7n.M) {
            final UserIdentifier l0 = this.F0.L0;
            final vjo a = vjo.a;
            e0e.f((Object)l0, "userIdentifier");
            if (!vjo.D() || !ita.b().b("android_audio_room_recording_nux_enabled", false) || !vjo.R("enter_infinite_recording_space", l0)) {
                b = false;
            }
            if (b && !l7n.W) {
                final d2n f3 = this.F0;
                Objects.requireNonNull(f3);
                ((Dialog)new oxn((Context)f3.G0, false)).show();
            }
        }
        return vzv.a;
    }
}
