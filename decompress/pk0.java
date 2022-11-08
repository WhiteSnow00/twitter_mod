import android.view.View;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build$VERSION;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public class pk0
{
    public static final int[] c;
    public final ProgressBar a;
    public Bitmap b;
    
    static {
        c = new int[] { 16843067, 16843068 };
    }
    
    public pk0(final ProgressBar a) {
        this.a = a;
    }
    
    public void a(final AttributeSet set, int i) {
        final u9t q = u9t.q(((View)this.a).getContext(), set, pk0.c, i);
        final Drawable h = q.h(0);
        if (h != null) {
            final ProgressBar a = this.a;
            AnimationDrawable indeterminateDrawable = (AnimationDrawable)h;
            if (h instanceof AnimationDrawable) {
                final AnimationDrawable animationDrawable = (AnimationDrawable)h;
                final int numberOfFrames = animationDrawable.getNumberOfFrames();
                indeterminateDrawable = new AnimationDrawable();
                indeterminateDrawable.setOneShot(animationDrawable.isOneShot());
                Drawable b;
                for (i = 0; i < numberOfFrames; ++i) {
                    b = this.b(animationDrawable.getFrame(i), true);
                    b.setLevel(10000);
                    indeterminateDrawable.addFrame(b, animationDrawable.getDuration(i));
                }
                ((Drawable)indeterminateDrawable).setLevel(10000);
            }
            a.setIndeterminateDrawable((Drawable)indeterminateDrawable);
        }
        final Drawable h2 = q.h(1);
        if (h2 != null) {
            this.a.setProgressDrawable(this.b(h2, false));
        }
        q.r();
    }
    
    public final Drawable b(final Drawable drawable, final boolean b) {
        if (drawable instanceof atx) {
            final atx atx = (atx)drawable;
            final Drawable a = atx.a();
            if (a != null) {
                atx.b(this.b(a, b));
            }
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                final int numberOfLayers = layerDrawable.getNumberOfLayers();
                final Drawable[] array = new Drawable[numberOfLayers];
                final int n = 0;
                for (int i = 0; i < numberOfLayers; ++i) {
                    final int id = layerDrawable.getId(i);
                    array[i] = this.b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable layerDrawable2 = new LayerDrawable(array);
                for (int j = n; j < numberOfLayers; ++j) {
                    layerDrawable2.setId(j, layerDrawable.getId(j));
                    if (Build$VERSION.SDK_INT >= 23) {
                        pk0.a.a(layerDrawable, layerDrawable2, j);
                    }
                }
                return (Drawable)layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.b == null) {
                    this.b = bitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f }, (RectF)null, (float[])null));
                shapeDrawable.getPaint().setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                Object o = shapeDrawable;
                if (b) {
                    o = new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return (Drawable)o;
            }
        }
        return drawable;
    }
    
    public static final class a
    {
        public static void a(final LayerDrawable layerDrawable, final LayerDrawable layerDrawable2, final int n) {
            layerDrawable2.setLayerGravity(n, layerDrawable.getLayerGravity(n));
            layerDrawable2.setLayerWidth(n, layerDrawable.getLayerWidth(n));
            layerDrawable2.setLayerHeight(n, layerDrawable.getLayerHeight(n));
            layerDrawable2.setLayerInsetLeft(n, layerDrawable.getLayerInsetLeft(n));
            layerDrawable2.setLayerInsetRight(n, layerDrawable.getLayerInsetRight(n));
            layerDrawable2.setLayerInsetTop(n, layerDrawable.getLayerInsetTop(n));
            layerDrawable2.setLayerInsetBottom(n, layerDrawable.getLayerInsetBottom(n));
            layerDrawable2.setLayerInsetStart(n, layerDrawable.getLayerInsetStart(n));
            layerDrawable2.setLayerInsetEnd(n, layerDrawable.getLayerInsetEnd(n));
        }
    }
}
