import com.twitter.media.av.ui.control.VideoControlView;
import com.twitter.app.users.UsersContentViewProvider;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import android.view.MenuItem;
import java.util.concurrent.ExecutorService;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.j;
import android.content.ClipData;
import android.content.ClipData$Item;
import android.util.Log;
import android.os.Parcelable;
import android.view.inputmethod.InputContentInfo;
import android.os.Build$VERSION;
import android.view.View;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.Objects;
import android.database.Cursor;
import com.twitter.ui.autocomplete.SuggestionEditText$g;
import com.twitter.ui.autocomplete.SuggestionEditText$a;
import com.twitter.android.media.imageeditor.stickers.StickerSelectorView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qqd implements c, too$a, ymf$b, ac8$a, fo6, o41$b, xhl$a, fvh$a, f3x$a, ytk, b, xqc.a, y4r.a, zei$b, ny5, gcq, SuggestionEditText$a, ah, SuggestionEditText$g, mrg$a, t3x$a, r2$b, o5$a, srk$b
{
    public final int D0;
    public final Object E0;
    
    public qqd(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void a(final String s, final String s2) {
        final qjg qjg = (qjg)this.E0;
        czd.f((Object)qjg, "$this_apply");
        qjg.w((Object)s, (Object)s2);
    }
    
    public final Object apply(final Object o) {
        final too too = (too)this.E0;
        final Cursor cursor = (Cursor)o;
        final t3a i0 = too.I0;
        Objects.requireNonNull(too);
        while (cursor.moveToNext()) {
            too.d((long)cursor.getInt(0), c8g$a.I0, cursor.getString(1));
        }
        return null;
    }
    
    public final boolean b(final int n, final KeyEvent keyEvent) {
        final i6j$a i6j$a = (i6j$a)this.E0;
        if (!i6j$a.isDisposed() && n == 4 && keyEvent.getAction() == 1) {
            i6j$a.onNext((Object)tmi.a);
        }
        return false;
    }
    
    @Override
    public final boolean c(final sqd sqd, final int n, Bundle bundle) {
        final View view = (View)this.E0;
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        Bundle extras = bundle;
        if (sdk_INT >= 25) {
            extras = bundle;
            if ((n & 0x1) != 0x0) {
                try {
                    sqd.a.a();
                    final InputContentInfo inputContentInfo = (InputContentInfo)sqd.a.b();
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    else {
                        bundle = new Bundle(bundle);
                    }
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)inputContentInfo);
                    extras = bundle;
                }
                catch (final Exception ex) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", (Throwable)ex);
                    return b;
                }
            }
        }
        final ClipData clipData = new ClipData(sqd.a.getDescription(), new ClipData$Item(sqd.a.c()));
        Object o;
        if (sdk_INT >= 31) {
            o = new jl6$a(clipData, 2);
        }
        else {
            o = new jl6$c(clipData, 2);
        }
        ((jl6.b)o).h(sqd.a.j());
        ((jl6.b)o).setExtras(extras);
        if (j6x.u(view, ((jl6.b)o).b()) == null) {
            b = true;
        }
        return b;
    }
    
    public final void e(final z4r z4r, final atm atm) {
        final qdm qdm = (qdm)this.E0;
        Objects.requireNonNull(qdm);
        if (z4r == null) {
            qdm.f(new t1h((xrc)new t1h((jvg)null, 1005, new Exception("no response")), (jvg)null, qdm.J0));
        }
        else {
            xrc xrc = atm.d();
            if (z4r.a == 2) {
                final v4r e = z4r.e;
                String c;
                if (e != null && ikr.g((CharSequence)e.c)) {
                    c = z4r.e.c;
                }
                else {
                    c = "Error: received failure response";
                }
                xrc = xrc.c(1005, c);
                atm.a(xrc);
            }
            else if (z4r.b == 0L) {
                xrc = xrc.c(1006, "Error: no media id");
                atm.a(xrc);
            }
            if (xrc.b) {
                qdm.J0 = z4r.b;
                ((ln1)qdm).d(5000);
                qdm.h(0);
            }
            else {
                qdm.f(new t1h(xrc, (jvg)null, qdm.J0));
            }
        }
    }
    
    public final void f(final j j) {
        final g00 g00 = (g00)this.E0;
        czd.f((Object)g00, "$listener");
        czd.f((Object)j, "it");
        j.r0(g00);
    }
    
    public final void g(final w.c c) {
        final PlaybackException ex = (PlaybackException)this.E0;
        czd.f((Object)ex, "$error");
        czd.f((Object)c, "it");
        c.p0(ex);
    }
    
    public final void h(final Object o, final l1b l1b) {
        ((w.c)o).B0(((k)this.E0).I0, new w.b(l1b));
    }
    
    public final Object i(final ubs ubs) {
        final zbs zbs = (zbs)this.E0;
        final ExecutorService a = jnw.a;
        if (ubs.s()) {
            zbs.d(ubs.o());
        }
        else {
            final Exception n = ubs.n();
            Objects.requireNonNull(n);
            zbs.c(n);
        }
        return null;
    }
    
    public final void j() {
        final xgd xgd = (xgd)this.E0;
        if (g63.I(xgd.H0)) {
            xgd.D0.h();
        }
    }
    
    public final void k(final g3 l0) {
        switch (this.D0) {
            default: {
                final z4x z4x = (z4x)this.E0;
                z4x.L0 = l0;
                final kvj m0 = z4x.M0;
                if (m0 != null) {
                    final Object a = ((m2j)m0).a;
                    jee.l(a);
                    if (l0.equals(a)) {
                        final g3 l2 = z4x.L0;
                        final Object b = ((m2j)z4x.M0).b;
                        jee.l(b);
                        z4x.e(l2, (int)b);
                        z4x.M0 = null;
                    }
                }
                final hgq d0 = z4x.E0.D0;
                final int d2 = z4x.I0.d(l0);
                if (((y3x)d0).G0 != d2) {
                    ((y3x)d0).G0 = d2;
                    ((y3x)d0).a();
                }
                return;
            }
            case 22: {
                final i7f i7f = (i7f)this.E0;
                Objects.requireNonNull(i7f);
                if (!g63.I(l0)) {
                    final long c1 = nza.c1(l0);
                    ((View)i7f.Q0).setAlpha(0.0f);
                    final mnk r0 = i7f.R0;
                    if (!r0.c) {
                        r0.c = true;
                        r0.a();
                    }
                    i7f.G0.w(aof.f(i7f.D0), Long.valueOf(c1));
                    i7f.G0.d();
                }
            }
        }
    }
    
    public final boolean m(final View view) {
        final ydk ydk = (ydk)this.E0;
        czd.f((Object)ydk, "this$0");
        czd.f((Object)view, "<anonymous parameter 0>");
        ydk.O0.onNext((Object)wdk$a.a);
        return true;
    }
    
    public final void n(final ibq ibq) {
        final m87 m87 = (m87)this.E0;
        Objects.requireNonNull(m87);
        final l87 l87 = new l87(m87, ibq);
        ((paq$a)ibq).c((nf3)new k87((Object)m87, (Object)l87, 0));
        m87.a.W((o5g)l87);
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        final wog wog = (wog)this.E0;
        czd.f((Object)wog, "$emitter");
        ((nog$a)wog).b((Object)fzv.a);
        return true;
    }
    
    public final void p(final c6 c6) {
        final r71 r71 = (r71)this.E0;
        if (r71.I0) {
            final AutoPlayBadgeView e0 = r71.E0;
            if (e0 != null) {
                e0.b(c6);
            }
        }
    }
    
    public final void r(final Object o, final View view) {
        ((UsersContentViewProvider)this.E0).k1((sbw)o, view);
    }
    
    public final void s(final g3 g3, final edq edq) {
        final w7f w7f = (w7f)this.E0;
        ((View)w7f.I0).requestLayout();
        final VideoControlView e0 = w7f.E0;
        if (e0 != null) {
            ((View)e0).requestLayout();
        }
    }
    
    public final void t(final boolean b) {
        final oi4 oi4 = (oi4)this.E0;
        Objects.requireNonNull(oi4);
        gwo gwo;
        if (asa.c().b("android_growth_performance_holdback_optimize_cc_chrome", false)) {
            gwo = rw0.a();
        }
        else {
            gwo = gmw.x();
        }
        rw0.d(gwo, (oj)new ii4((Object)oi4, 0));
    }
    
    public final boolean test(final Object o) {
        final int d0 = this.D0;
        boolean b = false;
        final boolean b2 = false;
        switch (d0) {
            default: {
                final ui1 ui1 = (ui1)this.E0;
                final Long n = (Long)o;
                return ui1.i();
            }
            case 17: {
                final nhh nhh = (nhh)this.E0;
                final Boolean b3 = (Boolean)o;
                if (nhh.G0.i() != mbi$a.E0) {
                    final boolean b4 = b2;
                    if (nhh.G0.i() != mbi$a.D0) {
                        return b4;
                    }
                }
                return true;
            }
            case 10: {
                final psf psf = (psf)this.E0;
                final Long n2 = (Long)o;
                if (psf.k != null) {
                    b = true;
                }
                return b;
            }
        }
    }
}
