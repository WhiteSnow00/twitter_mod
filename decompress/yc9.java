import android.util.SparseArray;
import android.content.res.Resources;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import java.util.Objects;
import android.content.res.Resources$Theme;
import android.os.SystemClock;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class yc9 extends Drawable implements Drawable$Callback
{
    public static final int P0 = 0;
    public c D0;
    public Rect E0;
    public Drawable F0;
    public Drawable G0;
    public int H0;
    public boolean I0;
    public int J0;
    public boolean K0;
    public yc9$a L0;
    public long M0;
    public long N0;
    public b O0;
    
    public yc9() {
        this.H0 = 255;
        this.J0 = -1;
    }
    
    public final void a(final boolean b) {
        final int n = 1;
        this.I0 = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Drawable f0 = this.F0;
        int n2 = 0;
        Label_0109: {
            if (f0 != null) {
                final long m0 = this.M0;
                if (m0 != 0L) {
                    if (m0 > uptimeMillis) {
                        f0.setAlpha((255 - (int)((m0 - uptimeMillis) * 255L) / this.D0.y) * this.H0 / 255);
                        n2 = 1;
                        break Label_0109;
                    }
                    f0.setAlpha(this.H0);
                    this.M0 = 0L;
                }
            }
            else {
                this.M0 = 0L;
            }
            n2 = 0;
        }
        final Drawable g0 = this.G0;
        if (g0 != null) {
            final long n3 = this.N0;
            if (n3 != 0L) {
                if (n3 <= uptimeMillis) {
                    g0.setVisible(false, false);
                    this.G0 = null;
                    this.N0 = 0L;
                }
                else {
                    g0.setAlpha((int)((n3 - uptimeMillis) * 255L) / this.D0.z * this.H0 / 255);
                    n2 = n;
                }
            }
        }
        else {
            this.N0 = 0L;
        }
        if (b && n2 != 0) {
            this.scheduleSelf((Runnable)this.L0, uptimeMillis + 16L);
        }
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final c d0 = this.D0;
        Objects.requireNonNull(d0);
        if (resources$Theme != null) {
            d0.c();
            final int h = d0.h;
            final Drawable[] g = d0.g;
            for (int i = 0; i < h; ++i) {
                if (g[i] != null && xc9$b.b(g[i])) {
                    xc9$b.a(g[i], resources$Theme);
                    d0.e |= g[i].getChangingConfigurations();
                }
            }
            d0.g(resources$Theme.getResources());
        }
    }
    
    public c b() {
        throw null;
    }
    
    public final void c(final Drawable drawable) {
        if (this.O0 == null) {
            this.O0 = new b();
        }
        final b o0 = this.O0;
        o0.D0 = drawable.getCallback();
        drawable.setCallback((Drawable$Callback)o0);
        try {
            if (this.D0.y <= 0 && this.I0) {
                drawable.setAlpha(this.H0);
            }
            final c d0 = this.D0;
            if (d0.C) {
                drawable.setColorFilter(d0.B);
            }
            else {
                if (d0.F) {
                    xc9$b.h(drawable, d0.D);
                }
                final c d2 = this.D0;
                if (d2.G) {
                    xc9$b.i(drawable, d2.E);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.D0.w);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build$VERSION.SDK_INT >= 23) {
                xc9.c(drawable, xc9.b((Drawable)this));
            }
            xc9$a.e(drawable, this.D0.A);
            final Rect e0 = this.E0;
            if (e0 != null) {
                xc9$b.f(drawable, e0.left, e0.top, e0.right, e0.bottom);
            }
        }
        finally {
            final b o2 = this.O0;
            final Drawable$Callback d3 = o2.D0;
            o2.D0 = null;
            drawable.setCallback(d3);
        }
    }
    
    public final boolean canApplyTheme() {
        return this.D0.canApplyTheme();
    }
    
    public final boolean d(int y) {
        if (y == this.J0) {
            return false;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.D0.z > 0) {
            final Drawable g0 = this.G0;
            if (g0 != null) {
                g0.setVisible(false, false);
            }
            final Drawable f0 = this.F0;
            if (f0 != null) {
                this.G0 = f0;
                this.N0 = this.D0.z + uptimeMillis;
            }
            else {
                this.G0 = null;
                this.N0 = 0L;
            }
        }
        else {
            final Drawable f2 = this.F0;
            if (f2 != null) {
                f2.setVisible(false, false);
            }
        }
        Label_0191: {
            if (y >= 0) {
                final c d0 = this.D0;
                if (y < d0.h) {
                    final Drawable d2 = d0.d(y);
                    this.F0 = d2;
                    this.J0 = y;
                    if (d2 != null) {
                        y = this.D0.y;
                        if (y > 0) {
                            this.M0 = uptimeMillis + y;
                        }
                        this.c(d2);
                    }
                    break Label_0191;
                }
            }
            this.F0 = null;
            this.J0 = -1;
        }
        if (this.M0 != 0L || this.N0 != 0L) {
            final Runnable l0 = this.L0;
            if (l0 == null) {
                this.L0 = new Runnable(this) {
                    public final yc9 D0;
                    
                    @Override
                    public final void run() {
                        this.D0.a(true);
                        this.D0.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf((Runnable)l0);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.draw(canvas);
        }
        final Drawable g0 = this.G0;
        if (g0 != null) {
            g0.draw(canvas);
        }
    }
    
    public void e(final c c) {
        throw null;
    }
    
    public final int getAlpha() {
        return this.H0;
    }
    
    public final int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final c d0 = this.D0;
        return changingConfigurations | (d0.e | d0.d);
    }
    
    public final Drawable$ConstantState getConstantState() {
        final c d0 = this.D0;
        final boolean u = d0.u;
        boolean v = false;
        Label_0093: {
            if (u) {
                v = d0.v;
            }
            else {
                d0.c();
                d0.u = true;
                final int h = d0.h;
                final Drawable[] g = d0.g;
                for (int i = 0; i < h; ++i) {
                    if (g[i].getConstantState() == null) {
                        d0.v = false;
                        break Label_0093;
                    }
                }
                d0.v = true;
                v = true;
            }
        }
        if (v) {
            this.D0.d = this.getChangingConfigurations();
            return this.D0;
        }
        return null;
    }
    
    public final Drawable getCurrent() {
        return this.F0;
    }
    
    public final void getHotspotBounds(final Rect rect) {
        final Rect e0 = this.E0;
        if (e0 != null) {
            rect.set(e0);
        }
        else {
            super.getHotspotBounds(rect);
        }
    }
    
    public final int getIntrinsicHeight() {
        final c d0 = this.D0;
        if (d0.l) {
            if (!d0.m) {
                d0.b();
            }
            return d0.o;
        }
        final Drawable f0 = this.F0;
        int intrinsicHeight;
        if (f0 != null) {
            intrinsicHeight = f0.getIntrinsicHeight();
        }
        else {
            intrinsicHeight = -1;
        }
        return intrinsicHeight;
    }
    
    public final int getIntrinsicWidth() {
        final c d0 = this.D0;
        if (d0.l) {
            if (!d0.m) {
                d0.b();
            }
            return d0.n;
        }
        final Drawable f0 = this.F0;
        int intrinsicWidth;
        if (f0 != null) {
            intrinsicWidth = f0.getIntrinsicWidth();
        }
        else {
            intrinsicWidth = -1;
        }
        return intrinsicWidth;
    }
    
    public final int getMinimumHeight() {
        final c d0 = this.D0;
        if (d0.l) {
            if (!d0.m) {
                d0.b();
            }
            return d0.q;
        }
        final Drawable f0 = this.F0;
        int minimumHeight;
        if (f0 != null) {
            minimumHeight = f0.getMinimumHeight();
        }
        else {
            minimumHeight = 0;
        }
        return minimumHeight;
    }
    
    public final int getMinimumWidth() {
        final c d0 = this.D0;
        if (d0.l) {
            if (!d0.m) {
                d0.b();
            }
            return d0.p;
        }
        final Drawable f0 = this.F0;
        int minimumWidth;
        if (f0 != null) {
            minimumWidth = f0.getMinimumWidth();
        }
        else {
            minimumWidth = 0;
        }
        return minimumWidth;
    }
    
    public final int getOpacity() {
        final Drawable f0 = this.F0;
        int s;
        final int n = s = -2;
        if (f0 != null) {
            if (!f0.isVisible()) {
                s = n;
            }
            else {
                final c d0 = this.D0;
                if (d0.r) {
                    s = d0.s;
                }
                else {
                    d0.c();
                    final int h = d0.h;
                    final Drawable[] g = d0.g;
                    s = n;
                    if (h > 0) {
                        s = g[0].getOpacity();
                    }
                    for (int i = 1; i < h; ++i) {
                        s = Drawable.resolveOpacity(s, g[i].getOpacity());
                    }
                    d0.s = s;
                    d0.r = true;
                }
            }
        }
        return s;
    }
    
    public final void getOutline(final Outline outline) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.getOutline(outline);
        }
    }
    
    public final boolean getPadding(final Rect rect) {
        final c d0 = this.D0;
        final boolean i = d0.i;
        final Rect rect2 = null;
        Rect k = null;
        final int n = 1;
        if (i) {
            k = rect2;
        }
        else {
            final Rect j = d0.k;
            if (j == null && !d0.j) {
                d0.c();
                final Rect rect3 = new Rect();
                final int h = d0.h;
                final Drawable[] g = d0.g;
                Rect rect4;
                for (int l = 0; l < h; ++l, k = rect4) {
                    rect4 = k;
                    if (g[l].getPadding(rect3)) {
                        Rect rect5;
                        if ((rect5 = k) == null) {
                            rect5 = new Rect(0, 0, 0, 0);
                        }
                        final int left = rect3.left;
                        if (left > rect5.left) {
                            rect5.left = left;
                        }
                        final int top = rect3.top;
                        if (top > rect5.top) {
                            rect5.top = top;
                        }
                        final int right = rect3.right;
                        if (right > rect5.right) {
                            rect5.right = right;
                        }
                        final int bottom = rect3.bottom;
                        rect4 = rect5;
                        if (bottom > rect5.bottom) {
                            rect5.bottom = bottom;
                            rect4 = rect5;
                        }
                    }
                }
                d0.j = true;
                d0.k = k;
            }
            else {
                k = j;
            }
        }
        boolean b;
        if (k != null) {
            rect.set(k);
            b = ((k.left | k.top | k.bottom | k.right) != 0x0);
        }
        else {
            final Drawable f0 = this.F0;
            if (f0 != null) {
                b = f0.getPadding(rect);
            }
            else {
                b = super.getPadding(rect);
            }
        }
        int n2;
        if (this.D0.A && xc9.b((Drawable)this) == 1) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            final int left2 = rect.left;
            rect.left = rect.right;
            rect.right = left2;
        }
        return b;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final c d0 = this.D0;
        if (d0 != null) {
            d0.r = false;
            d0.t = false;
        }
        if (drawable == this.F0 && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public final boolean isAutoMirrored() {
        return this.D0.A;
    }
    
    public void jumpToCurrentState() {
        final Drawable g0 = this.G0;
        final int n = 1;
        int n2;
        if (g0 != null) {
            g0.jumpToCurrentState();
            this.G0 = null;
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.jumpToCurrentState();
            if (this.I0) {
                this.F0.setAlpha(this.H0);
            }
        }
        if (this.N0 != 0L) {
            this.N0 = 0L;
            n2 = 1;
        }
        if (this.M0 != 0L) {
            this.M0 = 0L;
            n2 = n;
        }
        if (n2 != 0) {
            this.invalidateSelf();
        }
    }
    
    public Drawable mutate() {
        if (!this.K0 && super.mutate() == this) {
            final c b = this.b();
            b.e();
            this.e(b);
            this.K0 = true;
        }
        return this;
    }
    
    public final void onBoundsChange(final Rect rect) {
        final Drawable g0 = this.G0;
        if (g0 != null) {
            g0.setBounds(rect);
        }
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setBounds(rect);
        }
    }
    
    public final boolean onLayoutDirectionChanged(final int x) {
        final c d0 = this.D0;
        final int j0 = this.J0;
        final int h = d0.h;
        final Drawable[] g = d0.g;
        int i = 0;
        boolean b = false;
        while (i < h) {
            boolean b2 = b;
            if (g[i] != null) {
                final boolean b3 = Build$VERSION.SDK_INT >= 23 && xc9.c(g[i], x);
                b2 = b;
                if (i == j0) {
                    b2 = b3;
                }
            }
            ++i;
            b = b2;
        }
        d0.x = x;
        return b;
    }
    
    public final boolean onLevelChange(final int n) {
        final Drawable g0 = this.G0;
        if (g0 != null) {
            return g0.setLevel(n);
        }
        final Drawable f0 = this.F0;
        return f0 != null && f0.setLevel(n);
    }
    
    public boolean onStateChange(final int[] array) {
        final Drawable g0 = this.G0;
        if (g0 != null) {
            return g0.setState(array);
        }
        final Drawable f0 = this.F0;
        return f0 != null && f0.setState(array);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (drawable == this.F0 && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public final void setAlpha(final int n) {
        if (!this.I0 || this.H0 != n) {
            this.I0 = true;
            this.H0 = n;
            final Drawable f0 = this.F0;
            if (f0 != null) {
                if (this.M0 == 0L) {
                    f0.setAlpha(n);
                }
                else {
                    this.a(false);
                }
            }
        }
    }
    
    public final void setAutoMirrored(final boolean a) {
        final c d0 = this.D0;
        if (d0.A != a) {
            d0.A = a;
            final Drawable f0 = this.F0;
            if (f0 != null) {
                xc9$a.e(f0, a);
            }
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        final c d0 = this.D0;
        d0.C = true;
        if (d0.B != colorFilter) {
            d0.B = colorFilter;
            final Drawable f0 = this.F0;
            if (f0 != null) {
                f0.setColorFilter(colorFilter);
            }
        }
    }
    
    public final void setDither(final boolean b) {
        final c d0 = this.D0;
        if (d0.w != b) {
            d0.w = b;
            final Drawable f0 = this.F0;
            if (f0 != null) {
                f0.setDither(b);
            }
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        final Drawable f0 = this.F0;
        if (f0 != null) {
            xc9$b.e(f0, n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Rect e0 = this.E0;
        if (e0 == null) {
            this.E0 = new Rect(n, n2, n3, n4);
        }
        else {
            e0.set(n, n2, n3, n4);
        }
        final Drawable f0 = this.F0;
        if (f0 != null) {
            xc9$b.f(f0, n, n2, n3, n4);
        }
    }
    
    public final void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList d) {
        final c d2 = this.D0;
        d2.F = true;
        if (d2.D != d) {
            d2.D = d;
            xc9$b.h(this.F0, d);
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode e) {
        final c d0 = this.D0;
        d0.G = true;
        if (d0.E != e) {
            d0.E = e;
            xc9$b.i(this.F0, e);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable g0 = this.G0;
        if (g0 != null) {
            g0.setVisible(b, b2);
        }
        final Drawable f0 = this.F0;
        if (f0 != null) {
            f0.setVisible(b, b2);
        }
        return setVisible;
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (drawable == this.F0 && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    public static final class b implements Drawable$Callback
    {
        public Drawable$Callback D0;
        
        public final void invalidateDrawable(final Drawable drawable) {
        }
        
        public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
            final Drawable$Callback d0 = this.D0;
            if (d0 != null) {
                d0.scheduleDrawable(drawable, runnable, n);
            }
        }
        
        public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
            final Drawable$Callback d0 = this.D0;
            if (d0 != null) {
                d0.unscheduleDrawable(drawable, runnable);
            }
        }
    }
    
    public abstract static class c extends Drawable$ConstantState
    {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff$Mode E;
        public boolean F;
        public boolean G;
        public final yc9 a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable$ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;
        
        public c(final c c, final yc9 a, final Resources resources) {
            final int n = 0;
            this.i = false;
            this.l = false;
            this.w = true;
            this.y = 0;
            this.z = 0;
            this.a = a;
            final Rect rect = null;
            Resources b;
            if (resources != null) {
                b = resources;
            }
            else if (c != null) {
                b = c.b;
            }
            else {
                b = null;
            }
            this.b = b;
            int n2;
            if (c != null) {
                n2 = c.c;
            }
            else {
                n2 = 0;
            }
            final int p3 = yc9.P0;
            if (resources != null) {
                n2 = resources.getDisplayMetrics().densityDpi;
            }
            int c2 = n2;
            if (n2 == 0) {
                c2 = 160;
            }
            this.c = c2;
            if (c != null) {
                this.d = c.d;
                this.e = c.e;
                this.u = true;
                this.v = true;
                this.i = c.i;
                this.l = c.l;
                this.w = c.w;
                this.x = c.x;
                this.y = c.y;
                this.z = c.z;
                this.A = c.A;
                this.B = c.B;
                this.C = c.C;
                this.D = c.D;
                this.E = c.E;
                this.F = c.F;
                this.G = c.G;
                if (c.c == c2) {
                    if (c.j) {
                        Rect k = rect;
                        if (c.k != null) {
                            k = new Rect(c.k);
                        }
                        this.k = k;
                        this.j = true;
                    }
                    if (c.m) {
                        this.n = c.n;
                        this.o = c.o;
                        this.p = c.p;
                        this.q = c.q;
                        this.m = true;
                    }
                }
                if (c.r) {
                    this.s = c.s;
                    this.r = true;
                }
                if (c.t) {
                    this.t = true;
                }
                final Drawable[] g = c.g;
                this.g = new Drawable[g.length];
                this.h = c.h;
                final SparseArray<Drawable$ConstantState> f = c.f;
                if (f != null) {
                    this.f = (SparseArray<Drawable$ConstantState>)f.clone();
                }
                else {
                    this.f = (SparseArray<Drawable$ConstantState>)new SparseArray(this.h);
                }
                for (int h = this.h, i = n; i < h; ++i) {
                    if (g[i] != null) {
                        final Drawable$ConstantState constantState = g[i].getConstantState();
                        if (constantState != null) {
                            this.f.put(i, (Object)constantState);
                        }
                        else {
                            this.g[i] = g[i];
                        }
                    }
                }
            }
            else {
                this.g = new Drawable[10];
                this.h = 0;
            }
        }
        
        public final int a(final Drawable drawable) {
            final int h = this.h;
            if (h >= this.g.length) {
                final int n = h + 10;
                final v8r.a a = (v8r.a)this;
                final Drawable[] g = new Drawable[n];
                final Drawable[] g2 = ((c)a).g;
                if (g2 != null) {
                    System.arraycopy(g2, 0, g, 0, h);
                }
                ((c)a).g = g;
                final int[][] h2 = new int[n][];
                System.arraycopy(a.H, 0, h2, 0, h);
                a.H = h2;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable$Callback)this.a);
            this.g[h] = drawable;
            ++this.h;
            this.e |= drawable.getChangingConfigurations();
            this.r = false;
            this.t = false;
            this.k = null;
            this.j = false;
            this.m = false;
            this.u = false;
            return h;
        }
        
        public final void b() {
            this.m = true;
            this.c();
            final int h = this.h;
            final Drawable[] g = this.g;
            this.o = -1;
            this.n = -1;
            int i = 0;
            this.q = 0;
            this.p = 0;
            while (i < h) {
                final Drawable drawable = g[i];
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                final int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                final int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
                ++i;
            }
        }
        
        public final void c() {
            final SparseArray<Drawable$ConstantState> f = this.f;
            if (f != null) {
                for (int size = f.size(), i = 0; i < size; ++i) {
                    this.g[this.f.keyAt(i)] = this.f(((Drawable$ConstantState)this.f.valueAt(i)).newDrawable(this.b));
                }
                this.f = null;
            }
        }
        
        public final boolean canApplyTheme() {
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                final Drawable drawable = g[i];
                if (drawable != null) {
                    if (xc9$b.b(drawable)) {
                        return true;
                    }
                }
                else {
                    final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)this.f.get(i);
                    if (drawable$ConstantState != null && drawable$ConstantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        public final Drawable d(final int n) {
            final Drawable drawable = this.g[n];
            if (drawable != null) {
                return drawable;
            }
            final SparseArray<Drawable$ConstantState> f = this.f;
            if (f != null) {
                final int indexOfKey = f.indexOfKey(n);
                if (indexOfKey >= 0) {
                    final Drawable f2 = this.f(((Drawable$ConstantState)this.f.valueAt(indexOfKey)).newDrawable(this.b));
                    this.g[n] = f2;
                    this.f.removeAt(indexOfKey);
                    if (this.f.size() == 0) {
                        this.f = null;
                    }
                    return f2;
                }
            }
            return null;
        }
        
        public abstract void e();
        
        public final Drawable f(Drawable mutate) {
            if (Build$VERSION.SDK_INT >= 23) {
                xc9.c(mutate, this.x);
            }
            mutate = mutate.mutate();
            mutate.setCallback((Drawable$Callback)this.a);
            return mutate;
        }
        
        public final void g(final Resources b) {
            if (b != null) {
                this.b = b;
                final int p = yc9.P0;
                int densityDpi;
                if ((densityDpi = b.getDisplayMetrics().densityDpi) == 0) {
                    densityDpi = 160;
                }
                if (this.c != (this.c = densityDpi)) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
        
        public final int getChangingConfigurations() {
            return this.d | this.e;
        }
    }
}
