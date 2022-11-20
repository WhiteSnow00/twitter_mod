import com.twitter.media.ui.image.AspectRatioFrameLayout;
import com.twitter.media.ui.image.c;
import android.view.MenuItem;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.AppBarLayout;
import android.view.Menu;
import java.util.Objects;
import android.os.Parcelable;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.webkit.WebView;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import android.app.Activity;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import com.twitter.android.revenue.card.VideoWebsiteCardFullscreenChromeView;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bq2 extends vbv
{
    public zc4 X0;
    public cp2 Y0;
    public final wh3 Z0;
    public final hp2 a1;
    public VideoContainerHost b1;
    public VideoWebsiteCardFullscreenChromeView c1;
    public View d1;
    public View e1;
    public TextView f1;
    public TextView g1;
    public TextView h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    
    public bq2(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final jto jto, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = ((fdi)((b5j)br0.a()).B((Class)fdi.class)).Q7();
        this.i1 = -1;
        this.k1 = true;
        this.l1 = true;
        this.l1 = intent.getBooleanExtra("extra_is_video", true);
        final efv efv = (efv)klp.a(intent.getByteArrayExtra("extra_scribe_association"), (rlp)efv.i);
        final hp2 a1 = (hp2)intent.getParcelableExtra("browser_data_source");
        this.a1 = a1;
        final mj3 mj3 = new mj3((Context)cnb, efv);
        if (a1 != null) {
            mj3.j(a1.e(), a1.s1(), (String)null, a1);
        }
        this.Z0 = new wh3((qh3)new th3((Activity)cnb, (jfu)new kfu((Context)cnb), (obi)obi), (kj3)mj3, "");
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)((u9)this).C4(2131428289);
        final LayoutInflater from = LayoutInflater.from((Context)cnb);
        int n;
        if (this.l1) {
            n = 2131624897;
        }
        else {
            n = 2131624896;
        }
        ((ViewGroup)collapsingToolbarLayout).addView(from.inflate(n, (ViewGroup)null));
        if (this.l1) {
            jee.l((Object)(this.b1 = (VideoContainerHost)((u9)this).C4(2131432552)));
            final i1 a2 = (i1)intent.getParcelableExtra("extra_av_data_source");
            jee.l((Object)a2);
            Object c;
            if (intent.getBooleanExtra("extra_audio_on", false)) {
                c = ffz.Z0;
            }
            else {
                c = ffz.a1;
            }
            final VideoWebsiteCardFullscreenChromeView c2 = (VideoWebsiteCardFullscreenChromeView)((u9)this).C4(2131432551);
            this.c1 = c2;
            this.e1 = ((View)c2).findViewById(2131429987);
            final mxw$a mxw$a = new mxw$a();
            mxw$a.a = a2;
            mxw$a.f = bv0.a(a2);
            mxw$a.c = (flk)c;
            mxw$a.d = (r6x)s6x.c;
            mxw$a.b = (mba)new lbv(efv);
            mxw$a.g = (e1x)this.c1;
            mxw$a.m = true;
            this.b1.setVideoContainerConfig((mxw)((n4j)mxw$a).e());
            final TextView textView = (TextView)((u9)this).C4(2131427866);
            if (textView != null) {
                ((View)textView).setVisibility(8);
            }
        }
        else {
            this.e1 = ((u9)this).C4(2131429987);
            final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)((u9)this).C4(2131428096);
            ((c)frescoMediaImageView).setImageType("card");
            final dtg dtg = (dtg)klp.a(intent.getByteArrayExtra("extra_media_entity"), (rlp)dtg.p1);
            jee.l((Object)dtg);
            ((c)frescoMediaImageView).p(y7d.b(dtg));
            float aspectRatio;
            if (dtg.S0.b()) {
                aspectRatio = dtg.S0.b.h();
            }
            else if (!dtg.U0.i()) {
                aspectRatio = dtg.U0.h();
            }
            else {
                aspectRatio = 2.5f;
            }
            ((AspectRatioFrameLayout)frescoMediaImageView).setAspectRatio(aspectRatio);
            ((View)frescoMediaImageView).setBackgroundColor(pps.g(dtg, resources.getColor(2131099922)));
            ((View)frescoMediaImageView).setOnTouchListener((View$OnTouchListener)new cq2(this));
        }
        (this.d1 = ((u9)this).C4(2131428998)).setOnClickListener((View$OnClickListener)new fpf(this, 4));
        final View e1 = this.e1;
        jee.l((Object)e1);
        this.f1 = (TextView)e1.findViewById(2131432076);
        final View e2 = this.e1;
        jee.l((Object)e2);
        this.g1 = (TextView)e2.findViewById(2131431801);
        if (this.l1) {
            final TextView f1 = this.f1;
            jee.l((Object)f1);
            ((View)f1).setVisibility(8);
            final TextView g1 = this.g1;
            jee.l((Object)g1);
            ((View)g1).setVisibility(8);
        }
        final View e3 = this.e1;
        jee.l((Object)e3);
        final TextView h1 = (TextView)e3.findViewById(2131429986);
        jee.l((Object)(this.h1 = h1));
        ((View)h1).setVisibility(8);
        this.Y0 = new cp2((Activity)cnb, (kp2)new bq2.bq2$b(this, cnb, (pwe)new zp2(this), jn), new fnx((Context)cnb, a1, zil.a()), (WebView)((u9)this).C4(2131432649), (ProgressBar)((u9)this).C4(2131430785), false, false, new sp2(gdi.a().k6()), m6f.a(), obi, this.X0);
        jto.a((mso)new mso<Bundle>(this) {
            public final bq2 D0;
            
            public final Parcelable C3() {
                final cp2 y0 = this.D0.Y0;
                Objects.requireNonNull(y0);
                final Bundle bundle = new Bundle();
                y0.g(bundle);
                return (Parcelable)bundle;
            }
            
            public final void T0() {
            }
            
            public final String getId() {
                return bq2$a.class.getName();
            }
            
            public final void v(final Parcelable parcelable) {
                this.D0.W4((Bundle)parcelable);
            }
        });
        this.W4(null);
        r8x.k().subscribe((lj6)new vgd(this, 8));
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        super.N2(hai, menu);
        this.Y0.b(hai, menu);
        return true;
    }
    
    public final void N4() {
        this.Y0.c();
        if (this.l1) {
            this.X4().d();
        }
    }
    
    public final void P4() {
        super.P4();
        if (this.l1) {
            this.X4().getAutoPlayableItem().a1();
        }
        this.Y0.f();
    }
    
    public final void Q4() {
        super.Q4();
        if (this.l1) {
            this.X4().getAutoPlayableItem().j1();
        }
    }
    
    public final void W4(final Bundle bundle) {
        this.Y0.e(bundle, ((u9)this).L0);
        final cp2 y0 = this.Y0;
        final lo0 lo0 = (lo0)dwj.b(((u9)this).L0, "extra_app_store_data", (rlp)lo0.o);
        if (lo0 != null) {
            final dq2 u = new dq2(this, lo0);
            Objects.requireNonNull(y0);
            y0.u = (View$OnTouchListener)u;
        }
        final AppBarLayout appBarLayout = (AppBarLayout)((u9)this).C4(2131427617);
        final ViewGroup viewGroup = (ViewGroup)((u9)this).C4(2131432114);
        ((View)viewGroup).setVisibility(8);
        appBarLayout.a((AppBarLayout$OnOffsetChangedListener)new aq2(this, viewGroup));
        this.Y4(((u9)this).L0.getStringExtra("extra_vanity_url"));
    }
    
    public final VideoContainerHost X4() {
        final VideoContainerHost b1 = this.b1;
        jee.l((Object)b1);
        final VideoContainerHost videoContainerHost = b1;
        return b1;
    }
    
    public final void Y4(final String text) {
        if (this.l1 && ikr.g((CharSequence)text)) {
            final TextView h1 = this.h1;
            jee.l((Object)h1);
            final TextView textView = h1;
            h1.setText((CharSequence)text);
            ((View)this.h1).setVisibility(0);
        }
    }
    
    public final int d2(final hai hai) {
        return 1;
    }
    
    public final boolean j() {
        this.Y0.a();
        return true;
    }
    
    public final void m0() {
        this.Y0.d();
    }
    
    public final boolean n(final MenuItem menuItem) {
        if (this.Y0.i(menuItem)) {
            super.n(menuItem);
        }
        return true;
    }
}
