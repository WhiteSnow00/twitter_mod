import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import android.view.View;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.util.Property;
import android.graphics.Matrix;
import android.animation.TypeEvaluator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lp3 extends g0u
{
    public static final String[] j1;
    public static final TypeEvaluator<Matrix> k1;
    public static final Property<ImageView, Matrix> l1;
    
    static {
        j1 = new String[] { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };
        lp3.k1 = new TypeEvaluator<Matrix>() {
            public final /* bridge */ Object evaluate(final float n, final Object o, final Object o2) {
                final Matrix matrix = (Matrix)o;
                final Matrix matrix2 = (Matrix)o2;
                return null;
            }
        };
        lp3.l1 = new Property<ImageView, Matrix>(Matrix.class) {
            public final /* bridge */ Object get(final Object o) {
                final ImageView imageView = (ImageView)o;
                return null;
            }
            
            public final void set(final Object o, final Object o2) {
                v9d.a((ImageView)o, (Matrix)o2);
            }
        };
    }
    
    public lp3() {
    }
    
    public lp3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final e1u e1u) {
        final View b = e1u.b;
        if (b instanceof ImageView) {
            if (b.getVisibility() == 0) {
                final ImageView imageView = (ImageView)b;
                if (imageView.getDrawable() == null) {
                    return;
                }
                final HashMap a = e1u.a;
                a.put("android:changeImageTransform:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
                final Drawable drawable = imageView.getDrawable();
                Matrix matrix = null;
                Label_0311: {
                    if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                        final int n = lp3$c.a[((Enum)imageView.getScaleType()).ordinal()];
                        if (n == 1) {
                            final Drawable drawable2 = imageView.getDrawable();
                            matrix = new Matrix();
                            matrix.postScale(((View)imageView).getWidth() / (float)drawable2.getIntrinsicWidth(), ((View)imageView).getHeight() / (float)drawable2.getIntrinsicHeight());
                            break Label_0311;
                        }
                        if (n == 2) {
                            final Drawable drawable3 = imageView.getDrawable();
                            final int intrinsicWidth = drawable3.getIntrinsicWidth();
                            final float n2 = (float)((View)imageView).getWidth();
                            final float n3 = (float)intrinsicWidth;
                            final float n4 = n2 / n3;
                            final int intrinsicHeight = drawable3.getIntrinsicHeight();
                            final float n5 = (float)((View)imageView).getHeight();
                            final float n6 = (float)intrinsicHeight;
                            final float max = Math.max(n4, n5 / n6);
                            final int round = Math.round((n2 - n3 * max) / 2.0f);
                            final int round2 = Math.round((n5 - n6 * max) / 2.0f);
                            matrix = new Matrix();
                            matrix.postScale(max, max);
                            matrix.postTranslate((float)round, (float)round2);
                            break Label_0311;
                        }
                    }
                    matrix = new Matrix(imageView.getImageMatrix());
                }
                a.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }
    
    public final void h(final e1u e1u) {
        this.R(e1u);
    }
    
    public final void k(final e1u e1u) {
        this.R(e1u);
    }
    
    public final Animator o(final ViewGroup viewGroup, final e1u e1u, final e1u e1u2) {
        Object o2;
        final Object o = o2 = null;
        if (e1u != null) {
            if (e1u2 == null) {
                o2 = o;
            }
            else {
                final Rect rect = e1u.a.get("android:changeImageTransform:bounds");
                final Rect rect2 = e1u2.a.get("android:changeImageTransform:bounds");
                o2 = o;
                if (rect != null) {
                    if (rect2 == null) {
                        o2 = o;
                    }
                    else {
                        final Matrix matrix = e1u.a.get("android:changeImageTransform:matrix");
                        final Matrix matrix2 = e1u2.a.get("android:changeImageTransform:matrix");
                        final boolean b = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals((Object)matrix2));
                        if (rect.equals((Object)rect2) && b) {
                            return null;
                        }
                        final ImageView imageView = (ImageView)e1u2.b;
                        final Drawable drawable = imageView.getDrawable();
                        final int intrinsicWidth = drawable.getIntrinsicWidth();
                        final int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            Object a;
                            if ((a = matrix) == null) {
                                a = vog.a;
                            }
                            Object a2;
                            if ((a2 = matrix2) == null) {
                                a2 = vog.a;
                            }
                            final Property<ImageView, Matrix> l1 = lp3.l1;
                            l1.set(imageView, a);
                            o2 = ObjectAnimator.ofObject((Object)imageView, (Property)l1, (TypeEvaluator)new d1u$a(), (Object[])new Matrix[] { (Matrix)a, (Matrix)a2 });
                        }
                        else {
                            final Property<ImageView, Matrix> l2 = lp3.l1;
                            final TypeEvaluator<Matrix> k1 = (TypeEvaluator<Matrix>)lp3.k1;
                            final vog$a a3 = vog.a;
                            o2 = ObjectAnimator.ofObject((Object)imageView, (Property)l2, (TypeEvaluator)k1, (Object[])new Matrix[] { (Matrix)a3, (Matrix)a3 });
                        }
                    }
                }
            }
        }
        return (Animator)o2;
    }
    
    public final String[] z() {
        return lp3.j1;
    }
}
