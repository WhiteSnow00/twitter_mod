// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import com.twitter.media.ui.image.c;
import com.twitter.media.ui.image.AspectRatioFrameLayout;
import com.twitter.media.ui.image.b$c;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager.widget.ViewPager;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.view.View;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;

public class StickerTabLayout extends TabLayout
{
    public boolean u1;
    public int v1;
    
    public StickerTabLayout(final Context context, final AttributeSet set) {
        int data = 0;
        super(context, set, 0);
        this.v1 = 0;
        final TypedValue typedValue = new TypedValue();
        if (((View)this).getContext().getTheme().resolveAttribute(2130970728, typedValue, true)) {
            data = typedValue.data;
        }
        this.v1 = data;
    }
    
    public static hhr B(final a a, int n, final boolean b, final boolean b2) {
        int i = 0;
        int n2 = 0;
        while (i < 2) {
            int n3 = n2;
            if ((new boolean[] { b, b2 })[i]) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        n -= n2;
        hhr hhr;
        if (b2) {
            hhr = hr4.e((Iterable)a.F0, (otk)a.M0).get(n);
        }
        else {
            hhr = a.F0.get(n);
        }
        pf8.r(hhr);
        return hhr;
    }
    
    public final View A() {
        final ImageView imageView = new ImageView(((View)this).getContext());
        imageView.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
        final Context context = ((View)this).getContext();
        final int a = xd9.a(context, 2130969703, 2131232473);
        final Object a2 = eo6.a;
        imageView.setImageDrawable(eo6$c.b(context, a));
        ((View)imageView).setContentDescription((CharSequence)((View)this).getResources().getString(2131958538));
        return (View)imageView;
    }
    
    public void setShouldShowRecentlyUsedFirstIfExists(final boolean u1) {
        this.u1 = u1;
    }
    
    @Override
    public void setupWithViewPager(final ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        if (viewPager == null) {
            return;
        }
        if (viewPager.getAdapter() != null) {
            this.o();
            final a a = (a)viewPager.getAdapter();
            final boolean q = a.Q();
            final boolean b = this.u1 && a.R();
            final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(2131167274);
            for (int i = 0; i < a.getCount(); ++i) {
                hhr a2 = null;
                Object f;
                if (b && i == 0) {
                    f = this.A();
                }
                else if (i == (b ? 1 : 0) && q) {
                    f = new ImageView(((View)this).getContext());
                    ((ImageView)f).setScaleType(ImageView$ScaleType.CENTER_INSIDE);
                    final Context context = ((View)this).getContext();
                    final int a3 = xd9.a(context, 2130969702, 2131232467);
                    final Object a4 = eo6.a;
                    ((ImageView)f).setImageDrawable(eo6$c.b(context, a3));
                    ((View)f).setContentDescription((CharSequence)((View)this).getResources().getString(2131958536));
                }
                else if (b) {
                    a2 = B(a, i, q, true);
                    f = this.z(a2.e, a2.d);
                }
                else {
                    a2 = B(a, i, q, false);
                    if (a2.e.equals("recently_used")) {
                        f = this.A();
                    }
                    else {
                        f = this.z(a2.e, a2.d);
                    }
                }
                final g m = this.m();
                m.f = (View)f;
                m.h();
                m.a = a2;
                this.b(m);
                final ViewGroup$LayoutParams layoutParams = ((View)f).getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
            }
            return;
        }
        throw new IllegalStateException("Set adapter before setting up tabs");
    }
    
    public final View z(final String contentDescription, final ggr ggr) {
        final FrescoMediaImageView frescoMediaImageView = new FrescoMediaImageView(((View)this).getContext());
        ((AspectRatioFrameLayout)frescoMediaImageView).setScaleMode(1);
        frescoMediaImageView.setScaleType(b$c.F0);
        if (ggr != null) {
            ((com.twitter.media.ui.image.c)frescoMediaImageView).p(t8d.g(ggr.b));
        }
        else {
            ((com.twitter.media.ui.image.c)frescoMediaImageView).setDefaultDrawable(xd9.c(tqm.Companion.b((View)this).j(xd9.a(((View)this).getContext(), 2130969767, 2131232432)), this.v1));
        }
        ((View)frescoMediaImageView).setContentDescription((CharSequence)contentDescription);
        return (View)frescoMediaImageView;
    }
}
