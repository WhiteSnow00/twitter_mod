import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ToggleButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zk0 extends ToggleButton implements v9t
{
    public final wj0 C0;
    public final vk0 D0;
    public kk0 E0;
    
    public zk0(final Context context, final AttributeSet set) {
        super(context, set, 16842827);
        mls.a((View)this, ((View)this).getContext());
        (this.C0 = new wj0((View)this)).d(set, 16842827);
        (this.D0 = new vk0((TextView)this)).h(set, 16842827);
        this.getEmojiTextViewHelper().b(set, 16842827);
    }
    
    private kk0 getEmojiTextViewHelper() {
        if (this.E0 == null) {
            this.E0 = new kk0((TextView)this);
        }
        return this.E0;
    }
    
    public final void drawableStateChanged() {
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
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
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
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
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
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setFilters(final InputFilter[] array) {
        super.setFilters(this.getEmojiTextViewHelper().a(array));
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
}
