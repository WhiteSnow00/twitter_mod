// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.net.Uri;
import java.util.Objects;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton
{
    public final sj0 D0;
    public final gk0 E0;
    public boolean F0;
    
    public AppCompatImageButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969810);
    }
    
    public AppCompatImageButton(final Context context, final AttributeSet set, final int n) {
        gat.a(context);
        super(context, set, n);
        this.F0 = false;
        hms.a((View)this, ((View)this).getContext());
        (this.D0 = new sj0((View)this)).d(set, n);
        (this.E0 = new gk0((ImageView)this)).b(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.a();
        }
        final gk0 e0 = this.E0;
        if (e0 != null) {
            e0.a();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final sj0 d0 = this.D0;
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
        final sj0 d0 = this.D0;
        PorterDuff$Mode c;
        if (d0 != null) {
            c = d0.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportImageTintList() {
        final gk0 e0 = this.E0;
        ColorStateList a = null;
        if (e0 != null) {
            final iat b = e0.b;
            a = a;
            if (b != null) {
                a = b.a;
            }
        }
        return a;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final gk0 e0 = this.E0;
        PorterDuff$Mode b = null;
        if (e0 != null) {
            final iat b2 = e0.b;
            b = b;
            if (b2 != null) {
                b = b2.b;
            }
        }
        return b;
    }
    
    public final boolean hasOverlappingRendering() {
        final boolean b = ((View)this.E0.a).getBackground() instanceof RippleDrawable;
        boolean b2 = true;
        if (!(b ^ true) || !super.hasOverlappingRendering()) {
            b2 = false;
        }
        return b2;
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.f(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final gk0 e0 = this.E0;
        if (e0 != null) {
            e0.a();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        final gk0 e0 = this.E0;
        if (e0 != null && imageDrawable != null && !this.F0) {
            Objects.requireNonNull(e0);
            e0.d = imageDrawable.getLevel();
        }
        super.setImageDrawable(imageDrawable);
        final gk0 e2 = this.E0;
        if (e2 != null) {
            e2.a();
            if (!this.F0) {
                final gk0 e3 = this.E0;
                if (e3.a.getDrawable() != null) {
                    e3.a.getDrawable().setLevel(e3.d);
                }
            }
        }
    }
    
    public void setImageLevel(final int imageLevel) {
        super.setImageLevel(imageLevel);
        this.F0 = true;
    }
    
    public void setImageResource(final int n) {
        this.E0.c(n);
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final gk0 e0 = this.E0;
        if (e0 != null) {
            e0.a();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList list) {
        final gk0 e0 = this.E0;
        if (e0 != null) {
            e0.d(list);
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final gk0 e0 = this.E0;
        if (e0 != null) {
            e0.e(porterDuff$Mode);
        }
    }
}
