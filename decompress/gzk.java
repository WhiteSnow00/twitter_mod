import android.graphics.PathMeasure;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzk
{
    public List a = a;
    
    public gzk(final int n) {
        if (n != 3) {
            this.a = new ArrayList();
            return;
        }
        this.a = new ArrayList();
    }
    
    public final int a(final String s) {
        this.a.add(s);
        return this.a.size() - 1;
    }
    
    public final void b(final int n) {
        Label_0064: {
            if (this.a.isEmpty() ^ true) {
                if (this.a.get(0).intValue() != n) {
                    final List a = this.a;
                    if (((Number)a.get(a.size() - 1)).intValue() != n) {
                        break Label_0064;
                    }
                }
                return;
            }
        }
        int i = this.a.size();
        this.a.add(n);
        while (i > 0) {
            final int n2 = (i + 1 >>> 1) - 1;
            final int intValue = this.a.get(n2).intValue();
            if (n <= intValue) {
                break;
            }
            this.a.set(i, intValue);
            i = n2;
        }
        this.a.set(i, n);
    }
    
    public final void c(final g3u g3u) {
        this.a.add(g3u);
    }
    
    public final void d(final Path path) {
        int size = this.a.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final g3u g3u = this.a.get(n);
            final ThreadLocal<PathMeasure> a = mmw.a;
            size = n;
            if (g3u == null) {
                continue;
            }
            if (g3u.a) {
                size = n;
            }
            else {
                mmw.a(path, g3u.d.l() / 100.0f, g3u.e.l() / 100.0f, g3u.f.l() / 360.0f);
                size = n;
            }
        }
    }
    
    public final int e() {
        if (this.a.size() > 0) {
            final int intValue = this.a.get(0).intValue();
            while ((this.a.isEmpty() ^ true) && this.a.get(0).intValue() == intValue) {
                final List a = this.a;
                a.set(0, or4.O1(a));
                final List a2 = this.a;
                a2.remove(a2.size() - 1);
                final int size = this.a.size();
                final int size2 = this.a.size();
                int i = 0;
                while (i < size2 >>> 1) {
                    final int intValue2 = this.a.get(i).intValue();
                    final int n = (i + 1) * 2;
                    final int n2 = n - 1;
                    final int intValue3 = this.a.get(n2).intValue();
                    if (n < size) {
                        final int intValue4 = this.a.get(n).intValue();
                        if (intValue4 > intValue3) {
                            if (intValue4 > intValue2) {
                                this.a.set(i, intValue4);
                                this.a.set(n, intValue2);
                                i = n;
                                continue;
                            }
                            break;
                        }
                    }
                    if (intValue3 <= intValue2) {
                        break;
                    }
                    this.a.set(i, intValue3);
                    this.a.set(n2, intValue2);
                    i = n2;
                }
            }
            return intValue;
        }
        ea6.d("Set is empty".toString());
        throw null;
    }
}
