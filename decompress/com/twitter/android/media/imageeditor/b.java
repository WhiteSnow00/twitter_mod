// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor;

import com.twitter.ui.widget.TintableImageButton;
import com.twitter.media.ui.image.AspectRatioFrameLayout;
import com.twitter.media.ui.image.d;
import android.os.BaseBundle;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.lang.ref.WeakReference;
import com.twitter.media.legacy.widget.FilterFilmstripView$e;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.graphics.drawable.Drawable;
import com.twitter.ui.widget.CroppableImageView;
import com.twitter.ui.widget.CroppableImageView$b;
import com.twitter.media.ui.image.b$b;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Objects;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageButton;
import com.twitter.ui.view.RtlViewPager;
import android.os.Bundle;
import java.util.ArrayList;
import com.twitter.media.ui.image.FixedSizeImageView;
import android.widget.TextView;
import com.twitter.media.ui.image.MediaImageView;
import android.view.View;
import com.twitter.ui.widget.ToggleImageButton;
import com.twitter.media.legacy.widget.FilterFilmstripView;
import com.twitter.android.media.imageeditor.stickers.StickerSelectorView;
import com.twitter.android.media.stickers.StickerFilteredImageView;
import com.twitter.media.filters.Filters;
import java.util.List;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewResult;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewArgs;
import com.twitter.alttext.AltTextActivityContentViewResult;
import com.twitter.alttext.AltTextActivityContentViewArgs;
import android.view.View$OnClickListener;

public class b extends umd implements View$OnClickListener
{
    public static final b.b$e S2;
    public static final int[] T2;
    public static final int[] U2;
    public boolean A2;
    public int B2;
    public int C2;
    public int D2;
    public int E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public int I2;
    public boolean J2;
    public String K2;
    public String L2;
    public String M2;
    public boolean N2;
    public final wc6 O2;
    public dn6<AltTextActivityContentViewArgs, AltTextActivityContentViewResult> P2;
    public dn6<SensitiveMediaActivityContentViewArgs, SensitiveMediaActivityContentViewResult> Q2;
    public dn6<x6k, PermissionContentViewResult> R2;
    public final List<Filters> X1;
    public StickerFilteredImageView Y1;
    public CropMediaImageView Z1;
    public StickerSelectorView a2;
    public FilterFilmstripView b2;
    public ToggleImageButton c2;
    public View d2;
    public MediaImageView e2;
    public View f2;
    public View g2;
    public ToggleImageButton h2;
    public TextView i2;
    public TextView j2;
    public TextView k2;
    public View l2;
    public FixedSizeImageView m2;
    public uy n2;
    public FixedSizeImageView o2;
    public ew9 p2;
    public ew9 q2;
    public c r2;
    public qgr s2;
    public Filters t2;
    public d u2;
    public CropMediaImageView.a v2;
    public String w2;
    public int x2;
    public int y2;
    public float z2;
    
    static {
        S2 = new b.b$e();
        T2 = new int[] { 2131431454, 2131428954, 2131428538, 2131431764, 2131431159, 2131430473, 2131432658, 2131431685, 2131427585, 2131431342 };
        U2 = new int[] { 2131431159, 2131430473, 2131432658, 2131431685 };
    }
    
    public b() {
        this.X1 = new ArrayList();
        this.y2 = 1;
        this.O2 = new wc6();
    }
    
