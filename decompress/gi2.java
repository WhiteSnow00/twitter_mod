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

public final class gi2 extends q3 implements v4q
{
    public final u4 X0;
    public final boolean Y0;
    
    public gi2(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final i1 i1, final TwitterMediaPlayerArgs twitterMediaPlayerArgs, final u4 x0, final k0x k0x, final w83 w83, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, i1, twitterMediaPlayerArgs, x0, k0x, w83, a8p);
        this.X0 = x0;
        final boolean fromEventsTimeline = ((BroadcastFullscreenContentViewArgs)twitterMediaPlayerArgs).getFromEventsTimeline();
        this.Y0 = fromEventsTimeline;
        if (fromEventsTimeline) {
            super.W0.a = new zyt(new yyt(2130772018, 0), null);
        }
    }
    
    public final p1x W4(final i1 i1, final u4 u4) {
        final gob d0 = ((x9)this).D0;
        Object o;
        if (i1.getType() == 8) {
            o = tdy.H0;
        }
        else {
            o = y5x.a;
        }
        return (p1x)new w32((Context)d0, u4, (x5x)o);
    }
    
    public final boolean j() {
        if (this.Y0) {
            super.W0.a = new zyt(new yyt(2130772018, 2130772068), null);
        }
        ((x9)this).E0.c((vn6)new BroadcastFullscreenContentViewResult(this.X0.b.l1));
        return true;
    }
    
    public final void o3() {
    }
    
    public final void q3() {
        super.W0.a = new zyt(null, new yyt(2130772018, 2130772021));
        ((abv)this).Q0.j();
    }
}
