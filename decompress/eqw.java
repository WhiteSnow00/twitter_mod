import java.util.ArrayList;
import android.content.res.TypedArray;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.ArrayDeque;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqw extends dqw
{
    public static final PorterDuff$Mode O0;
    public eqw.eqw$g G0;
    public PorterDuffColorFilter H0;
    public ColorFilter I0;
    public boolean J0;
    public boolean K0;
    public final float[] L0;
    public final Matrix M0;
    public final Rect N0;
    
    static {
        O0 = PorterDuff$Mode.SRC_IN;
    }
    
    public eqw() {
        this.K0 = true;
        this.L0 = new float[9];
        this.M0 = new Matrix();
        this.N0 = new Rect();
        this.G0 = new eqw.eqw$g();
    }
    
    public eqw(final eqw.eqw$g g0) {
        this.K0 = true;
        this.L0 = new float[9];
        this.M0 = new Matrix();
        this.N0 = new Rect();
        this.G0 = g0;
        this.H0 = this.b(g0.c, g0.d);
    }
    
    public static eqw a(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final eqw eqw = new eqw();
        eqw.inflate(resources, xmlPullParser, set, resources$Theme);
        return eqw;
    }
    
    public final PorterDuffColorFilter b(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final boolean canApplyTheme() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$b.b(f0);
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.draw(canvas);
            return;
        }
        this.copyBounds(this.N0);
        if (this.N0.width() > 0) {
            if (this.N0.height() > 0) {
                Object colorFilter;
                if ((colorFilter = this.I0) == null) {
                    colorFilter = this.H0;
                }
                canvas.getMatrix(this.M0);
                this.M0.getValues(this.L0);
                final float[] l0 = this.L0;
                final int n = 0;
                float abs = Math.abs(l0[0]);
                float abs2 = Math.abs(this.L0[4]);
                final float abs3 = Math.abs(this.L0[1]);
                final float abs4 = Math.abs(this.L0[3]);
                if (abs3 != 0.0f || abs4 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                final int n2 = (int)(this.N0.width() * abs);
                final int n3 = (int)(this.N0.height() * abs2);
                final int min = Math.min(2048, n2);
                final int min2 = Math.min(2048, n3);
                if (min > 0) {
                    if (min2 > 0) {
                        final int save = canvas.save();
                        final Rect n4 = this.N0;
                        canvas.translate((float)n4.left, (float)n4.top);
                        if (this.isAutoMirrored() && ae9.b((Drawable)this) == 1) {
                            canvas.translate((float)this.N0.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.N0.offsetTo(0, 0);
                        final eqw.eqw$g g0 = this.G0;
                        final Bitmap f2 = g0.f;
                        if (f2 == null || min != f2.getWidth() || min2 != g0.f.getHeight()) {
                            g0.f = Bitmap.createBitmap(min, min2, Bitmap$Config.ARGB_8888);
                            g0.k = true;
                        }
                        if (!this.K0) {
                            this.G0.b(min, min2);
                        }
                        else {
                            final eqw.eqw$g g2 = this.G0;
                            if (g2.k || g2.g != g2.c || g2.h != g2.d || g2.j != g2.e || g2.i != g2.b.getRootAlpha()) {
                                this.G0.b(min, min2);
                                final eqw.eqw$g g3 = this.G0;
                                g3.g = g3.c;
                                g3.h = g3.d;
                                g3.i = g3.b.getRootAlpha();
                                g3.j = g3.e;
                                g3.k = false;
                            }
                        }
                        final eqw.eqw$g g4 = this.G0;
                        final Rect n5 = this.N0;
                        int n6 = n;
                        if (g4.b.getRootAlpha() < 255) {
                            n6 = 1;
                        }
                        Paint i;
                        if (n6 == 0 && colorFilter == null) {
                            i = null;
                        }
                        else {
                            if (g4.l == null) {
                                (g4.l = new Paint()).setFilterBitmap(true);
                            }
                            g4.l.setAlpha(g4.b.getRootAlpha());
                            g4.l.setColorFilter((ColorFilter)colorFilter);
                            i = g4.l;
                        }
                        canvas.drawBitmap(g4.f, (Rect)null, n5, i);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }
    
    public final int getAlpha() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return ae9$a.a(f0);
        }
        return this.G0.b.getRootAlpha();
    }
    
    public final int getChangingConfigurations() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.G0.getChangingConfigurations();
    }
    
    public final ColorFilter getColorFilter() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return ae9$b.c(f0);
        }
        return this.I0;
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (super.F0 != null && Build$VERSION.SDK_INT >= 24) {
            return (Drawable$ConstantState)new eqw.eqw$h(super.F0.getConstantState());
        }
        this.G0.a = this.getChangingConfigurations();
        return (Drawable$ConstantState)this.G0;
    }
    
    public final int getIntrinsicHeight() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.getIntrinsicHeight();
        }
        return (int)this.G0.b.i;
    }
    
    public final int getIntrinsicWidth() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.getIntrinsicWidth();
        }
        return (int)this.G0.b.h;
    }
    
    public final int getOpacity() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.getOpacity();
        }
        return -3;
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) throws XmlPullParserException, IOException {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$b.d(f0, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final eqw.eqw$g g0 = this.G0;
        g0.b = new eqw.eqw$f();
        final TypedArray o = nmv.o(resources, resources$Theme, set, b60.a);
        final eqw.eqw$g g2 = this.G0;
        final eqw.eqw$f b = g2.b;
        final int h = nmv.h(o, xmlPullParser, "tintMode", 6, -1);
        final PorterDuff$Mode src_IN = PorterDuff$Mode.SRC_IN;
        PorterDuff$Mode d;
        if (h != 3) {
            d = src_IN;
            if (h != 5) {
                if (h != 9) {
                    switch (h) {
                        default: {
                            d = src_IN;
                            break;
                        }
                        case 16: {
                            d = PorterDuff$Mode.ADD;
                            break;
                        }
                        case 15: {
                            d = PorterDuff$Mode.SCREEN;
                            break;
                        }
                        case 14: {
                            d = PorterDuff$Mode.MULTIPLY;
                            break;
                        }
                    }
                }
                else {
                    d = PorterDuff$Mode.SRC_ATOP;
                }
            }
        }
        else {
            d = PorterDuff$Mode.SRC_OVER;
        }
        g2.d = d;
        final ColorStateList e = nmv.e(o, xmlPullParser, resources$Theme);
        if (e != null) {
            g2.c = e;
        }
        g2.e = nmv.c(o, xmlPullParser, "autoMirrored", 5, g2.e);
        b.j = nmv.g(o, xmlPullParser, "viewportWidth", 7, b.j);
        final float g3 = nmv.g(o, xmlPullParser, "viewportHeight", 8, b.k);
        b.k = g3;
        if (b.j <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append(o.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (g3 <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(o.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        b.h = o.getDimension(3, b.h);
        final float dimension = o.getDimension(2, b.i);
        b.i = dimension;
        if (b.h <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(o.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        if (dimension <= 0.0f) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(o.getPositionDescription());
            sb4.append("<vector> tag requires height > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        b.setAlpha(nmv.g(o, xmlPullParser, "alpha", 4, b.getAlpha()));
        final String string = o.getString(0);
        if (string != null) {
            b.m = string;
            b.o.put((Object)string, (Object)b);
        }
        o.recycle();
        g0.a = this.getChangingConfigurations();
        g0.k = true;
        final eqw.eqw$g g4 = this.G0;
        final eqw.eqw$f b2 = g4.b;
        final ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(b2.g);
        int n = xmlPullParser.getEventType();
        final int n2 = xmlPullParser.getDepth() + 1;
        int n3 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= n2 || n != 3)) {
            int n5;
            if (n == 2) {
                final String name = xmlPullParser.getName();
                final c c = arrayDeque.peek();
                if ("path".equals(name)) {
                    final b b3 = new b();
                    final TypedArray o2 = nmv.o(resources, resources$Theme, set, b60.c);
                    if (nmv.n(xmlPullParser, "pathData")) {
                        final String string2 = o2.getString(0);
                        if (string2 != null) {
                            ((e)b3).b = string2;
                        }
                        final String string3 = o2.getString(2);
                        if (string3 != null) {
                            ((e)b3).a = p0k.c(string3);
                        }
                        b3.g = nmv.f(o2, xmlPullParser, resources$Theme, "fillColor", 1);
                        b3.i = nmv.g(o2, xmlPullParser, "fillAlpha", 12, b3.i);
                        final int h2 = nmv.h(o2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint$Cap m = b3.m;
                        if (h2 != 0) {
                            if (h2 != 1) {
                                if (h2 == 2) {
                                    m = Paint$Cap.SQUARE;
                                }
                            }
                            else {
                                m = Paint$Cap.ROUND;
                            }
                        }
                        else {
                            m = Paint$Cap.BUTT;
                        }
                        b3.m = m;
                        final int h3 = nmv.h(o2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint$Join n4 = b3.n;
                        if (h3 != 0) {
                            if (h3 != 1) {
                                if (h3 == 2) {
                                    n4 = Paint$Join.BEVEL;
                                }
                            }
                            else {
                                n4 = Paint$Join.ROUND;
                            }
                        }
                        else {
                            n4 = Paint$Join.MITER;
                        }
                        b3.n = n4;
                        b3.o = nmv.g(o2, xmlPullParser, "strokeMiterLimit", 10, b3.o);
                        b3.e = nmv.f(o2, xmlPullParser, resources$Theme, "strokeColor", 3);
                        b3.h = nmv.g(o2, xmlPullParser, "strokeAlpha", 11, b3.h);
                        b3.f = nmv.g(o2, xmlPullParser, "strokeWidth", 4, b3.f);
                        b3.k = nmv.g(o2, xmlPullParser, "trimPathEnd", 6, b3.k);
                        b3.l = nmv.g(o2, xmlPullParser, "trimPathOffset", 7, b3.l);
                        b3.j = nmv.g(o2, xmlPullParser, "trimPathStart", 5, b3.j);
                        ((e)b3).c = nmv.h(o2, xmlPullParser, "fillType", 13, ((e)b3).c);
                    }
                    o2.recycle();
                    c.b.add(b3);
                    if (((e)b3).getPathName() != null) {
                        b2.o.put((Object)((e)b3).getPathName(), (Object)b3);
                    }
                    g4.a |= ((e)b3).d;
                    n5 = 0;
                }
                else {
                    if ("clip-path".equals(name)) {
                        final a a = new a();
                        if (nmv.n(xmlPullParser, "pathData")) {
                            final TypedArray o3 = nmv.o(resources, resources$Theme, set, b60.d);
                            final String string4 = o3.getString(0);
                            if (string4 != null) {
                                ((e)a).b = string4;
                            }
                            final String string5 = o3.getString(1);
                            if (string5 != null) {
                                ((e)a).a = p0k.c(string5);
                            }
                            ((e)a).c = nmv.h(o3, xmlPullParser, "fillType", 2, 0);
                            o3.recycle();
                        }
                        c.b.add(a);
                        if (((e)a).getPathName() != null) {
                            b2.o.put((Object)((e)a).getPathName(), (Object)a);
                        }
                        g4.a |= ((e)a).d;
                    }
                    else if ("group".equals(name)) {
                        final c c2 = new c();
                        final TypedArray o4 = nmv.o(resources, resources$Theme, set, b60.b);
                        c2.c = nmv.g(o4, xmlPullParser, "rotation", 5, c2.c);
                        c2.d = o4.getFloat(1, c2.d);
                        c2.e = o4.getFloat(2, c2.e);
                        c2.f = nmv.g(o4, xmlPullParser, "scaleX", 3, c2.f);
                        c2.g = nmv.g(o4, xmlPullParser, "scaleY", 4, c2.g);
                        c2.h = nmv.g(o4, xmlPullParser, "translateX", 6, c2.h);
                        c2.i = nmv.g(o4, xmlPullParser, "translateY", 7, c2.i);
                        final String string6 = o4.getString(0);
                        if (string6 != null) {
                            c2.l = string6;
                        }
                        c2.c();
                        o4.recycle();
                        c.b.add(c2);
                        arrayDeque.push(c2);
                        if (c2.getGroupName() != null) {
                            b2.o.put((Object)c2.getGroupName(), (Object)c2);
                        }
                        g4.a |= c2.k;
                    }
                    n5 = n3;
                }
            }
            else {
                n5 = n3;
                if (n == 3) {
                    n5 = n3;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n5 = n3;
                    }
                }
            }
            n = xmlPullParser.next();
            n3 = n5;
        }
        if (n3 == 0) {
            this.H0 = this.b(g0.c, g0.d);
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final void invalidateSelf() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return ae9$a.d(f0);
        }
        return this.G0.e;
    }
    
    public final boolean isStateful() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.isStateful();
        }
        if (!super.isStateful()) {
            final eqw.eqw$g g0 = this.G0;
            if (g0 != null) {
                if (g0.a()) {
                    return true;
                }
                final ColorStateList c = this.G0.c;
                if (c != null && c.isStateful()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final Drawable mutate() {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.mutate();
            return this;
        }
        if (!this.J0 && super.mutate() == this) {
            this.G0 = new eqw.eqw$g(this.G0);
            this.J0 = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect bounds) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.setBounds(bounds);
        }
    }
    
    public final boolean onStateChange(final int[] state) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.setState(state);
        }
        final boolean b = false;
        final eqw.eqw$g g0 = this.G0;
        final ColorStateList c = g0.c;
        final boolean b2 = true;
        boolean b3 = b;
        if (c != null) {
            final PorterDuff$Mode d = g0.d;
            b3 = b;
            if (d != null) {
                this.H0 = this.b(c, d);
                this.invalidateSelf();
                b3 = true;
            }
        }
        if (g0.a()) {
            final boolean b4 = g0.b.g.b(state);
            g0.k |= b4;
            if (b4) {
                this.invalidateSelf();
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.setAlpha(n);
            return;
        }
        if (this.G0.b.getRootAlpha() != n) {
            this.G0.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public final void setAutoMirrored(final boolean e) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$a.e(f0, e);
            return;
        }
        this.G0.e = e;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.setColorFilter(colorFilter);
            return;
        }
        this.I0 = colorFilter;
        this.invalidateSelf();
    }
    
    public final void setTint(final int n) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$b.g(f0, n);
            return;
        }
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList c) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$b.h(f0, c);
            return;
        }
        final eqw.eqw$g g0 = this.G0;
        if (g0.c != c) {
            g0.c = c;
            this.H0 = this.b(c, g0.d);
            this.invalidateSelf();
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode d) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            ae9$b.i(f0, d);
            return;
        }
        final eqw.eqw$g g0 = this.G0;
        if (g0.d != d) {
            g0.d = d;
            this.H0 = this.b(g0.c, d);
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            return f0.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public final void unscheduleSelf(final Runnable runnable) {
        final Drawable f0 = super.F0;
        if (f0 != null) {
            f0.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
    
    public static final class a extends e
    {
        public a() {
        }
        
        public a(final a a) {
            super((e)a);
        }
    }
    
    public static final class b extends e
    {
        public q16 e;
        public float f;
        public q16 g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public Paint$Cap m;
        public Paint$Join n;
        public float o;
        
        public b() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint$Cap.BUTT;
            this.n = Paint$Join.MITER;
            this.o = 4.0f;
        }
        
        public b(final b b) {
            super((e)b);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint$Cap.BUTT;
            this.n = Paint$Join.MITER;
            this.o = 4.0f;
            this.e = b.e;
            this.f = b.f;
            this.h = b.h;
            this.g = b.g;
            super.c = b.c;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
        }
        
        public final boolean a() {
            return this.g.c() || this.e.c();
        }
        
        public final boolean b(final int[] array) {
            return this.e.d(array) | this.g.d(array);
        }
        
        public float getFillAlpha() {
            return this.i;
        }
        
        public int getFillColor() {
            return this.g.c;
        }
        
        public float getStrokeAlpha() {
            return this.h;
        }
        
        public int getStrokeColor() {
            return this.e.c;
        }
        
        public float getStrokeWidth() {
            return this.f;
        }
        
        public float getTrimPathEnd() {
            return this.k;
        }
        
        public float getTrimPathOffset() {
            return this.l;
        }
        
        public float getTrimPathStart() {
            return this.j;
        }
        
        public void setFillAlpha(final float i) {
            this.i = i;
        }
        
        public void setFillColor(final int c) {
            this.g.c = c;
        }
        
        public void setStrokeAlpha(final float h) {
            this.h = h;
        }
        
        public void setStrokeColor(final int c) {
            this.e.c = c;
        }
        
        public void setStrokeWidth(final float f) {
            this.f = f;
        }
        
        public void setTrimPathEnd(final float k) {
            this.k = k;
        }
        
        public void setTrimPathOffset(final float l) {
            this.l = l;
        }
        
        public void setTrimPathStart(final float j) {
            this.j = j;
        }
    }
    
    public static final class c extends eqw$d
    {
        public final Matrix a;
        public final ArrayList<eqw$d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public String l;
        
        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<eqw$d>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.l = null;
        }
        
        public c(c c, final ws0<String, Object> ws0) {
            this.a = new Matrix();
            this.b = new ArrayList<eqw$d>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            final Matrix j = new Matrix();
            this.j = j;
            this.l = null;
            this.c = c.c;
            this.d = c.d;
            this.e = c.e;
            this.f = c.f;
            this.g = c.g;
            this.h = c.h;
            this.i = c.i;
            final String l = c.l;
            this.l = l;
            this.k = c.k;
            if (l != null) {
                ws0.put((Object)l, (Object)this);
            }
            j.set(c.j);
            final ArrayList<eqw$d> b = c.b;
            for (int i = 0; i < b.size(); ++i) {
                final Object value = b.get(i);
                if (value instanceof c) {
                    c = (c)value;
                    this.b.add(new c(c, ws0));
                }
                else {
                    e e;
                    if (value instanceof b) {
                        e = new b((b)value);
                    }
                    else {
                        if (!(value instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        e = new a((a)value);
                    }
                    this.b.add(e);
                    final String b2 = e.b;
                    if (b2 != null) {
                        ws0.put((Object)b2, (Object)e);
                    }
                }
            }
        }
        
        public final boolean a() {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }
        
        public final boolean b(final int[] array) {
            int i = 0;
            boolean b = false;
            while (i < this.b.size()) {
                b |= this.b.get(i).b(array);
                ++i;
            }
            return b;
        }
        
        public final void c() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }
        
        public String getGroupName() {
            return this.l;
        }
        
        public Matrix getLocalMatrix() {
            return this.j;
        }
        
        public float getPivotX() {
            return this.d;
        }
        
        public float getPivotY() {
            return this.e;
        }
        
        public float getRotation() {
            return this.c;
        }
        
        public float getScaleX() {
            return this.f;
        }
        
        public float getScaleY() {
            return this.g;
        }
        
        public float getTranslateX() {
            return this.h;
        }
        
        public float getTranslateY() {
            return this.i;
        }
        
        public void setPivotX(final float d) {
            if (d != this.d) {
                this.d = d;
                this.c();
            }
        }
        
        public void setPivotY(final float e) {
            if (e != this.e) {
                this.e = e;
                this.c();
            }
        }
        
        public void setRotation(final float c) {
            if (c != this.c) {
                this.c = c;
                this.c();
            }
        }
        
        public void setScaleX(final float f) {
            if (f != this.f) {
                this.f = f;
                this.c();
            }
        }
        
        public void setScaleY(final float g) {
            if (g != this.g) {
                this.g = g;
                this.c();
            }
        }
        
        public void setTranslateX(final float h) {
            if (h != this.h) {
                this.h = h;
                this.c();
            }
        }
        
        public void setTranslateY(final float i) {
            if (i != this.i) {
                this.i = i;
                this.c();
            }
        }
    }
    
    public abstract static class e extends eqw$d
    {
        public p0k$a[] a;
        public String b;
        public int c;
        public int d;
        
        public e() {
            this.a = null;
            this.c = 0;
        }
        
        public e(final e e) {
            this.a = null;
            this.c = 0;
            this.b = e.b;
            this.d = e.d;
            this.a = p0k.e(e.a);
        }
        
        public p0k$a[] getPathData() {
            return this.a;
        }
        
        public String getPathName() {
            return this.b;
        }
        
        public void setPathData(final p0k$a[] array) {
            if (!p0k.a(this.a, array)) {
                this.a = p0k.e(array);
            }
            else {
                final p0k$a[] a = this.a;
                for (int i = 0; i < array.length; ++i) {
                    a[i].a = array[i].a;
                    for (int j = 0; j < array[i].b.length; ++j) {
                        a[i].b[j] = array[i].b[j];
                    }
                }
            }
        }
    }
}
