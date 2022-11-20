import com.twitter.android.av.video.BroadcastFullscreenContentViewResult;
import android.content.Context;
import com.twitter.android.av.video.BroadcastFullscreenContentViewArgs;
import com.twitter.android.av.video.TwitterMediaPlayerArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zh2 extends t3 implements n5q
{
    public final w4 Y0;
    public final boolean Z0;
    
    public zh2(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final i1 i1, final TwitterMediaPlayerArgs twitterMediaPlayerArgs, final w4 y0, final e1x e1x, final p83 p25, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, i1, twitterMediaPlayerArgs, y0, e1x, p25, t8p);
        this.Y0 = y0;
        final boolean fromEventsTimeline = ((BroadcastFullscreenContentViewArgs)twitterMediaPlayerArgs).getFromEventsTimeline();
        this.Z0 = fromEventsTimeline;
        if (fromEventsTimeline) {
            super.X0.a = new pzt(new ozt(2130772018, 0), null);
        }
    }
    
    public final i2x W4(final i1 i1, final w4 w4) {
        final cnb e0 = ((u9)this).E0;
        Object o;
        if (i1.getType() == 8) {
            o = c9y.G0;
        }
        else {
            o = s6x.a;
        }
        return (i2x)new q32((Context)e0, w4, (r6x)o);
    }
    
    public final boolean j() {
        if (this.Z0) {
            super.X0.a = new pzt(new ozt(2130772018, 2130772068), null);
        }
        ((u9)this).F0.c((bn6)new BroadcastFullscreenContentViewResult(this.Y0.b.m1));
        return true;
    }
    
    public final void o3() {
    }
    
    public final void q3() {
        super.X0.a = new pzt(null, new ozt(2130772018, 2130772021));
        ((vbv)this).R0.j();
    }
}
