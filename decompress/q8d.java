import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8d
{
    public static final b Companion;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final rpw f;
    public final long g;
    public final int h;
    public final boolean i;
    
    static {
        Companion = new b();
    }
    
    public q8d(final String a, final float b, final float c, final float d, final float e, final rpw f, final long g, final int h, final boolean i) {
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
        if (!(o instanceof q8d)) {
            return false;
        }
        final String a = this.a;
        final q8d q8d = (q8d)o;
        return czd.a((Object)a, (Object)q8d.a) && m89.b(this.b, q8d.b) && m89.b(this.c, q8d.c) && this.d == q8d.d && this.e == q8d.e && czd.a((Object)this.f, (Object)q8d.f) && nq4.c(this.g, q8d.g) && this.h == q8d.h && this.i == q8d.i;
    }
    
    @Override
    public final int hashCode() {
        final int j = ze.j(this.g, (this.f.hashCode() + c0.g(this.e, c0.g(this.d, c0.g(this.c, c0.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        final int h = this.h;
        int n;
        if (this.i) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (j + h) * 31 + n;
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
        public q8d.a.a j;
        public boolean k;
        
        public a(final String s) {
            Objects.requireNonNull(nq4.Companion);
            final long g = nq4.g;
            Objects.requireNonNull(i12.Companion);
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
            (this.i = new ArrayList()).add(this.j = new q8d.a.a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023));
        }
        
        public static q8d.a c(final q8d.a a, final List list, final fq2 fq2) {
            a.b(list, 0, "", fq2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
            return a;
        }
        
        public final q8d.a a(final String s, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final List<? extends vzj> list) {
            czd.f((Object)s, "name");
            czd.f((Object)list, "clipPathData");
            this.g();
            this.i.add(new q8d.a.a(s, n, n2, n3, n4, n5, n6, n7, list, 512));
            return this;
        }
        
        public final q8d.a b(final List<? extends vzj> list, final int n, final String s, final fq2 fq2, final float n2, final fq2 fq3, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8, final float n9, final float n10) {
            czd.f((Object)list, "pathData");
            czd.f((Object)s, "name");
            this.g();
            final ArrayList i = this.i;
            ((q8d.a.a)i.get(i.size() - 1)).j.add((tpw)new zpw(s, (List)list, n, fq2, n2, fq3, n3, n4, n5, n6, n7, n8, n9, n10, (rf8)null));
            return this;
        }
        
        public final rpw d(final q8d.a.a a) {
            return new rpw(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j);
        }
        
        public final q8d e() {
            this.g();
            while (this.i.size() > 1) {
                this.f();
            }
            final q8d q8d = new q8d(this.a, this.b, this.c, this.d, this.e, this.d(this.j), this.f, this.g, this.h);
            this.k = true;
            return q8d;
        }
        
        public final q8d.a f() {
            this.g();
            final ArrayList i = this.i;
            final q8d.a.a a = i.remove(i.size() - 1);
            final ArrayList j = this.i;
            ((q8d.a.a)j.get(j.size() - 1)).j.add(this.d(a));
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
            public List<? extends vzj> i;
            public List<tpw> j;
            
            public a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
            
            public a(String a, float b, float c, float d, float e, float f, float g, float h, List d2, final int n) {
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
                    final int a2 = spw.a;
                    d2 = f2a.D0;
                }
                List<tpw> j;
                if ((n & 0x200) != 0x0) {
                    j = new ArrayList<tpw>();
                }
                else {
                    j = null;
                }
                czd.f((Object)a, "name");
                czd.f((Object)d2, "clipPathData");
                czd.f((Object)j, "children");
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
                this.h = h;
                this.i = (List<? extends vzj>)d2;
                this.j = j;
            }
        }
    }
    
    public static final class b
    {
    }
}
