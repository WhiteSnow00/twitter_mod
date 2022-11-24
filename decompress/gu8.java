import android.view.Choreographer$FrameCallback;
import android.util.AndroidRuntimeException;
import android.os.Looper;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gu8<S extends jp1> extends oe9
{
    public static final q7b V0;
    public mj9<S> Q0;
    public final j5r R0;
    public final d5r S0;
    public float T0;
    public boolean U0;
    
    static {
        gu8.V0 = new q7b() {
            @Override
            public final float a(final Object o) {
                return ((gu8)o).T0 * 10000.0f;
            }
            
            @Override
            public final void b(final Object o, final float n) {
                ((gu8)o).j(n / 10000.0f);
            }
        };
    }
    
    public gu8(final Context context, final jp1 jp1, final mj9<S> q0) {
        super(context, jp1);
        this.U0 = false;
        this.Q0 = q0;
        q0.b = this;
        final j5r j5r = new j5r();
        this.R0 = j5r;
        j5r.b = 1.0f;
        j5r.c = false;
        j5r.a(50.0f);
        final d5r s0 = new d5r((Object)this);
        this.S0 = s0;
        s0.r = j5r;
        if (super.M0 != 1.0f) {
            super.M0 = 1.0f;
            this.invalidateSelf();
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Rect rect = new Rect();
        if (!this.getBounds().isEmpty() && this.isVisible()) {
            if (canvas.getClipBounds(rect)) {
                canvas.save();
                this.Q0.e(canvas, this.b());
                this.Q0.b(canvas, super.N0);
                this.Q0.a(canvas, super.N0, 0.0f, this.T0, ak1.f(super.G0.c[0], super.O0));
                canvas.restore();
            }
        }
    }
    
    public final int getIntrinsicHeight() {
        return this.Q0.c();
    }
    
    public final int getIntrinsicWidth() {
        return this.Q0.d();
    }
    
    @Override
    public final boolean h(final boolean b, final boolean b2, final boolean b3) {
        final boolean h = super.h(b, b2, b3);
        final float a = super.H0.a(super.F0.getContentResolver());
        if (a == 0.0f) {
            this.U0 = true;
        }
        else {
            this.U0 = false;
            this.R0.a(50.0f / a);
        }
        return h;
    }
    
    public final void j(final float t0) {
        this.T0 = t0;
        this.invalidateSelf();
    }
    
    public final void jumpToCurrentState() {
        this.S0.d();
        this.j(this.getLevel() / 10000.0f);
    }
    
    public final boolean onLevelChange(final int n) {
        if (this.U0) {
            this.S0.d();
            this.j(n / 10000.0f);
        }
        else {
            final d5r s0 = this.S0;
            ((zn9)s0).b = this.T0 * 10000.0f;
            ((zn9)s0).c = true;
            final float s2 = (float)n;
            if (((zn9)s0).f) {
                s0.s = s2;
            }
            else {
                if (s0.r == null) {
                    s0.r = new j5r(s2);
                }
                final j5r r = s0.r;
                final double i = s2;
                r.i = i;
                final double n2 = (float)i;
                if (n2 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (n2 < ((zn9)s0).g) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                final double abs = Math.abs((double)(((zn9)s0).i * 0.75f));
                r.d = abs;
                r.e = abs * 62.5;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                final boolean f = ((zn9)s0).f;
                if (!f && !f) {
                    ((zn9)s0).f = true;
                    if (!((zn9)s0).c) {
                        ((zn9)s0).b = ((zn9)s0).e.a(((zn9)s0).d);
                    }
                    final float b = ((zn9)s0).b;
                    if (b > Float.MAX_VALUE || b < ((zn9)s0).g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    final nb0 a = nb0.a();
                    if (a.b.size() == 0) {
                        if (a.d == null) {
                            a.d = new nb0.d(a.c);
                        }
                        final nb0.d d = a.d;
                        d.b.postFrameCallback((Choreographer$FrameCallback)d.c);
                    }
                    if (!a.b.contains(s0)) {
                        a.b.add(s0);
                    }
                }
            }
        }
        return true;
    }
}
