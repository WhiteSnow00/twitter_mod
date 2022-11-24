import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lu3<T extends x2d<? extends n8a>>
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public List<T> i;
    
    public lu3() {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = new ArrayList();
    }
    
    public lu3(final T... array) {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        final ArrayList i = new ArrayList();
        for (int length = array.length, j = 0; j < length; ++j) {
            i.add(array[j]);
        }
        this.i = i;
        this.a();
    }
    
    public final void a() {
        final svx$a g0 = svx$a.G0;
        final svx$a f0 = svx$a.F0;
        final ArrayList i = this.i;
        if (i == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        final Iterator iterator = i.iterator();
        while (iterator.hasNext()) {
            this.b((x2d)iterator.next());
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        final Iterator iterator2 = this.i.iterator();
        while (true) {
            x2d x2d;
            do {
                final boolean hasNext = iterator2.hasNext();
                final x2d x2d2 = null;
                if (!hasNext) {
                    x2d = null;
                    if (x2d != null) {
                        this.e = x2d.d();
                        this.f = x2d.h();
                        for (final x2d x2d3 : this.i) {
                            if (x2d3.y() == f0) {
                                if (x2d3.h() < this.f) {
                                    this.f = x2d3.h();
                                }
                                if (x2d3.d() <= this.e) {
                                    continue;
                                }
                                this.e = x2d3.d();
                            }
                        }
                    }
                    final Iterator iterator4 = this.i.iterator();
                    x2d x2d4;
                    do {
                        x2d4 = x2d2;
                        if (!iterator4.hasNext()) {
                            break;
                        }
                        x2d4 = (x2d)iterator4.next();
                    } while (x2d4.y() != g0);
                    if (x2d4 != null) {
                        this.g = x2d4.d();
                        this.h = x2d4.h();
                        for (final x2d x2d5 : this.i) {
                            if (x2d5.y() == g0) {
                                if (x2d5.h() < this.h) {
                                    this.h = x2d5.h();
                                }
                                if (x2d5.d() <= this.g) {
                                    continue;
                                }
                                this.g = x2d5.d();
                            }
                        }
                    }
                    return;
                }
                x2d = (x2d)iterator2.next();
            } while (x2d.y() != f0);
            continue;
        }
    }
    
    public final void b(final T t) {
        if (this.a < t.d()) {
            this.a = t.d();
        }
        if (this.b > t.h()) {
            this.b = t.h();
        }
        if (this.c < t.U()) {
            this.c = t.U();
        }
        if (this.d > t.F()) {
            this.d = t.F();
        }
        if (t.y() == svx$a.F0) {
            if (this.e < t.d()) {
                this.e = t.d();
            }
            if (this.f > t.h()) {
                this.f = t.h();
            }
        }
        else {
            if (this.g < t.d()) {
                this.g = t.d();
            }
            if (this.h > t.h()) {
                this.h = t.h();
            }
        }
    }
    
    public final T c(final int n) {
        final ArrayList i = this.i;
        if (i != null && n >= 0 && n < i.size()) {
            return this.i.get(n);
        }
        return null;
    }
    
    public final int d() {
        final ArrayList i = this.i;
        if (i == null) {
            return 0;
        }
        return i.size();
    }
    
    public final int e() {
        final Iterator iterator = this.i.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((x2d)iterator.next()).Z();
        }
        return n;
    }
    
    public final n8a f(final flc flc) {
        if (flc.f >= this.i.size()) {
            return null;
        }
        return this.i.get(flc.f).I(flc.a, flc.b);
    }
    
    public final float g(final svx$a svx$a) {
        if (svx$a == svx$a.F0) {
            float n;
            if ((n = this.e) == -3.4028235E38f) {
                n = this.g;
            }
            return n;
        }
        float n2;
        if ((n2 = this.g) == -3.4028235E38f) {
            n2 = this.e;
        }
        return n2;
    }
    
    public final float h(final svx$a svx$a) {
        if (svx$a == svx$a.F0) {
            float n;
            if ((n = this.f) == Float.MAX_VALUE) {
                n = this.h;
            }
            return n;
        }
        float n2;
        if ((n2 = this.h) == Float.MAX_VALUE) {
            n2 = this.f;
        }
        return n2;
    }
}
