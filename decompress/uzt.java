import android.animation.TypeEvaluator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uzt
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean c2 = true;
        a = true;
        b = true;
        if (sdk_INT < 28) {
            c2 = false;
        }
        c = c2;
    }
    
    public static View a(final ViewGroup viewGroup, final View view, final View view2) {
        final Matrix matrix = new Matrix();
        matrix.setTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        rbx.e(view, matrix);
        rbx.f((View)viewGroup, matrix);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        matrix.mapRect(rectF);
        final int round = Math.round(rectF.left);
        final int round2 = Math.round(rectF.top);
        final int round3 = Math.round(rectF.right);
        final int round4 = Math.round(rectF.bottom);
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
        boolean b;
        boolean attachedToWindow;
        if (uzt.a) {
            b = (view.isAttachedToWindow() ^ true);
            attachedToWindow = ((View)viewGroup).isAttachedToWindow();
        }
        else {
            b = false;
            attachedToWindow = false;
        }
        final boolean b2 = uzt.b;
        final Bitmap bitmap = null;
        final Bitmap bitmap2 = null;
        Bitmap imageBitmap = null;
        Label_0433: {
            ViewGroup viewGroup2;
            int indexOfChild;
            if (b2 && b) {
                if (!attachedToWindow) {
                    imageBitmap = bitmap;
                    break Label_0433;
                }
                viewGroup2 = (ViewGroup)view.getParent();
                indexOfChild = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            else {
                viewGroup2 = null;
                indexOfChild = 0;
            }
            final int round5 = Math.round(rectF.width());
            final int round6 = Math.round(rectF.height());
            Bitmap bitmap3 = bitmap2;
            if (round5 > 0) {
                bitmap3 = bitmap2;
                if (round6 > 0) {
                    final float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                    final int round7 = Math.round(round5 * min);
                    final int round8 = Math.round(round6 * min);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    matrix.postScale(min, min);
                    if (uzt.c) {
                        final Picture picture = new Picture();
                        final Canvas beginRecording = picture.beginRecording(round7, round8);
                        beginRecording.concat(matrix);
                        view.draw(beginRecording);
                        picture.endRecording();
                        bitmap3 = Bitmap.createBitmap(picture);
                    }
                    else {
                        bitmap3 = Bitmap.createBitmap(round7, round8, Bitmap$Config.ARGB_8888);
                        final Canvas canvas = new Canvas(bitmap3);
                        canvas.concat(matrix);
                        view.draw(canvas);
                    }
                }
            }
            imageBitmap = bitmap3;
            if (b2) {
                imageBitmap = bitmap3;
                if (b) {
                    viewGroup.getOverlay().remove(view);
                    viewGroup2.addView(view, indexOfChild);
                    imageBitmap = bitmap3;
                }
            }
        }
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
        }
        ((View)imageView).measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        ((View)imageView).layout(round, round2, round3, round4);
        return (View)imageView;
    }
    
    public static Animator b(final Animator animator, final Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { animator, animator2 });
        return (Animator)set;
    }
    
    public static final class a implements TypeEvaluator<Matrix>
    {
        public final float[] a;
        public final float[] b;
        public final Matrix c;
        
        public a() {
            this.a = new float[9];
            this.b = new float[9];
            this.c = new Matrix();
        }
        
        public final Object evaluate(final float n, final Object o, final Object o2) {
            final Matrix matrix = (Matrix)o;
            final Matrix matrix2 = (Matrix)o2;
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; ++i) {
                final float[] b = this.b;
                final float n2 = b[i];
                final float[] a = this.a;
                b[i] = (n2 - a[i]) * n + a[i];
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }
}
