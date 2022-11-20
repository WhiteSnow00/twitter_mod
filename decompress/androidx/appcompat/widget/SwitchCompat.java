// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.animation.Animator;
import android.graphics.Paint;
import android.text.InputFilter;
import java.util.WeakHashMap;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import androidx.emoji2.text.c$e;
import androidx.emoji2.text.c;
import android.view.ActionMode$Callback;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.text.Layout$Alignment;
import android.text.Layout;
import android.text.method.TransformationMethod;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.animation.ObjectAnimator;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    public static final Property<SwitchCompat, Float> u1;
    public static final int[] v1;
    public Drawable D0;
    public ColorStateList E0;
    public PorterDuff$Mode F0;
    public boolean G0;
    public boolean H0;
    public Drawable I0;
    public ColorStateList J0;
    public PorterDuff$Mode K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public CharSequence R0;
    public CharSequence S0;
    public CharSequence T0;
    public CharSequence U0;
    public boolean V0;
    public int W0;
    public int X0;
    public float Y0;
    public float Z0;
    public VelocityTracker a1;
    public int b1;
    public float c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public boolean k1;
    public final TextPaint l1;
    public ColorStateList m1;
    public StaticLayout n1;
    public StaticLayout o1;
    public px p1;
    public ObjectAnimator q1;
    public fk0 r1;
    public SwitchCompat.SwitchCompat$c s1;
    public final Rect t1;
    
    static {
        SwitchCompat.u1 = new Property<SwitchCompat, Float>() {
            public final Object get(final Object o) {
                return ((SwitchCompat)o).c1;
            }
            
            public final void set(final Object o, final Object o2) {
                ((SwitchCompat)o).setThumbPosition((float)o2);
            }
        };
        v1 = new int[] { 16842912 };
    }
    
    public SwitchCompat(final Context context, final AttributeSet set) {
        super(context, set, 2130970771);
        this.E0 = null;
        this.F0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = null;
        this.K0 = null;
        this.L0 = false;
        this.M0 = false;
        this.a1 = VelocityTracker.obtain();
        boolean fakeBoldText = true;
        this.k1 = true;
        this.t1 = new Rect();
        hms.a((View)this, ((View)this).getContext());
        final TextPaint l1 = new TextPaint(1);
        this.l1 = l1;
        l1.density = ((View)this).getResources().getDisplayMetrics().density;
        final int[] e1 = jee.e1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, e1, 2130970771, 0);
        final kat kat = new kat(context, obtainStyledAttributes);
        j6x.y((View)this, context, e1, set, obtainStyledAttributes, 2130970771);
        final Drawable g = kat.g(2);
        this.D0 = g;
        if (g != null) {
            g.setCallback((Drawable$Callback)this);
        }
        final Drawable g2 = kat.g(11);
        if ((this.I0 = g2) != null) {
            g2.setCallback((Drawable$Callback)this);
        }
        this.setTextOnInternal(kat.n(0));
        this.setTextOffInternal(kat.n(1));
        this.V0 = kat.a(3, true);
        this.N0 = kat.f(8, 0);
        this.O0 = kat.f(5, 0);
        this.P0 = kat.f(6, 0);
        this.Q0 = kat.a(4, false);
        final ColorStateList c = kat.c(9);
        if (c != null) {
            this.E0 = c;
            this.G0 = true;
        }
        final PorterDuff$Mode d = gd9.d(kat.j(10, -1), (PorterDuff$Mode)null);
        if (this.F0 != d) {
            this.F0 = d;
            this.H0 = true;
        }
        if (this.G0 || this.H0) {
            this.a();
        }
        final ColorStateList c2 = kat.c(12);
        if (c2 != null) {
            this.J0 = c2;
            this.L0 = true;
        }
        final PorterDuff$Mode d2 = gd9.d(kat.j(13, -1), (PorterDuff$Mode)null);
        if (this.K0 != d2) {
            this.K0 = d2;
            this.M0 = true;
        }
        if (this.L0 || this.M0) {
            this.b();
        }
        final int i = kat.l(7, 0);
        if (i != 0) {
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, jee.f1);
            ColorStateList m1 = null;
            Label_0509: {
                if (obtainStyledAttributes2.hasValue(3)) {
                    final int resourceId = obtainStyledAttributes2.getResourceId(3, 0);
                    if (resourceId != 0) {
                        m1 = v68.u(context, resourceId);
                        if (m1 != null) {
                            break Label_0509;
                        }
                    }
                }
                m1 = obtainStyledAttributes2.getColorStateList(3);
            }
            if (m1 != null) {
                this.m1 = m1;
            }
            else {
                this.m1 = ((TextView)this).getTextColors();
            }
            final int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                final float textSize = (float)dimensionPixelSize;
                if (textSize != ((Paint)l1).getTextSize()) {
                    ((Paint)l1).setTextSize(textSize);
                    ((View)this).requestLayout();
                }
            }
            final int int1 = obtainStyledAttributes2.getInt(1, -1);
            final int int2 = obtainStyledAttributes2.getInt(2, -1);
            Typeface switchTypeface;
            if (int1 != 1) {
                if (int1 != 2) {
                    if (int1 != 3) {
                        switchTypeface = null;
                    }
                    else {
                        switchTypeface = Typeface.MONOSPACE;
                    }
                }
                else {
                    switchTypeface = Typeface.SERIF;
                }
            }
            else {
                switchTypeface = Typeface.SANS_SERIF;
            }
            float textSkewX = 0.0f;
            if (int2 > 0) {
                Typeface switchTypeface2;
                if (switchTypeface == null) {
                    switchTypeface2 = Typeface.defaultFromStyle(int2);
                }
                else {
                    switchTypeface2 = Typeface.create(switchTypeface, int2);
                }
                this.setSwitchTypeface(switchTypeface2);
                int style;
                if (switchTypeface2 != null) {
                    style = switchTypeface2.getStyle();
                }
                else {
                    style = 0;
                }
                final int n = ~style & int2;
                if ((n & 0x1) == 0x0) {
                    fakeBoldText = false;
                }
                ((Paint)l1).setFakeBoldText(fakeBoldText);
                if ((n & 0x2) != 0x0) {
                    textSkewX = -0.25f;
                }
                ((Paint)l1).setTextSkewX(textSkewX);
            }
            else {
                ((Paint)l1).setFakeBoldText(false);
                ((Paint)l1).setTextSkewX(0.0f);
                this.setSwitchTypeface(switchTypeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.p1 = new px(((View)this).getContext());
            }
            else {
                this.p1 = null;
            }
            this.setTextOnInternal(this.R0);
            this.setTextOffInternal(this.T0);
            obtainStyledAttributes2.recycle();
        }
        new qk0((TextView)this).h(set, 2130970771);
        kat.r();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.X0 = value.getScaledTouchSlop();
        this.b1 = value.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().b(set, 2130970771);
        ((View)this).refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private fk0 getEmojiTextViewHelper() {
        if (this.r1 == null) {
            this.r1 = new fk0((TextView)this);
        }
        return this.r1;
    }
    
    private boolean getTargetCheckedState() {
        return this.c1 > 0.5f;
    }
    
    private int getThumbOffset() {
        float c1;
        if (rcx.b((View)this)) {
            c1 = 1.0f - this.c1;
        }
        else {
            c1 = this.c1;
        }
        return (int)(c1 * this.getThumbScrollRange() + 0.5f);
    }
    
    private int getThumbScrollRange() {
        final Drawable i0 = this.I0;
        if (i0 != null) {
            final Rect t1 = this.t1;
            i0.getPadding(t1);
            final Drawable d0 = this.D0;
            Rect rect;
            if (d0 != null) {
                rect = gd9.c(d0);
            }
            else {
                rect = gd9.c;
            }
            return this.d1 - this.f1 - t1.left - t1.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private void setTextOffInternal(final CharSequence t0) {
        this.T0 = t0;
        this.U0 = this.c(t0);
        this.o1 = null;
        if (this.V0) {
            this.h();
        }
    }
    
    private void setTextOnInternal(final CharSequence r0) {
        this.R0 = r0;
        this.S0 = this.c(r0);
        this.n1 = null;
        if (this.V0) {
            this.h();
        }
    }
    
    public final void a() {
        final Drawable d0 = this.D0;
        if (d0 != null && (this.G0 || this.H0)) {
            final Drawable mutate = xc9.e(d0).mutate();
            this.D0 = mutate;
            if (this.G0) {
                xc9$b.h(mutate, this.E0);
            }
            if (this.H0) {
                xc9$b.i(this.D0, this.F0);
            }
            if (this.D0.isStateful()) {
                this.D0.setState(((View)this).getDrawableState());
            }
        }
    }
    
    public final void b() {
        final Drawable i0 = this.I0;
        if (i0 != null && (this.L0 || this.M0)) {
            final Drawable mutate = xc9.e(i0).mutate();
            this.I0 = mutate;
            if (this.L0) {
                xc9$b.h(mutate, this.J0);
            }
            if (this.M0) {
                xc9$b.i(this.I0, this.K0);
            }
            if (this.I0.isStateful()) {
                this.I0.setState(((View)this).getDrawableState());
            }
        }
    }
    
    public final CharSequence c(final CharSequence charSequence) {
        final TransformationMethod e = this.getEmojiTextViewHelper().b.a.e((TransformationMethod)this.p1);
        CharSequence transformation = charSequence;
        if (e != null) {
            transformation = e.getTransformation(charSequence, (View)this);
        }
        return transformation;
    }
    
    public final Layout d(final CharSequence charSequence) {
        final TextPaint l1 = this.l1;
        int n;
        if (charSequence != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(charSequence, l1));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(charSequence, l1, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    public final void draw(final Canvas canvas) {
        final Rect t1 = this.t1;
        int g1 = this.g1;
        final int h1 = this.h1;
        int i1 = this.i1;
        final int j1 = this.j1;
        final int n = this.getThumbOffset() + g1;
        final Drawable d0 = this.D0;
        Rect rect;
        if (d0 != null) {
            rect = gd9.c(d0);
        }
        else {
            rect = gd9.c;
        }
        final Drawable i2 = this.I0;
        int n2 = n;
        if (i2 != null) {
            i2.getPadding(t1);
            final int left = t1.left;
            final int n3 = n + left;
            int n5 = 0;
            int n6 = 0;
            int n9 = 0;
            Label_0258: {
                int n7;
                if (rect != null) {
                    final int left2 = rect.left;
                    int n4 = g1;
                    if (left2 > left) {
                        n4 = g1 + (left2 - left);
                    }
                    final int top = rect.top;
                    final int top2 = t1.top;
                    if (top > top2) {
                        n5 = top - top2 + h1;
                    }
                    else {
                        n5 = h1;
                    }
                    final int right = rect.right;
                    final int right2 = t1.right;
                    n6 = i1;
                    if (right > right2) {
                        n6 = i1 - (right - right2);
                    }
                    final int bottom = rect.bottom;
                    final int bottom2 = t1.bottom;
                    g1 = n4;
                    i1 = n6;
                    n7 = n5;
                    if (bottom > bottom2) {
                        final int n8 = j1 - (bottom - bottom2);
                        g1 = n4;
                        n9 = n8;
                        break Label_0258;
                    }
                }
                else {
                    n7 = h1;
                }
                n9 = j1;
                n5 = n7;
                n6 = i1;
            }
            this.I0.setBounds(g1, n5, n6, n9);
            n2 = n3;
        }
        final Drawable d2 = this.D0;
        if (d2 != null) {
            d2.getPadding(t1);
            final int n10 = n2 - t1.left;
            final int n11 = n2 + this.f1 + t1.right;
            this.D0.setBounds(n10, h1, n11, j1);
            final Drawable background = ((View)this).getBackground();
            if (background != null) {
                xc9$b.f(background, n10, h1, n11, j1);
            }
        }
        super.draw(canvas);
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable d0 = this.D0;
        if (d0 != null) {
            xc9$b.e(d0, n, n2);
        }
        final Drawable i0 = this.I0;
        if (i0 != null) {
            xc9$b.e(i0, n, n2);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final Drawable d0 = this.D0;
        int n2;
        final int n = n2 = 0;
        if (d0 != null) {
            n2 = n;
            if (d0.isStateful()) {
                n2 = ((false | d0.setState(drawableState)) ? 1 : 0);
            }
        }
        final Drawable i0 = this.I0;
        int n3 = n2;
        if (i0 != null) {
            n3 = n2;
            if (i0.isStateful()) {
                n3 = (n2 | (i0.setState(drawableState) ? 1 : 0));
            }
        }
        if (n3 != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final void e() {
        this.setTextOnInternal(this.R0);
        this.setTextOffInternal(this.T0);
        ((View)this).requestLayout();
    }
    
    public final void f() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.T0) == null) {
                charSequence = ((View)this).getResources().getString(2131951743);
            }
            j6x.D((View)this, charSequence);
        }
    }
    
    public final void g() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.R0) == null) {
                charSequence = ((View)this).getResources().getString(2131951744);
            }
            j6x.D((View)this, charSequence);
        }
    }
    
    public int getCompoundPaddingLeft() {
        if (!rcx.b((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.d1;
        if (!TextUtils.isEmpty(((TextView)this).getText())) {
            n += this.P0;
        }
        return n;
    }
    
    public int getCompoundPaddingRight() {
        if (rcx.b((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.d1;
        if (!TextUtils.isEmpty(((TextView)this).getText())) {
            n += this.P0;
        }
        return n;
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return cks.g(super.getCustomSelectionActionModeCallback());
    }
    
    public boolean getShowText() {
        return this.V0;
    }
    
    public boolean getSplitTrack() {
        return this.Q0;
    }
    
    public int getSwitchMinWidth() {
        return this.O0;
    }
    
    public int getSwitchPadding() {
        return this.P0;
    }
    
    public CharSequence getTextOff() {
        return this.T0;
    }
    
    public CharSequence getTextOn() {
        return this.R0;
    }
    
    public Drawable getThumbDrawable() {
        return this.D0;
    }
    
    public final float getThumbPosition() {
        return this.c1;
    }
    
    public int getThumbTextPadding() {
        return this.N0;
    }
    
    public ColorStateList getThumbTintList() {
        return this.E0;
    }
    
    public PorterDuff$Mode getThumbTintMode() {
        return this.F0;
    }
    
    public Drawable getTrackDrawable() {
        return this.I0;
    }
    
    public ColorStateList getTrackTintList() {
        return this.J0;
    }
    
    public PorterDuff$Mode getTrackTintMode() {
        return this.K0;
    }
    
    public final void h() {
        if (this.s1 == null) {
            if (this.r1.b.a.b()) {
                if (c.d()) {
                    final c a = c.a();
                    final int b = a.b();
                    if (b == 3 || b == 0) {
                        a.k((c$e)(this.s1 = new SwitchCompat.SwitchCompat$c(this)));
                    }
                }
            }
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable d0 = this.D0;
        if (d0 != null) {
            d0.jumpToCurrentState();
        }
        final Drawable i0 = this.I0;
        if (i0 != null) {
            i0.jumpToCurrentState();
        }
        final ObjectAnimator q1 = this.q1;
        if (q1 != null && ((Animator)q1).isStarted()) {
            ((Animator)this.q1).end();
            this.q1 = null;
        }
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, SwitchCompat.v1);
        }
        return onCreateDrawableState;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect t1 = this.t1;
        final Drawable i0 = this.I0;
        if (i0 != null) {
            i0.getPadding(t1);
        }
        else {
            t1.setEmpty();
        }
        final int h1 = this.h1;
        final int j1 = this.j1;
        final int top = t1.top;
        final int bottom = t1.bottom;
        final Drawable d0 = this.D0;
        if (i0 != null) {
            if (this.Q0 && d0 != null) {
                final Rect c = gd9.c(d0);
                d0.copyBounds(t1);
                t1.left += c.left;
                t1.right -= c.right;
                final int save = canvas.save();
                canvas.clipRect(t1, Region$Op.DIFFERENCE);
                i0.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                i0.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (d0 != null) {
            d0.draw(canvas);
        }
        StaticLayout staticLayout;
        if (this.getTargetCheckedState()) {
            staticLayout = this.n1;
        }
        else {
            staticLayout = this.o1;
        }
        if (staticLayout != null) {
            final int[] drawableState = ((View)this).getDrawableState();
            final ColorStateList m1 = this.m1;
            if (m1 != null) {
                ((Paint)this.l1).setColor(m1.getColorForState(drawableState, 0));
            }
            this.l1.drawableState = drawableState;
            int width;
            if (d0 != null) {
                final Rect bounds = d0.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = ((View)this).getWidth();
            }
            canvas.translate((float)(width / 2 - ((Layout)staticLayout).getWidth() / 2), (float)((h1 + top + (j1 - bottom)) / 2 - ((Layout)staticLayout).getHeight() / 2));
            ((Layout)staticLayout).draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"android.widget.Switch");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build$VERSION.SDK_INT < 30) {
            CharSequence text;
            if (this.isChecked()) {
                text = this.R0;
            }
            else {
                text = this.T0;
            }
            if (!TextUtils.isEmpty(text)) {
                final CharSequence text2 = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text2)) {
                    accessibilityNodeInfo.setText(text);
                }
                else {
                    final StringBuilder text3 = new StringBuilder();
                    text3.append(text2);
                    text3.append(' ');
                    text3.append(text);
                    accessibilityNodeInfo.setText((CharSequence)text3);
                }
            }
        }
    }
    
    public final void onLayout(final boolean b, int h1, int j1, int i1, int g1) {
        super.onLayout(b, h1, j1, i1, g1);
        final Drawable d0 = this.D0;
        j1 = 0;
        if (d0 != null) {
            final Rect t1 = this.t1;
            final Drawable i2 = this.I0;
            if (i2 != null) {
                i2.getPadding(t1);
            }
            else {
                t1.setEmpty();
            }
            final Rect c = gd9.c(this.D0);
            h1 = Math.max(0, c.left - t1.left);
            j1 = Math.max(0, c.right - t1.right);
        }
        else {
            h1 = 0;
        }
        if (rcx.b((View)this)) {
            g1 = ((View)this).getPaddingLeft() + h1;
            i1 = this.d1 + g1 - h1 - j1;
        }
        else {
            i1 = ((View)this).getWidth() - ((View)this).getPaddingRight() - j1;
            g1 = i1 - this.d1 + h1 + j1;
        }
        h1 = (((TextView)this).getGravity() & 0x70);
        if (h1 != 16) {
            if (h1 != 80) {
                h1 = ((View)this).getPaddingTop();
                j1 = this.e1 + h1;
            }
            else {
                j1 = ((View)this).getHeight() - ((View)this).getPaddingBottom();
                h1 = j1 - this.e1;
            }
        }
        else {
            h1 = ((View)this).getPaddingTop();
            h1 = (((View)this).getHeight() + h1 - ((View)this).getPaddingBottom()) / 2;
            j1 = this.e1;
            h1 -= j1 / 2;
            j1 += h1;
        }
        this.g1 = g1;
        this.h1 = h1;
        this.j1 = j1;
        this.i1 = i1;
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.V0) {
            if (this.n1 == null) {
                this.n1 = (StaticLayout)this.d(this.S0);
            }
            if (this.o1 == null) {
                this.o1 = (StaticLayout)this.d(this.U0);
            }
        }
        final Rect t1 = this.t1;
        final Drawable d0 = this.D0;
        final int n3 = 0;
        int n4;
        int intrinsicHeight;
        if (d0 != null) {
            d0.getPadding(t1);
            n4 = this.D0.getIntrinsicWidth() - t1.left - t1.right;
            intrinsicHeight = this.D0.getIntrinsicHeight();
        }
        else {
            n4 = 0;
            intrinsicHeight = 0;
        }
        int n5;
        if (this.V0) {
            n5 = this.N0 * 2 + Math.max(((Layout)this.n1).getWidth(), ((Layout)this.o1).getWidth());
        }
        else {
            n5 = 0;
        }
        this.f1 = Math.max(n5, n4);
        final Drawable i0 = this.I0;
        int intrinsicHeight2;
        if (i0 != null) {
            i0.getPadding(t1);
            intrinsicHeight2 = this.I0.getIntrinsicHeight();
        }
        else {
            t1.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = t1.left;
        final int right = t1.right;
        final Drawable d2 = this.D0;
        int max = right;
        int max2 = left;
        if (d2 != null) {
            final Rect c = gd9.c(d2);
            max2 = Math.max(left, c.left);
            max = Math.max(right, c.right);
        }
        int d3;
        if (this.k1) {
            d3 = Math.max(this.O0, this.f1 * 2 + max2 + max);
        }
        else {
            d3 = this.O0;
        }
        final int max3 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.d1 = d3;
        this.e1 = max3;
        super.onMeasure(n, n2);
        if (((View)this).getMeasuredHeight() < max3) {
            ((View)this).setMeasuredDimension(((View)this).getMeasuredWidthAndState(), max3);
        }
    }
    
    public final void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.R0;
        }
        else {
            charSequence = this.T0;
        }
        if (charSequence != null) {
            ((AccessibilityRecord)accessibilityEvent).getText().add(charSequence);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.a1.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = false;
        if (actionMasked != 0) {
            final float n = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                else {
                    final int w0 = this.W0;
                    if (w0 != 1) {
                        if (w0 != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        final float x = motionEvent.getX();
                        final int thumbScrollRange = this.getThumbScrollRange();
                        final float n2 = x - this.Y0;
                        float n3;
                        if (thumbScrollRange != 0) {
                            n3 = n2 / thumbScrollRange;
                        }
                        else if (n2 > 0.0f) {
                            n3 = 1.0f;
                        }
                        else {
                            n3 = -1.0f;
                        }
                        float n4 = n3;
                        if (rcx.b((View)this)) {
                            n4 = -n3;
                        }
                        final float c1 = this.c1;
                        float thumbPosition = n4 + c1;
                        if (thumbPosition < 0.0f) {
                            thumbPosition = n;
                        }
                        else if (thumbPosition > 1.0f) {
                            thumbPosition = 1.0f;
                        }
                        if (thumbPosition != c1) {
                            this.Y0 = x;
                            this.setThumbPosition(thumbPosition);
                        }
                        return true;
                    }
                    else {
                        final float x2 = motionEvent.getX();
                        final float y = motionEvent.getY();
                        if (Math.abs(x2 - this.Y0) > this.X0 || Math.abs(y - this.Z0) > this.X0) {
                            this.W0 = 2;
                            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
                            this.Y0 = x2;
                            this.Z0 = y;
                            return true;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.W0 == 2) {
                this.W0 = 0;
                final boolean b2 = motionEvent.getAction() == 1 && ((View)this).isEnabled();
                final boolean checked = this.isChecked();
                boolean targetCheckedState;
                if (b2) {
                    this.a1.computeCurrentVelocity(1000);
                    final float xVelocity = this.a1.getXVelocity();
                    if (Math.abs(xVelocity) > this.b1) {
                        targetCheckedState = (rcx.b((View)this) ? (xVelocity < 0.0f) : (xVelocity > 0.0f));
                    }
                    else {
                        targetCheckedState = this.getTargetCheckedState();
                    }
                }
                else {
                    targetCheckedState = checked;
                }
                if (targetCheckedState != checked) {
                    ((View)this).playSoundEffect(0);
                }
                this.setChecked(targetCheckedState);
                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.W0 = 0;
            this.a1.clear();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            if (((View)this).isEnabled()) {
                int n5;
                if (this.D0 == null) {
                    n5 = (b ? 1 : 0);
                }
                else {
                    final int thumbOffset = this.getThumbOffset();
                    this.D0.getPadding(this.t1);
                    final int h1 = this.h1;
                    final int x4 = this.X0;
                    final int n6 = this.g1 + thumbOffset - x4;
                    final int f1 = this.f1;
                    final Rect t1 = this.t1;
                    final int left = t1.left;
                    final int right = t1.right;
                    final int j1 = this.j1;
                    n5 = (b ? 1 : 0);
                    if (x3 > n6) {
                        n5 = (b ? 1 : 0);
                        if (x3 < f1 + n6 + left + right + x4) {
                            n5 = (b ? 1 : 0);
                            if (y2 > h1 - x4) {
                                n5 = (b ? 1 : 0);
                                if (y2 < j1 + x4) {
                                    n5 = 1;
                                }
                            }
                        }
                    }
                }
                if (n5 != 0) {
                    this.W0 = 1;
                    this.Y0 = x3;
                    this.Z0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (checked2) {
            this.g();
        }
        else {
            this.f();
        }
        final IBinder windowToken = ((View)this).getWindowToken();
        float thumbPosition = 1.0f;
        if (windowToken != null) {
            final WeakHashMap a = j6x.a;
            if (j6x$g.c((View)this)) {
                if (!checked2) {
                    thumbPosition = 0.0f;
                }
                (this.q1 = ObjectAnimator.ofFloat((Object)this, (Property)SwitchCompat.u1, new float[] { thumbPosition })).setDuration(250L);
                b.a(this.q1, true);
                this.q1.start();
                return;
            }
        }
        final ObjectAnimator q1 = this.q1;
        if (q1 != null) {
            ((Animator)q1).cancel();
        }
        if (!checked2) {
            thumbPosition = 0.0f;
        }
        this.setThumbPosition(thumbPosition);
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(cks.h((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
        this.setTextOnInternal(this.R0);
        this.setTextOffInternal(this.T0);
        ((View)this).requestLayout();
    }
    
    public final void setEnforceSwitchWidth(final boolean k1) {
        this.k1 = k1;
        ((View)this).invalidate();
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setShowText(final boolean v0) {
        if (this.V0 != v0) {
            this.V0 = v0;
            ((View)this).requestLayout();
            if (v0) {
                this.h();
            }
        }
    }
    
    public void setSplitTrack(final boolean q0) {
        this.Q0 = q0;
        ((View)this).invalidate();
    }
    
    public void setSwitchMinWidth(final int o0) {
        this.O0 = o0;
        ((View)this).requestLayout();
    }
    
    public void setSwitchPadding(final int p) {
        this.P0 = p;
        ((View)this).requestLayout();
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if ((((Paint)this.l1).getTypeface() != null && !((Paint)this.l1).getTypeface().equals((Object)typeface)) || (((Paint)this.l1).getTypeface() == null && typeface != null)) {
            ((Paint)this.l1).setTypeface(typeface);
            ((View)this).requestLayout();
            ((View)this).invalidate();
        }
    }
    
    public void setTextOff(final CharSequence textOffInternal) {
        this.setTextOffInternal(textOffInternal);
        ((View)this).requestLayout();
        if (!this.isChecked()) {
            this.f();
        }
    }
    
    public void setTextOn(final CharSequence textOnInternal) {
        this.setTextOnInternal(textOnInternal);
        ((View)this).requestLayout();
        if (this.isChecked()) {
            this.g();
        }
    }
    
    public void setThumbDrawable(final Drawable d0) {
        final Drawable d2 = this.D0;
        if (d2 != null) {
            d2.setCallback((Drawable$Callback)null);
        }
        if ((this.D0 = d0) != null) {
            d0.setCallback((Drawable$Callback)this);
        }
        ((View)this).requestLayout();
    }
    
    public void setThumbPosition(final float c1) {
        this.c1 = c1;
        ((View)this).invalidate();
    }
    
    public void setThumbResource(final int n) {
        this.setThumbDrawable(v68.x(((View)this).getContext(), n));
    }
    
    public void setThumbTextPadding(final int n0) {
        this.N0 = n0;
        ((View)this).requestLayout();
    }
    
    public void setThumbTintList(final ColorStateList e0) {
        this.E0 = e0;
        this.G0 = true;
        this.a();
    }
    
    public void setThumbTintMode(final PorterDuff$Mode f0) {
        this.F0 = f0;
        this.H0 = true;
        this.a();
    }
    
    public void setTrackDrawable(final Drawable i0) {
        final Drawable i2 = this.I0;
        if (i2 != null) {
            i2.setCallback((Drawable$Callback)null);
        }
        if ((this.I0 = i0) != null) {
            i0.setCallback((Drawable$Callback)this);
        }
        ((View)this).requestLayout();
    }
    
    public void setTrackResource(final int n) {
        this.setTrackDrawable(v68.x(((View)this).getContext(), n));
    }
    
    public void setTrackTintList(final ColorStateList j0) {
        this.J0 = j0;
        this.L0 = true;
        this.b();
    }
    
    public void setTrackTintMode(final PorterDuff$Mode k0) {
        this.K0 = k0;
        this.M0 = true;
        this.b();
    }
    
    public final void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.D0 || drawable == this.I0;
    }
    
    public static final class b
    {
        public static void a(final ObjectAnimator objectAnimator, final boolean autoCancel) {
            objectAnimator.setAutoCancel(autoCancel);
        }
    }
}
