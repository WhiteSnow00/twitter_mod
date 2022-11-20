import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fko extends tlb implements oex
{
    public Drawable H0;
    public qex I0;
    
    public fko(final Drawable drawable) {
        super(drawable);
        this.H0 = null;
    }
    
    @SuppressLint({ "WrongCall" })
    public final void draw(final Canvas canvas) {
        if (!((Drawable)this).isVisible()) {
            return;
        }
        final qex i0 = this.I0;
        if (i0 != null) {
            final td9 td9 = (td9)i0;
            if (!td9.a) {
                xli.H0((Class)rd9.class, "%x: Draw requested for a non-attached controller %x. %s", new Object[] { System.identityHashCode(td9), System.identityHashCode(td9.e), td9.toString() });
                td9.b = true;
                td9.c = true;
                td9.b();
            }
        }
        super.draw(canvas);
        final Drawable h0 = this.H0;
        if (h0 != null) {
            h0.setBounds(((Drawable)this).getBounds());
            this.H0.draw(canvas);
        }
    }
    
    public final int getIntrinsicHeight() {
        return -1;
    }
    
    public final int getIntrinsicWidth() {
        return -1;
    }
    
    public final void l(final qex i0) {
        this.I0 = i0;
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final qex i0 = this.I0;
        if (i0 != null) {
            ((td9)i0).f(b);
        }
        return super.setVisible(b, b2);
    }
}
