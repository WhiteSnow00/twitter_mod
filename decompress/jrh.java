import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.util.Log;
import java.util.ArrayList;
import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import android.content.res.TypedArray;
import android.content.Context;
import android.animation.PropertyValuesHolder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrh
{
    public final d8q<String, krh> a;
    public final d8q<String, PropertyValuesHolder[]> b;
    
    public jrh() {
        this.a = new d8q<String, krh>();
        this.b = new d8q<String, PropertyValuesHolder[]>();
    }
    
    public static jrh a(final Context context, final TypedArray typedArray, int resourceId) {
        if (typedArray.hasValue(resourceId)) {
            resourceId = typedArray.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return b(context, resourceId);
            }
        }
        return null;
    }
    
    public static jrh b(final Context context, final int n) {
        try {
            final Animator loadAnimator = AnimatorInflater.loadAnimator(context, n);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet)loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                final ArrayList<Animator> list = new ArrayList<Animator>();
                list.add(loadAnimator);
                return c(list);
            }
            return null;
        }
        catch (final Exception ex) {
            final StringBuilder j = fu8.j("Can't load animation resource ID #0x");
            j.append(Integer.toHexString(n));
            Log.w("MotionSpec", j.toString(), (Throwable)ex);
            return null;
        }
    }
    
    public static jrh c(final List<Animator> list) {
        final jrh jrh = new jrh();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
            final ObjectAnimator objectAnimator = (ObjectAnimator)animator;
            jrh.b.put(objectAnimator.getPropertyName(), ((ValueAnimator)objectAnimator).getValues());
            final String propertyName = objectAnimator.getPropertyName();
            final long startDelay = ((ValueAnimator)objectAnimator).getStartDelay();
            final long duration = ((ValueAnimator)objectAnimator).getDuration();
            final TimeInterpolator interpolator = ((ValueAnimator)objectAnimator).getInterpolator();
            Object o;
            if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                if (interpolator instanceof AccelerateInterpolator) {
                    o = gc0.c;
                }
                else {
                    o = interpolator;
                    if (interpolator instanceof DecelerateInterpolator) {
                        o = gc0.d;
                    }
                }
            }
            else {
                o = gc0.b;
            }
            final krh krh = new krh(startDelay, duration, (TimeInterpolator)o);
            krh.d = ((ValueAnimator)objectAnimator).getRepeatCount();
            krh.e = ((ValueAnimator)objectAnimator).getRepeatMode();
            jrh.a.put(propertyName, krh);
        }
        return jrh;
    }
    
    public final krh d(final String s) {
        if (this.a.getOrDefault(s, null) != null) {
            return this.a.getOrDefault(s, null);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof jrh && this.a.equals(((jrh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder a = ta0.A('\n');
        a.append(jrh.class.getName());
        a.append('{');
        a.append(Integer.toHexString(System.identityHashCode(this)));
        a.append(" timings: ");
        a.append(this.a);
        a.append("}\n");
        return a.toString();
    }
}
