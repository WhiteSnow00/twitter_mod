// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import java.util.Objects;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements v9t
{
    public final ak0 C0;
    public final wj0 D0;
    public final vk0 E0;
    public kk0 F0;
    
    public AppCompatCheckBox(final Context context, final AttributeSet set) {
        this(context, set, 2130968868);
    }
    
    public AppCompatCheckBox(final Context context, final AttributeSet set, final int n) {
        q9t.a(context);
        super(context, set, n);
        mls.a((View)this, ((View)this).getContext());
        (this.C0 = new ak0((CompoundButton)this)).b(set, n);
        (this.D0 = new wj0((View)this)).d(set, n);
        (this.E0 = new vk0((TextView)this)).h(set, n);
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
        final wj0 d0 = this.D0;
        if (d0 != null) {
            d0.a();
        }
        final vk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public int getCompoundPaddingLeft() {
        final int compoundPaddingLeft = super.getCompoundPaddingLeft();
        final ak0 c0 = this.C0;
        if (c0 != null) {
            Objects.requireNonNull(c0);
        }
        return compoundPaddingLeft;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final wj0 d0 = this.D0;
        ColorStateList b;
        if (d0 != null) {
            b = d0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final wj0 d0 = this.D0;
        PorterDuff$Mode c;
        if (d0 != null) {
            c = d0.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportButtonTintList() {
        final ak0 c0 = this.C0;
        ColorStateList b;
        if (c0 != null) {
            b = c0.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportButtonTintMode() {
        final ak0 c0 = this.C0;
        PorterDuff$Mode c2;
        if (c0 != null) {
            c2 = c0.c;
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.E0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.E0.f();
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final wj0 d0 = this.D0;
        if (d0 != null) {
            d0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final wj0 d0 = this.D0;
        if (d0 != null) {
            d0.f(backgroundResource);
        }
    }
    
    public void setButtonDrawable(final int n) {
        this.setButtonDrawable(qli.g(((View)this).getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final ak0 c0 = this.C0;
        if (c0 != null) {
            if (c0.f) {
                c0.f = false;
            }
            else {
                c0.f = true;
                c0.a();
            }
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final vk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final vk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final wj0 d0 = this.D0;
        if (d0 != null) {
            d0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final wj0 d0 = this.D0;
        if (d0 != null) {
            d0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportButtonTintList(final ColorStateList b) {
        final ak0 c0 = this.C0;
        if (c0 != null) {
            c0.b = b;
            c0.d = true;
            c0.a();
        }
    }
    
    public void setSupportButtonTintMode(final PorterDuff$Mode c) {
        final ak0 c2 = this.C0;
        if (c2 != null) {
            c2.c = c;
            c2.e = true;
            c2.a();
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.E0.n(list);
        this.E0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.E0.o(porterDuff$Mode);
        this.E0.b();
    }
}
