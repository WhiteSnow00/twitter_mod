// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.widget;

import android.animation.Animator;
import android.content.res.XmlResourceParser;
import java.util.Objects;
import android.text.TextWatcher;
import com.twitter.card.common.preview.b$a;
import com.twitter.card.common.preview.a$a;
import com.twitter.card.common.preview.CardPreviewView;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageButton;
import android.os.ResultReceiver;
import com.twitter.dm.widget.RecordingAudioView;
import android.view.MotionEvent;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.view.View$OnClickListener;
import com.twitter.subsystem.composer.TweetBox$e;
import com.twitter.util.user.UserIdentifier;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import com.twitter.media.legacy.widget.InlineComposerMediaScrollView;
import com.twitter.media.legacy.widget.InlineComposerMediaLayout;
import android.view.View;
import android.widget.ImageView;
import com.twitter.media.legacy.widget.InlineComposerMediaScrollView$a;
import com.twitter.app.dm.d;

public class DMConversationMessageComposer extends com.twitter.app.dm.widget.b<DMConversationMessageComposer.DMConversationMessageComposer$b> implements b, InlineComposerMediaScrollView$a, y4m$a
{
    public final ImageView Q0;
    public final View R0;
    public final View S0;
    public final InlineComposerMediaLayout T0;
    public final InlineComposerMediaScrollView U0;
    public final AttachmentMediaView V0;
    public final a W0;
    public dt7 X0;
    public com.twitter.card.common.preview.b Y0;
    public y4m Z0;
    public final vrk a1;
    public final spf b1;
    public final tzt c1;
    public final Handler d1;
    public boolean e1;
    public final boolean f1;
    public final int g1;
    public final int h1;
    public final int i1;
    public int j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public float n1;
    public float o1;
    public elb p1;
    
    public DMConversationMessageComposer(Context xml, final AttributeSet set) {
        super(xml, set);
        this.a1 = new vrk((Object)this, 7);
        this.b1 = new spf((Object)this, 8);
        this.d1 = new Handler();
        this.i1 = ((View)this).getResources().getDimensionPixelSize(2131165652);
        boolean f1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.p1 = new elb((Object)this, 4);
        this.W0 = new a(UserIdentifier.getCurrent());
        super.F0.setHintText(((View)this).getResources().getString(2131955823));
        super.F0.d((TweetBox$e)new p4w((Object)this, 15));
        if (xml.getResources().getConfiguration().hardKeyboardHidden == 1) {
            f1 = true;
        }
        this.f1 = f1;
        ((View)(this.Q0 = (ImageView)((View)super.D0).findViewById(2131429951))).setOnClickListener((View$OnClickListener)this);
        View viewById;
        if (amy.z()) {
            viewById = ((View)super.D0).findViewById(2131429266);
        }
        else {
            viewById = null;
        }
        this.R0 = viewById;
        this.S0 = ((View)super.D0).findViewById(2131429326);
        final InlineComposerMediaLayout t0 = (InlineComposerMediaLayout)((View)super.D0).findViewById(2131429968);
        this.T0 = t0;
        final InlineComposerMediaScrollView u0 = (InlineComposerMediaScrollView)((View)t0).findViewById(2131429967);
        (this.U0 = u0).setActionListener((InlineComposerMediaScrollView$a)this);
        this.V0 = (AttachmentMediaView)((View)u0).findViewById(2131429966);
        ((View)super.J0.getCancelButton()).setOnClickListener((View$OnClickListener)new kuf((Object)this, 9));
        this.g1 = xqm.a(((View)this).getResources(), 2131100704, xml.getTheme());
        this.h1 = xqm.a(((View)this).getResources(), 2131100865, xml.getTheme());
        final gzt gzt = new gzt(xml);
        xml = (Context)xml.getResources().getXml(2132148224);
        try {
            try {
                final xyt b = gzt.b((XmlPullParser)xml, Xml.asAttributeSet((XmlPullParser)xml), null);
                ((XmlResourceParser)xml).close();
                this.c1 = (tzt)b;
                if (poa.p0()) {
                    this.q();
                }
                else {
                    this.n();
                }
                return;
            }
            finally {}
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(((XmlPullParser)xml).getPositionDescription());
            sb.append(": ");
            sb.append(ex.getMessage());
            throw new InflateException(sb.toString(), (Throwable)ex);
        }
        catch (final XmlPullParserException ex2) {
            throw new InflateException(((Throwable)ex2).getMessage(), (Throwable)ex2);
        }
        ((XmlResourceParser)xml).close();
    }
    
