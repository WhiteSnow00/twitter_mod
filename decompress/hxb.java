import com.twitter.gallerygrid.api.GalleryGridMediaAttachedResult;
import android.os.Bundle;
import androidx.fragment.app.p;
import java.util.EnumSet;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.View$OnClickListener;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.app.Activity;
import android.content.Context;
import com.twitter.gallerygrid.api.GalleryGridContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxb extends abv implements on, rx0, ixb$a, kxb$a, kxb$b
{
    public final yqg W0;
    public final uvw X0;
    
    public hxb(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final GalleryGridContentViewArgs galleryGridContentViewArgs, final ibm ibm, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        final uvw videoAllowed = galleryGridContentViewArgs.getVideoAllowed();
        this.X0 = videoAllowed;
        final int cameraInitiator = galleryGridContentViewArgs.getCameraInitiator();
        final boolean disableNonGifItems = galleryGridContentViewArgs.getDisableNonGifItems();
        final String scribeSection = galleryGridContentViewArgs.getScribeSection();
        EnumSet set;
        if (videoAllowed instanceof uvw$d) {
            set = l1h.N0;
        }
        else {
            set = l1h.M0;
        }
        final yqg w0 = new yqg((Context)gob, (on)this, scribeSection, set, userIdentifier, z7x, ibm, cameraInitiator);
        this.W0 = w0;
        final rxb l2 = new rxb((Activity)gob, w0, (rx0)this, videoAllowed);
        ixb ixb;
        if ((ixb = (ixb)gob.Q().H("gallery")) == null) {
            ixb = new ixb();
            final p q = gob.Q();
            final a a = new a(q);
            a.e(2131429300, (Fragment)ixb, "gallery", 1);
            a.c();
            q.D();
        }
        final int[] a2 = lxb.a;
        final hc2 onClickListener = new hc2((Object)w0, (Object)this, (Object)this, 4);
        final boolean b = cameraInitiator == 3 || cameraInitiator == 5;
        final boolean b2 = cameraInitiator != 4;
        final ijf$a ijf$a = new ijf$a(3);
        for (int i = 0; i < 3; ++i) {
            final int n = a2[i];
            final jxb jxb = null;
            Object a3;
            if (n != 0) {
                a3 = jxb;
                if (n != 1) {
                    if (n != 2) {
                        a3 = jxb;
                    }
                    else {
                        a3 = jxb;
                        if (b) {
                            a3 = new jxb((Context)gob, (AttributeSet)null);
                            ((View)a3).setId(2131429304);
                            ((View)a3).setContentDescription((CharSequence)((Context)gob).getString(2131952311));
                            ((jxb)a3).setIcon(xd9.a((Context)gob, 2130969729, 2131232236));
                            ((View)a3).setBackgroundColor(goz.J((Context)gob, 2130969036));
                        }
                    }
                }
            }
            else {
                a3 = jxb;
                if (b2) {
                    a3 = kxb.a((Context)gob);
                }
            }
            if (a3 != null) {
                ((View)a3).setOnClickListener((View$OnClickListener)onClickListener);
                ((ijf)ijf$a).p(a3);
            }
        }
        final List list = (List)((h4j)ijf$a).e();
        ixb.Y1 = list.toArray(new View[list.size()]);
        ixb.r2 = (videoAllowed != uvw$b.b);
        final gxb w2 = ixb.W1;
        if (w2 == null) {
            ixb.g2 = disableNonGifItems;
        }
        else if (w2.U0 != disableNonGifItems) {
            w2.U0 = disableNonGifItems;
            w2.p();
        }
        ixb.b2 = (ixb$a)this;
        ixb.l2 = (lzg)l2;
        final ViewGroup viewGroup = (ViewGroup)((tll$a$b)((x9)this).c()).D0.findViewById(2131429299);
        viewGroup.addView(ixb.i2(viewGroup), 0);
        f.i(pca2.v0(), (u93)new en((Object)this, 10));
    }
    
    public final boolean L3(final wqg wqg) {
        return true;
    }
    
    public final void e0(final Intent intent, final int n) {
        ((x9)this).D0.startActivityForResult(intent, n, (Bundle)null);
    }
    
    public final void g1() {
        this.W0.k();
    }
    
    public final void p1(final dy0 dy0) {
        final wqg d = dy0.d();
        if (d == null) {
            return;
        }
        ((x9)this).E0.c((vn6)new GalleryGridMediaAttachedResult(d));
    }
    
    public final void u3(final ww9 ww9, final View view) {
        this.W0.d(ww9, (rx0)this);
    }
    
    public final void v1() {
        this.W0.j(this.X0, false);
    }
}
