import java.util.ListIterator;
import android.graphics.Matrix;
import android.graphics.Path$Op;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Path;
import android.annotation.TargetApi;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(19)
public final class g6h implements e0k, t8c
{
    public final Path a;
    public final Path b;
    public final Path c;
    public final List<e0k> d;
    public final f6h e;
    
    public g6h(final f6h e) {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = new ArrayList();
        Objects.requireNonNull(e);
        this.e = e;
    }
    
    @TargetApi(19)
    public final void a(final Path$Op path$Op) {
        this.b.reset();
        this.a.reset();
        for (int i = this.d.size() - 1; i >= 1; --i) {
            final e0k e0k = this.d.get(i);
            if (e0k instanceof fm6) {
                final fm6 fm6 = (fm6)e0k;
                final ArrayList list = (ArrayList)fm6.d();
                for (int j = list.size() - 1; j >= 0; --j) {
                    final Path s = ((e0k)list.get(j)).s();
                    final nzt k = fm6.k;
                    Matrix matrix;
                    if (k != null) {
                        matrix = k.e();
                    }
                    else {
                        fm6.c.reset();
                        matrix = fm6.c;
                    }
                    s.transform(matrix);
                    this.b.addPath(s);
                }
            }
            else {
                this.b.addPath(e0k.s());
            }
        }
        final ArrayList d = this.d;
        int n = 0;
        final e0k e0k2 = d.get(0);
        if (e0k2 instanceof fm6) {
            final fm6 fm7 = (fm6)e0k2;
            final List<e0k> d2 = fm7.d();
            while (true) {
                final ArrayList list2 = (ArrayList)d2;
                if (n >= list2.size()) {
                    break;
                }
                final Path s2 = ((e0k)list2.get(n)).s();
                final nzt l = fm7.k;
                Matrix matrix2;
                if (l != null) {
                    matrix2 = l.e();
                }
                else {
                    fm7.c.reset();
                    matrix2 = fm7.c;
                }
                s2.transform(matrix2);
                this.a.addPath(s2);
                ++n;
            }
        }
        else {
            this.a.set(e0k2.s());
        }
        this.c.op(this.a, this.b, path$Op);
    }
    
    public final void b(final List<wl6> list, final List<wl6> list2) {
        for (int i = 0; i < this.d.size(); ++i) {
            ((wl6)this.d.get(i)).b((List)list, (List)list2);
        }
    }
    
    public final void d(final ListIterator<wl6> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {}
        while (listIterator.hasPrevious()) {
            final wl6 wl6 = listIterator.previous();
            if (wl6 instanceof e0k) {
                this.d.add(wl6);
                listIterator.remove();
            }
        }
    }
    
    @Override
    public final Path s() {
        this.c.reset();
        final f6h e = this.e;
        if (e.c) {
            return this.c;
        }
        final int g = lb0.G(e.b);
        if (g != 0) {
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g == 4) {
                            this.a(Path$Op.XOR);
                        }
                    }
                    else {
                        this.a(Path$Op.INTERSECT);
                    }
                }
                else {
                    this.a(Path$Op.REVERSE_DIFFERENCE);
                }
            }
            else {
                this.a(Path$Op.UNION);
            }
        }
        else {
            for (int i = 0; i < this.d.size(); ++i) {
                this.c.addPath(((e0k)this.d.get(i)).s());
            }
        }
        return this.c;
    }
}
