import android.graphics.Rect;
import android.graphics.Canvas;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvo extends umb
{
    public ovo$b J0;
    public Object K0;
    public PointF L0;
    public int M0;
    public int N0;
    public Matrix O0;
    public Matrix P0;
    
    public lvo(final Drawable drawable, final ovo$b j0) {
        Objects.requireNonNull(drawable);
        super(drawable);
        this.L0 = null;
        this.M0 = 0;
        this.N0 = 0;
        this.P0 = new Matrix();
        this.J0 = j0;
    }
    
    @Override
    public final void c(final Matrix matrix) {
        this.n(matrix);
        this.q();
        final Matrix o0 = this.O0;
        if (o0 != null) {
            matrix.preConcat(o0);
        }
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        this.q();
        if (this.O0 != null) {
            final int save = canvas.save();
            canvas.clipRect(this.getBounds());
            canvas.concat(this.O0);
            super.draw(canvas);
            canvas.restoreToCount(save);
        }
        else {
            super.draw(canvas);
        }
    }
    
    @Override
    public final Drawable o(Drawable o) {
        o = super.o(o);
        this.p();
        return o;
    }
    
    @Override
    public final void onBoundsChange(final Rect rect) {
        this.p();
    }
    
    public final void p() {
        final Drawable f0 = super.F0;
        final Rect bounds = this.getBounds();
        final int width = bounds.width();
        final int height = bounds.height();
        final int intrinsicWidth = f0.getIntrinsicWidth();
        this.M0 = intrinsicWidth;
        final int intrinsicHeight = f0.getIntrinsicHeight();
        this.N0 = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            f0.setBounds(bounds);
            this.O0 = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            f0.setBounds(bounds);
            this.O0 = null;
            return;
        }
        if (this.J0 == ovo.j.a) {
            f0.setBounds(bounds);
            this.O0 = null;
            return;
        }
        f0.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        final ovo$b j0 = this.J0;
        final Matrix p0 = this.P0;
        final PointF l0 = this.L0;
        float x;
        if (l0 != null) {
            x = l0.x;
        }
        else {
            x = 0.5f;
        }
        float y;
        if (l0 != null) {
            y = l0.y;
        }
        else {
            y = 0.5f;
        }
        ((ovo$a)j0).a(p0, bounds, intrinsicWidth, intrinsicHeight, x, y);
        this.O0 = this.P0;
    }
    
    public final void q() {
        final ovo$b j0 = this.J0;
        final boolean b = j0 instanceof ovo$l;
        final int n = 1;
        boolean b2;
        if (b) {
            final Object state = ((ovo$l)j0).getState();
            b2 = (state == null || !state.equals(this.K0));
            this.K0 = state;
        }
        else {
            b2 = false;
        }
        int n2 = n;
        if (this.M0 == super.F0.getIntrinsicWidth()) {
            if (this.N0 != super.F0.getIntrinsicHeight()) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (n2 != 0 || b2) {
            this.p();
        }
    }
    
    public final void r(final ovo$b j0) {
        if (q5j.a((Object)this.J0, (Object)j0)) {
            return;
        }
        this.J0 = j0;
        this.K0 = null;
        this.p();
        this.invalidateSelf();
    }
}
