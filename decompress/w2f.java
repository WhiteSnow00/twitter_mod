import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w2f
{
    public final int a;
    public final s2f[] b;
    public final List<w8c> c;
    public final boolean d;
    public final int e;
    public final cwe f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    
    public w2f(int max, final s2f[] b, final List c, final boolean d, int i, final cwe f, int g, int length, final wg8 wg8) {
        this.a = max;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = i;
        this.f = f;
        this.g = g;
        this.h = length;
        length = b.length;
        g = 0;
        i = 0;
        max = 0;
        while (i < length) {
            max = Math.max(max, b[i].m);
            ++i;
        }
        this.i = max;
        max += this.g;
        if (max < 0) {
            max = g;
        }
        this.j = max;
    }
    
    public final List<eze> a(final int n, final int n2, final int n3) {
        final s2f[] b = this.b;
        final ArrayList list = new ArrayList(b.length);
        final int length = b.length;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < length) {
            final s2f s2f = b[i];
            final int n7 = (int)this.c.get(n4).a;
            int a;
            if (this.f == cwe.G0) {
                a = this.e - n5 - n7;
            }
            else {
                a = n5;
            }
            final boolean d = this.d;
            int a2;
            if (d) {
                a2 = this.a;
            }
            else {
                a2 = a;
            }
            if (!d) {
                a = this.a;
            }
            final eze a3 = s2f.a(n, n6, n2, n3, a2, a, this.i);
            n6 += s2f.d + this.h;
            n5 += n7;
            list.add((Object)a3);
            ++i;
            ++n4;
        }
        return (List<eze>)list;
    }
}
