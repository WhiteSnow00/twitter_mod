import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class max extends p1r
{
    public abstract void d(final View p0, final float p1);
    
    public static final class a extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setAlpha(this.a(n));
        }
    }
    
    public static final class b extends max
    {
        public SparseArray<zi6> f;
        public float[] g;
        
        public b(String s, final SparseArray<zi6> f) {
            s = s.split(",")[1];
            this.f = f;
        }
        
        public final void b(final int n, final float n2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }
        
        public final void c(final int n) {
            final int size = this.f.size();
            final int c = ((zi6)this.f.valueAt(0)).c();
            final double[] array = new double[size];
            this.g = new float[c];
            final double[][] array2 = new double[size][c];
            for (int i = 0; i < size; ++i) {
                final int key = this.f.keyAt(i);
                final zi6 zi6 = (zi6)this.f.valueAt(i);
                array[i] = key * 0.01;
                zi6.b(this.g);
                int n2 = 0;
                while (true) {
                    final float[] g = this.g;
                    if (n2 >= g.length) {
                        break;
                    }
                    array2[i][n2] = g[n2];
                    ++n2;
                }
            }
            super.a = ia7.a(n, array, array2);
        }
        
        @Override
        public final void d(final View view, final float n) {
            super.a.d(n, this.g);
            bfe.z((zi6)this.f.valueAt(0), view, this.g);
        }
    }
    
    public static final class c extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setElevation(this.a(n));
        }
    }
    
    public static final class d extends max
    {
        @Override
        public final void d(final View view, final float n) {
        }
    }
    
    public static final class e extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setPivotX(this.a(n));
        }
    }
    
    public static final class f extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setPivotY(this.a(n));
        }
    }
    
    public static final class g extends max
    {
        public boolean f;
        
        public g() {
            this.f = false;
        }
        
        @Override
        public final void d(final View view, final float n) {
            if (view instanceof zqh) {
                ((zqh)view).setProgress(this.a(n));
            }
            else {
                if (this.f) {
                    return;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                }
                catch (final NoSuchMethodException ex) {
                    this.f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, this.a(n));
                    }
                    catch (final InvocationTargetException ex2) {
                        Log.e("ViewSpline", "unable to setProgress", (Throwable)ex2);
                    }
                    catch (final IllegalAccessException ex3) {
                        Log.e("ViewSpline", "unable to setProgress", (Throwable)ex3);
                    }
                }
            }
        }
    }
    
    public static final class h extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotation(this.a(n));
        }
    }
    
    public static final class i extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotationX(this.a(n));
        }
    }
    
    public static final class j extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setRotationY(this.a(n));
        }
    }
    
    public static final class k extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setScaleX(this.a(n));
        }
    }
    
    public static final class l extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setScaleY(this.a(n));
        }
    }
    
    public static final class m extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationX(this.a(n));
        }
    }
    
    public static final class n extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationY(this.a(n));
        }
    }
    
    public static final class o extends max
    {
        @Override
        public final void d(final View view, final float n) {
            view.setTranslationZ(this.a(n));
        }
    }
}
