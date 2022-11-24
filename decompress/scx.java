import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class scx implements Interpolator
{
    public final mq9 a;
    
    public scx(final mq9 a) {
        this.a = a;
    }
    
    public final float getInterpolation(final float n) {
        return (float)this.a.a(n);
    }
}
