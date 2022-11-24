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

public final class hxb extends kcv implements rn, qx0, jxb$a, lxb$a, lxb$b
{
    public final rrg Z0;
    public final cxw a1;
    
    public hxb(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final GalleryGridContentViewArgs galleryGridContentViewArgs, final kcm kcm, final fda<fo> fda2, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final cxw videoAllowed = galleryGridContentViewArgs.getVideoAllowed();
        this.a1 = videoAllowed;
        final int cameraInitiator = galleryGridContentViewArgs.getCameraInitiator();
        final boolean disableNonGifItems = galleryGridContentViewArgs.getDisableNonGifItems();
        final String scribeSection = galleryGridContentViewArgs.getScribeSection();
        EnumSet set;
        if (videoAllowed instanceof cxw$d) {
            set = e2h.Q0;
        }
        else {
            set = e2h.P0;
        }
        final rrg z0 = new rrg((Context)dob, (rn)this, scribeSection, set, userIdentifier, k9x, kcm, cameraInitiator);
        this.Z0 = z0;
        final sxb o2 = new sxb((Activity)dob, z0, (qx0)this, videoAllowed);
        jxb jxb;
        if ((jxb = (jxb)dob.P().H("gallery")) == null) {
            jxb = new jxb();
            final p p23 = dob.P();
            final a a = new a(p23);
            a.e(2131429301, (Fragment)jxb, "gallery", 1);
            a.c();
            p23.D();
        }
        final int[] a2 = mxb.a;
        final cwd onClickListener = new cwd((Object)z0, (Object)this, (Object)this, 4);
        final boolean b = cameraInitiator == 3 || cameraInitiator == 5;
        final boolean b2 = cameraInitiator != 4;
        final ojf$a ojf$a = new ojf$a(3);
        for (int i = 0; i < 3; ++i) {
            final int n = a2[i];
            final kxb kxb = null;
            Object a3;
            if (n != 0) {
                a3 = kxb;
                if (n != 1) {
                    if (n != 2) {
                        a3 = kxb;
                    }
                    else {
                        a3 = kxb;
                        if (b) {
                            a3 = new kxb((Context)dob, (AttributeSet)null);
                            ((View)a3).setId(2131429305);
                            ((View)a3).setContentDescription((CharSequence)((Context)dob).getString(2131952310));
                            ((kxb)a3).setIcon(ie9.a((Context)dob, 2130969729, 2131232236));
                            ((View)a3).setBackgroundColor(b1b.B((Context)dob, 2130969036));
                        }
                    }
                }
            }
            else {
                a3 = kxb;
                if (b2) {
                    a3 = lxb.a((Context)dob);
                }
            }
            if (a3 != null) {
                ((View)a3).setOnClickListener((View$OnClickListener)onClickListener);
                ((ojf)ojf$a).p(a3);
            }
        }
        final List list = (List)((z4j)ojf$a).e();
        jxb.b2 = list.toArray(new View[list.size()]);
        jxb.u2 = (videoAllowed != cxw$b.b);
        final gxb z2 = jxb.Z1;
        if (z2 == null) {
            jxb.j2 = disableNonGifItems;
        }
        else if (z2.X0 != disableNonGifItems) {
            z2.X0 = disableNonGifItems;
            z2.p();
        }
        jxb.e2 = (jxb$a)this;
        jxb.o2 = (d0h)o2;
        final ViewGroup viewGroup = (ViewGroup)((sml$a$b)this.c()).G0.findViewById(2131429300);
        viewGroup.addView(jxb.i2(viewGroup), 0);
        f.i(fda2.v0(), (fa3)new es2((Object)this, 10));
    }
    
    public final boolean L3(final prg prg) {
        return true;
    }
    
    public final void d0(final Intent intent, final int n) {
        super.G0.startActivityForResult(intent, n, (Bundle)null);
    }
    
    public final void g1() {
        this.Z0.k();
    }
    
    public final void p1(final cy0 cy0) {
        final prg d = cy0.d();
        if (d == null) {
            return;
        }
        super.H0.c((ho6)new GalleryGridMediaAttachedResult(d));
    }
    
    public final void u3(final jx9 jx9, final View view) {
        this.Z0.d(jx9, (qx0)this);
    }
    
    public final void v1() {
        this.Z0.j(this.a1, false);
    }
}
