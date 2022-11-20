import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8r
{
    public final ArrayList<b> a;
    public b b;
    public ValueAnimator c;
    public final u8r$a d;
    
    public u8r() {
        this.a = new ArrayList<b>();
        this.b = null;
        this.c = null;
        this.d = new AnimatorListenerAdapter(this) {
            public final u8r D0;
            
            public final void onAnimationEnd(final Animator animator) {
                final u8r d0 = this.D0;
                if (d0.c == animator) {
                    d0.c = null;
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
