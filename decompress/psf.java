import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import java.io.File;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.net.Uri;
import java.util.Map;
import android.content.BroadcastReceiver;
import com.twitter.timeline.TimelineBottomPagingPolicy;
import android.content.ContextWrapper;
import com.twitter.util.user.InvalidUserIdentifierException;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psf implements sj
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public psf(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void run() {
        final int f0 = this.F0;
        final File file = null;
        final int n = 1;
        switch (f0) {
            default: {
                final mfw mfw = (mfw)this.G0;
                final UserIdentifier userIdentifier = (UserIdentifier)this.H0;
                Objects.requireNonNull(mfw);
                fj1.f();
                Label_1230: {
                    if (mfw.b().equals((Object)userIdentifier)) {
                        while (true) {
                            for (final UserIdentifier logged_OUT : mfw.d.b) {
                                if (!userIdentifier.equals((Object)logged_OUT)) {
                                    mfw.u(logged_OUT);
                                    break Label_1230;
                                }
                            }
                            UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
                            continue;
                        }
                    }
                }
                final mfw$a d = mfw.d;
                if (d.a(userIdentifier)) {
                    d.a.remove((Object)userIdentifier);
                    d.b.remove(userIdentifier);
                    mfw.c.onNext((Object)userIdentifier);
                    return;
                }
                throw new InvalidUserIdentifierException(userIdentifier);
            }
            case 14: {
                final v60 v60 = (v60)this.G0;
                final UserIdentifier userIdentifier2 = (UserIdentifier)this.H0;
                Objects.requireNonNull(v60);
                userIdentifier2.getId();
                ((fa)v60).e();
                return;
            }
            case 13: {
                f5j.b((pml)this.G0, (String)this.H0);
                return;
            }
            case 12: {
                ((ContextWrapper)this.H0).unregisterReceiver((BroadcastReceiver)((TimelineBottomPagingPolicy)this.G0).d);
                return;
            }
            case 11: {
                final wtt wtt = (wtt)this.G0;
                final vxs vxs = (vxs)this.H0;
                e0e.f((Object)wtt, "this$0");
                e0e.f((Object)vxs, "$timelineItem");
                wtt.k(vxs, true);
                return;
            }
            case 10: {
                final wnq wnq = (wnq)this.G0;
                final wtn$b wtn$b = (wtn$b)this.H0;
                e0e.f((Object)wnq, "this$0");
                e0e.f((Object)wtn$b, "$textInfo");
                wtn.c(wnq.H0, wjt.F0, wtn$b, wnq.F0, (String)null, 2131430230, 1, 0, 72);
                return;
            }
            case 9: {
                final zl1 zl1 = (zl1)this.G0;
                final sqn$b sqn$b = (sqn$b)this.H0;
                e0e.f((Object)zl1, "$baseFragmentActivity");
                e0e.f((Object)sqn$b, "$activityCallbacks");
                final mn$a b1 = zl1.b1;
                Objects.requireNonNull(b1);
                fj1.f();
                b1.a.remove(sqn$b);
                return;
            }
            case 8: {
                final o1g$c o1g$c = (o1g$c)this.G0;
                final String s = (String)this.H0;
                synchronized (o1g$c) {
                    final int b2 = o1g$c.b - 1;
                    o1g$c.b = b2;
                    if (b2 > 0) {
                        monitorexit(o1g$c);
                    }
                    else {
                        o1g$c.c.j.f(s);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Topic ");
                        sb.append(s);
                        sb.append(" removed as no observers exist currently");
                        nag.a("LivePipeline", sb.toString());
                    }
                }
            }
            case 7: {
                final mw0 mw0 = (mw0)this.G0;
                final Map map = (Map)this.H0;
                Objects.requireNonNull(mw0);
                for (final Map.Entry<Object, V> entry : map.entrySet()) {
                    mw0.d.onNext((Object)new omv$b(entry.getKey(), (Object)entry.getValue()));
                }
                return;
            }
            case 6: {
                final x7p x7p = (x7p)this.G0;
                x7p.b.x0((vfv)this.H0, 2, x7p.a);
                return;
            }
            case 5: {
                final stb stb = (stb)this.G0;
                final btm btm = (btm)this.H0;
                e0e.f((Object)stb, "$successBlock");
                e0e.f((Object)btm, "$result");
                stb.invoke(btm.c());
                return;
            }
            case 4: {
                final bf3 bf3 = (bf3)this.G0;
                final de6 de6 = (de6)this.H0;
                final OvershootInterpolator n2 = bf3.n;
                Objects.requireNonNull(bf3);
                de6.dispose();
                bf3.j.a();
                return;
            }
            case 3: {
                ((gvs)this.G0).d((fxs)this.H0, (tn6)null);
                return;
            }
            case 2: {
                final e9d e9d = (e9d)this.G0;
                final z8d z8d = (z8d)this.H0;
                final String[] e = e9d.e;
                Objects.requireNonNull(e9d);
                final String lastPathSegment = Uri.parse(z8d.d()).getLastPathSegment();
                final dxg e2 = dxg.e();
                Objects.requireNonNull(e2);
                fj1.e();
                File file2;
                if ((file2 = e2.f(z8d.t).L(z8d)) == null) {
                    final z73 v61 = eg8.X().V(srb.a(z8d));
                    Objects.requireNonNull(urb.a());
                    final t8d t = t8d.t;
                    xd.K(t, "ImagePipelineFactory was not initialized!");
                    bya bya;
                    if (((x09)t.g()).f(v61)) {
                        bya = ((x09)t.g()).d(v61);
                    }
                    else if (((x09)t.k()).f(v61)) {
                        bya = ((x09)t.k()).d(v61);
                    }
                    else {
                        bya = null;
                    }
                    if (bya != null) {
                        file2 = bya.a;
                    }
                    else {
                        file2 = null;
                    }
                }
                Label_1005: {
                    if (file2 != null) {
                        synchronized (file2) {
                            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                            bitmapFactory$Options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(file2.getAbsolutePath(), bitmapFactory$Options);
                            final String outMimeType = bitmapFactory$Options.outMimeType;
                            if (outMimeType == null || "image/webp".equals(outMimeType)) {
                                final File a = e9d.a(z8d);
                                monitorexit(file2);
                                file2 = a;
                                break Label_1005;
                            }
                            try {
                                final File file3 = (File)e9d.a.b(new twg(e2h.J0, lastPathSegment, (String)null, 12)).b(file2, false).w((rtb)dkc.I0).e();
                                monitorexit(file2);
                                file2 = file3;
                            }
                            catch (final Exception ex) {
                                monitorexit(file2);
                                file2 = file;
                            }
                            break Label_1005;
                        }
                    }
                    file2 = e9d.a(z8d);
                }
                int n3;
                if (file2 != null) {
                    n3 = n;
                }
                else {
                    n3 = 0;
                }
                int n4;
                if (n3 != 0) {
                    n4 = 2131957379;
                }
                else {
                    n4 = 2131957378;
                }
                e9d.c.c(n4, 0);
                return;
            }
            case 1: {
                final b39 b3 = (b39)this.G0;
                final b39 b4 = (b39)this.H0;
                b3.dispose();
                b4.dispose();
                return;
            }
            case 0: {
                final qsf qsf = (qsf)this.G0;
                final rsf rsf = (rsf)this.H0;
                Objects.requireNonNull(qsf.e);
                rsf.G0.setOverlayDrawable((Drawable)null);
                rsf.l0();
                ((View)rsf.M0).setOnClickListener((View$OnClickListener)null);
                ((View)rsf.M0).setTag(2131428123, (Object)null);
            }
        }
    }
}