    public static void q2(final c c) {
        final List stickers = c.d.getStickers();
        if (!stickers.isEmpty()) {
            final ew9$b f = c.f;
            final int n = f.n;
            final float h = ((jvg)f.a).b.h();
            final ew9$b f2 = c.f;
            final pbm d = f2.d;
            final pbm g = pbm.g;
            pbm pbm;
            if ((pbm = d) == null) {
                pbm = g;
            }
            float n2;
            float n3;
            if (n % 180 == 0) {
                n2 = pbm.d - pbm.b;
                n3 = (pbm.c - pbm.a) * h;
            }
            else {
                n2 = (pbm.d - pbm.b) * h;
                n3 = pbm.c - pbm.a;
            }
            f2.f = fq4.e((Iterable)fq4.c(stickers, (jtb)uhr.b), (xtk)new d7d(h, pbm, n, n2 / n3));
        }
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        final c r2 = this.r2;
        if (r2 != null) {
            q2(r2);
            dwj.k(bundle, "image", (Object)this.r2.a(), (rlp)ew9.S0);
            final boolean b = this.r2.b();
            int n = 1;
            if (b) {
                bundle.putBoolean("is_cropping", true);
                final CropMediaImageView.a cropState = this.r2.e.getCropState();
                ((BaseBundle)bundle).putInt("rotation", cropState.a);
                dwj.k(bundle, "crop_rect", (Object)cropState.b, (rlp)pbm.e);
            }
            final boolean b2 = this.r2.b();
            int currentItem = 0;
            if (b2) {
                n = 2;
            }
            else if (this.r2.c()) {
                n = 3;
            }
            else if (!this.b2.N0) {
                n = 0;
            }
            final RtlViewPager j = this.r2.j;
            if (j != null) {
                currentItem = j.getCurrentItem();
            }
            ((BaseBundle)bundle).putInt("sticker_tab_position", currentItem);
            ((BaseBundle)bundle).putInt("editor_type", n);
        }
    }
    
    public final void A2() {
        final c r2 = this.r2;
        if (r2 == null) {
            return;
        }
        final boolean c = r2.c();
        int text = 2131957374;
        int text2;
        if (c) {
            text2 = 2131955733;
            text = 2131953583;
        }
        else if (this.r2.b()) {
            text2 = 2131955731;
            text = 2131952055;
        }
        else if (this.b2.N0) {
            text2 = 2131955732;
        }
        else {
            text2 = 2131953731;
        }
        final String l2 = this.L2;
        if (l2 == null) {
            this.i2.setText(text2);
        }
        else {
            this.i2.setText((CharSequence)l2);
        }
        final String m2 = this.M2;
        if (m2 != null) {
            this.j2.setText((CharSequence)m2);
            ((View)this.j2).setVisibility(0);
        }
        final TextView k2 = this.k2;
        if (k2 != null) {
            final String k3 = this.K2;
            if (k3 == null) {
                k2.setText(text);
            }
            else {
                k2.setText((CharSequence)k3);
            }
        }
    }
    
