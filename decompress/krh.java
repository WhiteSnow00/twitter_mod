import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krh
{
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;
    
    public krh(final long a) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = a;
        this.b = 150L;
    }
    
    public krh(final long a, final long b, final TimeInterpolator c) {
        this.d = 0;
        this.e = 1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(this.b());
        if (animator instanceof ValueAnimator) {
            final ValueAnimator valueAnimator = (ValueAnimator)animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }
    
    public final TimeInterpolator b() {
        Object o = this.c;
        if (o == null) {
            o = gc0.b;
        }
        return (TimeInterpolator)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof krh)) {
            return false;
        }
        final krh krh = (krh)o;
        return this.a == krh.a && this.b == krh.b && this.d == krh.d && this.e == krh.e && this.b().getClass().equals(krh.b().getClass());
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return ((this.b().getClass().hashCode() + (n * 31 + (int)(b ^ b >>> 32)) * 31) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder a = ta0.A('\n');
        a.append(krh.class.getName());
        a.append('{');
        a.append(Integer.toHexString(System.identityHashCode(this)));
        a.append(" delay: ");
        a.append(this.a);
        a.append(" duration: ");
        a.append(this.b);
        a.append(" interpolator: ");
        a.append(this.b().getClass());
        a.append(" repeatCount: ");
        a.append(this.d);
        a.append(" repeatMode: ");
        return wc0.A(a, this.e, "}\n");
    }
}
