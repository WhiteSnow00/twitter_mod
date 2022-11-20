import java.util.NoSuchElementException;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cc<T> implements Iterator<T>, j$.util.Iterator
{
    public int D0;
    public T E0;
    
    public cc() {
        this.D0 = 2;
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        final int d0 = this.D0;
        final boolean b = false;
        if (d0 == 4) {
            throw new IllegalStateException();
        }
        final int e = ib0.E(d0);
        if (e != 0) {
            boolean b2 = b;
            if (e != 2) {
                this.D0 = 4;
                final u2r$a u2r$a = (u2r$a)this;
                int n = u2r$a.I0;
                String string;
                while (true) {
                    final int i0 = u2r$a.I0;
                    if (i0 == -1) {
                        ((cc)u2r$a).D0 = 3;
                        string = null;
                        break;
                    }
                    final s2r s2r = (s2r)u2r$a;
                    int n2 = s2r.K0.a.a(((u2r$a)s2r).F0, i0);
                    if (n2 == -1) {
                        n2 = u2r$a.F0.length();
                        u2r$a.I0 = -1;
                    }
                    else {
                        u2r$a.I0 = n2 + 1;
                    }
                    final int i2 = u2r$a.I0;
                    int j = n;
                    if (i2 == n) {
                        if ((u2r$a.I0 = i2 + 1) <= u2r$a.F0.length()) {
                            continue;
                        }
                        u2r$a.I0 = -1;
                    }
                    else {
                        int k;
                        while (j < (k = n2)) {
                            k = n2;
                            if (!u2r$a.G0.b(u2r$a.F0.charAt(j))) {
                                break;
                            }
                            ++j;
                        }
                        while (k > j) {
                            final at3 g0 = u2r$a.G0;
                            final CharSequence f0 = u2r$a.F0;
                            final int n3 = k - 1;
                            if (!g0.b(f0.charAt(n3))) {
                                break;
                            }
                            k = n3;
                        }
                        if (!u2r$a.H0 || j != k) {
                            final int j2 = u2r$a.J0;
                            int n4;
                            if (j2 == 1) {
                                int length = u2r$a.F0.length();
                                u2r$a.I0 = -1;
                                while (true) {
                                    n4 = length;
                                    if (length <= j) {
                                        break;
                                    }
                                    final at3 g2 = u2r$a.G0;
                                    final CharSequence f2 = u2r$a.F0;
                                    final int n5 = length - 1;
                                    n4 = length;
                                    if (!g2.b(f2.charAt(n5))) {
                                        break;
                                    }
                                    length = n5;
                                }
                            }
                            else {
                                u2r$a.J0 = j2 - 1;
                                n4 = k;
                            }
                            string = u2r$a.F0.subSequence(j, n4).toString();
                            break;
                        }
                        n = u2r$a.I0;
                    }
                }
                this.E0 = string;
                b2 = b;
                if (this.D0 != 3) {
                    this.D0 = 1;
                    b2 = true;
                }
            }
            return b2;
        }
        return true;
    }
    
    @Override
    public final T next() {
        if (this.hasNext()) {
            this.D0 = 2;
            final String e0 = this.E0;
            this.E0 = null;
            return (T)e0;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
