import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9d
{
    public static final b Companion;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final gqw f;
    public final long g;
    public final int h;
    public final boolean i;
    
    static {
        Companion = new b();
    }
    
    public r9d(final String a, final float b, final float c, final float d, final float e, final gqw f, final long g, final int h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r9d)) {
            return false;
        }
        final String a = this.a;
        final r9d r9d = (r9d)o;
        return e0e.a((Object)a, (Object)r9d.a) && s99.b(this.b, r9d.b) && s99.b(this.c, r9d.c) && this.d == r9d.d && this.e == r9d.e && e0e.a((Object)this.f, (Object)r9d.f) && sr4.c(this.g, r9d.g) && this.h == r9d.h && this.i == r9d.i;
    }
    
    @Override
    public final int hashCode() {
        final int h = go0.h(this.g, (this.f.hashCode() + dn.g(this.e, dn.g(this.d, dn.g(this.c, dn.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        final int h2 = this.h;
        int n;
        if (this.i) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (h + h2) * 31 + n;
    }
    
    public static final class a
    {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public r9d.a.a j;
        public boolean k;
        
        public a(final String s) {
            Objects.requireNonNull(sr4.Companion);
            final long g = sr4.g;
            Objects.requireNonNull(q12.Companion);
            this(s, 24.0f, 24.0f, 24.0f, 24.0f, g, 5, false);
        }
        
        public a(final String a, final float b, final float c, final float d, final float e, final long f, final int g, final boolean h) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            (this.i = new ArrayList()).add(this.j = new r9d.a.a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023));
        }
        
        public static r9d.a c(final r9d.a a, final List list, final wq2 wq2) {
            a.b(list, 0, "", wq2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
            return a;
        }
        
        public final r9d.a a(final String s, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final List<? extends m0k> list) {
            e0e.f((Object)s, "name");
            e0e.f((Object)list, "clipPathData");
            this.g();
            this.i.add(new r9d.a.a(s, n, n2, n3, n4, n5, n6, n7, list, 512));
            return this;
        }
        
        public final r9d.a b(final List<? extends m0k> list, final int n, final String s, final wq2 wq2, final float n2, final wq2 wq3, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8, final float n9, final float n10) {
            e0e.f((Object)list, "pathData");
            e0e.f((Object)s, "name");
            this.g();
            final ArrayList i = this.i;
            ((r9d.a.a)i.get(i.size() - 1)).j.add((iqw)new oqw(s, (List)list, n, wq2, n2, wq3, n3, n4, n5, n6, n7, n8, n9, n10, (wg8)null));
            return this;
        }
        
        public final gqw d(final r9d.a.a a) {
            return new gqw(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j);
        }
        
        public final r9d e() {
            this.g();
            while (this.i.size() > 1) {
                this.f();
            }
            final r9d r9d = new r9d(this.a, this.b, this.c, this.d, this.e, this.d(this.j), this.f, this.g, this.h);
            this.k = true;
            return r9d;
        }
        
        public final r9d.a f() {
            this.g();
            final ArrayList i = this.i;
            final r9d.a.a a = i.remove(i.size() - 1);
            final ArrayList j = this.i;
            ((r9d.a.a)j.get(j.size() - 1)).j.add(this.d(a));
            return this;
        }
        
        public final void g() {
            if (this.k ^ true) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
        
        public static final class a
        {
            public String a;
            public float b;
            public float c;
            public float d;
            public float e;
            public float f;
            public float g;
            public float h;
            public List<? extends m0k> i;
            public List<iqw> j;
            
            public a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
            
            public a(String a, float b, float c, float d, float e, float f, float g, float h, List f2, final int n) {
                if ((n & 0x1) != 0x0) {
                    a = "";
                }
                if ((n & 0x2) != 0x0) {
                    b = 0.0f;
                }
                if ((n & 0x4) != 0x0) {
                    c = 0.0f;
                }
                if ((n & 0x8) != 0x0) {
                    d = 0.0f;
                }
                if ((n & 0x10) != 0x0) {
                    e = 1.0f;
                }
                if ((n & 0x20) != 0x0) {
                    f = 1.0f;
                }
                if ((n & 0x40) != 0x0) {
                    g = 0.0f;
                }
                if ((n & 0x80) != 0x0) {
                    h = 0.0f;
                }
                if ((n & 0x100) != 0x0) {
                    final int a2 = hqw.a;
                    f2 = h3a.F0;
                }
                List<iqw> j;
                if ((n & 0x200) != 0x0) {
                    j = new ArrayList<iqw>();
                }
                else {
                    j = null;
                }
                e0e.f((Object)a, "name");
                e0e.f((Object)f2, "clipPathData");
                e0e.f((Object)j, "children");
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
                this.h = h;
                this.i = (List<? extends m0k>)f2;
                this.j = j;
            }
        }
    }
    
    public static final class b
    {
    }
}
