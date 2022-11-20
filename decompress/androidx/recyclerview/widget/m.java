// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public final class m
{
    public static final Comparator<c> a;
    
    static {
        m.a = new Comparator<c>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((c)o).a - ((c)o2).a;
            }
        };
    }
    
    public static d a(final b b, final boolean b2) {
        final int e = b.e();
        final int d = b.d();
        final ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(new g(e, d));
        final int n = (e + d + 1) / 2 * 2 + 1;
        final int[] array = new int[n];
        final int n2 = n / 2;
        final int[] array2 = new int[n];
        ArrayList list3 = new ArrayList();
        while (!list2.isEmpty()) {
            final g g = list2.remove(list2.size() - 1);
            final int b3 = g.b;
            final int a = g.a;
            final int n3 = b3 - a;
            ArrayList list4 = list3;
            ArrayList list5 = list2;
            g g2 = g;
            h h = null;
            g g3 = null;
            Label_0957: {
                if (n3 >= 1) {
                    final int n4 = g.d - g.c;
                    if (n4 < 1) {
                        list4 = list3;
                        list5 = list2;
                        g2 = g;
                    }
                    else {
                        final int n5 = (n4 + n3 + 1) / 2;
                        final int n6 = 1 + n2;
                        array[n6] = a;
                        array2[n6] = b3;
                        int n7 = 0;
                    Label_0204:
                        while (true) {
                            list4 = list3;
                            list5 = list2;
                            g2 = g;
                            if (n7 < n5) {
                                final boolean b4 = Math.abs(g.b - g.a - (g.d - g.c)) % 2 == 1;
                                final int b5 = g.b;
                                final int a2 = g.a;
                                final int d2 = g.d;
                                final int c = g.c;
                                int i;
                                final int n8 = i = -n7;
                                final boolean b6 = b4;
                                while (true) {
                                    while (i <= n7) {
                                        int a3;
                                        int c2;
                                        if (i != n8 && (i == n7 || array[i + 1 + n2] <= array[i - 1 + n2])) {
                                            a3 = array[i - 1 + n2];
                                            c2 = a3 + 1;
                                        }
                                        else {
                                            a3 = (c2 = array[i + 1 + n2]);
                                        }
                                        int d3 = c2 - g.a + g.c - i;
                                        int b7;
                                        if (n7 != 0 && c2 == a3) {
                                            b7 = d3 - 1;
                                        }
                                        else {
                                            b7 = d3;
                                        }
                                        while (c2 < g.b && d3 < g.d && b.b(c2, d3)) {
                                            ++c2;
                                            ++d3;
                                        }
                                        array[i + n2] = c2;
                                        if (b6) {
                                            final int n9 = b5 - a2 - (d2 - c) - i;
                                            if (n9 >= n8 + 1 && n9 <= n7 - 1 && array2[n9 + n2] <= c2) {
                                                h = new h();
                                                h.a = a3;
                                                h.b = b7;
                                                h.c = c2;
                                                h.d = d3;
                                                h.e = false;
                                                if (h != null) {
                                                    g3 = g;
                                                    break Label_0957;
                                                }
                                                final int n10 = g.b - g.a - (g.d - g.c);
                                                final boolean b8 = n10 % 2 == 0;
                                                while (true) {
                                                    for (int j = n8; j <= n7; j += 2) {
                                                        int c3;
                                                        int a4;
                                                        if (j != n8 && (j == n7 || array2[j + 1 + n2] >= array2[j - 1 + n2])) {
                                                            c3 = array2[j - 1 + n2];
                                                            a4 = c3 - 1;
                                                        }
                                                        else {
                                                            c3 = (a4 = array2[j + 1 + n2]);
                                                        }
                                                        int b9 = g.d - (g.b - a4 - j);
                                                        int d4;
                                                        if (n7 != 0 && a4 == c3) {
                                                            d4 = b9 + 1;
                                                        }
                                                        else {
                                                            d4 = b9;
                                                        }
                                                        while (a4 > g.a && b9 > g.c) {
                                                            final int n11 = a4 - 1;
                                                            final int n12 = b9 - 1;
                                                            if (!b.b(n11, n12)) {
                                                                break;
                                                            }
                                                            a4 = n11;
                                                            b9 = n12;
                                                        }
                                                        array2[j + n2] = a4;
                                                        if (b8) {
                                                            final int n13 = n10 - j;
                                                            if (n13 >= n8 && n13 <= n7 && array[n13 + n2] >= a4) {
                                                                h = new h();
                                                                h.a = a4;
                                                                h.b = b9;
                                                                h.c = c3;
                                                                h.d = d4;
                                                                h.e = true;
                                                                if (h != null) {
                                                                    g3 = g;
                                                                    break Label_0957;
                                                                }
                                                                ++n7;
                                                                continue Label_0204;
                                                            }
                                                        }
                                                    }
                                                    h = null;
                                                    continue;
                                                }
                                            }
                                        }
                                        i += 2;
                                    }
                                    h = null;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                list3 = list4;
                list2 = list5;
                final h h2 = null;
                g3 = g2;
                h = h2;
            }
            if (h != null) {
                if (h.a() > 0) {
                    final int d5 = h.d;
                    final int b10 = h.b;
                    final int n14 = d5 - b10;
                    final int c4 = h.c;
                    final int a5 = h.a;
                    final int n15 = c4 - a5;
                    c c5;
                    if (n14 != n15) {
                        if (h.e) {
                            c5 = new c(a5, b10, h.a());
                        }
                        else if (n14 > n15) {
                            c5 = new c(a5, b10 + 1, h.a());
                        }
                        else {
                            c5 = new c(a5 + 1, b10, h.a());
                        }
                    }
                    else {
                        c5 = new c(a5, b10, n15);
                    }
                    list.add(c5);
                }
                g g4;
                if (list3.isEmpty()) {
                    g4 = new g();
                }
                else {
                    g4 = list3.remove(list3.size() - 1);
                }
                g4.a = g3.a;
                g4.c = g3.c;
                g4.b = h.a;
                g4.d = h.b;
                list2.add(g4);
                g3.b = g3.b;
                g3.d = g3.d;
                g3.a = h.c;
                g3.c = h.d;
                list2.add(g3);
            }
            else {
                list3.add(g3);
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)m.a);
        return new d(b, list, array, array2, b2);
    }
    
    public abstract static class b
    {
        public abstract boolean a(final int p0, final int p1);
        
        public abstract boolean b(final int p0, final int p1);
        
        public Object c(final int n, final int n2) {
            return null;
        }
        
        public abstract int d();
        
        public abstract int e();
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final int c;
        
        public c(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class d
    {
        public final List<c> a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;
        
        public d(final b d, final List<c> a, final int[] b, final int[] c, final boolean g) {
            this.a = a;
            this.b = b;
            this.c = c;
            Arrays.fill(b, 0);
            Arrays.fill(c, 0);
            this.d = d;
            final int e = d.e();
            this.e = e;
            final int d2 = d.d();
            this.f = d2;
            this.g = g;
            c c2;
            if (a.isEmpty()) {
                c2 = null;
            }
            else {
                c2 = a.get(0);
            }
            if (c2 == null || c2.a != 0 || c2.b != 0) {
                a.add(0, new c(0, 0, 0));
            }
            a.add(new c(e, d2, 0));
            for (final c c3 : a) {
                for (int i = 0; i < c3.c; ++i) {
                    final int n = c3.a + i;
                    final int n2 = c3.b + i;
                    int n3;
                    if (this.d.a(n, n2)) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                    }
                    this.b[n] = (n2 << 4 | n3);
                    this.c[n2] = (n << 4 | n3);
                }
            }
            if (this.g) {
                final Iterator<c> iterator2 = this.a.iterator();
                int n4 = 0;
                while (iterator2.hasNext()) {
                    final c c4 = iterator2.next();
                    int n5 = n4;
                    int a2;
                    while (true) {
                        a2 = c4.a;
                        if (n5 >= a2) {
                            break;
                        }
                        Label_0476: {
                            if (this.b[n5] == 0) {
                                final int size = this.a.size();
                                int j = 0;
                                int n6 = 0;
                                while (j < size) {
                                    final c c5 = this.a.get(j);
                                    while (true) {
                                        final int b2 = c5.b;
                                        if (n6 >= b2) {
                                            n6 = c5.c + b2;
                                            ++j;
                                            break;
                                        }
                                        if (this.c[n6] == 0 && this.d.b(n5, n6)) {
                                            int n7;
                                            if (this.d.a(n5, n6)) {
                                                n7 = 8;
                                            }
                                            else {
                                                n7 = 4;
                                            }
                                            this.b[n5] = (n6 << 4 | n7);
                                            this.c[n6] = (n7 | n5 << 4);
                                            break Label_0476;
                                        }
                                        ++n6;
                                    }
                                }
                            }
                        }
                        ++n5;
                    }
                    n4 = c4.c + a2;
                }
            }
        }
        
        public static f c(final Collection<f> collection, final int n, final boolean b) {
            final Iterator<f> iterator = collection.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    final f f = iterator.next();
                    if (f.a == n && f.c == b) {
                        iterator.remove();
                        while (iterator.hasNext()) {
                            final f f2 = iterator.next();
                            if (b) {
                                --f2.b;
                            }
                            else {
                                ++f2.b;
                            }
                        }
                        return f;
                    }
                }
                final f f = null;
                continue;
            }
        }
        
        public final void a(final bmf bmf) {
            qs1 qs1;
            if (bmf instanceof qs1) {
                qs1 = (qs1)bmf;
            }
            else {
                qs1 = new qs1(bmf);
            }
            int e = this.e;
            final ArrayDeque<f> arrayDeque = new ArrayDeque<f>();
            int n = this.e;
            int n2 = this.f;
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final c c = this.a.get(i);
                final int a = c.a;
                final int c2 = c.c;
                final int b = c.b;
                int n3 = n;
                int n4 = e;
                int n5;
                int j;
                while (true) {
                    n5 = 0;
                    e = n4;
                    j = n2;
                    if (n3 <= a + c2) {
                        break;
                    }
                    final int n6 = n3 - 1;
                    final int n7 = this.b[n6];
                    if ((n7 & 0xC) != 0x0) {
                        final int n8 = n7 >> 4;
                        final f c3 = c(arrayDeque, n8, false);
                        if (c3 != null) {
                            final int n9 = n4 - c3.b - 1;
                            qs1.d(n6, n9);
                            n3 = n6;
                            if ((n7 & 0x4) == 0x0) {
                                continue;
                            }
                            qs1.c(n9, 1, this.d.c(n6, n8));
                            n3 = n6;
                        }
                        else {
                            arrayDeque.add(new f(n6, n4 - n6 - 1, true));
                            n3 = n6;
                        }
                    }
                    else {
                        qs1.b(n6, 1);
                        --n4;
                        n3 = n6;
                    }
                }
                while (j > b + c2) {
                    final int n10 = j - 1;
                    final int n11 = this.c[n10];
                    if ((n11 & 0xC) != 0x0) {
                        final int n12 = n11 >> 4;
                        final f c4 = c(arrayDeque, n12, true);
                        if (c4 == null) {
                            arrayDeque.add(new f(n10, e - n3, false));
                            j = n10;
                        }
                        else {
                            qs1.d(e - c4.b - 1, n3);
                            j = n10;
                            if ((n11 & 0x4) == 0x0) {
                                continue;
                            }
                            qs1.c(n3, 1, this.d.c(n12, n10));
                            j = n10;
                        }
                    }
                    else {
                        qs1.a(n3, 1);
                        ++e;
                        j = n10;
                    }
                }
                int a2 = c.a;
                int b2 = c.b;
                for (int k = n5; k < c.c; ++k) {
                    if ((this.b[a2] & 0xF) == 0x2) {
                        qs1.c(a2, 1, this.d.c(a2, b2));
                    }
                    ++a2;
                    ++b2;
                }
                n = c.a;
                n2 = c.b;
            }
            qs1.e();
        }
        
        public final void b(final RecyclerView$e recyclerView$e) {
            this.a((bmf)new androidx.recyclerview.widget.b(recyclerView$e));
        }
    }
    
    public abstract static class e<T>
    {
        public abstract boolean a(final T p0, final T p1);
        
        public abstract boolean b(final T p0, final T p1);
    }
    
    public static final class f
    {
        public int a;
        public int b;
        public boolean c;
        
        public f(final int a, final int b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class g
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public g() {
        }
        
        public g(final int b, final int d) {
            this.a = 0;
            this.b = b;
            this.c = 0;
            this.d = d;
        }
    }
    
    public static final class h
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        
        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }
}
