import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zko extends umb implements gfx
{
    public Drawable J0;
    public ifx K0;
    
    public zko(final Drawable drawable) {
        super(drawable);
        this.J0 = null;
    }
    
    @SuppressLint({ "WrongCall" })
    @Override
    public final void draw(final Canvas canvas) {
        if (!this.isVisible()) {
            return;
        }
        final ifx k0 = this.K0;
        if (k0 != null) {
            final we9 we9 = (we9)k0;
            if (!we9.a) {
                fr0.m0((Class)ue9.class, "%x: Draw requested for a non-attached controller %x. %s", new Object[] { System.identityHashCode(we9), System.identityHashCode(we9.e), we9.toString() });
                we9.b = true;
                we9.c = true;
                we9.b();
            }
        }
        super.draw(canvas);
        final Drawable j0 = this.J0;
        if (j0 != null) {
            j0.setBounds(this.getBounds());
            this.J0.draw(canvas);
        }
    }
    
    @Override
    public final int getIntrinsicHeight() {
        return -1;
    }
    
    @Override
    public final int getIntrinsicWidth() {
        return -1;
    }
    
    public final void l(final ifx k0) {
        this.K0 = k0;
    }
    
    @Override
    public final boolean setVisible(final boolean b, final boolean b2) {
        final ifx k0 = this.K0;
        if (k0 != null) {
            ((we9)k0).f(b);
        }
        return super.setVisible(b, b2);
    }
}
