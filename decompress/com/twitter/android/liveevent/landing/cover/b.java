// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.cover;

import android.content.res.Resources;
import com.twitter.media.ui.image.UserImageView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.util.InvalidDataException;
import java.util.Objects;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import java.util.List;
import android.app.Activity;

public final class b extends e7x implements com.twitter.android.liveevent.landing.cover.a.b, puf
{
    public final a H0;
    public final com.twitter.android.liveevent.landing.cover.a I0;
    public final Activity J0;
    
    public b(final z7x z7x, final Activity j0, final a h0, final com.twitter.android.liveevent.landing.cover.a i0) {
        super(z7x);
        this.J0 = j0;
        this.H0 = h0;
        this.I0 = i0;
        i0.b = (com.twitter.android.liveevent.landing.cover.a.b)this;
    }
    
    @Override
    public final void G0() {
        this.H0.C0.setVisibility(8);
    }
    
    @Override
    public final void R0(final hfv hfv, final String text, final String s, final String text2, final vo6 vo6, final List<ptf> list) {
        this.H0.D0.setOnClickListener((View$OnClickListener)new gpa(this, hfv, 1));
        final a h0 = this.H0;
        h0.C0.setVisibility(0);
        h0.G0.setText((CharSequence)hfv.c());
        h0.I0.H(hfv);
        ((View)h0.I0).setVisibility(0);
        final ImageView j0 = h0.J0;
        int visibility;
        if (!hfv.M0 && (hfv.h() == null || !hfv.h())) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        j0.setVisibility(visibility);
        final ImageView k0 = h0.K0;
        int visibility2;
        if (hfv.L0) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        k0.setVisibility(visibility2);
        h0.H0.setText((CharSequence)pjr.l(hfv.J0));
        ((View)h0.H0).setVisibility(0);
        h0.N0.i(h0.F0, s, (List)vo6);
        h0.E0.setText((CharSequence)text);
        if (pjr.e((CharSequence)text2)) {
            ((View)h0.L0).setVisibility(8);
        }
        else {
            ((View)h0.L0).setVisibility(0);
            h0.L0.setText((CharSequence)text2);
        }
    }
    
    public final void e1(final ouf ouf) {
        final com.twitter.android.liveevent.landing.cover.a i0 = this.I0;
        final bwf a = ouf.a;
        final vo6 c = ouf.c;
        Objects.requireNonNull(i0.a);
        if (!dta.b().b("live_event_hero_description_fields_enabled", false)) {
            i0.b.G0();
        }
        else {
            try {
                final qof a2 = com.twitter.android.liveevent.landing.cover.a.a(a).a;
                pf8.r(a2);
                i0.b(a2, c);
            }
            catch (final InvalidDataException ex) {
                i0.b.G0();
            }
        }
    }
    
    @Override
    public final void m0(final String text, final String text2, final String s, final String text3, final vo6 vo6, final List<ptf> list) {
        final a h0 = this.H0;
        h0.C0.setVisibility(0);
        final boolean g = pjr.g((CharSequence)text);
        final TextView g2 = h0.G0;
        int visibility;
        if (g) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)g2).setVisibility(visibility);
        h0.G0.setText((CharSequence)text);
        final TextView g3 = h0.G0;
        g3.setTextColor(goz.J(((View)g3).getContext(), 2130969093));
        if (pjr.e((CharSequence)text3)) {
            ((View)h0.H0).setVisibility(8);
            ((View)h0.M0).setVisibility(8);
        }
        else {
            ((View)h0.M0).setVisibility(0);
            ((View)h0.H0).setVisibility(0);
            h0.H0.setText((CharSequence)text3);
        }
        h0.N0.i(h0.F0, s, (List)vo6);
        h0.E0.setText((CharSequence)text2);
        final ViewGroup$LayoutParams layoutParams = ((View)h0.E0).getLayoutParams();
        final int a = w4j.a;
        final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)layoutParams;
        if (!g) {
            linearLayout$LayoutParams.topMargin = h0.O0;
        }
    }
    
    @Override
    public final void w1() {
        Objects.requireNonNull(this.I0);
    }
    
    public static final class a extends el8
    {
        public final View D0;
        public final TextView E0;
        public final TextView F0;
        public final TextView G0;
        public final TextView H0;
        public final UserImageView I0;
        public final ImageView J0;
        public final ImageView K0;
        public final TextView L0;
        public final TextView M0;
        public final ktf N0;
        public final int O0;
        
        public a(final View view, final ktf n0, final Resources resources) {
            super(view.findViewById(2131427537));
            this.D0 = view.findViewById(2131427544);
            this.G0 = (TextView)view.findViewById(2131427534);
            this.E0 = (TextView)view.findViewById(2131427536);
            this.F0 = (TextView)view.findViewById(2131427532);
            this.H0 = (TextView)view.findViewById(2131427535);
            this.I0 = (UserImageView)view.findViewById(2131427693);
            this.J0 = (ImageView)view.findViewById(2131432526);
            this.K0 = (ImageView)view.findViewById(2131430811);
            this.L0 = (TextView)view.findViewById(2131427531);
            this.M0 = (TextView)view.findViewById(2131427533);
            this.O0 = resources.getDimensionPixelSize(2131167445);
            this.N0 = n0;
        }
    }
}
