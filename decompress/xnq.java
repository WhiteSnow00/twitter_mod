import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.Objects;
import android.view.View;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import com.twitter.media.ui.image.UserImageView;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xnq
{
    public static final a Companion;
    public final Context a;
    public final ViewGroup b;
    public final UserImageView c;
    public int d;
    public final AnimatorSet e;
    public final AnimatorSet f;
    public ImageView g;
    public ImageView h;
    public boolean i;
    
    static {
        Companion = new a();
    }
    
    public xnq(final Context a, final ViewGroup b, final UserImageView c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new AnimatorSet();
        this.f = new AnimatorSet();
    }
    
    public final void a(final boolean b) {
        final ImageView h = this.h;
        final int n = 0;
        if (h != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)h).setVisibility(visibility);
        }
        final ImageView g = this.g;
        if (g != null) {
            int visibility2;
            if (b) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
            ((View)g).setVisibility(visibility2);
        }
    }
    
    public static final class a
    {
        public static final void a(final a a, final AnimatorSet set, final View view, final float n, final float n2) {
            Objects.requireNonNull(a);
            final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] { n }), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] { n + 0.1f }), PropertyValuesHolder.ofFloat(View.ALPHA, new float[] { 1.0f }) });
            czd.e((Object)ofPropertyValuesHolder, "ofPropertyValuesHolder(t\u2026scaleX1, scaleY1, alpha1)");
            ofPropertyValuesHolder.setDuration(600L);
            final ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] { n2 }), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] { n2 + 0.1f }), PropertyValuesHolder.ofFloat(View.ALPHA, new float[] { 0.0f }) });
            czd.e((Object)ofPropertyValuesHolder2, "ofPropertyValuesHolder(t\u2026scaleX2, scaleY2, alpha2)");
            ofPropertyValuesHolder2.setDuration(1000L);
            set.playSequentially(new Animator[] { (Animator)ofPropertyValuesHolder, (Animator)ofPropertyValuesHolder2 });
        }
    }
}
