import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zn9<T extends zn9<T>> implements b
{
    public static final zn9$b l;
    public static final zn9$c m;
    public static final zn9$d n;
    public static final zn9$e o;
    public static final zn9$f p;
    public static final zn9$a q;
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final q7b e;
    public boolean f;
    public float g;
    public long h;
    public float i;
    public final ArrayList<h> j;
    public final ArrayList<i> k;
    
    static {
        l = new zn9$b();
        m = new zn9$c();
        n = new zn9$d();
        o = new zn9$e();
        p = new zn9$f();
        q = new zn9$a();
    }
    
    public <K> zn9(final K d, final q7b q7b) {
        final q7b v0 = gu8.V0;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = -3.4028235E38f;
        this.h = 0L;
        this.j = new ArrayList<h>();
        this.k = new ArrayList<i>();
        this.d = d;
        this.e = v0;
        if (v0 != zn9.n && v0 != zn9.o && v0 != zn9.p) {
            if (v0 == zn9.q) {
                this.i = 0.00390625f;
            }
            else if (v0 != zn9.l && v0 != zn9.m) {
                this.i = 1.0f;
            }
            else {
                this.i = 0.00390625f;
            }
        }
        else {
            this.i = 0.1f;
        }
    }
    
    public static <T> void b(final ArrayList<T> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) == null) {
                list.remove(i);
            }
        }
    }
    
    @Override
    public final boolean a(long n) {
        final long h = this.h;
        final int n2 = 0;
        if (h == 0L) {
            this.h = n;
            this.c(this.b);
            return false;
        }
        final long n3 = n - h;
        this.h = n;
        final d5r d5r = (d5r)this;
        boolean b4 = false;
        Label_0425: {
            if (d5r.t) {
                final float s = d5r.s;
                if (s != Float.MAX_VALUE) {
                    d5r.r.i = s;
                    d5r.s = Float.MAX_VALUE;
                }
                ((zn9)d5r).b = (float)d5r.r.i;
                ((zn9)d5r).a = 0.0f;
                d5r.t = false;
            }
            else {
                if (d5r.s != Float.MAX_VALUE) {
                    final j5r r = d5r.r;
                    final double i = r.i;
                    final double n4 = ((zn9)d5r).b;
                    final double n5 = ((zn9)d5r).a;
                    n = n3 / 2L;
                    final g b = r.b(n4, n5, n);
                    final j5r r2 = d5r.r;
                    r2.i = d5r.s;
                    d5r.s = Float.MAX_VALUE;
                    final g b2 = r2.b((double)b.a, (double)b.b, n);
                    ((zn9)d5r).b = b2.a;
                    ((zn9)d5r).a = b2.b;
                }
                else {
                    final g b3 = d5r.r.b((double)((zn9)d5r).b, (double)((zn9)d5r).a, n3);
                    ((zn9)d5r).b = b3.a;
                    ((zn9)d5r).a = b3.b;
                }
                final float max = Math.max(((zn9)d5r).b, ((zn9)d5r).g);
                ((zn9)d5r).b = max;
                final float min = Math.min(max, Float.MAX_VALUE);
                ((zn9)d5r).b = min;
                final float a = ((zn9)d5r).a;
                final j5r r3 = d5r.r;
                Objects.requireNonNull(r3);
                if (Math.abs(a) >= r3.e || Math.abs(min - (float)r3.i) >= r3.d) {
                    b4 = false;
                    break Label_0425;
                }
                ((zn9)d5r).b = (float)d5r.r.i;
                ((zn9)d5r).a = 0.0f;
            }
            b4 = true;
        }
        final float min2 = Math.min(this.b, Float.MAX_VALUE);
        this.b = min2;
        this.c(this.b = Math.max(min2, this.g));
        if (b4) {
            this.f = false;
            final nb0 a2 = nb0.a();
            a2.a.remove((Object)this);
            final int index = a2.b.indexOf(this);
            if (index >= 0) {
                a2.b.set(index, null);
                a2.f = true;
            }
            this.h = 0L;
            this.c = false;
            for (int j = n2; j < this.j.size(); ++j) {
                if (this.j.get(j) != null) {
                    this.j.get(j).a();
                }
            }
            b(this.j);
        }
        return b4;
    }
    
    public final void c(final float n) {
        this.e.b(this.d, n);
        for (int i = 0; i < this.k.size(); ++i) {
            if (this.k.get(i) != null) {
                this.k.get(i).a();
            }
        }
        b(this.k);
    }
    
    public static final class g
    {
        public float a;
        public float b;
    }
    
    public interface h
    {
        void a();
    }
    
    public interface i
    {
        void a();
    }
    
    public abstract static class j extends q7b
    {
        public j(final String s) {
            super(s, 0);
        }
    }
}
