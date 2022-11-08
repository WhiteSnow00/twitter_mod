import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import java.util.List;
import java.util.WeakHashMap;
import android.widget.EditText;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatTextView;
import android.animation.Animator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jld
{
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public AppCompatTextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;
    
    public jld(final TextInputLayout b) {
        final Context context = ((View)b).getContext();
        this.a = context;
        this.b = b;
        this.g = (float)context.getResources().getDimensionPixelSize(2131165616);
    }
    
    public final void a(final TextView textView, int n) {
        if (this.c == null && this.e == null) {
            (this.c = new LinearLayout(this.a)).setOrientation(0);
            ((ViewGroup)this.b).addView((View)this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            ((ViewGroup)this.c).addView((View)this.e, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                this.b();
            }
        }
        if (n != 0 && n != 1) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (n != 0) {
            ((View)this.e).setVisibility(0);
            ((ViewGroup)this.e).addView((View)textView);
        }
        else {
            ((ViewGroup)this.c).addView((View)textView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
        }
        ((View)this.c).setVisibility(0);
        ++this.d;
    }
    
    public final void b() {
        if (this.c != null && this.b.getEditText() != null) {
            final EditText editText = this.b.getEditText();
            final boolean f = ong.f(this.a);
            final LinearLayout c = this.c;
            final WeakHashMap a = p5x.a;
            p5x$e.k((View)c, this.h(f, 2131166361, p5x$e.f((View)editText)), this.h(f, 2131166362, this.a.getResources().getDimensionPixelSize(2131166360)), this.h(f, 2131166361, p5x$e.e((View)editText)), 0);
        }
    }
    
    public final void c() {
        final Animator f = this.f;
        if (f != null) {
            f.cancel();
        }
    }
    
    public final void d(final List<Animator> list, final boolean b, final TextView textView, final int n, int n2, final int n3) {
        if (textView != null) {
            if (b) {
                if (n == n3 || n == n2) {
                    if (n3 == n) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    float n4;
                    if (n2 != 0) {
                        n4 = 1.0f;
                    }
                    else {
                        n4 = 0.0f;
                    }
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)textView, View.ALPHA, new float[] { n4 });
                    ofFloat.setDuration(167L);
                    ((Animator)ofFloat).setInterpolator((TimeInterpolator)kc0.a);
                    list.add((Animator)ofFloat);
                    if (n3 == n) {
                        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)textView, View.TRANSLATION_Y, new float[] { -this.g, 0.0f });
                        ofFloat2.setDuration(217L);
                        ((Animator)ofFloat2).setInterpolator((TimeInterpolator)kc0.d);
                        list.add((Animator)ofFloat2);
                    }
                }
            }
        }
    }
    
    public final boolean e() {
        final int i = this.i;
        boolean b = true;
        if (i != 1 || this.l == null || TextUtils.isEmpty(this.j)) {
            b = false;
        }
        return b;
    }
    
    public final TextView f(final int n) {
        if (n == 1) {
            return this.l;
        }
        if (n != 2) {
            return null;
        }
        return this.r;
    }
    
    public final int g() {
        final AppCompatTextView l = this.l;
        int currentTextColor;
        if (l != null) {
            currentTextColor = l.getCurrentTextColor();
        }
        else {
            currentTextColor = -1;
        }
        return currentTextColor;
    }
    
    public final int h(final boolean b, final int n, int dimensionPixelSize) {
        if (b) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(n);
        }
        return dimensionPixelSize;
    }
    
    public final void i() {
        this.j = null;
        this.c();
        if (this.h == 1) {
            if (this.q && !TextUtils.isEmpty(this.p)) {
                this.i = 2;
            }
            else {
                this.i = 0;
            }
        }
        this.l(this.h, this.i, this.k(this.l, ""));
    }
    
    public final void j(final TextView textView, int d) {
        final LinearLayout c = this.c;
        if (c == null) {
            return;
        }
        if (d != 0 && d != 1) {
            d = 0;
        }
        else {
            d = 1;
        }
        Label_0058: {
            if (d != 0) {
                final FrameLayout e = this.e;
                if (e != null) {
                    ((ViewGroup)e).removeView((View)textView);
                    break Label_0058;
                }
            }
            ((ViewGroup)c).removeView((View)textView);
        }
        d = this.d - 1;
        this.d = d;
        final LinearLayout c2 = this.c;
        if (d == 0) {
            ((View)c2).setVisibility(8);
        }
    }
    
    public final boolean k(final TextView textView, final CharSequence charSequence) {
        final TextInputLayout b = this.b;
        final WeakHashMap a = p5x.a;
        return p5x$g.c((View)b) && ((View)this.b).isEnabled() && (this.i != this.h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }
    
    public final void l(final int n, final int h, final boolean b) {
        if (n == h) {
            return;
        }
        if (b) {
            final AnimatorSet f = new AnimatorSet();
            this.f = (Animator)f;
            final ArrayList list = new ArrayList();
            this.d(list, this.q, this.r, 2, n, h);
            this.d(list, this.k, this.l, 1, n, h);
            m8y.w(f, list);
            ((Animator)f).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public final /* synthetic */ TextView D0 = jld.this.f(n);
                public final /* synthetic */ TextView F0 = jld.this.f(h);
                
                public final void onAnimationEnd(final Animator animator) {
                    final jld g0 = jld.this;
                    g0.h = h;
                    g0.f = null;
                    final TextView d0 = this.D0;
                    if (d0 != null) {
                        ((View)d0).setVisibility(4);
                        if (n == 1) {
                            final AppCompatTextView l = jld.this.l;
                            if (l != null) {
                                l.setText((CharSequence)null);
                            }
                        }
                    }
                    final TextView f0 = this.F0;
                    if (f0 != null) {
                        ((View)f0).setTranslationY(0.0f);
                        ((View)this.F0).setAlpha(1.0f);
                    }
                }
                
                public final void onAnimationStart(final Animator animator) {
                    final TextView f0 = this.F0;
                    if (f0 != null) {
                        ((View)f0).setVisibility(0);
                    }
                }
            });
            f.start();
        }
        else if (n != h) {
            if (h != 0) {
                final TextView f2 = this.f(h);
                if (f2 != null) {
                    ((View)f2).setVisibility(0);
                    ((View)f2).setAlpha(1.0f);
                }
            }
            if (n != 0) {
                final TextView f3 = this.f(n);
                if (f3 != null) {
                    ((View)f3).setVisibility(4);
                    if (n == 1) {
                        f3.setText((CharSequence)null);
                    }
                }
            }
            this.h = h;
        }
        this.b.w();
        this.b.A(b, false);
        this.b.F();
    }
}
