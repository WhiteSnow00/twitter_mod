// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.qrcodes;

import android.view.View;
import android.view.WindowManager$LayoutParams;
import android.app.Activity;
import com.twitter.ui.widget.touchintercept.TouchInterceptingFrameLayout;
import android.view.View$OnClickListener;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.permissions.PermissionContentViewResult;
import android.net.Uri;
import android.widget.Button;
import com.twitter.ui.view.RtlViewPager;
import android.widget.ImageButton;
import tv.periscope.android.graphics.GLRenderView;
import androidx.viewpager.widget.ViewPager$i;

@a91
public class QRCodeContentViewProvider extends kcv implements a$a, ViewPager$i
{
    public final e39 Z0;
    public final zb3 a1;
    public final GLRenderView b1;
    public final ImageButton c1;
    public final ImageButton d1;
    public final RtlViewPager e1;
    public final QRCodeContentViewProvider.QRCodeContentViewProvider$d f1;
    public final ImageButton g1;
    public final ImageButton h1;
    public final Button i1;
    public qgv j1;
    public Uri k1;
    public boolean l1;
    public int m1;
    public final jo6<k7k, PermissionContentViewResult> n1;
    
    public QRCodeContentViewProvider(Intent e1, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final duo duo, final fda<fo> fda2, final m9p m9p) {
        super(e1, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = new e39();
        this.m1 = 0;
        this.b1 = (GLRenderView)this.C4(2131428066);
        final eo2 eo2 = new eo2();
        eo2.a.add(new ag8());
        this.a1 = new zb3((Context)dob, eo2, (isg)new oj8(), w4a.a().a(), 0);
        e1 = (Intent)this.C4(2131430504);
        ((r8g)(this.e1 = (RtlViewPager)e1)).setScrollDurationMilliseconds(500);
        ((RtlViewPager)e1).c((ViewPager$i)this);
        ((RtlViewPager)e1).setAdapter((wuj)(this.f1 = new QRCodeContentViewProvider.QRCodeContentViewProvider$d(this, this.I4())));
        this.C4(2131428264).setOnClickListener((View$OnClickListener)new QRCodeContentViewProvider.QRCodeContentViewProvider$c(this));
        final WindowManager$LayoutParams attributes = ((Activity)dob).getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        ((Activity)dob).getWindow().setAttributes(attributes);
        ((Activity)dob).getWindow().addFlags(128);
        qee.q();
        try {
            ((Activity)dob).setRequestedOrientation(1);
        }
        catch (final Exception ex) {
            r9a.d((Throwable)ex);
        }
        final TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout)this.C4(2131431156);
        touchInterceptingFrameLayout.setTouchInterceptListener((xut)new g4a((Context)dob, (iuw$a)new sc9((Activity)dob, ((View)touchInterceptingFrameLayout).findViewById(2131432219), ((View)touchInterceptingFrameLayout).findViewById(2131432535), (sc9$b)new gf8((Object)this, 15))));
        final ImageButton c1 = (ImageButton)this.C4(2131430764);
        ((View)(this.c1 = c1)).setOnClickListener((View$OnClickListener)new bqf((Object)this, 3));
        final ImageButton d1 = (ImageButton)this.C4(2131430902);
        ((View)(this.d1 = d1)).setOnClickListener((View$OnClickListener)new cqf((Object)this, 2));
        final ImageButton g1 = (ImageButton)this.C4(2131431398);
        ((View)(this.g1 = g1)).setOnClickListener((View$OnClickListener)new d1x((Object)this, 3));
        final ImageButton h1 = (ImageButton)this.C4(2131428061);
        ((View)(this.h1 = h1)).setOnClickListener((View$OnClickListener)new quf(this, 5));
        final Button i1 = (Button)this.C4(2131430839);
        ((View)(this.i1 = i1)).setOnClickListener((View$OnClickListener)new f2p((Object)this, 3));
        if (this.l1) {
            ((View)i1).setVisibility(0);
            ((View)d1).setVisibility(8);
            ((View)h1).setVisibility(8);
        }
        else {
            final int m1 = this.m1;
            if (m1 == 0) {
                ((View)c1).setVisibility(0);
                ((View)g1).setVisibility(0);
            }
            else {
                ((RtlViewPager)e1).setCurrentItem(m1);
            }
        }
        this.Z4();
        final jo6<k7k, PermissionContentViewResult> h2 = super.T0.h(PermissionContentViewResult.class, htm.a((Class<RES>)PermissionContentViewResult.class));
        this.n1 = h2;
        f.i(h2.a(), (fa3)new qjl((Object)this, 3));
        duo.a((gto<?>)new QRCodeContentViewProvider$a(this));
        vo.a((fda)fda2, 2, (fa3)new h3((Object)this, 4));
        cbf.K((jn)new QRCodeContentViewProvider$b());
        f.i(k9x.d(), (fa3)new jg1((Object)this, 4));
    }
    
