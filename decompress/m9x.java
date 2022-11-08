import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class m9x extends wpe
{
    public abstract void d(final View p0, final float p1);
    
    public static final class a extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setAlpha(this.a(n));
        }
    }
    
    public static final class b extends m9x
    {
        public float[] g;
        public zi6 h;
        
        public b() {
            this.g = new float[1];
        }
        
        public final void b(final Object o) {
            this.h = (zi6)o;
        }
        
        @Override
        public final void d(final View view, final float n) {
            this.g[0] = this.a(n);
            bfe.z(this.h, view, this.g);
        }
    }
    
    public static final class c extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setElevation(this.a(n));
        }
    }
    
    public static final class d extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
        }
    }
    
    public static final class e extends m9x
    {
        public boolean g;
        
        public e() {
            this.g = false;
        }
        
        @Override
        public final void d(final View view, final float n) {
            if (view instanceof zqh) {
                ((zqh)view).setProgress(this.a(n));
            }
            else {
                if (this.g) {
                    return;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                }
                catch (final NoSuchMethodException ex) {
                    this.g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, this.a(n));
                    }
                    catch (final InvocationTargetException ex2) {
                        Log.e("ViewOscillator", "unable to setProgress", (Throwable)ex2);
                    }
                    catch (final IllegalAccessException ex3) {
                        Log.e("ViewOscillator", "unable to setProgress", (Throwable)ex3);
                    }
                }
            }
        }
    }
    
    public static final class f extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotation(this.a(n));
        }
    }
    
    public static final class g extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotationX(this.a(n));
        }
    }
    
    public static final class h extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotationY(this.a(n));
        }
    }
    
    public static final class i extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setScaleX(this.a(n));
        }
    }
    
    public static final class j extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setScaleY(this.a(n));
        }
    }
    
    public static final class k extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationX(this.a(n));
        }
    }
    
    public static final class l extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationY(this.a(n));
        }
    }
    
    public static final class m extends m9x
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationZ(this.a(n));
        }
    }
}
