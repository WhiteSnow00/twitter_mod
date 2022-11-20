import com.twitter.media.ui.image.c;
import android.app.Activity;
import android.os.BaseBundle;
import com.twitter.ui.view.RtlViewPager;
import androidx.fragment.app.p;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import android.app.Dialog;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.os.Handler;
import com.twitter.android.av.video.BroadcastFullscreenContentViewResult;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.MenuItem;
import android.view.Menu;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.concurrent.Callable;
import java.util.Objects;
import android.view.ViewStub;
import com.twitter.app.gallery.GalleryActivity;
import android.widget.TextView$BufferType;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.twitter.util.user.UserIdentifier$Companion;
import android.util.SparseArray;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.ui.view.TouchEventInterceptingViewPager;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvb extends vbv implements i, xv8, qwb$a, uvb$a, q1s$c
{
    public static final fvb.fvb$b Companion;
    public int A1;
    public boolean B1;
    public List<? extends nwb> C1;
    public float D1;
    public boolean E1;
    public ViewGroup F1;
    public nvb G1;
    public boolean H1;
    public final fok I1;
    public final fvb$c J1;
    public wxg K1;
    public final View X0;
    public final r8x Y0;
    public final kas Z0;
    public final jn a1;
    public final faf b1;
    public final d8d c1;
    public final jxg d1;
    public final vul e1;
    public final xwb f1;
    public final wvb g1;
    public final swb h1;
    public final cxb i1;
    public final wwb j1;
    public final zvb k1;
    public final gyg l1;
    public final xba<Configuration> m1;
    public final jto n1;
    public final dml<wxg> o1;
    public final w59 p1;
    public final h59 q1;
    public final nhb r1;
    public uvb s1;
    public int t1;
    public bo6 u1;
    public dtg v1;
    public TouchEventInterceptingViewPager w1;
    public long x1;
    public boolean y1;
    public View z1;
    
    static {
        Companion = new fvb.fvb$b();
    }
    
    public fvb(View decorView, final Intent intent, final r8x y0, final Resources resources, final kas z0, final pwe<bai> pwe, final jn a1, final cnb cnb, final faf b1, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final d8d c1, final jxg d1, final vul e1, final xwb f1, final wvb g1, final swb h1, final cxb i1, final wwb j1, final zvb k1, final avb avb, final gyg l1, final upx upx, final xba<Configuration> m1, final jto n1, final xbm xbm, final xba<bo> xba2, final dml<wxg> o1, final w59 p41, final h59 q1, final nhb r1, final t8p t8p) {
        czd.f((Object)decorView, "content");
        czd.f((Object)y0, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)z0, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)a1, "activityFinisher");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)c1, "imageSaver");
        czd.f((Object)d1, "mediaNetworkPreferencePolicer");
        czd.f((Object)e1, "quickReplyChromePresenter");
        czd.f((Object)f1, "galleryScribeClient");
        czd.f((Object)g1, "galleryChromePresenter");
        czd.f((Object)h1, "mediaTagViewHost");
        czd.f((Object)i1, "galleryTweetHeaderPresenter");
        czd.f((Object)j1, "galleryPresenter");
        czd.f((Object)k1, "galleryColorAnimator");
        czd.f((Object)avb, "galleryActivityArgs");
        czd.f((Object)l1, "mediaPrefetcher");
        czd.f((Object)upx, "windowInsetsDispatcher");
        czd.f((Object)m1, "configurationChangeObservable");
        czd.f((Object)n1, "savedStateHandler");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)xba2, "activityResultObservable");
        czd.f((Object)o1, "viewHostDelegateProvider");
        czd.f((Object)p41, "dockPermissionHelper");
        czd.f((Object)q1, "dockEventDispatcher");
        czd.f((Object)r1, "followCtaPresenter");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, y0, resources, z0, (pwe)pwe, a1, cnb, b1, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = decorView;
        this.Y0 = y0;
        this.Z0 = z0;
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        this.p1 = p41;
        this.q1 = q1;
        this.r1 = r1;
        this.t1 = -1;
        this.x1 = Long.MIN_VALUE;
        this.I1 = new fok((fok$a)new fvb$d(this));
        final fvb$c j2 = new fvb$c(this);
        this.J1 = j2;
        this.K1 = (wxg)wxg.a;
        ((u9)this).R4(decorView);
        n1.a((mso)new gvb(this));
        y0.o().subscribe((lj6)new tma((qsb)new hvb(this), 9));
        m1.v0().subscribe((lj6)new tg((qsb)new ivb(this), 15));
        b1.K((fn)new jvb(this));
        ((h5j)h1.j).subscribe((lj6)new ri4((qsb)new kvb(this), 11));
        this.F1 = (ViewGroup)((u9)this).C4(2131430505);
        this.y1 = ((xi1)avb).mIntent.getBooleanExtra("extra_gallery_is_dm", false);
        this.v1 = (dtg)dwj.b(((xi1)avb).mIntent, "extra_gallery_media_entity", (rlp)dtg.p1);
        final efv v = f1.v;
        czd.e((Object)v, "galleryScribeClient.association");
        final UserIdentifier$Companion companion = UserIdentifier.Companion;
        final uvb s1 = new uvb((Context)cnb, companion.c(), j1, v, new ii8(), (uvb$a)this);
        this.s1 = s1;
        s1.O0 = (q1s$c)this;
        final TouchEventInterceptingViewPager w1 = (TouchEventInterceptingViewPager)((u9)this).C4(2131430503);
        this.w1 = w1;
        if (w1 != null) {
            ((ViewPager)w1).setOffscreenPageLimit(3);
        }
        final TouchEventInterceptingViewPager w2 = this.w1;
        if (w2 != null) {
            ((RtlViewPager)w2).setAdapter((huj)this.s1);
        }
        final TouchEventInterceptingViewPager w3 = this.w1;
        if (w3 != null) {
            ((ViewPager)w3).setOnPageChangeListener((ViewPager.i)this);
        }
        final TouchEventInterceptingViewPager w4 = this.w1;
        if (w4 != null) {
            ((ViewPager)w4).setPageMargin(resources.getDimensionPixelSize(2131166032));
        }
        final qwb qwb = new qwb((Context)cnb, (qwb$a)this, (g1t)dwj.b(((xi1)avb).mIntent, "extra_ad_preview_metadata_override", (rlp)g1t.c), vav.c2(companion.c()), (z9j)z0.a(vpu.class));
        final dtg v2 = this.v1;
        long o2;
        if (v2 != null) {
            o2 = v2.O0;
        }
        else {
            o2 = -1L;
        }
        ((BaseBundle)qwb.H0).putLong("sourceStatusId", o2);
        final long c2 = avb.c();
        Label_1459: {
            if (c2 != 0L) {
                final z6d i2 = (z6d)((xi1)avb).mIntent.getParcelableExtra("extra_gallery_image");
                qwb.J0 = c2;
                qwb.I0 = i2;
                ((BaseBundle)qwb.H0).putStringArray("projection", mou.a);
                qwb.H0.putParcelable("uri", (Parcelable)bgv.b(c2, userIdentifier));
                r2g.b((xaf)cnb).d(0, qwb.H0, (r2g$a)qwb);
            }
            else {
                if (!this.y1) {
                    a1.a();
                    break Label_1459;
                }
                this.t1 = 0;
                final uvb s2 = this.s1;
                czd.c((Object)s2);
                final dtg v3 = this.v1;
                czd.c((Object)v3);
                final x7d$a b2 = y7d.b(v3);
                ((mrm$a)b2).b = s2.H0;
                final int a2 = c5j.a;
                ((mrm$a)b2).c = true;
                s2.S(rif.v((Object)new pck((bo6)null, v3, b2, v3.d1)));
                if (!f1.A) {
                    f1.l(f1.c, f1.x, (bo6)null, false);
                    f1.A = true;
                }
                g1.b(false, true);
                e1.f((bo6)null);
            }
            xbm.i((oj)new ovt(new wc6(new t19[] { ((h5j)upx.a).distinctUntilChanged().subscribe((lj6)new gt1((qsb)new lvb(this), 8)) }), 3));
            if (this.E1) {
                final ViewGroup f2 = this.F1;
                czd.c((Object)f2);
                final Drawable background = ((View)f2).getBackground();
                background.setAlpha(0);
                final ViewGroup f3 = this.F1;
                czd.c((Object)f3);
                final Point u = nvb.u;
                final String stringExtra = intent.getStringExtra("media_url");
                final lw6$e n2 = lw6.n;
                final edq edq = (edq)klp.a(intent.getByteArrayExtra("target_view_size"), (rlp)n2);
                final edq c3 = edq.c;
                edq edq2;
                if ((edq2 = edq) == null) {
                    edq2 = c3;
                }
                edq edq3;
                if ((edq3 = (edq)klp.a(intent.getByteArrayExtra("original_image_size"), (rlp)n2)) == null) {
                    edq3 = c3;
                }
                final pbm pbm = (pbm)klp.a(intent.getByteArrayExtra("media_crop"), (rlp)pbm.e);
                final Bundle bundle = (Bundle)intent.getParcelableExtra("view_info");
                if (bundle == null) {
                    throw new IllegalArgumentException("Intent does not contain VIEW_INFO_EXTRA");
                }
                final nvb g2 = new nvb(cnb, new jp(bundle), stringExtra, edq2, edq3, pbm, f3, background);
                this.G1 = g2;
                this.z1 = (View)((rws)g2).c;
                ((rws)g2).i = (ip$a)new dvb(this);
                ((rws)g2).c(true);
            }
            ((Activity)cnb).getWindow();
            decorView = ((Activity)cnb).getWindow().getDecorView();
            if (Build$VERSION.SDK_INT >= 23) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & 0xFFFFDFFF);
            }
            final UserIdentifier c4 = companion.c();
            czd.f((Object)c4, "userIdentifier");
            fca.a().b(c4, (elm)new af4(c4, vba.Companion.e("tweet", "media", "", "", "impression")));
        }
        final h5j skip = y0.k().skip(1L);
        czd.e((Object)skip, "viewLifecycle.observeShow().skip(1)");
        final w19 w5;
        w5.c(skip.doOnComplete((oj)new fvb$e(w5 = new w19())).subscribe((lj6)new f$h1((qsb)new qsb<tmi, fzv>(this) {
            public final fvb D0;
            
            public final Object invoke(final Object o) {
                final tmi tmi = (tmi)o;
                final fvb d0 = this.D0;
                final uvb s1 = d0.s1;
                if (s1 != null) {
                    final SparseArray l0 = s1.L0;
                    for (int i = 0; i < l0.size(); ++i) {
                        final vvb vvb = (vvb)l0.valueAt(i);
                        final nwb r = s1.R(vvb.a);
                        if (r != null) {
                            vvb.a(r, s1.O0, s1.I0);
                        }
                    }
                }
                final uvb s2 = d0.s1;
                vvb q;
                if (s2 != null) {
                    q = s2.Q(d0.t1);
                }
                else {
                    q = null;
                }
                if (q != null) {
                    d0.Y4(q, true);
                }
                return fzv.a;
            }
        })));
        ro.b(xba2, 999, (qsb<? super bo, fzv>)new qsb<bo, fzv>(this) {
            public final fvb D0;
            
            public final Object invoke(final Object o) {
                final bo bo = (bo)o;
                czd.f((Object)bo, "it");
                int n;
                if (Build$VERSION.SDK_INT == 26) {
                    n = 600;
                }
                else {
                    n = 0;
                }
                rw0.k((long)n, (oj)new pi4((Object)this.D0, (Object)bo, 3));
                return fzv.a;
            }
        });
        q1.b((k59)j2);
        xbm.i((oj)new ii4((Object)this, 6));
    }
    
    public final void B3(final int n) {
    }
    
    public final void D(final int n) {
        final uvb s1 = this.s1;
        int count;
        if (s1 != null) {
            count = s1.getCount();
        }
        else {
            count = 0;
        }
        final int t1 = this.t1;
        this.t1 = n;
        if (count > 0) {
            czd.c((Object)s1);
            final vvb q = s1.Q(n);
            if (q != null) {
                final boolean b = n != t1 || this.H1;
                this.H1 = false;
                final nwb f = q.f;
                bo6 a;
                if (f != null) {
                    a = f.a;
                }
                else {
                    a = null;
                }
                boolean b3;
                if (a != null) {
                    this.u1 = a;
                    this.f1.B = a;
                    final wvb g1 = this.g1;
                    final swb i = g1.i;
                    i.h = a;
                    i.i = null;
                    final List b2 = e1h.b((Iterable)wug.m(a.f()));
                    if (!b2.isEmpty()) {
                        final tlw c = i.c;
                        final int size = b2.size();
                        final long[] array = new long[size];
                        for (int j = 0; j < size; ++j) {
                            array[j] = ((u0h)b2.get(j)).a;
                        }
                        c.i2(array);
                        u0h k;
                        if (b2.size() == 1) {
                            k = b2.get(0);
                        }
                        else {
                            k = null;
                        }
                        i.i = k;
                        final TextView d = i.d;
                        final cnb a2 = i.a;
                        d.setText(rpb.u((Context)a2, b2, 2131232320, kn6.b((Context)a2, 2131100889)), TextView$BufferType.SPANNABLE);
                        GalleryActivity.d0((View)i.d, ((Context)i.a).getResources(), i.f, 0);
                        ((View)i.d).setVisibility(0);
                    }
                    else {
                        ((View)i.d).setVisibility(8);
                    }
                    g1.j.a(a);
                    final ylu m = g1.m;
                    if (m != null) {
                        final ewg g2 = g1.j.g;
                        if (g2 != null) {
                            g2.n2 = m;
                        }
                    }
                    if (m != null) {
                        final baq l = g1.l;
                        final View viewById = ((rbx)l).b.findViewById(((rbx)l).a);
                        if (viewById instanceof ViewStub) {
                            final int a3 = c5j.a;
                            ((ViewStub)viewById).setLayoutResource(2131625898);
                        }
                        g1.k.a(g1.l, g1.m, a.D(), (imu$a)new emu$a(), j8a.v(((View)g1.a).getContext()), true, "non_compliant".equals(a.D0.a1));
                    }
                    final a0j n2 = g1.n;
                    if (n2 != null) {
                        final ewg g3 = g1.j.g;
                        if (g3 != null) {
                            g3.o2 = n2;
                        }
                    }
                    final w4 w4 = this.W4();
                    i1 c2;
                    if (w4 != null) {
                        c2 = w4.b.c1;
                    }
                    else {
                        c2 = null;
                    }
                    Object a4;
                    if (c2 != null && y6.h(c2.getType())) {
                        a4 = this.o1.get();
                    }
                    else {
                        a4 = wxg.a;
                    }
                    (this.K1 = (wxg)a4).b(c2);
                    final nhb r1 = this.r1;
                    Objects.requireNonNull(r1);
                    r1.d.b(new UserIdentifier(a.w())).subscribe((lj6)new tg((qsb)new ohb(r1, a), 14));
                    if (t1 != -1) {
                        final xwb f2 = this.f1;
                        Objects.requireNonNull(f2);
                        if (n == t1 + 1) {
                            String s2;
                            if (f2.z) {
                                s2 = f2.b;
                            }
                            else {
                                s2 = f2.a;
                            }
                            f2.l(s2, f2.x, f2.B, true);
                        }
                        else if (n == t1 - 1) {
                            String s3;
                            if (f2.z) {
                                s3 = f2.a;
                            }
                            else {
                                s3 = f2.b;
                            }
                            f2.l(s3, f2.x, f2.B, true);
                        }
                        this.f1.i(a, wil.F1);
                    }
                    final hai g4 = ((u9)this).G4();
                    b3 = b;
                    if (g4 != null) {
                        final tj d2 = g4.d();
                        b3 = b;
                        if (d2 != null) {
                            d2.E((View)null);
                            b3 = b;
                        }
                    }
                }
                else {
                    b3 = b;
                }
                this.e1.f(a);
                if (b3) {
                    final vvb q2 = s1.Q(t1);
                    if (q2 != null && t1 != n) {
                        q2.d(false);
                        ((Activity)((u9)this).E0).invalidateOptionsMenu();
                    }
                    if (!this.h1.k) {
                        q.d(true);
                        ((Activity)((u9)this).E0).invalidateOptionsMenu();
                    }
                    Object o = s1.N0;
                    if (o == null) {
                        o = gdd.E0;
                        final int a5 = c5j.a;
                    }
                    czd.e(o, "pagerAdapter.galleryItems");
                    final List s4 = new s4e((Iterable)o, (jtb)tq9.c).s3();
                    czd.e((Object)s4, "mapWithoutNulls(\n       \u2026obj.getTweet() }.toList()");
                    final gyg l2 = this.l1;
                    final zl9$a a6 = zl9.a;
                    Objects.requireNonNull(l2);
                    l2.h((Callable)new eyg(l2, s4, n));
                    final nwb r2 = s1.R(n);
                    if (r2 != null) {
                        final bo6 a7 = r2.a;
                        long n3;
                        if (a7 == null) {
                            n3 = UserIdentifier.LOGGED_OUT.getId();
                        }
                        else {
                            n3 = a7.L();
                        }
                        final owb h = this.g1.h;
                        final String d3 = r2.d;
                        final TextView b4 = h.b;
                        final Resources a8 = h.a;
                        GalleryActivity.d0((View)b4, a8, h.c, a8.getDimensionPixelOffset(2131167432));
                        if (asa.a(UserIdentifier.getCurrent()).b("show_alt_text_and_icon", false) && n3 == UserIdentifier.getCurrent().getId() && ikr.g((CharSequence)d3) && !uoz.g()) {
                            ((View)h.b).setVisibility(0);
                            h.b.setText((CharSequence)d3);
                            ((View)h.b).setTag((Object)d3);
                            final String string = h.a.getString(2131958070);
                            final String string2 = h.a.getString(2131953786);
                            final ViewTreeObserver viewTreeObserver = ((View)h.b).getViewTreeObserver();
                            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new pwb(h, viewTreeObserver, d3, string, string2));
                        }
                        else {
                            ((View)h.b).setVisibility(8);
                        }
                    }
                }
                if (n != this.A1) {
                    final View z1 = this.z1;
                    if (z1 != null && z1.getVisibility() == 0) {
                        final View z2 = this.z1;
                        czd.c((Object)z2);
                        z2.setVisibility(8);
                    }
                }
            }
        }
        this.t1 = n;
        ((u9)this).F4().invalidate();
        this.j1.c = true;
    }
    
    public final void K3(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "viewGroup");
        if (this.E1 && this.A1 == this.t1) {
            this.m0();
        }
        else {
            this.a1.a();
            if (this.D1 > 0.0f) {
                ((Activity)((u9)this).E0).overridePendingTransition(2130772038, 2130772040);
            }
            else {
                ((Activity)((u9)this).E0).overridePendingTransition(2130772038, 2130772039);
            }
        }
    }
    
    public final void N0() {
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        czd.f((Object)hai, "navComponent");
        czd.f((Object)menu, "menu");
        super.N2(hai, menu);
        hai.z(2131689492, menu);
        hai.z(2131689527, menu);
        if (rpb.K()) {
            final MenuItem item = menu.findItem(2131430950);
            if (item != null) {
                item.setTitle(2131955093);
            }
        }
        hai.z(2131689482, menu);
        if (asa.b().b("vod_docking_explicit_docking_enabled", false)) {
            final uvb s1 = this.s1;
            vvb q;
            if (s1 != null) {
                q = s1.Q(this.t1);
            }
            else {
                q = null;
            }
            if (q instanceof fxb) {
                hai.z(2131689538, menu);
            }
        }
        return true;
    }
    
    public final void N4() {
        this.d1.destroy();
        this.t1 = -1;
        final uvb s1 = this.s1;
        if (s1 != null) {
            final SparseArray l0 = s1.L0;
            for (int i = 0; i < l0.size(); ++i) {
                ((vvb)l0.valueAt(i)).b();
            }
        }
        this.s1 = null;
        final TouchEventInterceptingViewPager w1 = this.w1;
        if (w1 != null) {
            czd.c((Object)w1);
            final ViewParent parent = ((View)w1).getParent();
            czd.d((Object)parent, "null cannot be cast to non-null type android.view.ViewGroup");
            final ViewGroup viewGroup = (ViewGroup)parent;
            viewGroup.removeAllViews();
            ((View)viewGroup).measure(0, 0);
            this.w1 = null;
        }
        final nvb g1 = this.G1;
        if (g1 != null) {
            ((rws)g1).b();
        }
    }
    
    public final void Q3(final ViewGroup viewGroup) {
    }
    
    public final void S0(final List<nwb> c1) {
        czd.f((Object)c1, "mediaItems");
        if (this.E1 && !this.B1) {
            this.C1 = c1;
        }
        else {
            this.a5(c1);
        }
    }
    
    public final boolean S2(final MotionEvent motionEvent) {
        return false;
    }
    
    public final w4 W4() {
        final uvb s1 = this.s1;
        final w4 w4 = null;
        Object q;
        if (s1 != null) {
            q = s1.Q(this.t1);
        }
        else {
            q = null;
        }
        final boolean b = q == null || q instanceof fxb;
        w4 i = w4;
        if (b) {
            final fxb fxb = (fxb)q;
            i = w4;
            if (fxb != null) {
                i = fxb.i;
            }
        }
        return i;
    }
    
    public final vwb X4() {
        final uvb s1 = this.s1;
        if (s1 != null) {
            czd.c((Object)s1);
            if (s1.Q(this.t1) instanceof vwb) {
                final uvb s2 = this.s1;
                czd.c((Object)s2);
                return (vwb)s2.Q(this.t1);
            }
        }
        return null;
    }
    
    public final void Y4(final vvb vvb, final boolean b) {
        vvb.d(b);
        ((Activity)((u9)this).E0).invalidateOptionsMenu();
    }
    
    public final void Z4() {
        final int a1 = this.A1;
        final int t1 = this.t1;
        boolean m1 = false;
        if (a1 == t1) {
            final View z1 = this.z1;
            if (z1 != null && this.G1 != null && this.w1 != null) {
                czd.c((Object)z1);
                z1.setVisibility(0);
                final TouchEventInterceptingViewPager w1 = this.w1;
                czd.c((Object)w1);
                ((View)w1).setVisibility(8);
                this.g1.b(false, false);
                final zvb k1 = this.k1;
                final int statusBarColor = k1.c.getStatusBarColor();
                final ValueAnimator setDuration = ValueAnimator.ofInt(new int[] { Color.alpha(k1.c.getNavigationBarColor()), 0 }).setDuration(150L);
                setDuration.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new yvb(k1, statusBarColor));
                setDuration.start();
                ObjectAnimator.ofArgb((Object)k1.c, "navigationBarColor", new int[] { 0 }).setDuration(150L).start();
                final nvb g1 = this.G1;
                if (g1 != null) {
                    ((rws)g1).c(false);
                }
                return;
            }
        }
        final jn a2 = this.a1;
        final w4 w2 = this.W4();
        if (w2 != null) {
            m1 = w2.b.m1;
        }
        a2.c((bn6)new BroadcastFullscreenContentViewResult(m1));
    }
    
    public final void a2(ViewGroup j, final float n) {
        czd.f((Object)j, "viewGroup");
        this.D1 = n;
        j = ((u9)this).F4().j();
        if (j != null) {
            if (n >= 0.0f) {
                ((View)this.g1.c).setTranslationY(n);
                final cxb i1 = this.i1;
                final float translationY = -n;
                i1.a(translationY);
                ((View)j).setTranslationY(translationY);
            }
            else {
                ((View)this.g1.c).setTranslationY(-n);
                this.i1.a(n);
                ((View)j).setTranslationY(n);
            }
        }
        final View z1 = this.z1;
        if (z1 != null) {
            czd.c((Object)z1);
            z1.setTranslationY(n);
        }
        final vul e1 = this.e1;
        if (e1.k) {
            e1.e();
        }
    }
    
    public final void a5(final List<? extends nwb> list) {
        final int t1 = this.t1;
        int n = 0;
        final int n2 = 0;
        final int max = Math.max(t1, 0);
        int a1 = 0;
        Label_0218: {
            if (this.x1 != Long.MIN_VALUE && this.v1 == null) {
                final int size = list.size();
                n = n2;
                while (true) {
                    a1 = max;
                    if (n >= size) {
                        break Label_0218;
                    }
                    final bo6 a2 = list.get(n).a;
                    if (a2 != null && a2.G() == this.x1) {
                        this.x1 = Long.MIN_VALUE;
                        break;
                    }
                    ++n;
                }
            }
            else {
                final dtg v1 = this.v1;
                a1 = max;
                if (v1 == null) {
                    break Label_0218;
                }
                a1 = max;
                if (this.t1 != -1) {
                    break Label_0218;
                }
                czd.c((Object)v1);
                a1 = max;
                if (!ikr.g((CharSequence)v1.R0)) {
                    break Label_0218;
                }
                final int size2 = list.size();
                while (true) {
                    a1 = max;
                    if (n >= size2) {
                        break Label_0218;
                    }
                    final nwb nwb = list.get(n);
                    final dtg v2 = this.v1;
                    czd.c((Object)v2);
                    if (czd.a((Object)v2.R0, (Object)((mrm$a)nwb.c).a)) {
                        break;
                    }
                    ++n;
                }
            }
            a1 = n;
        }
        this.A1 = a1;
        final TouchEventInterceptingViewPager w1 = this.w1;
        if (w1 != null && this.t1 == -1) {
            czd.c((Object)w1);
            ((View)w1).setVisibility(4);
        }
        new Handler().post((Runnable)new evb(this, a1));
        final uvb s1 = this.s1;
        if (s1 != null) {
            czd.c((Object)s1);
            s1.S((List)list);
        }
    }
    
    public final boolean c3(final MotionEvent motionEvent) {
        return false;
    }
    
    public final int d2(final hai hai) {
        czd.f((Object)hai, "navComponent");
        final w4 w4 = this.W4();
        if (w4 != null) {
            final xx0 e = w4.e;
            if (e != null) {
                e.g((f2)this.I1);
            }
        }
        final uvb s1 = this.s1;
        nwb r;
        if (s1 != null) {
            r = s1.R(this.t1);
        }
        else {
            r = null;
        }
        if (r != null) {
            final MenuItem item = hai.findItem(2131431175);
            if (item != null) {
                item.setVisible(r.b());
            }
            final int a = r.a();
            final boolean b = true;
            if (a == 1) {
                final MenuItem item2 = hai.findItem(2131429462);
                if (item2 != null) {
                    final vwb x4 = this.X4();
                    boolean b2 = false;
                    Label_0204: {
                        if (x4 != null) {
                            final FrescoMediaImageView h = x4.h;
                            boolean h2 = false;
                            Label_0192: {
                                if (h != null) {
                                    final String g = x4.g(h);
                                    if (g != null) {
                                        h2 = x4.h(h, g);
                                        break Label_0192;
                                    }
                                }
                                h2 = false;
                            }
                            if (h2) {
                                b2 = true;
                                break Label_0204;
                            }
                        }
                        b2 = false;
                    }
                    item2.setVisible(!b2 && (q3j.K() || !this.d1.a()));
                }
                final MenuItem item3 = hai.findItem(2131429844);
                if (item3 != null) {
                    boolean b5 = false;
                    Label_0404: {
                        if (this.v1 != null) {
                            final vwb x5 = this.X4();
                            final dtg v1 = this.v1;
                            czd.c((Object)v1);
                            final boolean b3 = v1.S0.b.l() >= hyv.J0.D0.l();
                            boolean b4 = false;
                            Label_0378: {
                                if (x5 != null) {
                                    final FrescoMediaImageView h3 = x5.h;
                                    boolean h4 = false;
                                    Label_0366: {
                                        if (h3 != null) {
                                            final String f = x5.f(h3);
                                            if (f != null) {
                                                h4 = x5.h(h3, f);
                                                break Label_0366;
                                            }
                                        }
                                        h4 = false;
                                    }
                                    if (h4) {
                                        b4 = true;
                                        break Label_0378;
                                    }
                                }
                                b4 = false;
                            }
                            if (b3 && !b4) {
                                b5 = asa.c().b("android_media_load_4k_image_option_enabled", false);
                                break Label_0404;
                            }
                        }
                        b5 = false;
                    }
                    item3.setVisible(b5);
                }
            }
            Label_0649: {
                if (!this.y1) {
                    final bo6 u1 = this.u1;
                    if (u1 != null) {
                        czd.c((Object)u1);
                        final List m = wug.m(u1.f());
                        czd.e((Object)m, "getValidMediaEntitiesFor\u2026Tweet!!.allMediaEntities)");
                        final UserIdentifier$Companion companion = UserIdentifier.Companion;
                        final boolean visible = e1h.d(e1h.b((Iterable)m), companion.c()) != null;
                        final MenuItem item4 = hai.findItem(2131430950);
                        if (item4 != null) {
                            item4.setVisible(visible);
                        }
                        final bo6 u2 = this.u1;
                        czd.c((Object)u2);
                        final boolean b6 = u2.L() == companion.c().getId();
                        final MenuItem item5 = hai.findItem(2131428625);
                        if (item5 == null) {
                            break Label_0649;
                        }
                        boolean visible2 = false;
                        Label_0608: {
                            if (b6) {
                                final bo6 u3 = this.u1;
                                czd.c((Object)u3);
                                if (!u3.D0()) {
                                    visible2 = b;
                                    break Label_0608;
                                }
                            }
                            visible2 = false;
                        }
                        item5.setVisible(visible2);
                        break Label_0649;
                    }
                }
                final MenuItem item6 = hai.findItem(2131428625);
                if (item6 != null) {
                    item6.setVisible(false);
                }
            }
            this.K1.c(hai, false);
        }
        return 2;
    }
    
    public final void h2(int value, final float n, int value2) {
        final uvb s1 = this.s1;
        if (s1 != null && this.t1 != -1) {
            final zvb k1 = this.k1;
            Objects.requireNonNull(k1);
            k1.b(value, s1.R(value));
            value2 = value + 1;
            k1.b(value2, s1.R(value2));
            value = k1.f.get(value, -16777216);
            value2 = k1.f.get(value2, -16777216);
            if (value != value2) {
                k1.a((int)k1.e.evaluate(n, (Object)value, (Object)value2), true);
            }
        }
    }
    
    public final boolean j() {
        final vul e1 = this.e1;
        e1.m = (Runnable)new ol6((Object)this, 4);
        if (!e1.e.j()) {
            this.Z4();
        }
        return true;
    }
    
    public final void k0(final Dialog dialog, int n, final int n2) {
        czd.f((Object)dialog, "dialog");
        final int n3 = 1;
        if (n == 1) {
            final cnb e0 = ((u9)this).E0;
            final bo6 u1 = this.u1;
            czd.c((Object)u1);
            final UserIdentifier c = UserIdentifier.Companion.c();
            if (n2 == -1) {
                final long id = c.getId();
                final List b = wug.b((Iterable)u1.l().g, (xtk)wug.h);
                final rif$a rif$a = new rif$a(b.size());
                for (final dtg dtg : b) {
                    if (!dtg.W0.isEmpty()) {
                        ((rif)rif$a).p((Object)dtg.N0);
                    }
                }
                final ln8 ln8 = new ln8((Context)e0, c, u1.D(), id, (List)((n4j)rif$a).e(), (Set)Collections.singleton(id));
                final trc c2 = trc.c();
                ((anm)ln8).U((wv0$b)new zem());
                c2.f((orc)ln8);
                n = n3;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final hai g4 = ((u9)this).G4();
                MenuItem item;
                if (g4 != null) {
                    item = g4.findItem(2131430950);
                }
                else {
                    item = null;
                }
                if (item != null) {
                    item.setVisible(false);
                }
                final xwb f1 = this.f1;
                f1.l(f1.f, f1.x, f1.B, false);
            }
        }
    }
    
    public final void l1() {
        final uvb s1 = this.s1;
        if (s1 != null) {
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            s1.S((List)e0);
        }
    }
    
    public final void m0() {
        final vul e1 = this.e1;
        e1.m = (Runnable)new r06((Object)this, 8);
        if (!e1.e.j()) {
            if (this.E1) {
                this.Z4();
            }
            else if (this.y1) {
                this.a1.a();
            }
            else {
                super.m0();
            }
        }
    }
    
    public final boolean n(final MenuItem menuItem) {
        czd.f((Object)menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (this.K1.a(menuItem, this.W4())) {
            return true;
        }
        if (itemId == 2131431175) {
            if (this.s1 != null) {
                final vwb x4 = this.X4();
                if (x4 != null) {
                    final FrescoMediaImageView h = x4.h;
                    if (h != null) {
                        final d8d c1 = this.c1;
                        Objects.requireNonNull(c1);
                        String d;
                        if (((c)h).getImageRequest() != null) {
                            d = ((c)h).getImageRequest().d();
                        }
                        else {
                            d = null;
                        }
                        if (ikr.g((CharSequence)d)) {
                            c1.b(d);
                        }
                        else {
                            c1.c.c(2131957378, 0);
                        }
                        final xwb f1 = this.f1;
                        f1.l(f1.s, f1.x, f1.B, false);
                    }
                }
            }
            return true;
        }
        if (itemId == 2131430950) {
            final p i4 = ((u9)this).I4();
            final kjl$b kjl$b = new kjl$b(1);
            ((kjl$a)kjl$b).F(2131956978);
            ((kjl$a)kjl$b).C(2131952374);
            if (rpb.K()) {
                ((kjl$a)kjl$b).H(2131955093);
                ((kjl$a)kjl$b).A(2131955092);
            }
            else {
                ((kjl$a)kjl$b).H(2131954983);
                ((kjl$a)kjl$b).A(2131954975);
            }
            final wk1 w = ((xk1$a)kjl$b).w();
            w.U1 = (xv8)this;
            final int a = c5j.a;
            w.l2(i4);
        }
        else if (itemId == 2131428625) {
            ((Activity)((u9)this).E0).showDialog(1);
        }
        else if (itemId == 2131429462) {
            final vwb x5 = this.X4();
            if (x5 != null) {
                final FrescoMediaImageView h2 = x5.h;
                if (h2 != null) {
                    final String g = x5.g(h2);
                    if (g != null) {
                        x5.i(h2, g, "load_high_quality");
                    }
                }
            }
        }
        else if (itemId == 2131429844) {
            final vwb x6 = this.X4();
            if (x6 != null) {
                final FrescoMediaImageView h3 = x6.h;
                if (h3 != null) {
                    final String f2 = x6.f(h3);
                    if (f2 != null) {
                        x6.i(h3, f2, "load_highest_quality");
                    }
                }
            }
        }
        return super.n(menuItem);
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "event");
        final vul e1 = this.e1;
        if (e1.k) {
            e1.e();
        }
        else if (!zg.f((Context)((u9)this).E0) && this.j1.c) {
            final wvb g1 = this.g1;
            g1.b(g1.p ^ true, true);
        }
        return false;
    }
    
    public final void t3(final int n) {
        if (n == this.A1) {
            ((u9)this).F4().invalidate();
            final View z1 = this.z1;
            if (z1 != null) {
                czd.c((Object)z1);
                z1.setVisibility(8);
            }
        }
    }
}
