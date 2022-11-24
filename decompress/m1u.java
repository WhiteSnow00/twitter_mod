import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1u
{
    public static Animator a(final View view, final e1u e1u, final int n, final int n2, float translationY, final float n3, final float n4, final float n5, final TimeInterpolator interpolator, final g0u g0u) {
        final float translationX = view.getTranslationX();
        final float translationY2 = view.getTranslationY();
        final int[] array = (int[])e1u.b.getTag(2131432222);
        float translationX2;
        if (array != null) {
            translationX2 = array[0] - n + translationX;
            translationY = array[1] - n2 + translationY2;
        }
        else {
            translationX2 = translationY;
            translationY = n3;
        }
        final int round = Math.round(translationX2 - translationX);
        final int round2 = Math.round(translationY - translationY2);
        view.setTranslationX(translationX2);
        view.setTranslationY(translationY);
        if (translationX2 == n4 && translationY == n5) {
            return null;
        }
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] { translationX2, n4 }), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { translationY, n5 }) });
        final m1u.m1u$a m1u$a = new m1u.m1u$a(view, e1u.b, round + n, round2 + n2, translationX, translationY2);
        g0u.a((g0u$e)m1u$a);
        ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)m1u$a);
        ((Animator)ofPropertyValuesHolder).addPauseListener((Animator$AnimatorPauseListener)m1u$a);
        ((Animator)ofPropertyValuesHolder).setInterpolator(interpolator);
        return (Animator)ofPropertyValuesHolder;
    }
}