    public final void B3(final int n) {
    }
    
    public final void D(final int n) {
        this.Z4();
        if (n == 1 && !this.l1) {
            this.a5();
            ((View)this.d1).setVisibility(0);
            ((View)this.h1).setVisibility(0);
        }
    }
    
    public final void N4() {
        this.a1.w();
        this.Z0.a();
    }
    
    @Override
    public final void P4() {
        super.P4();
        this.b1.b();
        this.a1.V();
    }
    
    public final iba W4() {
        final int n = (int)this.f1.getItemId(this.e1.getCurrentItem());
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new IllegalStateException("Returned unknown fragment ID");
                }
                s = "user_card";
            }
            else {
                s = "qr_scan";
            }
        }
        else {
            s = "qr_profile";
        }
        return hba.b("qr", s, "");
    }
    
    public final void X4() {
        if (u7k.d().a((Context)super.G0, pe3.a(0))) {
            this.Z0.c(this.a1.B(this.b1).G((rk6)new ppa(this, 5), (rk6)lvb.e));
        }
        else {
            final jo6<k7k, PermissionContentViewResult> n1 = this.n1;
            final dob g0 = super.G0;
            final k7k.a a = k7k.a(((Context)g0).getString(2131952366), (Context)g0, pe3.a(0));
            a.t(((Context)g0).getString(2131955730));
            a.q(false);
            n1.d((Object)a.e());
        }
    }
    
    public final void Y4(final Uri k1) {
        if (this.f1.S() != null) {
            final dob g0 = super.G0;
            final e2h j0 = e2h.J0;
            dwg.f((Context)g0, k1).c((bdq)new b.c(this.f1.S()));
        }
        else {
            this.k1 = k1;
        }
    }
    
    public final void Z4() {
        final fg4 fg4 = new fg4(super.M0);
        ((o1p)fg4).T = dda.Companion.b(this.W4(), "", "impression").toString();
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public final void a5() {
        if (this.f1.S() != null) {
            this.f1.S().g2 = (wb3)this.a1;
            this.f1.S().m2();
        }
    }
    
    public final void h2(final int n, float n2, final int n3) {
        if (n >= 1 && !this.l1) {
            ((View)this.g1).setVisibility(8);
            ((View)this.c1).setVisibility(8);
            ((View)this.h1).setVisibility(0);
            ((View)this.d1).setVisibility(0);
        }
        else if (n == 0 && !this.l1) {
            ((View)this.g1).setVisibility(0);
            ((View)this.c1).setVisibility(0);
            ((View)this.h1).setVisibility(0);
            ((View)this.d1).setVisibility(0);
            final ImageButton g1 = this.g1;
            final float n4 = 2.0f * n2;
            ((View)g1).setAlpha(1.0f - n4);
            ((View)this.h1).setAlpha(n4 - 1.0f);
            ((View)this.c1).setAlpha(1.0f - n2);
            ((View)this.d1).setAlpha(n2);
            final ImageButton c1 = this.c1;
            n2 *= -90.0f;
            ((View)c1).setRotation(n2);
            ((View)this.d1).setRotation(n2 + 90.0f);
        }
    }
    
    public final void n3(final qgv j1) {
        this.j1 = j1;
        ((View)this.i1).setVisibility(0);
        ((View)this.d1).setVisibility(8);
        ((View)this.h1).setVisibility(8);
        this.l1 = true;
        ((wuj)this.f1).J();
    }
}
