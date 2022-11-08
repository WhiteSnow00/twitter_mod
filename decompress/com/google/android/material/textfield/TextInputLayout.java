// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.graphics.Paint;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.ColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View$AccessibilityDelegate;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import android.content.res.Configuration;
import android.widget.TextView;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.annotation.TargetApi;
import android.view.ViewStructure;
import android.graphics.drawable.LayerDrawable;
import android.widget.AutoCompleteTextView;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Iterator;
import android.text.TextUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import java.util.WeakHashMap;
import android.view.animation.LinearInterpolator;
import android.os.Build$VERSION;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Rect;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnLongClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.PorterDuff$Mode;
import android.widget.EditText;
import android.content.res.ColorStateList;
import com.google.android.material.internal.CheckableImageButton;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;
import android.widget.LinearLayout;

public class TextInputLayout extends LinearLayout
{
    public final LinkedHashSet<f> A1;
    public int B1;
    public final FrameLayout C0;
    public final SparseArray<p4a> C1;
    public final u6r D0;
    public final CheckableImageButton D1;
    public final LinearLayout E0;
    public final LinkedHashSet<g> E1;
    public final FrameLayout F0;
    public ColorStateList F1;
    public EditText G0;
    public PorterDuff$Mode G1;
    public CharSequence H0;
    public ColorDrawable H1;
    public int I0;
    public int I1;
    public int J0;
    public Drawable J1;
    public int K0;
    public View$OnLongClickListener K1;
    public int L0;
    public View$OnLongClickListener L1;
    public final jld M0;
    public final CheckableImageButton M1;
    public boolean N0;
    public ColorStateList N1;
    public int O0;
    public PorterDuff$Mode O1;
    public boolean P0;
    public ColorStateList P1;
    public AppCompatTextView Q0;
    public ColorStateList Q1;
    public int R0;
    public int R1;
    public int S0;
    public int S1;
    public CharSequence T0;
    public int T1;
    public boolean U0;
    public ColorStateList U1;
    public AppCompatTextView V0;
    public int V1;
    public ColorStateList W0;
    public int W1;
    public int X0;
    public int X1;
    public cra Y0;
    public int Y1;
    public cra Z0;
    public int Z1;
    public ColorStateList a1;
    public boolean a2;
    public ColorStateList b1;
    public final iq4 b2;
    public CharSequence c1;
    public boolean c2;
    public final AppCompatTextView d1;
    public boolean d2;
    public boolean e1;
    public ValueAnimator e2;
    public CharSequence f1;
    public boolean f2;
    public boolean g1;
    public boolean g2;
    public qng h1;
    public qng i1;
    public qng j1;
    public pqp k1;
    public boolean l1;
    public final int m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public final Rect u1;
    public final Rect v1;
    public final RectF w1;
    public Typeface x1;
    public ColorDrawable y1;
    public int z1;
    
