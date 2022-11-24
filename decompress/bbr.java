import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.text.TextUtils$TruncateAt;
import android.text.TextDirectionHeuristic;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import java.util.Objects;
import android.text.StaticLayout;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbr implements cbr
{
    public static final bbr.bbr$a Companion;
    public static boolean a;
    public static Constructor<StaticLayout> b;
    
    static {
        Companion = new bbr.bbr$a();
    }
    
    @Override
    public final boolean a(final StaticLayout staticLayout, final boolean b) {
        return false;
    }
    
    @Override
    public StaticLayout b(final dbr dbr) {
        e0e.f((Object)dbr, "params");
        Objects.requireNonNull(bbr.Companion);
        final boolean a = bbr.a;
        final StaticLayout staticLayout = null;
        Constructor<StaticLayout> constructor;
        if (a) {
            constructor = bbr.b;
        }
        else {
            bbr.a = true;
            try {
                final Class<Integer> type = Integer.TYPE;
                final Class<Float> type2 = Float.TYPE;
                bbr.b = StaticLayout.class.getConstructor(CharSequence.class, type, type, TextPaint.class, type, Layout$Alignment.class, TextDirectionHeuristic.class, type2, type2, Boolean.TYPE, TextUtils$TruncateAt.class, type, type);
            }
            catch (final NoSuchMethodException ex) {
                bbr.b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            constructor = bbr.b;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (constructor != null) {
            try {
                staticLayout2 = constructor.newInstance(dbr.a, dbr.b, dbr.c, dbr.d, dbr.e, dbr.g, dbr.f, dbr.k, dbr.l, dbr.n, dbr.i, dbr.j, dbr.h);
            }
            catch (final InvocationTargetException ex2) {
                bbr.b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                staticLayout2 = staticLayout;
            }
            catch (final InstantiationException ex3) {
                bbr.b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                staticLayout2 = staticLayout;
            }
            catch (final IllegalAccessException ex4) {
                bbr.b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                staticLayout2 = staticLayout;
            }
        }
        if (staticLayout2 != null) {
            return staticLayout2;
        }
        return new StaticLayout(dbr.a, dbr.b, dbr.c, dbr.d, dbr.e, dbr.g, dbr.k, dbr.l, dbr.n, dbr.i, dbr.j);
    }
}
