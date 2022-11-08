// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor;

import com.twitter.ui.widget.MultiTouchImageView;
import com.twitter.media.ui.image.d;
import android.view.View;
import android.graphics.Bitmap;
import java.util.Collection;
import androidx.viewpager.widget.ViewPager;
import com.twitter.android.media.imageeditor.stickers.b;
import java.util.List;
import com.twitter.android.media.stickers.a;
import com.twitter.media.legacy.widget.FilterFilmstripView;
import java.util.Objects;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.ui.view.RtlViewPager;
import com.twitter.media.filters.Filters;
import com.twitter.android.media.imageeditor.stickers.StickerSelectorView;
import com.twitter.android.media.stickers.StickerFilteredImageView;
import androidx.fragment.app.p;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.media.legacy.widget.FilterFilmstripView$e;

public final class c implements FilterFilmstripView$e, vfr$d<xfr>
{
    public final WeakReference<Context> a;
    public final WeakReference<p> b;
    public boolean c;
    public final StickerFilteredImageView d;
    public final CropMediaImageView e;
    public final rw9$b f;
    public final StickerSelectorView g;
    public CropMediaImageView.a h;
    public Filters i;
    public RtlViewPager j;
    public int k;
    
    public c(final StickerFilteredImageView d, final CropMediaImageView e, final StickerSelectorView g, final rw9 rw9, final Context context, final p p6) {
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = new rw9$b(rw9);
        this.a = new WeakReference<Context>(context);
        this.b = new WeakReference<p>(p6);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean c = false;
        if (defaultSharedPreferences.getInt("filters_tooltip_times_shown", 0) < 3) {
            final t3s a = mq1.a;
            c = c;
            if (System.currentTimeMillis() - defaultSharedPreferences.getLong("filters_tooltip_last_time_shown", 0L) >= 86400000L) {
                c = true;
            }
        }
        this.c = c;
    }
    
    public final rw9 a() {
        final rw9$b f = this.f;
        Objects.requireNonNull(f);
        return new rw9(f);
    }
    
    public final boolean b() {
        return ((View)this.e).getVisibility() == 0;
    }
    
    public final boolean c() {
        return ((View)this.g).getVisibility() == 0;
    }
    
    public final void d(final FilterFilmstripView filterFilmstripView) {
        final rw9$b f = this.f;
        final int selectedFilter = filterFilmstripView.getSelectedFilter();
        final float intensity = filterFilmstripView.getIntensity();
        f.l = selectedFilter;
        f.m = intensity;
        this.g();
        if (this.c) {
            if (filterFilmstripView.M0) {
                ((View)filterFilmstripView).postDelayed((Runnable)new dj9(this, filterFilmstripView, filterFilmstripView.getActivePreview(), 1), 250L);
            }
        }
        this.f();
    }
    
    public final void e(final Object o) {
        final xfr xfr = (xfr)o;
        final StickerSelectorView g = this.g;
        final int k = this.k;
        ((View)g.G0).setVisibility(8);
        RtlViewPager c0;
        if (xfr != null) {
            g.H0.setVisibility(8);
            final t3s a = mq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            final com.twitter.android.media.imageeditor.stickers.a a2 = new com.twitter.android.media.imageeditor.stickers.a(((View)g).getContext(), (List)com.twitter.android.media.stickers.a.a(xfr.a, currentTimeMillis), (List)com.twitter.android.media.stickers.a.a(xfr.b, currentTimeMillis), (b.c)g, g.L0);
            g.I0 = a2;
            a2.K0 = g.J0;
            g.C0.setAdapter((cuj)a2);
            g.D0.setupWithViewPager((ViewPager)g.C0);
            if (k > 0 && k < g.I0.getCount()) {
                g.C0.setCurrentItem(k);
            }
            c0 = g.C0;
        }
        else {
            g.H0.setVisibility(0);
            c0 = null;
        }
        this.j = c0;
    }
    
    public final void f() {
        final Context context = this.a.get();
        if (context == null) {
            return;
        }
        final e7d a = this.f.a;
        final t8d$a g = t8d.g(((kvg)a).g().toString());
        g.n = true;
        final Context applicationContext = context.getApplicationContext();
        final rw9$b f = this.f;
        g.s = (h9d)new j0b(applicationContext, f.l, f.j, f.m);
        Object o;
        if ((o = this.f.f) == null) {
            o = v2a.C0;
        }
        if (!hr4.t((Collection)o)) {
            g.z = (p8d)new qgr(((kvg)a).b.h(), (List)o);
        }
        this.e.setScaleFactor(1.0f);
        final CropMediaImageView e = this.e;
        final CropMediaImageView.a h = this.h;
        e.p1 = h;
        if (((d)e).q(g, false)) {
            e.o1.setShowCrop(false);
        }
        else {
            e.o1.setShowCrop(true);
            if (h == null) {
                ((MultiTouchImageView)e.o1).setImageSelection(abm.g);
                e.o1.setRotation(0);
            }
            else {
                ((MultiTouchImageView)e.o1).setImageSelection(h.b);
                e.o1.setRotation(h.a);
            }
        }
    }
    
    public final void g() {
        if (this.a.get() == null) {
            return;
        }
        final rw9$b f = this.f;
        Objects.requireNonNull(f);
        final rw9 i1 = new rw9(f);
        final StickerFilteredImageView d = this.d;
        if (!i1.o(d.I1)) {
            d.I1 = i1;
            d.H1 = null;
            final t8d$a g = t8d.g(((ww9)i1).m().toString());
            g.p = i1.L0;
            g.q = i1.K0;
            ((d)d).q(g, g.n = true);
        }
        this.d.setFilterIntensity(i1.J0);
        final StickerFilteredImageView d2 = this.d;
        final int i2 = i1.I0;
        final boolean g2 = i1.G0;
        final h0b j1 = d2.j1;
        if (j1 != null) {
            j1.setFilterId(i2);
            if (d2.i1 != g2) {
                final Bitmap k1 = d2.k1;
                if (k1 != null) {
                    d2.i1 = g2;
                    d2.j1.d(k1, g2);
                }
            }
        }
    }
    
    public final void h() {
        final StickerFilteredImageView d = this.d;
        final h0b j1 = d.j1;
        if (j1 != null && d.l1) {
            final xvb$i d2 = ((xvb)j1).D0;
            Objects.requireNonNull(d2);
            final xvb$j n0 = xvb.N0;
            synchronized (n0) {
                d2.E0 = false;
                d2.P0 = true;
                d2.Q0 = false;
                n0.notifyAll();
                while (!d2.D0 && d2.F0 && !d2.Q0) {
                    try {
                        xvb.N0.wait();
                    }
                    catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
    
    public final void i() {
        final CropMediaImageView.a cropState = this.e.getCropState();
        this.h = cropState;
        final rw9$b f = this.f;
        final int a = cropState.a;
        f.n = a;
        f.d = w7d.b(a, false).g(cropState.b);
    }
    
    public final void j(final float cropAspectRatio) {
        this.e.getImageView().setCropAspectRatio(cropAspectRatio);
    }
}