    public TextInputLayout(Context context, final AttributeSet set) {
        super(ung.a(context, set, 2130970879, 2132019179), set, 2130970879);
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = new jld(this);
        this.u1 = new Rect();
        this.v1 = new Rect();
        this.w1 = new RectF();
        this.A1 = new LinkedHashSet<f>();
        this.B1 = 0;
        final SparseArray c1 = new SparseArray();
        this.C1 = (SparseArray<p4a>)c1;
        this.E1 = new LinkedHashSet<g>();
        final iq4 b2 = new iq4((View)this);
        this.b2 = b2;
        context = ((View)this).getContext();
        this.setOrientation(1);
        ((View)this).setWillNotDraw(false);
        ((ViewGroup)this).setAddStatesFromChildren(true);
        final FrameLayout c2 = new FrameLayout(context);
        this.C0 = c2;
        final FrameLayout f0 = new FrameLayout(context);
        this.F0 = f0;
        final LinearLayout e0 = new LinearLayout(context);
        this.E0 = e0;
        final AppCompatTextView d1 = new AppCompatTextView(context, null);
        this.d1 = d1;
        ((View)e0).setVisibility(8);
        ((View)f0).setVisibility(8);
        ((View)d1).setVisibility(8);
        final LayoutInflater from = LayoutInflater.from(context);
        final CheckableImageButton m1 = (CheckableImageButton)from.inflate(2131624277, (ViewGroup)e0, false);
        this.M1 = m1;
        final CheckableImageButton d2 = (CheckableImageButton)from.inflate(2131624277, (ViewGroup)f0, false);
        this.D1 = d2;
        ((ViewGroup)c2).setAddStatesFromChildren(true);
        e0.setOrientation(0);
        ((View)e0).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388613));
        ((View)f0).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final LinearInterpolator a = kc0.a;
        b2.W = (TimeInterpolator)a;
        b2.m(false);
        b2.z((TimeInterpolator)a);
        b2.q(8388659);
        final int[] c3 = rp2.C1;
        hks.a(context, set, 2130970879, 2132019179);
        hks.b(context, set, c3, 2130970879, 2132019179, new int[] { 22, 20, 35, 40, 44 });
        final u9t u9t = new u9t(context, context.obtainStyledAttributes(set, c3, 2130970879, 2132019179));
        final u6r d3 = new u6r(this, u9t);
        this.D0 = d3;
        this.e1 = u9t.a(43, true);
        this.setHint(u9t.n(4));
        this.d2 = u9t.a(42, true);
        this.c2 = u9t.a(37, true);
        if (u9t.o(6)) {
            this.setMinEms(u9t.j(6, -1));
        }
        else if (u9t.o(3)) {
            this.setMinWidth(u9t.f(3, -1));
        }
        if (u9t.o(5)) {
            this.setMaxEms(u9t.j(5, -1));
        }
        else if (u9t.o(2)) {
            this.setMaxWidth(u9t.f(2, -1));
        }
        this.k1 = new pqp(pqp.b(context, set, 2130970879, 2132019179));
        this.m1 = context.getResources().getDimensionPixelOffset(2131166669);
        this.o1 = u9t.e(9, 0);
        this.q1 = u9t.f(16, context.getResources().getDimensionPixelSize(2131166670));
        this.r1 = u9t.f(17, context.getResources().getDimensionPixelSize(2131166671));
        this.p1 = this.q1;
        final float d4 = u9t.d(13);
        final float d5 = u9t.d(12);
        final float d6 = u9t.d(10);
        final float d7 = u9t.d(11);
        final pqp k1 = this.k1;
        Objects.requireNonNull(k1);
        final pqp.a a2 = new pqp.a(k1);
        if (d4 >= 0.0f) {
            a2.f(d4);
        }
        if (d5 >= 0.0f) {
            a2.g(d5);
        }
        if (d6 >= 0.0f) {
            a2.e(d6);
        }
        if (d7 >= 0.0f) {
            a2.d(d7);
        }
        this.k1 = new pqp(a2);
        final ColorStateList a3 = ong.a(context, u9t, 7);
        if (a3 != null) {
            final int defaultColor = a3.getDefaultColor();
            this.V1 = defaultColor;
            this.t1 = defaultColor;
            if (a3.isStateful()) {
                this.W1 = a3.getColorForState(new int[] { -16842910 }, -1);
                this.X1 = a3.getColorForState(new int[] { 16842908, 16842910 }, -1);
                this.Y1 = a3.getColorForState(new int[] { 16843623, 16842910 }, -1);
            }
            else {
                this.X1 = this.V1;
                final ColorStateList f2 = qli.f(context, 2131100486);
                this.W1 = f2.getColorForState(new int[] { -16842910 }, -1);
                this.Y1 = f2.getColorForState(new int[] { 16843623 }, -1);
            }
        }
        else {
            this.t1 = 0;
            this.V1 = 0;
            this.W1 = 0;
            this.X1 = 0;
            this.Y1 = 0;
        }
        if (u9t.o(1)) {
            final ColorStateList c4 = u9t.c(1);
            this.Q1 = c4;
            this.P1 = c4;
        }
        final ColorStateList a4 = ong.a(context, u9t, 14);
        this.T1 = u9t.b();
        this.R1 = eo6.b(context, 2131100509);
        this.Z1 = eo6.b(context, 2131100510);
        this.S1 = eo6.b(context, 2131100513);
        if (a4 != null) {
            this.setBoxStrokeColorStateList(a4);
        }
        if (u9t.o(15)) {
            this.setBoxStrokeErrorColor(ong.a(context, u9t, 15));
        }
        if (u9t.l(44, -1) != -1) {
            this.setHintTextAppearance(u9t.l(44, 0));
        }
        final int l = u9t.l(35, 0);
        final CharSequence n = u9t.n(30);
        final boolean a5 = u9t.a(31, false);
        ((View)m1).setId(2131431964);
        if (ong.f(context)) {
            wkg.h((ViewGroup$MarginLayoutParams)((View)m1).getLayoutParams(), 0);
        }
        if (u9t.o(33)) {
            this.N1 = ong.a(context, u9t, 33);
        }
        if (u9t.o(34)) {
            this.O1 = sbx.e(u9t.j(34, -1), (PorterDuff$Mode)null);
        }
        if (u9t.o(32)) {
            this.setErrorIconDrawable(u9t.g(32));
        }
        ((View)m1).setContentDescription(((View)this).getResources().getText(2131953918));
        final WeakHashMap a6 = p5x.a;
        p5x$d.s((View)m1, 2);
        ((View)m1).setClickable(false);
        m1.setPressable(false);
        ((View)m1).setFocusable(false);
        final int i = u9t.l(40, 0);
        final boolean a7 = u9t.a(39, false);
        final CharSequence n2 = u9t.n(38);
        final int j = u9t.l(52, 0);
        final CharSequence n3 = u9t.n(51);
        final int l2 = u9t.l(65, 0);
        final CharSequence n4 = u9t.n(64);
        final boolean a8 = u9t.a(18, false);
        this.setCounterMaxLength(u9t.j(19, -1));
        this.S0 = u9t.l(22, 0);
        this.R0 = u9t.l(20, 0);
        this.setBoxBackgroundMode(u9t.j(8, 0));
        if (ong.f(context)) {
            wkg.h((ViewGroup$MarginLayoutParams)((View)d2).getLayoutParams(), 0);
        }
        final int l3 = u9t.l(26, 0);
        c1.append(-1, (Object)new oa7(this, l3));
        c1.append(0, (Object)new gki(this));
        int l4;
        if (l3 == 0) {
            l4 = u9t.l(47, 0);
        }
        else {
            l4 = l3;
        }
        c1.append(1, (Object)new c(this, l4));
        c1.append(2, (Object)new a(this, l3));
        c1.append(3, (Object)new b(this, l3));
        if (!u9t.o(48)) {
            if (u9t.o(28)) {
                this.F1 = ong.a(context, u9t, 28);
            }
            if (u9t.o(29)) {
                this.G1 = sbx.e(u9t.j(29, -1), (PorterDuff$Mode)null);
            }
        }
        if (u9t.o(27)) {
            this.setEndIconMode(u9t.j(27, 0));
            if (u9t.o(25)) {
                this.setEndIconContentDescription(u9t.n(25));
            }
            this.setEndIconCheckable(u9t.a(24, true));
        }
        else if (u9t.o(48)) {
            if (u9t.o(49)) {
                this.F1 = ong.a(context, u9t, 49);
            }
            if (u9t.o(50)) {
                this.G1 = sbx.e(u9t.j(50, -1), (PorterDuff$Mode)null);
            }
            this.setEndIconMode(u9t.a(48, false) ? 1 : 0);
            this.setEndIconContentDescription(u9t.n(46));
        }
        ((View)d1).setId(2131431992);
        ((View)d1).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 80));
        p5x$g.f((View)d1, 1);
        this.setErrorContentDescription(n);
        this.setCounterOverflowTextAppearance(this.R0);
        this.setHelperTextTextAppearance(i);
        this.setErrorTextAppearance(l);
        this.setCounterTextAppearance(this.S0);
        this.setPlaceholderText(n3);
        this.setPlaceholderTextAppearance(j);
        this.setSuffixTextAppearance(l2);
        if (u9t.o(36)) {
            this.setErrorTextColor(u9t.c(36));
        }
        if (u9t.o(41)) {
            this.setHelperTextColor(u9t.c(41));
        }
        if (u9t.o(45)) {
            this.setHintTextColor(u9t.c(45));
        }
        if (u9t.o(23)) {
            this.setCounterTextColor(u9t.c(23));
        }
        if (u9t.o(21)) {
            this.setCounterOverflowTextColor(u9t.c(21));
        }
        if (u9t.o(53)) {
            this.setPlaceholderTextColor(u9t.c(53));
        }
        if (u9t.o(66)) {
            this.setSuffixTextColor(u9t.c(66));
        }
        this.setEnabled(u9t.a(0, true));
        u9t.r();
        p5x$d.s((View)this, 2);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26 && sdk_INT >= 26) {
            p5x$l.l((View)this, 1);
        }
        ((ViewGroup)f0).addView((View)d2);
        ((ViewGroup)e0).addView((View)d1);
        ((ViewGroup)e0).addView((View)m1);
        ((ViewGroup)e0).addView((View)f0);
        ((ViewGroup)c2).addView((View)d3);
        ((ViewGroup)c2).addView((View)e0);
        ((ViewGroup)this).addView((View)c2);
        this.setHelperTextEnabled(a7);
        this.setErrorEnabled(a5);
        this.setCounterEnabled(a8);
        this.setHelperText(n2);
        this.setSuffixText(n4);
    }
    
    private p4a getEndIconDelegate() {
        p4a p4a = (p4a)this.C1.get(this.B1);
        if (p4a == null) {
            p4a = (p4a)this.C1.get(0);
        }
        return p4a;
    }
    
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (((View)this.M1).getVisibility() == 0) {
            return this.M1;
        }
        if (this.i() && this.k()) {
            return this.D1;
        }
        return null;
    }
    
    public static void o(final ViewGroup viewGroup, final boolean enabled) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                o((ViewGroup)child, enabled);
            }
        }
    }
    
    public static void q(final CheckableImageButton checkableImageButton, final View$OnLongClickListener view$OnLongClickListener) {
        final WeakHashMap a = p5x.a;
        final boolean a2 = p5x$c.a((View)checkableImageButton);
        boolean focusable = false;
        int n = 1;
        final boolean longClickable = view$OnLongClickListener != null;
        if (a2 || longClickable) {
            focusable = true;
        }
        ((View)checkableImageButton).setFocusable(focusable);
        ((View)checkableImageButton).setClickable(a2);
        checkableImageButton.setPressable(a2);
        ((View)checkableImageButton).setLongClickable(longClickable);
        if (!focusable) {
            n = 2;
        }
        p5x$d.s((View)checkableImageButton, n);
    }
    
    private void setEditText(final EditText g0) {
        if (this.G0 == null) {
            if (this.B1 != 3 && !(g0 instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.G0 = g0;
            final int i0 = this.I0;
            if (i0 != -1) {
                this.setMinEms(i0);
            }
            else {
                this.setMinWidth(this.K0);
            }
            final int j0 = this.J0;
            if (j0 != -1) {
                this.setMaxEms(j0);
            }
            else {
                this.setMaxWidth(this.L0);
            }
            this.m();
            this.setTextInputAccessibilityDelegate(new TextInputLayout.TextInputLayout$e(this));
            final iq4 b2 = this.b2;
            final Typeface typeface = ((TextView)this.G0).getTypeface();
            final boolean r = b2.r(typeface);
            final boolean w = b2.w(typeface);
            if (r || w) {
                b2.m(false);
            }
            final iq4 b3 = this.b2;
            final float textSize = ((TextView)this.G0).getTextSize();
            if (b3.m != textSize) {
                b3.m = textSize;
                b3.m(false);
            }
            final iq4 b4 = this.b2;
            final float letterSpacing = ((TextView)this.G0).getLetterSpacing();
            if (b4.g0 != letterSpacing) {
                b4.g0 = letterSpacing;
                b4.m(false);
            }
            final int gravity = ((TextView)this.G0).getGravity();
            this.b2.q((gravity & 0xFFFFFF8F) | 0x30);
            this.b2.v(gravity);
            ((TextView)this.G0).addTextChangedListener((TextWatcher)new TextWatcher() {
                public final void afterTextChanged(final Editable editable) {
                    final TextInputLayout c0 = TextInputLayout.this;
                    c0.A(c0.g2 ^ true, false);
                    final TextInputLayout c2 = TextInputLayout.this;
                    if (c2.N0) {
                        c2.t(((CharSequence)editable).length());
                    }
                    final TextInputLayout c3 = TextInputLayout.this;
                    if (c3.U0) {
                        c3.B(((CharSequence)editable).length());
                    }
                }
                
                public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
                
                public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
            });
            if (this.P1 == null) {
                this.P1 = ((TextView)this.G0).getHintTextColors();
            }
            if (this.e1) {
                if (TextUtils.isEmpty(this.f1)) {
                    this.setHint(this.H0 = ((TextView)this.G0).getHint());
                    ((TextView)this.G0).setHint((CharSequence)null);
                }
                this.g1 = true;
            }
            if (this.Q0 != null) {
                this.t(((CharSequence)this.G0.getText()).length());
            }
            this.w();
            this.M0.b();
            ((View)this.D0).bringToFront();
            ((View)this.E0).bringToFront();
            ((View)this.F0).bringToFront();
            ((View)this.M1).bringToFront();
            final Iterator<Object> iterator = this.A1.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this);
            }
            this.D();
            if (!((View)this).isEnabled()) {
                ((View)g0).setEnabled(false);
            }
            this.A(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    
    private void setHintInternal(final CharSequence f1) {
        if (!TextUtils.equals(f1, this.f1)) {
            this.f1 = f1;
            this.b2.B(f1);
            if (!this.a2) {
                this.n();
            }
        }
    }
    
    private void setPlaceholderTextEnabled(final boolean u0) {
        if (this.U0 == u0) {
            return;
        }
        if (u0) {
            final AppCompatTextView v0 = this.V0;
            if (v0 != null) {
                ((ViewGroup)this.C0).addView((View)v0);
                ((View)this.V0).setVisibility(0);
            }
        }
        else {
            final AppCompatTextView v2 = this.V0;
            if (v2 != null) {
                ((View)v2).setVisibility(8);
            }
            this.V0 = null;
        }
        this.U0 = u0;
    }
    
    public final void A(final boolean b, final boolean b2) {
        final boolean enabled = ((View)this).isEnabled();
        final EditText g0 = this.G0;
        final boolean b3 = g0 != null && !TextUtils.isEmpty((CharSequence)g0.getText());
        final EditText g2 = this.G0;
        final boolean b4 = g2 != null && ((View)g2).hasFocus();
        final boolean e = this.M0.e();
        final ColorStateList p2 = this.P1;
        if (p2 != null) {
            this.b2.p(p2);
            this.b2.u(this.P1);
        }
        Label_0285: {
            if (!enabled) {
                final ColorStateList p3 = this.P1;
                int n;
                if (p3 != null) {
                    n = p3.getColorForState(new int[] { -16842910 }, this.Z1);
                }
                else {
                    n = this.Z1;
                }
                this.b2.p(ColorStateList.valueOf(n));
                this.b2.u(ColorStateList.valueOf(n));
            }
            else if (e) {
                final iq4 b5 = this.b2;
                final AppCompatTextView l = this.M0.l;
                ColorStateList textColors;
                if (l != null) {
                    textColors = l.getTextColors();
                }
                else {
                    textColors = null;
                }
                b5.p(textColors);
            }
            else {
                if (this.P0) {
                    final AppCompatTextView q0 = this.Q0;
                    if (q0 != null) {
                        this.b2.p(q0.getTextColors());
                        break Label_0285;
                    }
                }
                if (b4) {
                    final ColorStateList q2 = this.Q1;
                    if (q2 != null) {
                        this.b2.p(q2);
                    }
                }
            }
        }
        if (!b3 && this.c2 && (!((View)this).isEnabled() || !b4)) {
            if (b2 || !this.a2) {
                final ValueAnimator e2 = this.e2;
                if (e2 != null && e2.isRunning()) {
                    this.e2.cancel();
                }
                if (b && this.d2) {
                    this.c(0.0f);
                }
                else {
                    this.b2.x(0.0f);
                }
                if (this.f() && (((ce7)this.h1).b1.isEmpty() ^ true) && this.f()) {
                    ((ce7)this.h1).C(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.a2 = true;
                this.j();
                final u6r d0 = this.D0;
                d0.J0 = true;
                d0.g();
                this.E();
            }
        }
        else if (b2 || this.a2) {
            final ValueAnimator e3 = this.e2;
            if (e3 != null && e3.isRunning()) {
                this.e2.cancel();
            }
            if (b && this.d2) {
                this.c(1.0f);
            }
            else {
                this.b2.x(1.0f);
            }
            this.a2 = false;
            if (this.f()) {
                this.n();
            }
            final EditText g3 = this.G0;
            int length;
            if (g3 == null) {
                length = 0;
            }
            else {
                length = ((CharSequence)g3.getText()).length();
            }
            this.B(length);
            final u6r d2 = this.D0;
            d2.J0 = false;
            d2.g();
            this.E();
        }
    }
    
    public final void B(final int n) {
        if (n == 0 && !this.a2) {
            if (this.V0 != null && this.U0 && !TextUtils.isEmpty(this.T0)) {
                this.V0.setText(this.T0);
                szt.a((ViewGroup)this.C0, (xyt)this.Y0);
                ((View)this.V0).setVisibility(0);
                ((View)this.V0).bringToFront();
                ((View)this).announceForAccessibility(this.T0);
            }
        }
        else {
            this.j();
        }
    }
    
    public final void C(final boolean b, final boolean b2) {
        final int defaultColor = this.U1.getDefaultColor();
        final int colorForState = this.U1.getColorForState(new int[] { 16843623, 16842910 }, defaultColor);
        final int colorForState2 = this.U1.getColorForState(new int[] { 16843518, 16842910 }, defaultColor);
        if (b) {
            this.s1 = colorForState2;
        }
        else if (b2) {
            this.s1 = colorForState;
        }
        else {
            this.s1 = defaultColor;
        }
    }
    
    public final void D() {
        if (this.G0 == null) {
            return;
        }
        int e;
        if (!this.k() && !this.l()) {
            final EditText g0 = this.G0;
            final WeakHashMap a = p5x.a;
            e = p5x$e.e((View)g0);
        }
        else {
            e = 0;
        }
        final AppCompatTextView d1 = this.d1;
        final int dimensionPixelSize = ((View)this).getContext().getResources().getDimensionPixelSize(2131166363);
        final int paddingTop = ((View)this.G0).getPaddingTop();
        final int paddingBottom = ((View)this.G0).getPaddingBottom();
        final WeakHashMap a2 = p5x.a;
        p5x$e.k((View)d1, dimensionPixelSize, paddingTop, e, paddingBottom);
    }
    
    public final void E() {
        final int visibility = ((View)this.d1).getVisibility();
        final CharSequence c1 = this.c1;
        boolean b = false;
        int visibility2;
        if (c1 != null && !this.a2) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        if (visibility != visibility2) {
            final p4a endIconDelegate = this.getEndIconDelegate();
            if (visibility2 == 0) {
                b = true;
            }
            endIconDelegate.c(b);
        }
        this.x();
        ((View)this.d1).setVisibility(visibility2);
        this.v();
    }
    
    public final void F() {
        if (this.h1 != null) {
            if (this.n1 != 0) {
                final boolean focused = ((View)this).isFocused();
                final boolean b = false;
                boolean b2 = false;
                Label_0054: {
                    if (!focused) {
                        final EditText g0 = this.G0;
                        if (g0 == null || !((View)g0).hasFocus()) {
                            b2 = false;
                            break Label_0054;
                        }
                    }
                    b2 = true;
                }
                boolean b3 = false;
                Label_0086: {
                    if (!((View)this).isHovered()) {
                        final EditText g2 = this.G0;
                        b3 = b;
                        if (g2 == null) {
                            break Label_0086;
                        }
                        b3 = b;
                        if (!((View)g2).isHovered()) {
                            break Label_0086;
                        }
                    }
                    b3 = true;
                }
                Label_0228: {
                    if (!((View)this).isEnabled()) {
                        this.s1 = this.Z1;
                    }
                    else if (this.M0.e()) {
                        if (this.U1 != null) {
                            this.C(b2, b3);
                        }
                        else {
                            this.s1 = this.M0.g();
                        }
                    }
                    else {
                        if (this.P0) {
                            final AppCompatTextView q0 = this.Q0;
                            if (q0 != null) {
                                if (this.U1 != null) {
                                    this.C(b2, b3);
                                    break Label_0228;
                                }
                                this.s1 = q0.getCurrentTextColor();
                                break Label_0228;
                            }
                        }
                        if (b2) {
                            this.s1 = this.T1;
                        }
                        else if (b3) {
                            this.s1 = this.S1;
                        }
                        else {
                            this.s1 = this.R1;
                        }
                    }
                }
                this.y();
                d4d.c(this, this.M1, this.N1);
                final u6r d0 = this.D0;
                d4d.c(d0.C0, d0.F0, d0.G0);
                this.p();
                final p4a endIconDelegate = this.getEndIconDelegate();
                Objects.requireNonNull(endIconDelegate);
                if (endIconDelegate instanceof b) {
                    if (this.M0.e() && this.getEndIconDrawable() != null) {
                        final Drawable mutate = pd9.e(this.getEndIconDrawable()).mutate();
                        pd9.b.g(mutate, this.M0.g());
                        this.D1.setImageDrawable(mutate);
                    }
                    else {
                        d4d.a(this, this.D1, this.F1, this.G1);
                    }
                }
                if (this.n1 == 2) {
                    final int p1 = this.p1;
                    if (b2 && ((View)this).isEnabled()) {
                        this.p1 = this.r1;
                    }
                    else {
                        this.p1 = this.q1;
                    }
                    if (this.p1 != p1 && this.f() && !this.a2) {
                        if (this.f()) {
                            ((ce7)this.h1).C(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        this.n();
                    }
                }
                if (this.n1 == 1) {
                    if (!((View)this).isEnabled()) {
                        this.t1 = this.W1;
                    }
                    else if (b3 && !b2) {
                        this.t1 = this.Y1;
                    }
                    else if (b2) {
                        this.t1 = this.X1;
                    }
                    else {
                        this.t1 = this.V1;
                    }
                }
                this.d();
            }
        }
    }
    
    public final void a(final f f) {
        this.A1.add(f);
        if (this.G0 != null) {
            f.a(this);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams layoutParams) {
        if (view instanceof EditText) {
            final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(layoutParams);
            frameLayout$LayoutParams.gravity = ((frameLayout$LayoutParams.gravity & 0xFFFFFF8F) | 0x10);
            ((ViewGroup)this.C0).addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
            ((View)this.C0).setLayoutParams(layoutParams);
            this.z();
            this.setEditText((EditText)view);
        }
        else {
            super.addView(view, n, layoutParams);
        }
    }
    
    public final void b(final g g) {
        this.E1.add(g);
    }
    
    public final void c(final float n) {
        if (this.b2.c == n) {
            return;
        }
        if (this.e2 == null) {
            (this.e2 = new ValueAnimator()).setInterpolator((TimeInterpolator)kc0.b);
            this.e2.setDuration(167L);
            this.e2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    TextInputLayout.this.b2.x((float)valueAnimator.getAnimatedValue());
                }
            });
        }
        this.e2.setFloatValues(new float[] { this.b2.c, n });
        this.e2.start();
    }
    
    public final void d() {
        final qng h1 = this.h1;
        if (h1 == null) {
            return;
        }
        final pqp a = h1.C0.a;
        final pqp k1 = this.k1;
        final boolean b = false;
        if (a != k1) {
            h1.setShapeAppearanceModel(k1);
            if (this.B1 == 3 && this.n1 == 2) {
                final b b2 = (b)this.C1.get(3);
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)this.G0;
                Objects.requireNonNull(b2);
                if (((TextView)autoCompleteTextView).getKeyListener() == null && ((p4a)b2).a.getBoxBackgroundMode() == 2) {
                    if (((View)autoCompleteTextView).getBackground() instanceof LayerDrawable) {
                        b2.i(autoCompleteTextView);
                    }
                }
            }
        }
        if (this.n1 == 2 && (this.p1 > -1 && this.s1 != 0)) {
            this.h1.v((float)this.p1, this.s1);
        }
        int t1 = this.t1;
        if (this.n1 == 1) {
            t1 = gs4.g(this.t1, dml.B(((View)this).getContext(), 2130968983, 0));
        }
        this.t1 = t1;
        this.h1.q(ColorStateList.valueOf(t1));
        if (this.B1 == 3) {
            ((View)this.G0).getBackground().invalidateSelf();
        }
        final qng i1 = this.i1;
        if (i1 != null) {
            if (this.j1 != null) {
                int n = b ? 1 : 0;
                if (this.p1 > -1) {
                    n = (b ? 1 : 0);
                    if (this.s1 != 0) {
                        n = 1;
                    }
                }
                if (n != 0) {
                    ColorStateList list;
                    if (((View)this.G0).isFocused()) {
                        list = ColorStateList.valueOf(this.R1);
                    }
                    else {
                        list = ColorStateList.valueOf(this.s1);
                    }
                    i1.q(list);
                    this.j1.q(ColorStateList.valueOf(this.s1));
                }
                ((View)this).invalidate();
            }
        }
        ((View)this).invalidate();
    }
    
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(final ViewStructure viewStructure, final int n) {
        final EditText g0 = this.G0;
        if (g0 == null) {
            super.dispatchProvideAutofillStructure(viewStructure, n);
            return;
        }
        final CharSequence h0 = this.H0;
        int i = 0;
        if (h0 != null) {
            final boolean g2 = this.g1;
            this.g1 = false;
            final CharSequence hint = ((TextView)g0).getHint();
            ((TextView)this.G0).setHint(this.H0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, n);
                return;
            }
            finally {
                ((TextView)this.G0).setHint(hint);
                this.g1 = g2;
            }
        }
        viewStructure.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure, n);
        this.onProvideAutofillVirtualStructure(viewStructure, n);
        viewStructure.setChildCount(((ViewGroup)this.C0).getChildCount());
        while (i < ((ViewGroup)this.C0).getChildCount()) {
            final View child = ((ViewGroup)this.C0).getChildAt(i);
            final ViewStructure child2 = viewStructure.newChild(i);
            child.dispatchProvideAutofillStructure(child2, n);
            if (child == this.G0) {
                child2.setHint(this.getHint());
            }
            ++i;
        }
    }
    
    public final void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.g2 = true;
        super.dispatchRestoreInstanceState((SparseArray)sparseArray);
        this.g2 = false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.e1) {
            this.b2.f(canvas);
        }
        if (this.j1 != null) {
            final qng i1 = this.i1;
            if (i1 != null) {
                i1.draw(canvas);
                if (((View)this.G0).isFocused()) {
                    final Rect bounds = ((Drawable)this.j1).getBounds();
                    final Rect bounds2 = ((Drawable)this.i1).getBounds();
                    final float c = this.b2.c;
                    final int centerX = bounds2.centerX();
                    bounds.left = kc0.b(centerX, bounds2.left, c);
                    bounds.right = kc0.b(centerX, bounds2.right, c);
                    this.j1.draw(canvas);
                }
            }
        }
    }
    
    public final void drawableStateChanged() {
        if (this.f2) {
            return;
        }
        boolean b = true;
        this.f2 = true;
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final iq4 b2 = this.b2;
        final boolean b3 = b2 != null && (b2.A(drawableState) | false);
        if (this.G0 != null) {
            final WeakHashMap a = p5x.a;
            if (!p5x$g.c((View)this) || !((View)this).isEnabled()) {
                b = false;
            }
            this.A(b, false);
        }
        this.w();
        this.F();
        if (b3) {
            ((View)this).invalidate();
        }
        this.f2 = false;
    }
    
    public final int e() {
        if (!this.e1) {
            return 0;
        }
        final int n1 = this.n1;
        float g;
        if (n1 != 0) {
            if (n1 != 2) {
                return 0;
            }
            g = this.b2.g() / 2.0f;
        }
        else {
            g = this.b2.g();
        }
        return (int)g;
    }
    
    public final boolean f() {
        return this.e1 && !TextUtils.isEmpty(this.f1) && this.h1 instanceof ce7;
    }
    
    public final int g(int n, final boolean b) {
        final int n2 = n += ((TextView)this.G0).getCompoundPaddingLeft();
        if (this.getPrefixText() != null) {
            n = n2;
            if (!b) {
                n = n2 - ((View)this.getPrefixTextView()).getMeasuredWidth() + ((View)this.getPrefixTextView()).getPaddingLeft();
            }
        }
        return n;
    }
    
    public int getBaseline() {
        final EditText g0 = this.G0;
        if (g0 != null) {
            return this.e() + (((View)this).getPaddingTop() + ((View)g0).getBaseline());
        }
        return super.getBaseline();
    }
    
    public qng getBoxBackground() {
        final int n1 = this.n1;
        if (n1 != 1 && n1 != 2) {
            throw new IllegalStateException();
        }
        return this.h1;
    }
    
    public int getBoxBackgroundColor() {
        return this.t1;
    }
    
    public int getBoxBackgroundMode() {
        return this.n1;
    }
    
    public int getBoxCollapsedPaddingTop() {
        return this.o1;
    }
    
    public float getBoxCornerRadiusBottomEnd() {
        float n;
        if (sbx.d((View)this)) {
            n = this.k1.h.a(this.w1);
        }
        else {
            n = this.k1.g.a(this.w1);
        }
        return n;
    }
    
    public float getBoxCornerRadiusBottomStart() {
        float n;
        if (sbx.d((View)this)) {
            n = this.k1.g.a(this.w1);
        }
        else {
            n = this.k1.h.a(this.w1);
        }
        return n;
    }
    
    public float getBoxCornerRadiusTopEnd() {
        float n;
        if (sbx.d((View)this)) {
            n = this.k1.e.a(this.w1);
        }
        else {
            n = this.k1.f.a(this.w1);
        }
        return n;
    }
    
    public float getBoxCornerRadiusTopStart() {
        float n;
        if (sbx.d((View)this)) {
            n = this.k1.f.a(this.w1);
        }
        else {
            n = this.k1.e.a(this.w1);
        }
        return n;
    }
    
    public int getBoxStrokeColor() {
        return this.T1;
    }
    
    public ColorStateList getBoxStrokeErrorColor() {
        return this.U1;
    }
    
    public int getBoxStrokeWidth() {
        return this.q1;
    }
    
    public int getBoxStrokeWidthFocused() {
        return this.r1;
    }
    
    public int getCounterMaxLength() {
        return this.O0;
    }
    
    public CharSequence getCounterOverflowDescription() {
        if (this.N0 && this.P0) {
            final AppCompatTextView q0 = this.Q0;
            if (q0 != null) {
                return ((View)q0).getContentDescription();
            }
        }
        return null;
    }
    
    public ColorStateList getCounterOverflowTextColor() {
        return this.a1;
    }
    
    public ColorStateList getCounterTextColor() {
        return this.a1;
    }
    
    public ColorStateList getDefaultHintTextColor() {
        return this.P1;
    }
    
    public EditText getEditText() {
        return this.G0;
    }
    
    public CharSequence getEndIconContentDescription() {
        return ((View)this.D1).getContentDescription();
    }
    
    public Drawable getEndIconDrawable() {
        return ((ImageView)this.D1).getDrawable();
    }
    
    public int getEndIconMode() {
        return this.B1;
    }
    
    public CheckableImageButton getEndIconView() {
        return this.D1;
    }
    
    public CharSequence getError() {
        final jld m0 = this.M0;
        CharSequence j;
        if (m0.k) {
            j = m0.j;
        }
        else {
            j = null;
        }
        return j;
    }
    
    public CharSequence getErrorContentDescription() {
        return this.M0.m;
    }
    
    public int getErrorCurrentTextColors() {
        return this.M0.g();
    }
    
    public Drawable getErrorIconDrawable() {
        return ((ImageView)this.M1).getDrawable();
    }
    
    public final int getErrorTextCurrentColor() {
        return this.M0.g();
    }
    
    public CharSequence getHelperText() {
        final jld m0 = this.M0;
        CharSequence p;
        if (m0.q) {
            p = m0.p;
        }
        else {
            p = null;
        }
        return p;
    }
    
    public int getHelperTextCurrentTextColor() {
        final AppCompatTextView r = this.M0.r;
        int currentTextColor;
        if (r != null) {
            currentTextColor = r.getCurrentTextColor();
        }
        else {
            currentTextColor = -1;
        }
        return currentTextColor;
    }
    
    public CharSequence getHint() {
        CharSequence f1;
        if (this.e1) {
            f1 = this.f1;
        }
        else {
            f1 = null;
        }
        return f1;
    }
    
    public final float getHintCollapsedTextHeight() {
        return this.b2.g();
    }
    
    public final int getHintCurrentCollapsedTextColor() {
        return this.b2.h();
    }
    
    public ColorStateList getHintTextColor() {
        return this.Q1;
    }
    
    public int getMaxEms() {
        return this.J0;
    }
    
    public int getMaxWidth() {
        return this.L0;
    }
    
    public int getMinEms() {
        return this.I0;
    }
    
    public int getMinWidth() {
        return this.K0;
    }
    
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return ((View)this.D1).getContentDescription();
    }
    
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return ((ImageView)this.D1).getDrawable();
    }
    
    public CharSequence getPlaceholderText() {
        CharSequence t0;
        if (this.U0) {
            t0 = this.T0;
        }
        else {
            t0 = null;
        }
        return t0;
    }
    
    public int getPlaceholderTextAppearance() {
        return this.X0;
    }
    
    public ColorStateList getPlaceholderTextColor() {
        return this.W0;
    }
    
    public CharSequence getPrefixText() {
        return this.D0.E0;
    }
    
    public ColorStateList getPrefixTextColor() {
        return this.D0.D0.getTextColors();
    }
    
    public TextView getPrefixTextView() {
        return this.D0.D0;
    }
    
    public CharSequence getStartIconContentDescription() {
        return ((View)this.D0.F0).getContentDescription();
    }
    
    public Drawable getStartIconDrawable() {
        return ((ImageView)this.D0.F0).getDrawable();
    }
    
    public CharSequence getSuffixText() {
        return this.c1;
    }
    
    public ColorStateList getSuffixTextColor() {
        return this.d1.getTextColors();
    }
    
    public TextView getSuffixTextView() {
        return this.d1;
    }
    
    public Typeface getTypeface() {
        return this.x1;
    }
    
    public final int h(int n, final boolean b) {
        final int n2 = n -= ((TextView)this.G0).getCompoundPaddingRight();
        if (this.getPrefixText() != null) {
            n = n2;
            if (b) {
                n = n2 + (((View)this.getPrefixTextView()).getMeasuredWidth() - ((View)this.getPrefixTextView()).getPaddingRight());
            }
        }
        return n;
    }
    
    public final boolean i() {
        return this.B1 != 0;
    }
    
    public final void j() {
        final AppCompatTextView v0 = this.V0;
        if (v0 != null && this.U0) {
            v0.setText((CharSequence)null);
            szt.a((ViewGroup)this.C0, (xyt)this.Z0);
            ((View)this.V0).setVisibility(4);
        }
    }
    
    public final boolean k() {
        return ((View)this.F0).getVisibility() == 0 && ((View)this.D1).getVisibility() == 0;
    }
    
    public final boolean l() {
        return ((View)this.M1).getVisibility() == 0;
    }
    
    public final void m() {
        final int n1 = this.n1;
        final int n2 = 1;
        if (n1 != 0) {
            if (n1 != 1) {
                if (n1 != 2) {
                    throw new IllegalArgumentException(gd.y(new StringBuilder(), this.n1, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
                if (this.e1 && !(this.h1 instanceof ce7)) {
                    this.h1 = new ce7(this.k1);
                }
                else {
                    this.h1 = new qng(this.k1);
                }
                this.i1 = null;
                this.j1 = null;
            }
            else {
                this.h1 = new qng(this.k1);
                this.i1 = new qng();
                this.j1 = new qng();
            }
        }
        else {
            this.h1 = null;
            this.i1 = null;
            this.j1 = null;
        }
        final EditText g0 = this.G0;
        if (g0 != null && this.h1 != null && ((View)g0).getBackground() == null && this.n1 != 0) {
            final EditText g2 = this.G0;
            final qng h1 = this.h1;
            final WeakHashMap a = p5x.a;
            p5x$d.q((View)g2, (Drawable)h1);
        }
        this.F();
        if (this.n1 == 1) {
            if (((View)this).getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.o1 = ((View)this).getResources().getDimensionPixelSize(2131166359);
            }
            else if (ong.f(((View)this).getContext())) {
                this.o1 = ((View)this).getResources().getDimensionPixelSize(2131166358);
            }
        }
        if (this.G0 != null) {
            if (this.n1 == 1) {
                int n3;
                if (((View)this).getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    n3 = n2;
                }
                else {
                    n3 = 0;
                }
                if (n3 != 0) {
                    final EditText g3 = this.G0;
                    final WeakHashMap a2 = p5x.a;
                    p5x$e.k((View)g3, p5x$e.f((View)g3), ((View)this).getResources().getDimensionPixelSize(2131166357), p5x$e.e((View)this.G0), ((View)this).getResources().getDimensionPixelSize(2131166356));
                }
                else if (ong.f(((View)this).getContext())) {
                    final EditText g4 = this.G0;
                    final WeakHashMap a3 = p5x.a;
                    p5x$e.k((View)g4, p5x$e.f((View)g4), ((View)this).getResources().getDimensionPixelSize(2131166355), p5x$e.e((View)this.G0), ((View)this).getResources().getDimensionPixelSize(2131166354));
                }
            }
        }
        if (this.n1 != 0) {
            this.z();
        }
    }
    
    public final void n() {
        if (!this.f()) {
            return;
        }
        final RectF w1 = this.w1;
        final iq4 b2 = this.b2;
        final int width = ((View)this.G0).getWidth();
        final int gravity = ((TextView)this.G0).getGravity();
        final boolean b3 = b2.b(b2.G);
        b2.I = b3;
        float left = 0.0f;
        Label_0195: {
            float n = 0.0f;
            float n2 = 0.0f;
            Label_0188: {
                if (gravity != 17 && (gravity & 0x7) != 0x1) {
                    int n3;
                    if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                        final Rect i = b2.i;
                        if (b3) {
                            n = (float)i.right;
                            n2 = b2.j0;
                            break Label_0188;
                        }
                        n3 = i.left;
                    }
                    else {
                        final Rect j = b2.i;
                        if (!b3) {
                            n = (float)j.right;
                            n2 = b2.j0;
                            break Label_0188;
                        }
                        n3 = j.left;
                    }
                    left = (float)n3;
                    break Label_0195;
                }
                n = width / 2.0f;
                n2 = b2.j0 / 2.0f;
            }
            left = n - n2;
        }
        w1.left = left;
        final Rect k = b2.i;
        final float top = (float)k.top;
        w1.top = top;
        float right = 0.0f;
        Label_0335: {
            if (gravity != 17 && (gravity & 0x7) != 0x1) {
                int n4;
                if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                    if (!b3) {
                        right = b2.j0 + left;
                        break Label_0335;
                    }
                    n4 = k.right;
                }
                else {
                    if (b3) {
                        right = b2.j0 + left;
                        break Label_0335;
                    }
                    n4 = k.right;
                }
                right = (float)n4;
            }
            else {
                right = width / 2.0f + b2.j0 / 2.0f;
            }
        }
        w1.right = right;
        w1.bottom = b2.g() + top;
        final float left2 = w1.left;
        final float n5 = (float)this.m1;
        w1.left = left2 - n5;
        w1.right += n5;
        w1.offset((float)(-((View)this).getPaddingLeft()), -((View)this).getPaddingTop() - w1.height() / 2.0f + this.p1);
        final ce7 ce7 = (ce7)this.h1;
        Objects.requireNonNull(ce7);
        ce7.C(w1.left, w1.top, w1.right, w1.bottom);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b2.k(configuration);
    }
    
    public final void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final EditText g0 = this.G0;
        if (g0 != null) {
            final Rect u1 = this.u1;
            tp8.a((ViewGroup)this, (View)g0, u1);
            final qng i1 = this.i1;
            if (i1 != null) {
                n = u1.bottom;
                n2 = this.q1;
                ((Drawable)i1).setBounds(u1.left, n - n2, u1.right, n);
            }
            final qng j1 = this.j1;
            if (j1 != null) {
                n2 = u1.bottom;
                n = this.r1;
                ((Drawable)j1).setBounds(u1.left, n2 - n, u1.right, n2);
            }
            if (this.e1) {
                final iq4 b2 = this.b2;
                final float textSize = ((TextView)this.G0).getTextSize();
                if (b2.m != textSize) {
                    b2.m = textSize;
                    b2.m(false);
                }
                n = ((TextView)this.G0).getGravity();
                this.b2.q((n & 0xFFFFFF8F) | 0x30);
                this.b2.v(n);
                final iq4 b3 = this.b2;
                if (this.G0 == null) {
                    throw new IllegalStateException();
                }
                final Rect v1 = this.v1;
                final boolean d = sbx.d((View)this);
                v1.bottom = u1.bottom;
                n = this.n1;
                n2 = 1;
                if (n != 1) {
                    if (n != 2) {
                        v1.left = this.g(u1.left, d);
                        v1.top = ((View)this).getPaddingTop();
                        v1.right = this.h(u1.right, d);
                    }
                    else {
                        n = u1.left;
                        v1.left = ((View)this.G0).getPaddingLeft() + n;
                        v1.top = u1.top - this.e();
                        v1.right = u1.right - ((View)this.G0).getPaddingRight();
                    }
                }
                else {
                    v1.left = this.g(u1.left, d);
                    v1.top = u1.top + this.o1;
                    v1.right = this.h(u1.right, d);
                }
                Objects.requireNonNull(b3);
                b3.n(v1.left, v1.top, v1.right, v1.bottom);
                final iq4 b4 = this.b2;
                if (this.G0 == null) {
                    throw new IllegalStateException();
                }
                final Rect v2 = this.v1;
                final TextPaint u2 = b4.U;
                ((Paint)u2).setTextSize(b4.m);
                ((Paint)u2).setTypeface(b4.A);
                ((Paint)u2).setLetterSpacing(b4.g0);
                final float n5 = -((Paint)b4.U).ascent();
                n = u1.left;
                v2.left = ((TextView)this.G0).getCompoundPaddingLeft() + n;
                if (this.n1 == 1 && ((TextView)this.G0).getMinLines() <= 1) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    n = (int)(u1.centerY() - n5 / 2.0f);
                }
                else {
                    n = u1.top + ((TextView)this.G0).getCompoundPaddingTop();
                }
                v2.top = n;
                v2.right = u1.right - ((TextView)this.G0).getCompoundPaddingRight();
                if (this.n1 == 1 && ((TextView)this.G0).getMinLines() <= 1) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    n = (int)(v2.top + n5);
                }
                else {
                    n = u1.bottom - ((TextView)this.G0).getCompoundPaddingBottom();
                }
                v2.bottom = n;
                Objects.requireNonNull(b4);
                b4.s(v2.left, v2.top, v2.right, v2.bottom);
                this.b2.m(false);
                if (this.f() && !this.a2) {
                    this.n();
                }
            }
        }
    }
    
    public final void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        Label_0060: {
            if (this.G0 != null) {
                n = Math.max(((View)this.E0).getMeasuredHeight(), ((View)this.D0).getMeasuredHeight());
                if (((View)this.G0).getMeasuredHeight() < n) {
                    ((View)this.G0).setMinimumHeight(n);
                    n = 1;
                    break Label_0060;
                }
            }
            n = 0;
        }
        final boolean v = this.v();
        if (n != 0 || v) {
            ((View)this.G0).post((Runnable)new Runnable() {
                @Override
                public final void run() {
                    ((View)TextInputLayout.this.G0).requestLayout();
                }
            });
        }
        if (this.V0 != null) {
            final EditText g0 = this.G0;
            if (g0 != null) {
                n = ((TextView)g0).getGravity();
                this.V0.setGravity(n);
                this.V0.setPadding(((TextView)this.G0).getCompoundPaddingLeft(), ((TextView)this.G0).getCompoundPaddingTop(), ((TextView)this.G0).getCompoundPaddingRight(), ((TextView)this.G0).getCompoundPaddingBottom());
            }
        }
        this.D();
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout.TextInputLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final TextInputLayout.TextInputLayout$SavedState textInputLayout$SavedState = (TextInputLayout.TextInputLayout$SavedState)parcelable;
        super.onRestoreInstanceState(((fa)textInputLayout$SavedState).getSuperState());
        this.setError(textInputLayout$SavedState.error);
        if (textInputLayout$SavedState.isEndIconChecked) {
            ((View)this.D1).post((Runnable)new Runnable() {
                @Override
                public final void run() {
                    ((View)TextInputLayout.this.D1).performClick();
                    ((View)TextInputLayout.this.D1).jumpDrawablesToCurrentState();
                }
            });
        }
        this.setHint(textInputLayout$SavedState.hintText);
        this.setHelperText(textInputLayout$SavedState.helperText);
        this.setPlaceholderText(textInputLayout$SavedState.placeholderText);
        ((View)this).requestLayout();
    }
    
    public final void onRtlPropertiesChanged(int n) {
        super.onRtlPropertiesChanged(n);
        final int n2 = 0;
        final boolean b = n == 1;
        final boolean l1 = this.l1;
        if (b != l1) {
            n = n2;
            if (b) {
                n = n2;
                if (!l1) {
                    n = 1;
                }
            }
            float a = this.k1.e.a(this.w1);
            final float a2 = this.k1.f.a(this.w1);
            float a3 = this.k1.h.a(this.w1);
            final float a4 = this.k1.g.a(this.w1);
            float n3;
            if (n != 0) {
                n3 = a;
            }
            else {
                n3 = a2;
            }
            if (n != 0) {
                a = a2;
            }
            float n4;
            if (n != 0) {
                n4 = a3;
            }
            else {
                n4 = a4;
            }
            if (n != 0) {
                a3 = a4;
            }
            final boolean d = sbx.d((View)this);
            this.l1 = d;
            float n5;
            if (d) {
                n5 = a;
            }
            else {
                n5 = n3;
            }
            if (!d) {
                n3 = a;
            }
            float n6;
            if (d) {
                n6 = a3;
            }
            else {
                n6 = n4;
            }
            if (!d) {
                n4 = a3;
            }
            final qng h1 = this.h1;
            if (h1 != null && h1.l() == n5) {
                final qng h2 = this.h1;
                if (h2.C0.a.f.a(h2.i()) == n3) {
                    final qng h3 = this.h1;
                    if (h3.C0.a.h.a(h3.i()) == n6) {
                        final qng h4 = this.h1;
                        if (h4.C0.a.g.a(h4.i()) == n4) {
                            return;
                        }
                    }
                }
            }
            final pqp k1 = this.k1;
            Objects.requireNonNull(k1);
            final pqp.a a5 = new pqp.a(k1);
            a5.f(n5);
            a5.g(n3);
            a5.d(n6);
            a5.e(n4);
            this.k1 = a5.a();
            this.d();
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final TextInputLayout.TextInputLayout$SavedState textInputLayout$SavedState = new TextInputLayout.TextInputLayout$SavedState(super.onSaveInstanceState());
        if (this.M0.e()) {
            textInputLayout$SavedState.error = this.getError();
        }
        textInputLayout$SavedState.isEndIconChecked = (this.i() && this.D1.isChecked());
        textInputLayout$SavedState.hintText = this.getHint();
        textInputLayout$SavedState.helperText = this.getHelperText();
        textInputLayout$SavedState.placeholderText = this.getPlaceholderText();
        return (Parcelable)textInputLayout$SavedState;
    }
    
    public final void p() {
        d4d.c(this, this.D1, this.F1);
    }
    
    public final void r(final TextView textView, int defaultColor) {
        final int n = 1;
        Label_0044: {
            try {
                hjs.f(textView, defaultColor);
                if (Build$VERSION.SDK_INT >= 23) {
                    defaultColor = textView.getTextColors().getDefaultColor();
                    if (defaultColor == -65281) {
                        defaultColor = n;
                        break Label_0044;
                    }
                }
                defaultColor = 0;
            }
            catch (final Exception ex) {
                defaultColor = n;
            }
        }
        if (defaultColor != 0) {
            hjs.f(textView, 2132018421);
            textView.setTextColor(eo6.b(((View)this).getContext(), 2131099835));
        }
    }
    
    public final void s() {
        if (this.Q0 != null) {
            final EditText g0 = this.G0;
            int length;
            if (g0 == null) {
                length = 0;
            }
            else {
                length = ((CharSequence)g0.getText()).length();
            }
            this.t(length);
        }
    }
    
    public void setBoxBackgroundColor(final int n) {
        if (this.t1 != n) {
            this.t1 = n;
            this.V1 = n;
            this.X1 = n;
            this.Y1 = n;
            this.d();
        }
    }
    
    public void setBoxBackgroundColorResource(final int n) {
        this.setBoxBackgroundColor(eo6.b(((View)this).getContext(), n));
    }
    
    public void setBoxBackgroundColorStateList(final ColorStateList list) {
        final int defaultColor = list.getDefaultColor();
        this.V1 = defaultColor;
        this.t1 = defaultColor;
        this.W1 = list.getColorForState(new int[] { -16842910 }, -1);
        this.X1 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
        this.Y1 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
        this.d();
    }
    
    public void setBoxBackgroundMode(final int n1) {
        if (n1 == this.n1) {
            return;
        }
        this.n1 = n1;
        if (this.G0 != null) {
            this.m();
        }
    }
    
    public void setBoxCollapsedPaddingTop(final int o1) {
        this.o1 = o1;
    }
    
    public void setBoxStrokeColor(final int t1) {
        if (this.T1 != t1) {
            this.T1 = t1;
            this.F();
        }
    }
    
    public void setBoxStrokeColorStateList(final ColorStateList list) {
        if (list.isStateful()) {
            this.R1 = list.getDefaultColor();
            this.Z1 = list.getColorForState(new int[] { -16842910 }, -1);
            this.S1 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
            this.T1 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
        }
        else if (this.T1 != list.getDefaultColor()) {
            this.T1 = list.getDefaultColor();
        }
        this.F();
    }
    
    public void setBoxStrokeErrorColor(final ColorStateList u1) {
        if (this.U1 != u1) {
            this.U1 = u1;
            this.F();
        }
    }
    
    public void setBoxStrokeWidth(final int q1) {
        this.q1 = q1;
        this.F();
    }
    
    public void setBoxStrokeWidthFocused(final int r1) {
        this.r1 = r1;
        this.F();
    }
    
    public void setBoxStrokeWidthFocusedResource(final int n) {
        this.setBoxStrokeWidthFocused(((View)this).getResources().getDimensionPixelSize(n));
    }
    
    public void setBoxStrokeWidthResource(final int n) {
        this.setBoxStrokeWidth(((View)this).getResources().getDimensionPixelSize(n));
    }
    
    public void setCounterEnabled(final boolean n0) {
        if (this.N0 != n0) {
            if (n0) {
                ((View)(this.Q0 = new AppCompatTextView(((View)this).getContext(), null))).setId(2131431987);
                final Typeface x1 = this.x1;
                if (x1 != null) {
                    this.Q0.setTypeface(x1);
                }
                this.Q0.setMaxLines(1);
                this.M0.a(this.Q0, 2);
                wkg.h((ViewGroup$MarginLayoutParams)((View)this.Q0).getLayoutParams(), ((View)this).getResources().getDimensionPixelOffset(2131166672));
                this.u();
                this.s();
            }
            else {
                this.M0.j(this.Q0, 2);
                this.Q0 = null;
            }
            this.N0 = n0;
        }
    }
    
    public void setCounterMaxLength(final int o0) {
        if (this.O0 != o0) {
            if (o0 > 0) {
                this.O0 = o0;
            }
            else {
                this.O0 = -1;
            }
            if (this.N0) {
                this.s();
            }
        }
    }
    
    public void setCounterOverflowTextAppearance(final int r0) {
        if (this.R0 != r0) {
            this.R0 = r0;
            this.u();
        }
    }
    
    public void setCounterOverflowTextColor(final ColorStateList b1) {
        if (this.b1 != b1) {
            this.b1 = b1;
            this.u();
        }
    }
    
    public void setCounterTextAppearance(final int s0) {
        if (this.S0 != s0) {
            this.S0 = s0;
            this.u();
        }
    }
    
    public void setCounterTextColor(final ColorStateList a1) {
        if (this.a1 != a1) {
            this.a1 = a1;
            this.u();
        }
    }
    
    public void setDefaultHintTextColor(final ColorStateList list) {
        this.P1 = list;
        this.Q1 = list;
        if (this.G0 != null) {
            this.A(false, false);
        }
    }
    
    public void setEnabled(final boolean enabled) {
        o((ViewGroup)this, enabled);
        super.setEnabled(enabled);
    }
    
    public void setEndIconActivated(final boolean activated) {
        ((View)this.D1).setActivated(activated);
    }
    
    public void setEndIconCheckable(final boolean checkable) {
        this.D1.setCheckable(checkable);
    }
    
    public void setEndIconContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setEndIconContentDescription(text);
    }
    
    public void setEndIconContentDescription(final CharSequence contentDescription) {
        if (this.getEndIconContentDescription() != contentDescription) {
            ((View)this.D1).setContentDescription(contentDescription);
        }
    }
    
    public void setEndIconDrawable(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(((View)this).getContext(), n);
        }
        else {
            g = null;
        }
        this.setEndIconDrawable(g);
    }
    
    public void setEndIconDrawable(final Drawable imageDrawable) {
        this.D1.setImageDrawable(imageDrawable);
        if (imageDrawable != null) {
            d4d.a(this, this.D1, this.F1, this.G1);
            this.p();
        }
    }
    
    public void setEndIconMode(final int b1) {
        final int b2 = this.B1;
        if (b2 == b1) {
            return;
        }
        this.B1 = b1;
        final Iterator<Object> iterator = this.E1.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, b2);
        }
        this.setEndIconVisible(b1 != 0);
        if (this.getEndIconDelegate().b(this.n1)) {
            this.getEndIconDelegate().a();
            d4d.a(this, this.D1, this.F1, this.G1);
            return;
        }
        final StringBuilder g = w48.g("The current box background mode ");
        g.append(this.n1);
        g.append(" is not supported by the end icon mode ");
        g.append(b1);
        throw new IllegalStateException(g.toString());
    }
    
    public void setEndIconOnClickListener(final View$OnClickListener onClickListener) {
        final CheckableImageButton d1 = this.D1;
        final View$OnLongClickListener k1 = this.K1;
        ((View)d1).setOnClickListener(onClickListener);
        q(d1, k1);
    }
    
    public void setEndIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.K1 = view$OnLongClickListener;
        final CheckableImageButton d1 = this.D1;
        ((View)d1).setOnLongClickListener(view$OnLongClickListener);
        q(d1, view$OnLongClickListener);
    }
    
    public void setEndIconTintList(final ColorStateList f1) {
        if (this.F1 != f1) {
            this.F1 = f1;
            d4d.a(this, this.D1, f1, this.G1);
        }
    }
    
    public void setEndIconTintMode(final PorterDuff$Mode g1) {
        if (this.G1 != g1) {
            this.G1 = g1;
            d4d.a(this, this.D1, this.F1, g1);
        }
    }
    
    public void setEndIconVisible(final boolean b) {
        if (this.k() != b) {
            final CheckableImageButton d1 = this.D1;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)d1).setVisibility(visibility);
            this.x();
            this.D();
            this.v();
        }
    }
    
    public void setError(final CharSequence charSequence) {
        if (!this.M0.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            final jld m0 = this.M0;
            m0.c();
            m0.j = charSequence;
            m0.l.setText(charSequence);
            final int h = m0.h;
            if (h != 1) {
                m0.i = 1;
            }
            m0.l(h, m0.i, m0.k(m0.l, charSequence));
        }
        else {
            this.M0.i();
        }
    }
    
    public void setErrorContentDescription(final CharSequence charSequence) {
        final jld m0 = this.M0;
        m0.m = charSequence;
        final AppCompatTextView l = m0.l;
        if (l != null) {
            ((View)l).setContentDescription(charSequence);
        }
    }
    
    public void setErrorEnabled(final boolean k) {
        final jld m0 = this.M0;
        if (m0.k != k) {
            m0.c();
            if (k) {
                ((View)(m0.l = new AppCompatTextView(m0.a, null))).setId(2131431988);
                ((View)m0.l).setTextAlignment(5);
                final Typeface u = m0.u;
                if (u != null) {
                    m0.l.setTypeface(u);
                }
                final int n = m0.n;
                m0.n = n;
                final AppCompatTextView l = m0.l;
                if (l != null) {
                    m0.b.r(l, n);
                }
                final ColorStateList o = m0.o;
                m0.o = o;
                final AppCompatTextView i = m0.l;
                if (i != null && o != null) {
                    i.setTextColor(o);
                }
                final CharSequence j = m0.m;
                m0.m = j;
                final AppCompatTextView l2 = m0.l;
                if (l2 != null) {
                    ((View)l2).setContentDescription(j);
                }
                ((View)m0.l).setVisibility(4);
                final AppCompatTextView l3 = m0.l;
                final WeakHashMap a = p5x.a;
                p5x$g.f((View)l3, 1);
                m0.a(m0.l, 0);
            }
            else {
                m0.i();
                m0.j(m0.l, 0);
                m0.l = null;
                m0.b.w();
                m0.b.F();
            }
            m0.k = k;
        }
    }
    
    public void setErrorIconDrawable(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(((View)this).getContext(), n);
        }
        else {
            g = null;
        }
        this.setErrorIconDrawable(g);
        d4d.c(this, this.M1, this.N1);
    }
    
    public void setErrorIconDrawable(final Drawable imageDrawable) {
        this.M1.setImageDrawable(imageDrawable);
        this.y();
        d4d.a(this, this.M1, this.N1, this.O1);
    }
    
    public void setErrorIconOnClickListener(final View$OnClickListener onClickListener) {
        final CheckableImageButton m1 = this.M1;
        final View$OnLongClickListener l1 = this.L1;
        ((View)m1).setOnClickListener(onClickListener);
        q(m1, l1);
    }
    
    public void setErrorIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.L1 = view$OnLongClickListener;
        final CheckableImageButton m1 = this.M1;
        ((View)m1).setOnLongClickListener(view$OnLongClickListener);
        q(m1, view$OnLongClickListener);
    }
    
    public void setErrorIconTintList(final ColorStateList n1) {
        if (this.N1 != n1) {
            this.N1 = n1;
            d4d.a(this, this.M1, n1, this.O1);
        }
    }
    
    public void setErrorIconTintMode(final PorterDuff$Mode o1) {
        if (this.O1 != o1) {
            this.O1 = o1;
            d4d.a(this, this.M1, this.N1, o1);
        }
    }
    
    public void setErrorTextAppearance(final int n) {
        final jld m0 = this.M0;
        m0.n = n;
        final AppCompatTextView l = m0.l;
        if (l != null) {
            m0.b.r(l, n);
        }
    }
    
    public void setErrorTextColor(final ColorStateList list) {
        final jld m0 = this.M0;
        m0.o = list;
        final AppCompatTextView l = m0.l;
        if (l != null && list != null) {
            l.setTextColor(list);
        }
    }
    
    public void setExpandedHintEnabled(final boolean c2) {
        if (this.c2 != c2) {
            this.c2 = c2;
            this.A(false, false);
        }
    }
    
    public void setHelperText(final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.M0.q) {
                this.setHelperTextEnabled(false);
            }
        }
        else {
            if (!this.M0.q) {
                this.setHelperTextEnabled(true);
            }
            final jld m0 = this.M0;
            m0.c();
            m0.p = charSequence;
            m0.r.setText(charSequence);
            final int h = m0.h;
            if (h != 2) {
                m0.i = 2;
            }
            m0.l(h, m0.i, m0.k(m0.r, charSequence));
        }
    }
    
    public void setHelperTextColor(final ColorStateList list) {
        final jld m0 = this.M0;
        m0.t = list;
        final AppCompatTextView r = m0.r;
        if (r != null && list != null) {
            r.setTextColor(list);
        }
    }
    
    public void setHelperTextEnabled(final boolean q) {
        final jld m0 = this.M0;
        if (m0.q != q) {
            m0.c();
            if (q) {
                ((View)(m0.r = new AppCompatTextView(m0.a, null))).setId(2131431989);
                ((View)m0.r).setTextAlignment(5);
                final Typeface u = m0.u;
                if (u != null) {
                    m0.r.setTypeface(u);
                }
                ((View)m0.r).setVisibility(4);
                final AppCompatTextView r = m0.r;
                final WeakHashMap a = p5x.a;
                p5x$g.f((View)r, 1);
                final int s = m0.s;
                m0.s = s;
                final AppCompatTextView r2 = m0.r;
                if (r2 != null) {
                    hjs.f((TextView)r2, s);
                }
                final ColorStateList t = m0.t;
                m0.t = t;
                final AppCompatTextView r3 = m0.r;
                if (r3 != null && t != null) {
                    r3.setTextColor(t);
                }
                m0.a(m0.r, 1);
                ((View)m0.r).setAccessibilityDelegate((View$AccessibilityDelegate)new kld(m0));
            }
            else {
                m0.c();
                final int h = m0.h;
                if (h == 2) {
                    m0.i = 0;
                }
                m0.l(h, m0.i, m0.k(m0.r, ""));
                m0.j(m0.r, 1);
                m0.r = null;
                m0.b.w();
                m0.b.F();
            }
            m0.q = q;
        }
    }
    
    public void setHelperTextTextAppearance(final int s) {
        final jld m0 = this.M0;
        m0.s = s;
        final AppCompatTextView r = m0.r;
        if (r != null) {
            hjs.f((TextView)r, s);
        }
    }
    
    public void setHint(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setHint(text);
    }
    
    public void setHint(final CharSequence hintInternal) {
        if (this.e1) {
            this.setHintInternal(hintInternal);
            ((View)this).sendAccessibilityEvent(2048);
        }
    }
    
    public void setHintAnimationEnabled(final boolean d2) {
        this.d2 = d2;
    }
    
    public void setHintEnabled(final boolean e1) {
        if (e1 != this.e1) {
            if (!(this.e1 = e1)) {
                this.g1 = false;
                if (!TextUtils.isEmpty(this.f1) && TextUtils.isEmpty(((TextView)this.G0).getHint())) {
                    ((TextView)this.G0).setHint(this.f1);
                }
                this.setHintInternal(null);
            }
            else {
                final CharSequence hint = ((TextView)this.G0).getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1)) {
                        this.setHint(hint);
                    }
                    ((TextView)this.G0).setHint((CharSequence)null);
                }
                this.g1 = true;
            }
            if (this.G0 != null) {
                this.z();
            }
        }
    }
    
    public void setHintTextAppearance(final int n) {
        this.b2.o(n);
        this.Q1 = this.b2.p;
        if (this.G0 != null) {
            this.A(false, false);
            this.z();
        }
    }
    
    public void setHintTextColor(final ColorStateList q1) {
        if (this.Q1 != q1) {
            if (this.P1 == null) {
                this.b2.p(q1);
            }
            this.Q1 = q1;
            if (this.G0 != null) {
                this.A(false, false);
            }
        }
    }
    
    public void setMaxEms(final int n) {
        this.J0 = n;
        final EditText g0 = this.G0;
        if (g0 != null && n != -1) {
            ((TextView)g0).setMaxEms(n);
        }
    }
    
    public void setMaxWidth(final int n) {
        this.L0 = n;
        final EditText g0 = this.G0;
        if (g0 != null && n != -1) {
            ((TextView)g0).setMaxWidth(n);
        }
    }
    
    public void setMaxWidthResource(final int n) {
        this.setMaxWidth(((View)this).getContext().getResources().getDimensionPixelSize(n));
    }
    
    public void setMinEms(final int n) {
        this.I0 = n;
        final EditText g0 = this.G0;
        if (g0 != null && n != -1) {
            ((TextView)g0).setMinEms(n);
        }
    }
    
    public void setMinWidth(final int n) {
        this.K0 = n;
        final EditText g0 = this.G0;
        if (g0 != null && n != -1) {
            ((TextView)g0).setMinWidth(n);
        }
    }
    
    public void setMinWidthResource(final int n) {
        this.setMinWidth(((View)this).getContext().getResources().getDimensionPixelSize(n));
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setPasswordVisibilityToggleContentDescription(text);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(final CharSequence contentDescription) {
        ((View)this.D1).setContentDescription(contentDescription);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(((View)this).getContext(), n);
        }
        else {
            g = null;
        }
        this.setPasswordVisibilityToggleDrawable(g);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(final Drawable imageDrawable) {
        this.D1.setImageDrawable(imageDrawable);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleEnabled(final boolean b) {
        if (b && this.B1 != 1) {
            this.setEndIconMode(1);
        }
        else if (!b) {
            this.setEndIconMode(0);
        }
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintList(final ColorStateList f1) {
        this.F1 = f1;
        d4d.a(this, this.D1, f1, this.G1);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintMode(final PorterDuff$Mode g1) {
        this.G1 = g1;
        d4d.a(this, this.D1, this.F1, g1);
    }
    
    public void setPlaceholderText(final CharSequence t0) {
        if (this.V0 == null) {
            ((View)(this.V0 = new AppCompatTextView(((View)this).getContext(), null))).setId(2131431990);
            final AppCompatTextView v0 = this.V0;
            final WeakHashMap a = p5x.a;
            p5x$d.s((View)v0, 2);
            final cra y0 = new cra();
            ((xyt)y0).E0 = 87L;
            final LinearInterpolator a2 = kc0.a;
            ((xyt)y0).F0 = (TimeInterpolator)a2;
            this.Y0 = y0;
            ((xyt)y0).D0 = 67L;
            final cra z0 = new cra();
            ((xyt)z0).E0 = 87L;
            ((xyt)z0).F0 = (TimeInterpolator)a2;
            this.Z0 = z0;
            this.setPlaceholderTextAppearance(this.X0);
            this.setPlaceholderTextColor(this.W0);
        }
        final boolean empty = TextUtils.isEmpty(t0);
        int length = 0;
        if (empty) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if (!this.U0) {
                this.setPlaceholderTextEnabled(true);
            }
            this.T0 = t0;
        }
        final EditText g0 = this.G0;
        if (g0 != null) {
            length = ((CharSequence)g0.getText()).length();
        }
        this.B(length);
    }
    
    public void setPlaceholderTextAppearance(final int x0) {
        this.X0 = x0;
        final AppCompatTextView v0 = this.V0;
        if (v0 != null) {
            hjs.f((TextView)v0, x0);
        }
    }
    
    public void setPlaceholderTextColor(final ColorStateList list) {
        if (this.W0 != list) {
            this.W0 = list;
            final AppCompatTextView v0 = this.V0;
            if (v0 != null && list != null) {
                v0.setTextColor(list);
            }
        }
    }
    
    public void setPrefixText(final CharSequence text) {
        final u6r d0 = this.D0;
        Objects.requireNonNull(d0);
        CharSequence e0;
        if (TextUtils.isEmpty(text)) {
            e0 = null;
        }
        else {
            e0 = text;
        }
        d0.E0 = e0;
        d0.D0.setText(text);
        d0.g();
    }
    
    public void setPrefixTextAppearance(final int n) {
        hjs.f((TextView)this.D0.D0, n);
    }
    
    public void setPrefixTextColor(final ColorStateList textColor) {
        this.D0.D0.setTextColor(textColor);
    }
    
    public void setStartIconCheckable(final boolean checkable) {
        this.D0.F0.setCheckable(checkable);
    }
    
    public void setStartIconContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setStartIconContentDescription(text);
    }
    
    public void setStartIconContentDescription(final CharSequence charSequence) {
        this.D0.a(charSequence);
    }
    
    public void setStartIconDrawable(final int n) {
        Drawable g;
        if (n != 0) {
            g = qli.g(((View)this).getContext(), n);
        }
        else {
            g = null;
        }
        this.setStartIconDrawable(g);
    }
    
    public void setStartIconDrawable(final Drawable drawable) {
        this.D0.b(drawable);
    }
    
    public void setStartIconOnClickListener(final View$OnClickListener view$OnClickListener) {
        this.D0.c(view$OnClickListener);
    }
    
    public void setStartIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.D0.d(view$OnLongClickListener);
    }
    
    public void setStartIconTintList(final ColorStateList g0) {
        final u6r d0 = this.D0;
        if (d0.G0 != g0) {
            d0.G0 = g0;
            d4d.a(d0.C0, d0.F0, g0, d0.H0);
        }
    }
    
    public void setStartIconTintMode(final PorterDuff$Mode h0) {
        final u6r d0 = this.D0;
        if (d0.H0 != h0) {
            d0.H0 = h0;
            d4d.a(d0.C0, d0.F0, d0.G0, h0);
        }
    }
    
    public void setStartIconVisible(final boolean b) {
        this.D0.e(b);
    }
    
    public void setSuffixText(final CharSequence text) {
        CharSequence c1;
        if (TextUtils.isEmpty(text)) {
            c1 = null;
        }
        else {
            c1 = text;
        }
        this.c1 = c1;
        this.d1.setText(text);
        this.E();
    }
    
    public void setSuffixTextAppearance(final int n) {
        hjs.f((TextView)this.d1, n);
    }
    
    public void setSuffixTextColor(final ColorStateList textColor) {
        this.d1.setTextColor(textColor);
    }
    
    public void setTextInputAccessibilityDelegate(final TextInputLayout.TextInputLayout$e textInputLayout$e) {
        final EditText g0 = this.G0;
        if (g0 != null) {
            p5x.z((View)g0, (wf)textInputLayout$e);
        }
    }
    
    public void setTypeface(final Typeface typeface) {
        if (typeface != this.x1) {
            this.x1 = typeface;
            final iq4 b2 = this.b2;
            final boolean r = b2.r(typeface);
            final boolean w = b2.w(typeface);
            if (r || w) {
                b2.m(false);
            }
            final jld m0 = this.M0;
            if (typeface != m0.u) {
                m0.u = typeface;
                final AppCompatTextView l = m0.l;
                if (l != null) {
                    l.setTypeface(typeface);
                }
                final AppCompatTextView r2 = m0.r;
                if (r2 != null) {
                    r2.setTypeface(typeface);
                }
            }
            final AppCompatTextView q0 = this.Q0;
            if (q0 != null) {
                q0.setTypeface(typeface);
            }
        }
    }
    
    public final void t(final int n) {
        final boolean p = this.P0;
        final int o0 = this.O0;
        CharSequence string = null;
        if (o0 == -1) {
            this.Q0.setText((CharSequence)String.valueOf(n));
            ((View)this.Q0).setContentDescription((CharSequence)null);
            this.P0 = false;
        }
        else {
            this.P0 = (n > o0);
            final Context context = ((View)this).getContext();
            final AppCompatTextView q0 = this.Q0;
            final int o2 = this.O0;
            int n2;
            if (this.P0) {
                n2 = 2131952439;
            }
            else {
                n2 = 2131952438;
            }
            ((View)q0).setContentDescription((CharSequence)context.getString(n2, new Object[] { n, o2 }));
            if (p != this.P0) {
                this.u();
            }
            final hw1 c = hw1.c();
            final AppCompatTextView q2 = this.Q0;
            final String string2 = ((View)this).getContext().getString(2131952440, new Object[] { n, this.O0 });
            final pes c2 = c.c;
            if (string2 != null) {
                string = ((SpannableStringBuilder)c.e(string2, c2)).toString();
            }
            q2.setText(string);
        }
        if (this.G0 != null && p != this.P0) {
            this.A(false, false);
            this.F();
            this.w();
        }
    }
    
    public final void u() {
        final AppCompatTextView q0 = this.Q0;
        if (q0 != null) {
            int n;
            if (this.P0) {
                n = this.R0;
            }
            else {
                n = this.S0;
            }
            this.r(q0, n);
            if (!this.P0) {
                final ColorStateList a1 = this.a1;
                if (a1 != null) {
                    this.Q0.setTextColor(a1);
                }
            }
            if (this.P0) {
                final ColorStateList b1 = this.b1;
                if (b1 != null) {
                    this.Q0.setTextColor(b1);
                }
            }
        }
    }
    
    public final boolean v() {
        if (this.G0 == null) {
            return false;
        }
        final Drawable startIconDrawable = this.getStartIconDrawable();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0220: {
            Label_0217: {
                if ((startIconDrawable != null || (this.getPrefixText() != null && ((View)this.getPrefixTextView()).getVisibility() == 0)) && ((View)this.D0).getMeasuredWidth() > 0) {
                    final int z1 = ((View)this.D0).getMeasuredWidth() - ((View)this.G0).getPaddingLeft();
                    if (this.y1 == null || this.z1 != z1) {
                        ((Drawable)(this.y1 = new ColorDrawable())).setBounds(0, 0, this.z1 = z1, 1);
                    }
                    final Drawable[] a = hjs$b.a((TextView)this.G0);
                    final Drawable drawable = a[0];
                    final ColorDrawable y1 = this.y1;
                    if (drawable == y1) {
                        break Label_0217;
                    }
                    hjs$b.e((TextView)this.G0, (Drawable)y1, a[1], a[2], a[3]);
                }
                else {
                    if (this.y1 == null) {
                        break Label_0217;
                    }
                    final Drawable[] a2 = hjs$b.a((TextView)this.G0);
                    hjs$b.e((TextView)this.G0, (Drawable)null, a2[1], a2[2], a2[3]);
                    this.y1 = null;
                }
                b3 = true;
                break Label_0220;
            }
            b3 = false;
        }
        if ((((View)this.M1).getVisibility() == 0 || (this.i() && this.k()) || this.c1 != null) && ((View)this.E0).getMeasuredWidth() > 0) {
            final int n = ((View)this.d1).getMeasuredWidth() - ((View)this.G0).getPaddingRight();
            final CheckableImageButton endIconToUpdateDummyDrawable = this.getEndIconToUpdateDummyDrawable();
            int n2 = n;
            if (endIconToUpdateDummyDrawable != null) {
                n2 = wkg.c((ViewGroup$MarginLayoutParams)((View)endIconToUpdateDummyDrawable).getLayoutParams()) + (((View)endIconToUpdateDummyDrawable).getMeasuredWidth() + n);
            }
            final Drawable[] a3 = hjs$b.a((TextView)this.G0);
            final ColorDrawable h1 = this.H1;
            if (h1 != null && this.I1 != n2) {
                ((Drawable)h1).setBounds(0, 0, this.I1 = n2, 1);
                hjs$b.e((TextView)this.G0, a3[0], a3[1], (Drawable)this.H1, a3[3]);
                b3 = b;
            }
            else {
                if (h1 == null) {
                    ((Drawable)(this.H1 = new ColorDrawable())).setBounds(0, 0, this.I1 = n2, 1);
                }
                final Drawable drawable2 = a3[2];
                final ColorDrawable h2 = this.H1;
                if (drawable2 != h2) {
                    this.J1 = a3[2];
                    hjs$b.e((TextView)this.G0, a3[0], a3[1], (Drawable)h2, a3[3]);
                    b3 = b;
                }
            }
        }
        else {
            final boolean b4 = b3;
            if (this.H1 == null) {
                return b4;
            }
            final Drawable[] a4 = hjs$b.a((TextView)this.G0);
            if (a4[2] == this.H1) {
                hjs$b.e((TextView)this.G0, a4[0], a4[1], this.J1, a4[3]);
                b3 = b2;
            }
            this.H1 = null;
        }
        return b3;
    }
    
    public final void w() {
        final EditText g0 = this.G0;
        if (g0 != null) {
            if (this.n1 == 0) {
                final Drawable background = ((View)g0).getBackground();
                if (background == null) {
                    return;
                }
                final int[] a = yd9.a;
                final Drawable mutate = background.mutate();
                if (this.M0.e()) {
                    mutate.setColorFilter((ColorFilter)ik0.c(this.M0.g(), PorterDuff$Mode.SRC_IN));
                }
                else {
                    if (this.P0) {
                        final AppCompatTextView q0 = this.Q0;
                        if (q0 != null) {
                            mutate.setColorFilter((ColorFilter)ik0.c(q0.getCurrentTextColor(), PorterDuff$Mode.SRC_IN));
                            return;
                        }
                    }
                    pd9.a(mutate);
                    ((View)this.G0).refreshDrawableState();
                }
            }
        }
    }
    
    public final void x() {
        final FrameLayout f0 = this.F0;
        final int visibility = ((View)this.D1).getVisibility();
        int visibility2 = 8;
        int visibility3;
        if (visibility == 0 && !this.l()) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        ((View)f0).setVisibility(visibility3);
        int n;
        if (this.c1 != null && !this.a2) {
            n = 0;
        }
        else {
            n = 8;
        }
        final boolean b = this.k() || this.l() || n == 0;
        final LinearLayout e0 = this.E0;
        if (b) {
            visibility2 = 0;
        }
        ((View)e0).setVisibility(visibility2);
    }
    
    public final void y() {
        final Drawable errorIconDrawable = this.getErrorIconDrawable();
        final int n = 0;
        boolean b = false;
        Label_0037: {
            if (errorIconDrawable != null) {
                final jld m0 = this.M0;
                if (m0.k && m0.e()) {
                    b = true;
                    break Label_0037;
                }
            }
            b = false;
        }
        final CheckableImageButton m2 = this.M1;
        int visibility;
        if (b) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((View)m2).setVisibility(visibility);
        this.x();
        this.D();
        if (!this.i()) {
            this.v();
        }
    }
    
    public final void z() {
        if (this.n1 != 1) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.C0).getLayoutParams();
            final int e = this.e();
            if (e != linearLayout$LayoutParams.topMargin) {
                linearLayout$LayoutParams.topMargin = e;
                ((View)this.C0).requestLayout();
            }
        }
    }
    
    public interface f
    {
        void a(final TextInputLayout p0);
    }
    
    public interface g
    {
        void a(final TextInputLayout p0, final int p1);
    }
}
