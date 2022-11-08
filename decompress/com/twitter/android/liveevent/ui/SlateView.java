// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.ui;

import androidx.appcompat.widget.AppCompatTextView;
import com.twitter.media.ui.image.c;
import android.os.Build$VERSION;
import android.widget.FrameLayout;
import android.view.View$OnClickListener;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.text.method.LinkMovementMethod;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.twitter.media.ui.image.b;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.media.ui.image.b$a;
import com.twitter.media.ui.image.AspectRatioFrameLayout;

public class SlateView extends AspectRatioFrameLayout implements b$a<FrescoMediaImageView>
{
    public snj<dtg> J0;
    public final a K0;
    public snj<mdq> L0;
    public CharSequence M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public final boolean T0;
    
    public SlateView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        final snj b = snj.b;
        final int a = w4j.a;
        this.J0 = (snj<dtg>)b;
        this.L0 = (snj<mdq>)b;
        final a k0 = new a(View.inflate(((View)this).getContext(), 2131624748, (ViewGroup)this));
        this.K0 = k0;
        this.setAspectRatio(1.7777778f);
        this.setScaleMode(4);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, tdy.t1, 0, 0);
        this.T0 = obtainStyledAttributes.getBoolean(5, true);
        this.N0 = obtainStyledAttributes.getBoolean(4, true);
        this.O0 = obtainStyledAttributes.getBoolean(3, true);
        this.P0 = obtainStyledAttributes.getBoolean(0, true);
        int q0 = 2;
        final int int1 = obtainStyledAttributes.getInt(2, 2);
        if (int1 == 0 || int1 == 1) {
            q0 = int1;
        }
        this.Q0 = q0;
        int int2 = obtainStyledAttributes.getInt(6, 0);
        if (int2 != 1) {
            int2 = 0;
        }
        this.R0 = int2;
        this.S0 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.d();
        ((c)k0.a).setDefaultDrawableScaleType(ImageView$ScaleType.CENTER_CROP);
    }
    
    public final abm c(final b b) {
        final ncq targetViewSize = ((FrescoMediaImageView)b).getTargetViewSize();
        abm j;
        if (!this.L0.e() && targetViewSize.a > 0 && targetViewSize.b > 0) {
            j = pf8.J(targetViewSize, (mdq)this.L0.c(), (dtg)snj.d((snj)this.J0), this.T0);
        }
        else {
            j = null;
        }
        return j;
    }
    
    public final void d() {
        if (this.L0.e()) {
            ((View)this.K0.b).setVisibility(8);
            return;
        }
        final mdq mdq = (mdq)this.L0.c();
        final snj b = snj.b((Object)pf8.G(mdq.e));
        snj b2;
        if (b.f()) {
            b2 = new snj((Object)u8d.a((v7d)b.c()));
        }
        else {
            b2 = snj.b;
            final int a = w4j.a;
        }
        if (b2.f()) {
            ((c)this.K0.a).setCroppingRectangleProvider((b$a)this);
            ((c)this.K0.a).p((t8d$a)b2.c());
        }
        final a k0 = this.K0;
        final boolean o0 = this.O0;
        final Drawable drawable = null;
        String b3;
        if (o0) {
            b3 = mdq.b;
        }
        else {
            b3 = null;
        }
        final int r0 = this.R0;
        h6q.Y((TextView)k0.b, (CharSequence)b3);
        final boolean b4 = true;
        if (r0 == 1) {
            ((AppCompatTextView)k0.b).setBackgroundResource(2131230995);
        }
        else {
            ((View)k0.b).setBackground((Drawable)null);
        }
        final a k2 = this.K0;
        String c;
        if (this.N0) {
            c = mdq.c;
        }
        else {
            c = null;
        }
        h6q.Y((TextView)k2.c, (CharSequence)c);
        final a k3 = this.K0;
        String d;
        if (this.P0) {
            d = mdq.d;
        }
        else {
            d = null;
        }
        h6q.Y((TextView)k3.d, (CharSequence)d);
        final TypefacesTextView e = this.K0.e;
        final CharSequence m0 = this.M0;
        if (this.S0 && pjr.g(m0)) {
            ((View)e).setVisibility(0);
            ((TextView)e).setText(m0);
        }
        else {
            ((View)e).setVisibility(8);
        }
        ((TextView)e).setMovementMethod(LinkMovementMethod.getInstance());
        final a k4 = this.K0;
        final FrescoMediaImageView a2 = k4.a;
        final int q0 = this.Q0;
        int n = b4 ? 1 : 0;
        if (q0 != 0) {
            if (q0 == 1 && (pjr.g(((AppCompatTextView)k4.b).getText()) || pjr.g(((AppCompatTextView)k4.d).getText()) || pjr.g(((AppCompatTextView)k4.c).getText()) || pjr.g(((AppCompatTextView)k4.e).getText()))) {
                n = (b4 ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        Drawable b5 = drawable;
        if (n != 0) {
            final Context context = ((View)this).getContext();
            final Object a3 = eo6.a;
            b5 = eo6$c.b(context, 2131230919);
        }
        ((FrameLayout)a2).setForeground(b5);
    }
    
    public void setAttribution(final CharSequence m0) {
        this.M0 = m0;
        this.d();
    }
    
    public void setImageClickListener(final View$OnClickListener onClickListener) {
        ((View)this.K0.a).setOnClickListener(onClickListener);
    }
    
    public void setSlate(final mdq mdq) {
        this.L0 = (snj<mdq>)snj.b((Object)mdq);
        this.d();
    }
    
    public static final class a
    {
        public final FrescoMediaImageView a;
        public final TypefacesTextView b;
        public final TypefacesTextView c;
        public final TypefacesTextView d;
        public final TypefacesTextView e;
        
        public a(final View view) {
            this.a = (FrescoMediaImageView)view.findViewById(2131431484);
            this.b = (TypefacesTextView)view.findViewById(2131431485);
            this.c = (TypefacesTextView)view.findViewById(2131431486);
            this.d = (TypefacesTextView)view.findViewById(2131431482);
            final FrameLayout frameLayout = (FrameLayout)view.findViewById(2131431483);
            final TypefacesTextView e = (TypefacesTextView)view.findViewById(2131431481);
            this.e = e;
            if (Build$VERSION.SDK_INT >= 28) {
                ((AppCompatTextView)e).setLastBaselineToBottomHeight((int)((View)e).getResources().getDimension(2131167412));
            }
            else {
                final int n = (int)((View)e).getResources().getDimension(2131167411);
                final int n2 = (int)((View)e).getResources().getDimension(2131167412);
                int n3;
                if (n2 >= n) {
                    n3 = n2 - n;
                }
                else {
                    n3 = 0;
                }
                ((View)e).setPadding(((View)e).getPaddingLeft(), ((View)e).getPaddingTop(), ((View)e).getPaddingRight(), n3);
            }
        }
    }
}
