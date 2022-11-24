import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9r
{
    public final ArrayList<b> a;
    public b b;
    public ValueAnimator c;
    public final t9r$a d;
    
    public t9r() {
        this.a = new ArrayList<b>();
        this.b = null;
        this.c = null;
        this.d = new AnimatorListenerAdapter(this) {
            public final t9r F0;
            
            public final void onAnimationEnd(final Animator animator) {
                final t9r f0 = this.F0;
                if (f0.c == animator) {
                    f0.c = null;
                }
            }
        };
    }
    
    public final void a(final int[] array, final ValueAnimator valueAnimator) {
        final b b = new b(array, valueAnimator);
        ((Animator)valueAnimator).addListener((Animator$AnimatorListener)this.d);
        this.a.add(b);
    }
    
    public static final class b
    {
        public final int[] a;
        public final ValueAnimator b;
        
        public b(final int[] a, final ValueAnimator b) {
            this.a = a;
            this.b = b;
        }
    }
}