    public final void a(final y4m$c y4m$c) {
        ((View)super.J0).post((Runnable)new qpb(this, y4m$c, 8));
    }
    
    public final void c(final wqg wqg) {
        final com.twitter.app.dm.widget.b.a o0 = super.O0;
        if (o0 != null) {
            ((DMConversationMessageComposer.DMConversationMessageComposer$b)o0).m(wqg);
        }
    }
    
    public final void e() {
        if (poa.p0()) {
            final y4m z0 = this.Z0;
            Object o;
            if (z0 != null) {
                o = z0.m;
            }
            else {
                o = y4m$c$c.a;
            }
            this.a((y4m$c)o);
        }
        else {
            this.n();
        }
    }
    
    public final void f(final String s) {
        super.F0.k(s, (int[])null);
        if (pjr.g((CharSequence)s) && s.contains(" https://twitter.com/i/moments/")) {
            final String[] split = s.split(" https://twitter.com/i/moments/");
            if (split.length == 2) {
                super.F0.k(s, (int[])null);
                super.F0.n(0, split[0].length());
                this.i(false);
                super.F0.p(true);
            }
        }
    }
    
    public String getCardUrl() {
        final com.twitter.card.common.preview.b y0 = this.Y0;
        if (y0 != null) {
            final String e0 = y0.e0();
            if (e0 != null && !e0.isEmpty() && (super.F0.getText().contains(e0) || "tombstone://card".equals(e0))) {
                return e0;
            }
        }
        return null;
    }
    
    public final void i(final boolean b) {
        final dt7 x0 = this.X0;
        if (x0 != null) {
            x0.e(true);
            if (b) {
                this.X0.h();
            }
        }
    }
    
    public final boolean k() {
        return ((View)this.T0).isShown();
    }
    
    public final void l() {
        if (this.j1 != 4) {
            this.j1 = 4;
            ((ImageView)super.G0).getDrawable().setTint(this.g1);
            ((View)super.E0).setVisibility(8);
            ((View)super.F0).setVisibility(8);
            ((View)super.J0).setVisibility(0);
            ((View)super.G0).setVisibility(0);
            ((View)super.H0).setVisibility(8);
            ((View)super.I0).setVisibility(8);
        }
    }
    
    public final void m() {
        super.m();
    }
    
    public final void n() {
        this.j1 = 2;
        ((View)super.G0).setEnabled(super.F0.h());
        ((View)super.E0).setVisibility(0);
        ((View)super.G0).setVisibility(0);
        ((View)super.H0).setVisibility(8);
        ((View)super.F0).setVisibility(0);
        ((View)super.J0).setVisibility(8);
        ((View)super.I0).setVisibility(8);
    }
    