    public final void D1(final View view, final Bundle bundle) {
        final Context n0 = ((Fragment)this).N0();
        this.E2 = fd9.a(n0, 2130969698, 2131231535);
        this.D2 = fd9.a(n0, 2130969699, 2131231536);
        this.C2 = fd9.a(n0, 2130969694, 2131231530);
        this.B2 = fd9.a(n0, 2130969695, 2131231531);
        this.c2 = (ToggleImageButton)view.findViewById(2131431454);
        this.h2 = (ToggleImageButton)view.findViewById(2131428954);
        this.e2 = (MediaImageView)view.findViewById(2131430688);
        final ImageButton imageButton = (ImageButton)view.findViewById(2131427585);
        final boolean g = uoz.g();
        final int n2 = 8;
        int visibility;
        if (g) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)imageButton).setVisibility(visibility);
        this.m2 = (FixedSizeImageView)view.findViewById(2131427586);
        final ImageButton imageButton2 = (ImageButton)view.findViewById(2131431342);
        int visibility2 = n2;
        if (xli.K0()) {
            visibility2 = 0;
        }
        ((View)imageButton2).setVisibility(visibility2);
        this.o2 = (FixedSizeImageView)view.findViewById(2131431343);
        this.b2 = (FilterFilmstripView)view.findViewById(2131429137);
        this.i2 = (TextView)view.findViewById(2131429424);
        this.j2 = (TextView)view.findViewById(2131431782);
        this.d2 = view.findViewById(2131428539);
        final View viewById = view.findViewById(2131428033);
        this.f2 = viewById;
        ((TransitionDrawable)viewById.getBackground()).startTransition(0);
        this.g2 = view.findViewById(2131432136);
        final int[] t2 = b.T2;
        for (int length = t2.length, i = 0; i < length; ++i) {
            view.findViewById(t2[i]).setOnClickListener((View$OnClickListener)this);
        }
        ((View)(this.k2 = (TextView)view.findViewById(2131428783))).setOnClickListener((View$OnClickListener)this);
        (this.l2 = view.findViewById(2131427752)).setOnClickListener((View$OnClickListener)this);
        this.v2(false);
        view.findViewById(2131428955).setVisibility(0);
        this.i2.setText((CharSequence)"");
        final ew9 q2 = this.q2;
        final ew9 p2 = this.p2;
        Object o;
        if ((o = q2) == null) {
            o = p2;
        }
        if (o != null) {
            this.j2((jw9)o);
        }
    }
    
    public final void c2() {
        super.c2();
        final c r2 = this.r2;
        if (r2 != null) {
            r2.h();
        }
    }
    
    public final void d2() {
        final c r2 = this.r2;
        if (r2 != null) {
            final StickerFilteredImageView d = r2.d;
            final eza k1 = ((jza)d).k1;
            if (k1 != null && ((jza)d).m1) {
                final zub$i e0 = ((zub)k1).E0;
                Objects.requireNonNull(e0);
                final zub$j o0 = zub.O0;
                synchronized (o0) {
                    e0.F0 = true;
                    o0.notifyAll();
                    while (!e0.E0 && !e0.G0) {
                        try {
                            zub.O0.wait();
                        }
                        catch (final InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            q2(this.r2);
        }
        super.d2();
    }
    
    public final void g1(final Bundle bundle) {
        ((Fragment)this).i1 = true;
        this.r2((gtb<b, Filters, Void>)i71.L0);
        if (bundle != null && bundle.getBoolean("is_cropping")) {
            this.w2();
        }
        final dn6 a = this.v0().h().a((Class)AltTextActivityContentViewResult.class);
        this.P2 = (dn6<AltTextActivityContentViewArgs, AltTextActivityContentViewResult>)a;
        f.i(a.c(), (n93)new gg1((Object)this, 3));
        final dn6 a2 = this.v0().h().a((Class)SensitiveMediaActivityContentViewResult.class);
        this.Q2 = (dn6<SensitiveMediaActivityContentViewArgs, SensitiveMediaActivityContentViewResult>)a2;
        f.i(a2.c(), (n93)new mr2((Object)this, 3));
        final dn6 h = this.v0().h().h((Class)PermissionContentViewResult.class, ssm.a((Class)PermissionContentViewResult.class));
        this.R2 = (dn6<x6k, PermissionContentViewResult>)h;
        f.i(h.c().filter((ytk)b71.S0), (n93)new so3((Object)this, 3));
    }
    
    public final View g2(final LayoutInflater layoutInflater, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624391, (ViewGroup)null);
        (this.Y1 = (StickerFilteredImageView)inflate.findViewById(2131429135)).setStickerEditListener((StickerFilteredImageView.a)new b$a(this));
        ((jza)this.Y1).setFilterRenderListener((dza$a)new qr9(this));
        ((com.twitter.media.ui.image.d)(this.Z1 = (CropMediaImageView)inflate.findViewById(2131428540))).setOnImageLoadedListener((b$b)new eu4((Object)this, 14));
        this.Z1.setZoomDisabled(this.N2);
        final CroppableImageView imageView = this.Z1.getImageView();
        imageView.setCropListener((CroppableImageView$b)new scn((Object)this, 5));
        imageView.setDrawActiveRectAsCircle(this.G2);
        if (this.z2 > 0.0f) {
            imageView.setDraggableCorners(false);
            if (!this.H2) {
                imageView.setShowGrid(false);
            }
        }
        (this.a2 = (StickerSelectorView)inflate.findViewById(2131431762)).setStickerSelectedListener((com.twitter.android.media.imageeditor.stickers.b.b)new wm3((Object)this, 10));
        this.a2.setScribeSection(this.w2);
        return inflate;
    }
    
    public final void i2() {
        final c r2 = this.r2;
        final boolean b = r2 != null && this.p2 != null && (this.p2.o(r2.a()) ^ true);
        final d u2 = this.u2;
        if (u2 != null) {
            u2.I3(b);
        }
    }
    
    public final void j2(final jw9 jw9) {
        if (jw9.D0.c == m1h.H0) {
            final ew9 ew9 = (ew9)jw9;
            this.r2 = new c(this.Y1, this.Z1, this.a2, ew9, ((Fragment)this).N0(), ((Fragment)this).V0);
            Object o;
            if ((o = ew9.O0) == null) {
                o = f2a.D0;
            }
            for (final rhr rhr : o) {
                final com.twitter.android.media.stickers.b b = new com.twitter.android.media.stickers.b(((Fragment)this).N0(), new com.twitter.android.media.stickers.b.a(rhr), (Drawable)null);
                ((AspectRatioFrameLayout)b).setAspectRatio(rhr.a.L0.a);
                this.Y1.x(b);
            }
            if (!this.X1.isEmpty()) {
                final c r2 = this.r2;
                final Filters filters = this.X1.remove(0);
                if (filters != null) {
                    ((jza)r2.d).setFilters(filters);
                }
                r2.i = filters;
            }
            else {
                this.r2((gtb<b, Filters, Void>)f71.R0);
            }
            final StickerFilteredImageView y1 = this.Y1;
            if (((com.twitter.media.ui.image.d)y1).g1) {
                this.J2 = true;
            }
            else {
                ((com.twitter.media.ui.image.d)y1).setOnImageLoadedListener((b$b)new qr9(this));
            }
            final int x2 = this.x2;
            if (x2 == 1 || x2 == 3) {
                this.O2.a(rw0.l(TimeUnit.SECONDS, 10L, (oj)new cbk((Object)this, 5)));
            }
            Object v2 = this.v2;
            if (v2 == null) {
                final int l0 = ew9.L0;
                final pbm m0 = ew9.M0;
                final pbm g = pbm.g;
                pbm pbm;
                if ((pbm = m0) == null) {
                    pbm = g;
                }
                if (l0 != 0 && !pbm.e()) {
                    v2 = new CropMediaImageView.a(l0, a7d.b(l0, false).e().g(pbm));
                }
                else {
                    v2 = new CropMediaImageView.a(l0, pbm);
                }
            }
            this.v2 = null;
            final c r3 = this.r2;
            r3.h = (CropMediaImageView.a)v2;
            final qgr s2 = this.s2;
            jee.l((Object)s2);
            r3.k = this.I2;
            final StickerSelectorView g2 = r3.g;
            Objects.requireNonNull(s2);
            g2.setRetryStickerCatalogListener((StickerSelectorView.b)new qqd(s2, 11));
            final b5w g3 = new b5w((Object)r3);
            s2.f = (qgr$d)r3;
            s2.g = (qgr$c)g3;
            if (s2.h) {
                r3.e((Object)s2.i);
            }
            s2.i();
            r3.h();
            final ToggleImageButton h2 = this.h2;
            int imageResource;
            if (ew9.H0) {
                imageResource = this.D2;
            }
            else {
                imageResource = this.E2;
            }
            ((TintableImageButton)h2).setImageResource(imageResource);
            this.h2.setToggledOn(ew9.H0);
            this.A2();
            final int x3 = this.x2;
            if (x3 != 1) {
                if (x3 != 2) {
                    final c r4 = this.r2;
                    r4.g();
                    r4.f();
                }
                else {
                    this.w2();
                }
            }
            else {
                final Filters t2 = this.t2;
                if (t2 != null) {
                    this.p2(t2);
                }
                final c r5 = this.r2;
                r5.g();
                r5.f();
            }
            this.u2(true);
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        final vl1 z1 = ((sl1)this).Z1();
        this.w2 = z1.g("scribe_section");
        this.F2 = z1.b("lock_to_initial");
        this.G2 = z1.b("is_circle_crop_region");
        this.H2 = z1.b("show_grid");
        this.z2 = z1.a.getFloat("force_crop_ratio");
        this.K2 = z1.g("done_button_text");
        this.L2 = z1.g("header_text");
        this.M2 = z1.g("subheader_text");
        this.N2 = z1.b("disable_zoom");
        this.n2 = new uy(zcw.b(((sl1)this).L1));
        qgr s2 = (qgr)((sl1)this).D0("sticker_catalog_repo");
        if (s2 == null) {
            final UserIdentifier l1 = ((sl1)this).L1;
            s2 = new qgr(l1, pbu.d(l1), vav.c2(((sl1)this).L1), new mhr());
        }
        ((sl1)this).v("sticker_catalog_repo", (Object)(this.s2 = s2));
        if (bundle == null) {
            this.x2 = z1.d("initial_type");
            this.I2 = 0;
        }
        else {
            this.I2 = ((BaseBundle)bundle).getInt("sticker_tab_position");
            this.q2 = (ew9)klp.a(bundle.getByteArray("image"), (rlp)ew9.S0);
            pbm pbm;
            if (bundle.getBoolean("is_cropping")) {
                pbm = (pbm)klp.a(bundle.getByteArray("crop_rect"), (rlp)pbm.e);
            }
            else {
                pbm = null;
            }
            if (pbm != null) {
                this.v2 = new CropMediaImageView.a(((BaseBundle)bundle).getInt("rotation"), pbm);
                this.x2 = 1;
            }
            else {
                this.x2 = ((BaseBundle)bundle).getInt("editor_type");
            }
        }
    }
    
    public final void k2() {
        m8a.d((Throwable)new IllegalStateException("Filters failed to load"));
        m1f.e().c(2131954380, 1);
    }
    
    public final void l2(final boolean b) {
        if (this.r2 == null) {
            return;
        }
        this.d2.setVisibility(8);
        final c r2 = this.r2;
        ((View)r2.d).setVisibility(0);
        ((View)r2.e).setVisibility(4);
        if (!b) {
            r2.i();
            r2.g();
        }
        if (!b) {
            this.t2();
        }
        this.f2.setVisibility(0);
        this.A2();
    }
    
    public final void m2(final boolean b) {
        if (this.r2 == null) {
            return;
        }
        final View g2 = this.g2;
        final krm c = krm.c((Fragment)this);
        Objects.requireNonNull(c);
        g2.setBackgroundDrawable(c.j(2131230920));
        final c r2 = this.r2;
        ((View)r2.e).setVisibility(8);
        ((View)r2.g).setVisibility(8);
        r2.f();
        this.x2(false);
        this.f2.setVisibility(0);
        if (b) {
            this.y2(true, true);
        }
        this.A2();
        this.u2(true);
    }
    
    public final void n2(final ew9 ew9) {
        if (this.u2 == null) {
            return;
        }
        final cnb l0 = ((Fragment)this).L0();
        final String[] u2 = iwb.u2;
        if (mwb.a((Context)l0)) {
            Object l2 = ((sl1)this).L1;
            final String w2 = this.w2;
            final List o0 = ew9.O0;
            if (!fq4.t((Collection)o0)) {
                l2 = new af4((UserIdentifier)l2, new String[] { "", xjr.r(w2), "image_attachment:sticker:add" });
                final Map a = xth.a(0);
                final Map a2 = xth.a(0);
                for (final rhr rhr : o0) {
                    final long i0 = rhr.a.I0;
                    final HashMap hashMap = (HashMap)a;
                    if (!hashMap.containsKey(i0)) {
                        final gfv gfv = new gfv();
                        gfv.a = i0;
                        gfv.c = 32;
                        ((HashMap<Long, List>)a2).put(i0, vth.a(0));
                        hashMap.put(i0, gfv);
                    }
                    final List list = ((HashMap<Long, List>)a2).get(i0);
                    final nhr.a a3 = new nhr.a();
                    a3.a = rhr.a.J0;
                    list.add(a3.e());
                }
                final HashMap hashMap2 = (HashMap)a;
                for (final Map.Entry entry : hashMap2.entrySet()) {
                    final gfv gfv2 = (gfv)entry.getValue();
                    final ahr$a ahr$a = new ahr$a();
                    ahr$a.a = ((HashMap<Long, List>)a2).get(entry.getKey());
                    gfv2.k0 = (ahr)((n4j)ahr$a).e();
                }
                ((u0p)l2).j((Collection)hashMap2.values());
                cbw.b((elm)l2);
            }
            final d u3 = this.u2;
            final Filters t2 = this.t2;
            Label_0448: {
                if (t2 != null) {
                    final int j0 = ew9.J0;
                    synchronized (t2) {
                        l2 = Filters.e.get(j0);
                        break Label_0448;
                    }
                }
                l2 = null;
            }
            u3.X2(ew9, (String)l2);
        }
        else {
            String w3;
            if ((w3 = this.w2) == null) {
                w3 = "";
            }
            final x6k$a a4 = x6k.a(((Fragment)this).U0().getString(2131955735), (Context)((Fragment)this).L0(), iwb.u2);
            a4.s(aba.c("", w3, "", ""));
            this.R2.d((Object)((n4j)a4).e());
        }
    }
    
    public final void o1() {
        this.A2 = true;
        this.O2.dispose();
        final Filters t2 = this.t2;
        if (t2 != null) {
            t2.d();
        }
        final Iterator iterator = this.X1.iterator();
        while (iterator.hasNext()) {
            ((Filters)iterator.next()).d();
        }
        final c r2 = this.r2;
        if (r2 != null) {
            final eza k1 = ((jza)r2.d).k1;
            if (k1 != null) {
                final dza q0 = k1.Q0;
                if (q0 != null) {
                    final int i = q0.i;
                    if (i != 0) {
                        q0.j.f(i);
                        q0.i = 0;
                        q0.f = false;
                    }
                }
            }
            final Filters j = this.r2.i;
            if (j != null) {
                j.d();
            }
        }
        ((xcg)b.S2).D0.removeCallbacksAndMessages((Object)null);
        super.o1();
    }
    
    public final void onClick(final View view) {
        if (this.r2 == null) {
            return;
        }
        final int id = view.getId();
        if (id == 2131428783) {
            this.u2(true);
            if (this.r2.c()) {
                this.m2(false);
            }
            else if (this.r2.b() ^ true) {
                q2(this.r2);
                this.n2(this.r2.a());
            }
            else if (this.r2.b()) {
                if (this.F2) {
                    this.t2();
                    this.r2.i();
                    q2(this.r2);
                    this.n2(this.r2.a());
                }
                else {
                    this.l2(false);
                }
                this.l2.setVisibility(0);
            }
        }
        else if (id == 2131427752) {
            this.u2(true);
            if (this.r2.c()) {
                this.m2(false);
            }
            else if (this.r2.b()) {
                if (this.F2) {
                    this.i2();
                }
                else {
                    this.l2(true);
                }
            }
            else {
                this.i2();
            }
        }
        else if (id == 2131428954) {
            final c r2 = this.r2;
            if (r2 != null) {
                final ew9$b f = r2.f;
                final boolean b = f.j ^ true;
                f.j = b;
                r2.g();
                r2.f();
                final ToggleImageButton h2 = this.h2;
                int imageResource;
                if (b) {
                    imageResource = this.D2;
                }
                else {
                    imageResource = this.E2;
                }
                ((TintableImageButton)h2).setImageResource(imageResource);
                this.h2.setToggledOn(b);
            }
        }
        else if (id == 2131431764) {
            this.u2(false);
            this.z2();
        }
        else if (id == 2131431454) {
            final af4 af4 = new af4();
            ((u0p)af4).q(new String[] { "", this.w2, "editor", "filters", "click" });
            cbw.b((elm)af4);
            this.y2(this.b2.N0 ^ true, true);
        }
        else if (id == 2131428538) {
            this.u2(false);
            this.w2();
        }
        else if (id == 2131431159) {
            this.r2.e.getImageView().m();
        }
        else if (id == 2131430473) {
            final c r3 = this.r2;
            r3.j(((jvg)r3.f.a).b.h());
            this.y2 = 1;
        }
        else if (id == 2131432658) {
            this.r2.j(1.7777778f);
            this.y2 = 3;
        }
        else if (id == 2131431685) {
            this.r2.j(1.0f);
            this.y2 = 4;
        }
        else if (id == 2131427585) {
            if (this.n2.a.c()) {
                this.n2.a(((Fragment)this).N0(), (View$OnClickListener)new sy((Object)this, 8));
                final af4 af5 = new af4();
                ((u0p)af5).q(new String[] { "alt_text_sheet", "", "", "", "open" });
                cbw.b((elm)af5);
            }
            else {
                final ew9 a = this.r2.a();
                this.P2.d((Object)new AltTextActivityContentViewArgs(a, null, a.P0));
            }
            final af4 af6 = new af4();
            ((u0p)af6).q(new String[] { "", this.w2, "editor", "alt_text_button", "click" });
            cbw.b((elm)af6);
        }
        else if (id == 2131431342) {
            this.Q2.d((Object)new SensitiveMediaActivityContentViewArgs((jw9<?>)this.r2.a()));
        }
    }
    
    public final void p2(final Filters filters) {
        if (this.r2 == null) {
            return;
        }
        boolean b = false;
        Label_0113: {
            if (this.x2 != 3) {
                final mra d = mra.d("sticker_selector_tooltip", ((sl1)this).L1);
                if (d.c() && this.x2 != 2) {
                    final vit$b d2 = vit.d2(((Fragment)this).N0(), 2131431764);
                    d2.b(2131958539);
                    d2.c = 2132018371;
                    d2.h = 2131429136;
                    d2.d = (vit$c)new e71((Object)this, 0);
                    d2.c(((Fragment)this).V0, "sticker_selector_tooltip");
                    d.b();
                    b = true;
                    break Label_0113;
                }
            }
            b = false;
        }
        if (b) {
            this.y2(false, false);
        }
        final ew9 a = this.r2.a();
        this.b2.setFilterListener((FilterFilmstripView$e)null);
        this.b2.a(filters, ((jw9)a).m().toString(), a.L0, true);
        this.b2.setSelectedFilter(a.J0);
        this.b2.setIntensity(a.K0);
        this.b2.setFilterListener((FilterFilmstripView$e)this.r2);
        this.b2.b(false);
    }
    
    public final void r2(final gtb<b, Filters, Void> gtb) {
        final WeakReference weakReference = new WeakReference((T)this);
        this.O2.a(rw0.j((Callable)new ch8((Object)weakReference, 1), (n93)pr9.a, (ecq)new com.twitter.android.media.imageeditor.b$b(this, weakReference, (gtb)gtb), owo.c()));
    }
    
    public final void t2() {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "", this.w2, "image_attachment", "crop", "success" });
        final int y2 = this.y2;
        if (y2 != 1) {
            if (y2 != 2) {
                if (y2 != 3) {
                    if (y2 == 4) {
                        ((u0p)af4).c = "square_aspect";
                        final int a = c5j.a;
                    }
                }
                else {
                    ((u0p)af4).c = "wide_aspect";
                    final int a2 = c5j.a;
                }
            }
            else {
                ((u0p)af4).c = "free_aspect";
                final int a3 = c5j.a;
            }
        }
        else {
            ((u0p)af4).c = "original_aspect";
            final int a4 = c5j.a;
        }
        cbw.b((elm)af4);
    }
    
    public final void u2(final boolean b) {
        if (this.r2 != null) {
            final boolean g = uoz.g();
            int visibility = 8;
            final int n = 1;
            if (g) {
                final boolean empty = this.r2.a().b().isEmpty();
                final FixedSizeImageView m2 = this.m2;
                int visibility2;
                if ((empty ^ true) && b) {
                    visibility2 = 0;
                }
                else {
                    visibility2 = 8;
                }
                ((View)m2).setVisibility(visibility2);
            }
            int n2;
            if (b && !fq4.t((Collection)this.r2.a().R0) && xli.K0()) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            final FixedSizeImageView o2 = this.o2;
            if (n2 != 0) {
                visibility = 0;
            }
            ((View)o2).setVisibility(visibility);
        }
    }
    
    public final void v2(final boolean enabled) {
        final View k1 = ((Fragment)this).k1;
        if (k1 != null) {
            final int[] u2 = b.U2;
            for (int length = u2.length, i = 0; i < length; ++i) {
                k1.findViewById(u2[i]).setEnabled(enabled);
            }
        }
    }
    
    public final void w2() {
        this.y2(false, false);
        final c r2 = this.r2;
        if (r2 != null) {
            q2(r2);
            final c r3 = this.r2;
            ((View)r3.d).setVisibility(4);
            r3.f();
            ((View)r3.e).setVisibility(0);
        }
        if (this.z2 == 0.0f) {
            this.d2.setVisibility(0);
        }
        this.f2.setVisibility(8);
        this.A2();
    }
    
    public final void x2(final boolean b) {
        this.f2.animate().cancel();
        this.f2.setVisibility(0);
        if (b) {
            this.f2.setAlpha(0.0f);
            final View f2 = this.f2;
            final r20 r20 = new r20((Object)this, 4);
            final WeakHashMap a = j6x.a;
            j6x$d.m(f2, (Runnable)r20);
        }
        else {
            this.f2.setTranslationY(0.0f);
            this.f2.setAlpha(1.0f);
        }
    }
    
    public final void y2(final boolean n0, final boolean b) {
        if (((Fragment)this).k1 != null) {
            final FilterFilmstripView b2 = this.b2;
            b2.N0 = n0;
            boolean b3 = false;
            Label_0257: {
                if (!b) {
                    int visibility;
                    if (n0) {
                        visibility = 0;
                    }
                    else {
                        visibility = 8;
                    }
                    ((View)b2).setVisibility(visibility);
                }
                else {
                    if (b2.M0) {
                        b3 = false;
                        break Label_0257;
                    }
                    final AnimatorSet set = new AnimatorSet();
                    if (n0) {
                        ((View)b2).setVisibility(0);
                        set.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat((Object)b2, View.TRANSLATION_Y, new float[] { (float)((View)b2).getMeasuredHeight(), 0.0f }), (Animator)ObjectAnimator.ofFloat((Object)b2, View.ALPHA, new float[] { 0.0f, 1.0f }) });
                    }
                    else {
                        set.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat((Object)b2, View.TRANSLATION_Y, new float[] { 0.0f, (float)((View)b2).getMeasuredHeight() }), (Animator)ObjectAnimator.ofFloat((Object)b2, View.ALPHA, new float[] { 1.0f, 0.0f }) });
                        ((Animator)set).addListener((Animator$AnimatorListener)new vya(b2));
                    }
                    ((Animator)set).addListener((Animator$AnimatorListener)new wya(b2));
                    set.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
                    set.setDuration(300L);
                    set.start();
                    b2.M0 = true;
                }
                b3 = true;
            }
            if (b3) {
                final TransitionDrawable transitionDrawable = (TransitionDrawable)this.f2.getBackground();
                if (n0) {
                    ((TintableImageButton)this.c2).setImageResource(this.B2);
                    this.c2.setToggledOn(true);
                    final c r2 = this.r2;
                    if (r2 != null) {
                        r2.d.D((com.twitter.android.media.stickers.b)null);
                    }
                    transitionDrawable.startTransition(250);
                }
                else {
                    ((TintableImageButton)this.c2).setImageResource(this.C2);
                    this.c2.setToggledOn(false);
                    transitionDrawable.reverseTransition(250);
                }
                this.A2();
            }
        }
    }
    
    public final void z2() {
        final c r2 = this.r2;
        if (r2 == null) {
            return;
        }
        if (r2.d.getStickers().size() >= 25) {
            m1f.e().a((CharSequence)((Fragment)this).W0(2131955734), 1);
            return;
        }
        this.g2.setBackgroundColor(((Fragment)this).U0().getColor(2131099699));
        final c r3 = this.r2;
        ((View)r3.e).setVisibility(8);
        ((View)r3.g).setVisibility(0);
        this.y2(false, false);
        this.f2.setVisibility(8);
        this.A2();
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "", this.w2, "editor", "sticker", "show" });
        cbw.b((elm)af4);
    }
    
    public interface d
    {
        void I3(final boolean p0);
        
        void X2(final ew9 p0, final String p1);
    }
}
