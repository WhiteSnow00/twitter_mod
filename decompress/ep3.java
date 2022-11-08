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

public final class ep3 extends xyt
{
    public static final String[] g1;
    public static final TypeEvaluator<Matrix> h1;
    public static final Property<ImageView, Matrix> i1;
    
    static {
        g1 = new String[] { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };
        ep3.h1 = new ep3$a();
        ep3.i1 = new ep3$b((Class)Matrix.class);
    }
    
    public ep3() {
    }
    
    public ep3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final vzt vzt) {
        final View b = vzt.b;
        if (b instanceof ImageView) {
            if (b.getVisibility() == 0) {
                final ImageView imageView = (ImageView)b;
                if (imageView.getDrawable() == null) {
                    return;
                }
                final HashMap a = vzt.a;
                a.put("android:changeImageTransform:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
                final Drawable drawable = imageView.getDrawable();
                Matrix matrix = null;
                Label_0295: {
                    if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                        final int n = ep3$c.a[((Enum)imageView.getScaleType()).ordinal()];
                        if (n == 1) {
                            final Drawable drawable2 = imageView.getDrawable();
                            matrix = new Matrix();
                            matrix.postScale(((View)imageView).getWidth() / (float)drawable2.getIntrinsicWidth(), ((View)imageView).getHeight() / (float)drawable2.getIntrinsicHeight());
                            break Label_0295;
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
                            break Label_0295;
                        }
                    }
                    matrix = new Matrix(imageView.getImageMatrix());
                }
                a.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }
    
    @Override
    public final void h(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final void k(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final Animator o(final ViewGroup viewGroup, final vzt vzt, final vzt vzt2) {
        Object o2;
        final Object o = o2 = null;
        if (vzt != null) {
            if (vzt2 == null) {
                o2 = o;
            }
            else {
                final Rect rect = vzt.a.get("android:changeImageTransform:bounds");
                final Rect rect2 = vzt2.a.get("android:changeImageTransform:bounds");
                o2 = o;
                if (rect != null) {
                    if (rect2 == null) {
                        o2 = o;
                    }
                    else {
                        final Matrix matrix = vzt.a.get("android:changeImageTransform:matrix");
                        final Matrix matrix2 = vzt2.a.get("android:changeImageTransform:matrix");
                        final boolean b = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals((Object)matrix2));
                        if (rect.equals((Object)rect2) && b) {
                            return null;
                        }
                        final ImageView imageView = (ImageView)vzt2.b;
                        final Drawable drawable = imageView.getDrawable();
                        final int intrinsicWidth = drawable.getIntrinsicWidth();
                        final int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            Object a;
                            if ((a = matrix) == null) {
                                a = cog.a;
                            }
                            Object a2;
                            if ((a2 = matrix2) == null) {
                                a2 = cog.a;
                            }
                            final ep3$b i1 = ep3.i1;
                            i1.set((Object)imageView, a);
                            o2 = ObjectAnimator.ofObject((Object)imageView, (Property)i1, (TypeEvaluator)new uzt.a(), (Object[])new Matrix[] { (Matrix)a, (Matrix)a2 });
                        }
                        else {
                            final ep3$b i2 = ep3.i1;
                            final ep3$a h1 = ep3.h1;
                            final cog$a a3 = cog.a;
                            o2 = ObjectAnimator.ofObject((Object)imageView, (Property)i2, (TypeEvaluator)h1, (Object[])new Matrix[] { (Matrix)a3, (Matrix)a3 });
                        }
                    }
                }
            }
        }
        return (Animator)o2;
    }
    
    @Override
    public final String[] z() {
        return ep3.g1;
    }
}
