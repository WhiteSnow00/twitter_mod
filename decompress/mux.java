import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mux extends Drawable$ConstantState
{
    public int a;
    public Drawable$ConstantState b;
    public ColorStateList c;
    public PorterDuff$Mode d;
    
    public mux(final mux mux) {
        this.c = null;
        this.d = kux.L0;
        if (mux != null) {
            this.a = mux.a;
            this.b = mux.b;
            this.c = mux.c;
            this.d = mux.d;
        }
    }
    
    public final int getChangingConfigurations() {
        final int a = this.a;
        final Drawable$ConstantState b = this.b;
        int changingConfigurations;
        if (b != null) {
            changingConfigurations = b.getChangingConfigurations();
        }
        else {
            changingConfigurations = 0;
        }
        return a | changingConfigurations;
    }
    
    public final Drawable newDrawable() {
        return new lux(this, null);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return new lux(this, resources);
    }
}
