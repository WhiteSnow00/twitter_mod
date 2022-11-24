import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import com.twitter.ui.widget.touchintercept.TouchInterceptingFrameLayout;
import com.twitter.android.av.video.TwitterMediaPlayerArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class n3 extends kcv
{
    public final h93 Z0;
    
    public n3(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final h1 h1, final TwitterMediaPlayerArgs twitterMediaPlayerArgs, final q4 q4, final v1x externalChromeView, final h93 z0, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = z0;
        if (twitterMediaPlayerArgs.getFromDock()) {
            z0.a = new i0u(new h0u(2130772018, 0), (h0u)null);
        }
        final int type = h1.getType();
        if (type != 1 && type != 0 && type != 7 && type != 4 && type != 2 && type != 3 && type != 8) {
            ehk.c().c(2131954970, 1);
            super.T0.k();
            return;
        }
        final TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout)((sml$a$b)this.c()).G0;
        if (h1.getType() != 8) {
            final m2s touchInterceptListener = new m2s((Context)dob, false);
            touchInterceptListener.G0 = (m2s$c)new m3(this);
            touchInterceptingFrameLayout.setTouchInterceptListener((xut)touchInterceptListener);
        }
        final z2x w4 = this.W4(h1, q4);
        ((View)w4).setId(2131427730);
        ((ViewGroup)touchInterceptingFrameLayout).addView((View)w4, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        if (externalChromeView != null) {
            ((ViewGroup)touchInterceptingFrameLayout).addView(externalChromeView.getView());
            w4.setExternalChromeView(externalChromeView);
            externalChromeView.e(q4);
        }
    }
    
    public z2x W4(final h1 h1, final q4 q4) {
        final dob g0 = super.G0;
        e51 e51;
        if (h1.getType() == 8) {
            e51 = tkr.I0;
        }
        else {
            e51 = k7x.a;
        }
        return new z2x((Context)g0, q4, (j7x)e51, ix.l());
    }
    
    @Override
    public boolean k() {
        this.D4();
        return true;
    }
}
