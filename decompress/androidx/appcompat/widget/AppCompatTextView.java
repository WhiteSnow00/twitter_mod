// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.os.Build$VERSION;
import android.view.textclassifier.TextClassifier;
import java.util.concurrent.ExecutionException;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.annotation.SuppressLint;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.Future;
import android.widget.TextView;

public class AppCompatTextView extends TextView implements v9t, d91
{
    public final wj0 C0;
    public final vk0 D0;
    public final uk0 E0;
    public kk0 F0;
    public boolean G0;
    public Future<jtk> H0;
    
    public AppCompatTextView(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public AppCompatTextView(final Context context, final AttributeSet set, final int n) {
        q9t.a(context);
        super(context, set, n);
        this.G0 = false;
        mls.a((View)this, ((View)this).getContext());
        (this.C0 = new wj0((View)this)).d(set, n);
        final vk0 d0 = new vk0((TextView)this);
        (this.D0 = d0).h(set, n);
        d0.b();
        this.E0 = new uk0((TextView)this);
        this.getEmojiTextViewHelper().b(set, n);
    }
    
    private kk0 getEmojiTextViewHelper() {
        if (this.F0 == null) {
            this.F0 = new kk0((TextView)this);
        }
        return this.F0;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.a();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public int getAutoSizeMaxTextSize() {
        if (d91.h) {
            return super.getAutoSizeMaxTextSize();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.e);
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (d91.h) {
            return super.getAutoSizeMinTextSize();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.d);
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (d91.h) {
            return super.getAutoSizeStepGranularity();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return Math.round(d0.i.c);
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (d91.h) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return d0.i.f;
        }
        return new int[0];
    }
    
    @SuppressLint({ "WrongConstant" })
    public int getAutoSizeTextType() {
        final boolean h = d91.h;
        int n = 0;
        if (h) {
            if (super.getAutoSizeTextType() == 1) {
                n = 1;
            }
            return n;
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            return d0.i.a;
        }
        return 0;
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return hjs.g(super.getCustomSelectionActionModeCallback());
    }
    
    public int getFirstBaselineToTopHeight() {
        return ((View)this).getPaddingTop() - ((Paint)this.getPaint()).getFontMetricsInt().top;
    }
    
    public int getLastBaselineToBottomHeight() {
        return ((View)this).getPaddingBottom() + ((Paint)this.getPaint()).getFontMetricsInt().bottom;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final wj0 c0 = this.C0;
        ColorStateList b;
        if (c0 != null) {
            b = c0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final wj0 c0 = this.C0;
        PorterDuff$Mode c2;
        if (c0 != null) {
            c2 = c0.c();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.D0.f();
    }
    
    public CharSequence getText() {
        final Future<jtk> h0 = this.H0;
        Label_0027: {
            if (h0 == null) {
                break Label_0027;
            }
            try {
                this.H0 = null;
                hjs.e((TextView)this, (jtk)h0.get());
                return super.getText();
            }
            catch (final InterruptedException | ExecutionException ex) {
                return super.getText();
            }
        }
    }
    
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final uk0 e0 = this.E0;
            if (e0 != null) {
                TextClassifier textClassifier;
                if ((textClassifier = e0.b) == null) {
                    textClassifier = uk0$a.a(e0.a);
                }
                return textClassifier;
            }
        }
        return super.getTextClassifier();
    }
    
    public jtk.a getTextMetricsParamsCompat() {
        return hjs.a((TextView)this);
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.D0);
        if (Build$VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            jx9.d(editorInfo, this.getText());
        }
        lr0.J(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            Objects.requireNonNull(d0);
            if (!d91.h) {
                d0.c();
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        final Future<jtk> h0 = this.H0;
        while (true) {
            if (h0 == null) {
                break Label_0027;
            }
            try {
                this.H0 = null;
                hjs.e((TextView)this, (jtk)h0.get());
                super.onMeasure(n, n2);
            }
            catch (final InterruptedException | ExecutionException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        final vk0 d0 = this.D0;
        if (d0 != null && !d91.h && d0.g()) {
            this.D0.c();
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public final void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (d91.h) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.k(n, n2, n3, n4);
            }
        }
    }
    
    public final void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) throws IllegalArgumentException {
        if (d91.h) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.l(array, n);
            }
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (d91.h) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                d0.m(autoSizeTextTypeWithDefaults);
            }
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.f(backgroundResource);
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable g = null;
        Drawable g2;
        if (n != 0) {
            g2 = qli.g(context, n);
        }
        else {
            g2 = null;
        }
        Drawable g3;
        if (n2 != 0) {
            g3 = qli.g(context, n2);
        }
        else {
            g3 = null;
        }
        Drawable g4;
        if (n3 != 0) {
            g4 = qli.g(context, n3);
        }
        else {
            g4 = null;
        }
        if (n4 != 0) {
            g = qli.g(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(g2, g3, g4, g);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable g = null;
        Drawable g2;
        if (n != 0) {
            g2 = qli.g(context, n);
        }
        else {
            g2 = null;
        }
        Drawable g3;
        if (n2 != 0) {
            g3 = qli.g(context, n2);
        }
        else {
            g3 = null;
        }
        Drawable g4;
        if (n3 != 0) {
            g4 = qli.g(context, n3);
        }
        else {
            g4 = null;
        }
        if (n4 != 0) {
            g = qli.g(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(g2, g3, g4, g);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(hjs.h((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setFirstBaselineToTopHeight(final int firstBaselineToTopHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        }
        else {
            hjs.b((TextView)this, firstBaselineToTopHeight);
        }
    }
    
    public void setLastBaselineToBottomHeight(final int lastBaselineToBottomHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        }
        else {
            hjs.c((TextView)this, lastBaselineToBottomHeight);
        }
    }
    
    public void setLineHeight(final int n) {
        hjs.d((TextView)this, n);
    }
    
    public void setPrecomputedText(final jtk jtk) {
        hjs.e((TextView)this, jtk);
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.D0.n(list);
        this.D0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.D0.o(porterDuff$Mode);
        this.D0.b();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.i(context, n);
        }
    }
    
    public void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final uk0 e0 = this.E0;
            if (e0 != null) {
                e0.b = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
    
    public void setTextFuture(final Future<jtk> h0) {
        this.H0 = h0;
        if (h0 != null) {
            ((View)this).requestLayout();
        }
    }
    
    public void setTextMetricsParamsCompat(final jtk.a a) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final TextDirectionHeuristic b = a.b;
        final TextDirectionHeuristic firststrong_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int n = 1;
        if (b != firststrong_RTL) {
            if (b != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (b == TextDirectionHeuristics.ANYRTL_LTR) {
                    n = 2;
                }
                else if (b == TextDirectionHeuristics.LTR) {
                    n = 3;
                }
                else if (b == TextDirectionHeuristics.RTL) {
                    n = 4;
                }
                else if (b == TextDirectionHeuristics.LOCALE) {
                    n = 5;
                }
                else if (b == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    n = 6;
                }
                else if (b == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    n = 7;
                }
            }
        }
        hjs$b.h((View)this, n);
        if (sdk_INT < 23) {
            final float textScaleX = ((Paint)a.a).getTextScaleX();
            this.getPaint().set(a.a);
            if (textScaleX == this.getTextScaleX()) {
                this.setTextScaleX(textScaleX / 2.0f + 1.0f);
            }
            this.setTextScaleX(textScaleX);
        }
        else {
            this.getPaint().set(a.a);
            hjs$c.e((TextView)this, a.c);
            hjs$c.h((TextView)this, a.d);
        }
    }
    
    public void setTextSize(final int n, final float n2) {
        final boolean h = d91.h;
        if (h) {
            super.setTextSize(n, n2);
        }
        else {
            final vk0 d0 = this.D0;
            if (d0 != null) {
                Objects.requireNonNull(d0);
                if (!h && !d0.g()) {
                    d0.i.f(n, n2);
                }
            }
        }
    }
    
    public final void setTypeface(Typeface typeface, final int n) {
        if (this.G0) {
            return;
        }
        Typeface create;
        final Typeface typeface2 = create = null;
        if (typeface != null) {
            create = typeface2;
            if (n > 0) {
                final Context context = ((View)this).getContext();
                final qlv a = ilv.a;
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null");
                }
                create = Typeface.create(typeface, n);
            }
        }
        this.G0 = true;
        if (create != null) {
            typeface = create;
        }
        try {
            super.setTypeface(typeface, n);
        }
        finally {
            this.G0 = false;
        }
    }
}