    public final void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131429951) {
            ((DMConversationMessageComposer.DMConversationMessageComposer$b)super.O0).b();
        }
        else if (id == 2131429266) {
            ((DMConversationMessageComposer.DMConversationMessageComposer$b)super.O0).g();
        }
        else if (id == 2131431772) {
            final y4m z0 = this.Z0;
            if (z0 != null) {
                z0.l();
            }
        }
        else if (this.j1 == 4 && id == 2131431337) {
            ((com.twitter.app.dm.widget.b.a)super.O0).h(null);
        }
        else {
            super.onClick(view);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final com.twitter.card.common.preview.b y0 = this.Y0;
        if (y0 != null) {
            y0.D().H0 = null;
        }
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final float dimension = ((View)this).getResources().getDimension(2131167535);
        final float dimension2 = ((View)this).getResources().getDimension(2131167536);
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        this.k1 = false;
                        this.r(super.K0);
                        super.N0.setTint(this.g1);
                        ((View)super.L0).setBackgroundColor(this.g1);
                    }
                }
                else if (!this.l1) {
                    this.l1 = true;
                }
                else {
                    final float abs = Math.abs(this.n1 - motionEvent.getX());
                    final float abs2 = Math.abs(this.o1 - motionEvent.getY());
                    final float n2 = fcmpg(abs, dimension);
                    if (n2 < 0 && abs2 > dimension2 && !this.m1) {
                        this.d1.removeCallbacks((Runnable)this.p1);
                        this.l1 = false;
                        this.m1 = true;
                        super.N0.setTint(this.h1);
                        ((View)super.L0).setBackgroundColor(this.h1);
                        final RecordingAudioView j0 = super.J0;
                        ((zqh)j0).setProgress(0.0f);
                        ((View)j0.getStatusContainer()).setOnClickListener((View$OnClickListener)null);
                        j0.V(j0.x2, j0.t2);
                        j0.U(j0.t2, Integer.valueOf(51), j0.v2, 0.5f, j0.t2, j0.p2, j0.r2);
                        if (!((Animator)j0.l2).isRunning() || !((Animator)j0.m2).isRunning()) {
                            j0.l2.start();
                            j0.m2.start();
                        }
                    }
                    else if (n2 < 0 && abs2 < dimension2 && this.m1) {
                        this.d1.removeCallbacks((Runnable)this.p1);
                        this.l1 = false;
                        this.m1 = false;
                        super.N0.setTint(this.g1);
                        ((View)super.L0).setBackgroundColor(this.g1);
                        super.J0.X(((y4m$c$d)this.Z0.m).a);
                    }
                }
            }
            else {
                this.l1 = false;
                this.d1.removeCallbacks((Runnable)this.p1);
                if (this.k1) {
                    this.k1 = false;
                    this.r(super.K0);
                    super.N0.setTint(this.g1);
                    ((View)super.L0).setBackgroundColor(this.g1);
                }
                else {
                    ((View)super.I0).setVisibility(0);
                    final y4m z0 = this.Z0;
                    if (z0 != null) {
                        z0.k();
                    }
                    else {
                        ((DMConversationMessageComposer.DMConversationMessageComposer$b)super.O0).l();
                    }
                }
            }
        }
        else {
            this.d1.postDelayed((Runnable)this.p1, 200L);
            this.n1 = motionEvent.getX();
            this.o1 = motionEvent.getY();
            this.m1 = false;
        }
        return true;
    }
    
    public final void p() {
        if (super.F0.hasFocus()) {
            tbx.w(super.P0, (View)super.F0, false, (ResultReceiver)null);
        }
    }
    
    public final void q() {
        this.j1 = 1;
        ((ImageView)super.G0).getDrawable().setTint(this.h1);
        ((View)super.G0).setEnabled(true);
        ((View)super.E0).setVisibility(0);
        final boolean h = super.F0.h();
        final ImageButton g0 = super.G0;
        int visibility;
        if (h) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)g0).setVisibility(visibility);
        final ImageButton h2 = super.H0;
        int visibility2;
        if (h) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        ((View)h2).setVisibility(visibility2);
        ((View)super.F0).setVisibility(0);
        ((View)super.J0).setVisibility(8);
        ((View)super.I0).setVisibility(8);
        final ViewGroup$LayoutParams layoutParams = ((View)super.D0).getLayoutParams();
        int i1;
        if (h) {
            i1 = -2;
        }
        else {
            i1 = this.i1;
        }
        layoutParams.height = i1;
    }
    
    public final void r(final View view) {
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f);
        final y4m z0 = this.Z0;
        if (z0 != null) {
            z0.l();
        }
        view.setVisibility(8);
        view.startAnimation((Animation)scaleAnimation);
        ((View)super.M0).clearAnimation();
    }
    
    public void setAssociation(final jev b) {
        this.W0.b = b;
    }
    
    public void setCardPreviewController(final com.twitter.card.common.preview.b b) {
        this.Y0 = b;
        ((CardPreviewView)((View)this).findViewById(2131428106)).setListener((a$a)b);
        b.i((b$a)new com.twitter.app.dm.widget.a(this, b));
        super.F0.setTextWatcher((TextWatcher)new ll7(this, b));
    }
    
    public void setQuickReplyDrawerHost(final dt7 x0) {
        ij1.c(this.X0 == null, "Attempting to set a new host on the Message Composer. Something's fishy!");
        this.X0 = x0;
    }
    
    public void setRecordAudioController(final y4m z0) {
        if (poa.p0()) {
            Objects.requireNonNull(this.Z0 = z0);
            ((DMConversationMessageComposer)(z0.j = (y4m$a)this)).a(z0.m);
            final wqg k = z0.k;
            if (k != null) {
                this.c(k);
            }
        }
    }
    
    public static final class a
    {
        public final UserIdentifier a;
        public jev b;
        
        public a(final UserIdentifier a) {
            this.a = a;
        }
    }
}
