import android.content.res.Resources$Theme;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import java.util.Objects;
import android.graphics.PorterDuffColorFilter;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqm
{
    public static final PorterDuff$Mode h;
    public static pqm i;
    public static final c j;
    public WeakHashMap<Context, a0r<ColorStateList>> a;
    public l7q<String, e> b;
    public a0r<String> c;
    public final WeakHashMap<Context, ocg<WeakReference<Drawable$ConstantState>>> d;
    public TypedValue e;
    public boolean f;
    public f g;
    
    static {
        h = PorterDuff$Mode.SRC_IN;
        j = new c();
    }
    
    public pqm() {
        this.d = new WeakHashMap<Context, ocg<WeakReference<Drawable$ConstantState>>>(0);
    }
    
    public static pqm d() {
        synchronized (pqm.class) {
            if (pqm.i == null) {
                j(pqm.i = new pqm());
            }
            return pqm.i;
        }
    }
    
    public static PorterDuffColorFilter h(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (pqm.class) {
            final c j = pqm.j;
            Objects.requireNonNull(j);
            final int n2 = (n + 31) * 31;
            PorterDuffColorFilter porterDuffColorFilter;
            if ((porterDuffColorFilter = (PorterDuffColorFilter)j.c((Object)(porterDuff$Mode.hashCode() + n2))) == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(n, porterDuff$Mode);
                Objects.requireNonNull(j);
                final PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter)j.d((Object)(porterDuff$Mode.hashCode() + n2), (Object)porterDuffColorFilter);
            }
            return porterDuffColorFilter;
        }
    }
    
    public static void j(final pqm pqm) {
        if (Build$VERSION.SDK_INT < 24) {
            pqm.a("vector", (e)new g());
            pqm.a("animated-vector", (e)new b());
            pqm.a("animated-selector", (e)new a());
            pqm.a("drawable", (e)new d());
        }
    }
    
    public final void a(final String s, final e e) {
        if (this.b == null) {
            this.b = (l7q<String, e>)new l7q();
        }
        this.b.put((Object)s, (Object)e);
    }
    
    public final boolean b(final Context context, final long n, final Drawable drawable) {
        synchronized (this) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                ocg ocg;
                if ((ocg = this.d.get(context)) == null) {
                    ocg = new ocg();
                    this.d.put(context, (ocg<WeakReference<Drawable$ConstantState>>)ocg);
                }
                ocg.j(n, (Object)new WeakReference(constantState));
                return true;
            }
            return false;
        }
    }
    
    public final Drawable c(final Context context, final int n) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        final TypedValue e = this.e;
        context.getResources().getValue(n, e, true);
        final long n2 = (long)e.assetCookie << 32 | (long)e.data;
        final Drawable e2 = this.e(context, n2);
        if (e2 != null) {
            return e2;
        }
        final f g = this.g;
        Object o = null;
        if (g != null) {
            final ik0$a ik0$a = (ik0$a)g;
            Objects.requireNonNull(ik0$a);
            if (n == 2131230772) {
                o = new LayerDrawable(new Drawable[] { this.f(context, 2131230771), this.f(context, 2131230773) });
            }
            else if (n == 2131230807) {
                o = ik0$a.c(this, context, 2131165243);
            }
            else if (n == 2131230806) {
                o = ik0$a.c(this, context, 2131165244);
            }
            else if (n == 2131230808) {
                o = ik0$a.c(this, context, 2131165245);
            }
        }
        if (o != null) {
            ((Drawable)o).setChangingConfigurations(e.changingConfigurations);
            this.b(context, n2, (Drawable)o);
        }
        return (Drawable)o;
    }
    
    public final Drawable e(final Context context, final long n) {
        synchronized (this) {
            final ocg ocg = this.d.get(context);
            if (ocg == null) {
                return null;
            }
            final WeakReference weakReference = (WeakReference)ocg.g(n, (Object)null);
            if (weakReference != null) {
                final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)weakReference.get();
                if (drawable$ConstantState != null) {
                    return drawable$ConstantState.newDrawable(context.getResources());
                }
                ocg.k(n);
            }
            return null;
        }
    }
    
    public final Drawable f(final Context context, final int n) {
        synchronized (this) {
            return this.g(context, n, false);
        }
    }
    
    public final Drawable g(final Context context, final int n, final boolean b) {
        monitorenter(this);
        Label_0180: {
            Label_0162: {
                try {
                    if (!this.f) {
                        final boolean b2 = true;
                        this.f = true;
                        final Drawable f = this.f(context, 2131230834);
                        if (f == null) {
                            break Label_0162;
                        }
                        int n2 = b2 ? 1 : 0;
                        if (!(f instanceof uow)) {
                            if ("android.graphics.drawable.VectorDrawable".equals(f.getClass().getName())) {
                                n2 = (b2 ? 1 : 0);
                            }
                            else {
                                n2 = 0;
                            }
                        }
                        if (n2 == 0) {
                            break Label_0162;
                        }
                    }
                    Drawable drawable;
                    if ((drawable = this.k(context, n)) == null) {
                        drawable = this.c(context, n);
                    }
                    Drawable b3;
                    if ((b3 = drawable) == null) {
                        final Object a = eo6.a;
                        b3 = eo6$c.b(context, n);
                    }
                    Drawable l;
                    if ((l = b3) != null) {
                        l = this.l(context, n, b, b3);
                    }
                    if (l != null) {
                        yd9.a(l);
                    }
                    monitorexit(this);
                    return l;
                }
                finally {
                    break Label_0180;
                }
            }
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        monitorexit(this);
    }
    
    public final ColorStateList i(final Context context, final int n) {
        monitorenter(this);
        Label_0166: {
            Object a2;
            try {
                final WeakHashMap<Context, a0r<ColorStateList>> a = this.a;
                final WeakHashMap<Context, a0r<ColorStateList>> weakHashMap = null;
                Object o = null;
                Label_0042: {
                    if (a != null) {
                        final a0r a0r = a.get(context);
                        if (a0r != null) {
                            o = a0r.e(n, (Object)null);
                            break Label_0042;
                        }
                    }
                    o = null;
                }
                a2 = o;
                if (o == null) {
                    final f g = this.g;
                    Object d;
                    if (g == null) {
                        d = weakHashMap;
                    }
                    else {
                        d = ((ik0$a)g).d(context, n);
                    }
                    if (d != null) {
                        if (this.a == null) {
                            a2 = new WeakHashMap<Context, a0r<ColorStateList>>();
                            this.a = (WeakHashMap<Context, a0r<ColorStateList>>)a2;
                        }
                        if ((a2 = this.a.get(context)) == null) {
                            a2 = new a0r();
                            this.a.put(context, (a0r<ColorStateList>)a2);
                        }
                        ((a0r)a2).a(n, d);
                    }
                    a2 = d;
                }
            }
            finally {
                break Label_0166;
            }
            monitorexit(this);
            return (ColorStateList)a2;
        }
        monitorexit(this);
    }
    
    public final Drawable k(final Context context, final int n) {
        final l7q<String, e> b = this.b;
        if (b == null || b.isEmpty()) {
            return null;
        }
        final a0r<String> c = this.c;
        if (c != null) {
            final String s = (String)c.e(n, (Object)null);
            if ("appcompat_skip_skip".equals(s) || (s != null && this.b.getOrDefault((Object)s, (Object)null) == null)) {
                return null;
            }
        }
        else {
            this.c = (a0r<String>)new a0r();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        final TypedValue e = this.e;
        final Resources resources = context.getResources();
        resources.getValue(n, e, true);
        final long n2 = (long)e.assetCookie << 32 | (long)e.data;
        final Drawable e2 = this.e(context, n2);
        if (e2 != null) {
            return e2;
        }
        final CharSequence string = e.string;
        Drawable drawable = e2;
        if (string != null) {
            drawable = e2;
            if (string.toString().endsWith(".xml")) {
                drawable = e2;
                try {
                    final XmlResourceParser xml = resources.getXml(n);
                    drawable = e2;
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    int next;
                    do {
                        drawable = e2;
                        next = ((XmlPullParser)xml).next();
                    } while (next != 2 && next != 1);
                    if (next != 2) {
                        drawable = e2;
                        drawable = e2;
                        final XmlPullParserException ex = new XmlPullParserException("No start tag found");
                        drawable = e2;
                        throw ex;
                    }
                    drawable = e2;
                    final String name = ((XmlPullParser)xml).getName();
                    drawable = e2;
                    this.c.a(n, (Object)name);
                    drawable = e2;
                    final e e3 = (e)this.b.getOrDefault((Object)name, (Object)null);
                    Drawable a = e2;
                    if (e3 != null) {
                        drawable = e2;
                        a = e3.a(context, (XmlPullParser)xml, attributeSet, context.getTheme());
                    }
                    if ((drawable = a) != null) {
                        drawable = a;
                        a.setChangingConfigurations(e.changingConfigurations);
                        drawable = a;
                        this.b(context, n2, a);
                        drawable = a;
                    }
                }
                catch (final Exception ex2) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", (Throwable)ex2);
                }
            }
        }
        if (drawable == null) {
            this.c.a(n, (Object)"appcompat_skip_skip");
        }
        return drawable;
    }
    
    public final Drawable l(final Context context, final int n, final boolean b, Drawable e) {
        final ColorStateList i = this.i(context, n);
        final PorterDuff$Mode porterDuff$Mode = null;
        Drawable drawable;
        if (i != null) {
            final int[] a = yd9.a;
            e = pd9.e(e.mutate());
            pd9.b.h(e, i);
            PorterDuff$Mode multiply;
            if (this.g == null) {
                multiply = porterDuff$Mode;
            }
            else {
                multiply = porterDuff$Mode;
                if (n == 2131230821) {
                    multiply = PorterDuff$Mode.MULTIPLY;
                }
            }
            drawable = e;
            if (multiply != null) {
                pd9.b.i(e, multiply);
                drawable = e;
            }
        }
        else {
            final f g = this.g;
            if (g != null) {
                final ik0$a ik0$a = (ik0$a)g;
                boolean b2 = true;
                if (n == 2131230816) {
                    final LayerDrawable layerDrawable = (LayerDrawable)e;
                    final Drawable drawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                    final int c = mls.c(context, 2130968955);
                    final PorterDuff$Mode b3 = ik0.b;
                    ik0$a.e(drawableByLayerId, c, b3);
                    ik0$a.e(layerDrawable.findDrawableByLayerId(16908303), mls.c(context, 2130968955), b3);
                    ik0$a.e(layerDrawable.findDrawableByLayerId(16908301), mls.c(context, 2130968953), b3);
                }
                else if (n != 2131230807 && n != 2131230806 && n != 2131230808) {
                    b2 = false;
                }
                else {
                    final LayerDrawable layerDrawable2 = (LayerDrawable)e;
                    final Drawable drawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                    final int b4 = mls.b(context, 2130968955);
                    final PorterDuff$Mode b5 = ik0.b;
                    ik0$a.e(drawableByLayerId2, b4, b5);
                    ik0$a.e(layerDrawable2.findDrawableByLayerId(16908303), mls.c(context, 2130968953), b5);
                    ik0$a.e(layerDrawable2.findDrawableByLayerId(16908301), mls.c(context, 2130968953), b5);
                }
                if (b2) {
                    drawable = e;
                    return drawable;
                }
            }
            drawable = e;
            if (!this.m(context, n, e)) {
                drawable = e;
                if (b) {
                    drawable = null;
                }
            }
        }
        return drawable;
    }
    
    public final boolean m(final Context context, int n, Drawable mutate) {
        final f g = this.g;
        boolean b = true;
        if (g != null) {
            final ik0$a ik0$a = (ik0$a)g;
            PorterDuff$Mode porterDuff$Mode = ik0.b;
            final boolean a = ik0$a.a(ik0$a.a, n);
            final int n2 = 16842801;
            int alpha = 0;
            int n3 = 0;
            Label_0159: {
                int round = 0;
                Label_0137: {
                    if (a) {
                        n = 2130968955;
                    }
                    else if (ik0$a.a(ik0$a.c, n)) {
                        n = 2130968953;
                    }
                    else if (ik0$a.a(ik0$a.d, n)) {
                        porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                        n = n2;
                    }
                    else {
                        if (n == 2131230793) {
                            n = 16842800;
                            round = Math.round(40.8f);
                            break Label_0137;
                        }
                        if (n != 2131230775) {
                            n = 0;
                            alpha = -1;
                            n3 = 0;
                            break Label_0159;
                        }
                        n = n2;
                    }
                    round = -1;
                }
                final int n4 = 1;
                alpha = round;
                n3 = n4;
            }
            if (n3 != 0) {
                final int[] a2 = yd9.a;
                mutate = mutate.mutate();
                mutate.setColorFilter((ColorFilter)ik0.c(mls.c(context, n), porterDuff$Mode));
                if (alpha != -1) {
                    mutate.setAlpha(alpha);
                }
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final class a implements e
    {
        @Override
        public final Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return (Drawable)ua0.g(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (final Exception ex) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    public static final class b implements e
    {
        @Override
        public final Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                final Resources resources = context.getResources();
                final wa0 wa0 = new wa0(context);
                wa0.inflate(resources, xmlPullParser, set, resources$Theme);
                return (Drawable)wa0;
            }
            catch (final Exception ex) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    public static final class c extends seg<Integer, PorterDuffColorFilter>
    {
        public c() {
            super(6);
        }
    }
    
    public static final class d implements e
    {
        @Override
        public final Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            final String classAttribute = set.getClassAttribute();
            if (classAttribute != null) {
                try {
                    final Drawable drawable = (Drawable)d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    gz5.c(drawable, context.getResources(), xmlPullParser, set, resources$Theme);
                    return drawable;
                }
                catch (final Exception ex) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", (Throwable)ex);
                }
            }
            return null;
        }
    }
    
    public interface e
    {
        Drawable a(final Context p0, final XmlPullParser p1, final AttributeSet p2, final Resources$Theme p3);
    }
    
    public interface f
    {
    }
    
    public static final class g implements e
    {
        @Override
        public final Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return (Drawable)uow.a(context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (final Exception ex) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", (Throwable)ex);
                return null;
            }
        }
    }
}
