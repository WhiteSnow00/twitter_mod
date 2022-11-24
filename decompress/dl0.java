// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dl0
{
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public dl0(final int a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = true;
    }
    
    public dl0(final int a, final String b, final String c, final int n, final boolean b2, final int n2, final wg8 wg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = true;
    }
    
    public String a() {
        return this.c;
    }
    
    public boolean b() {
        return this.d;
    }
    
    public int c() {
        return this.a;
    }
    
    public String d() {
        return this.b;
    }
    
    public static final class a extends dl0
    {
        public final int e;
        public final String f;
        public final String g;
        public final int h;
        public final int i;
        
        public a(final int e, final String f, final String g, final int h, final int i) {
            e0e.f((Object)f, "name");
            e0e.f((Object)g, "activityName");
            super(e, f, g, h, true, i, null);
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final String a() {
            return this.g;
        }
        
        @Override
        public final int c() {
            return this.e;
        }
        
        @Override
        public final String d() {
            return this.f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.e == a.e && e0e.a((Object)this.f, (Object)a.f) && e0e.a((Object)this.g, (Object)a.g) && this.h == a.h && this.i == a.i;
        }
        
        @Override
        public final int hashCode() {
            return (brg.d(this.g, brg.d(this.f, this.e * 31, 31), 31) + this.h) * 31 + this.i;
        }
        
        @Override
        public final String toString() {
            final int e = this.e;
            final String f = this.f;
            final String g = this.g;
            final int h = this.h;
            final int i = this.i;
            final StringBuilder f2 = awg.f("Permanent(id=", e, ", name=", f, ", activityName=");
            m51.z(f2, g, ", iconResourceId=", h, ", contentDescriptionResId=");
            return ad.y(f2, i, ")");
        }
    }
    
    public static final class b extends dl0
    {
        public final int e;
        public final String f;
        public final String g;
        public final int h;
        public final long i;
        public final long j;
        public final int k;
        public final boolean l;
        
        public b(final int e, final String f, final String g, final int h, final long i, final long j, final int k, final boolean l) {
            e0e.f((Object)f, "name");
            e0e.f((Object)g, "activityName");
            super(e, f, g);
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        @Override
        public final String a() {
            return this.g;
        }
        
        @Override
        public final boolean b() {
            final boolean l = this.l;
            boolean b = true;
            if (!l) {
                final long i = this.i;
                final long j = this.j;
                final g5s a = nq1.a;
                final long currentTimeMillis = System.currentTimeMillis();
                b = (i <= currentTimeMillis && currentTimeMillis <= j && b);
            }
            return b;
        }
        
        @Override
        public final int c() {
            return this.e;
        }
        
        @Override
        public final String d() {
            return this.f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.e == b.e && e0e.a((Object)this.f, (Object)b.f) && e0e.a((Object)this.g, (Object)b.g) && this.h == b.h && this.i == b.i && this.j == b.j && this.k == b.k && this.l == b.l;
        }
        
        @Override
        public final int hashCode() {
            final int d = brg.d(this.g, brg.d(this.f, this.e * 31, 31), 31);
            final int h = this.h;
            final long i = this.i;
            final int n = (int)(i ^ i >>> 32);
            final long j = this.j;
            final int n2 = (int)(j ^ j >>> 32);
            final int k = this.k;
            int l;
            if ((l = (this.l ? 1 : 0)) != 0) {
                l = 1;
            }
            return ((((d + h) * 31 + n) * 31 + n2) * 31 + k) * 31 + l;
        }
        
        @Override
        public final String toString() {
            final int e = this.e;
            final String f = this.f;
            final String g = this.g;
            final int h = this.h;
            final long i = this.i;
            final long j = this.j;
            final int k = this.k;
            final boolean l = this.l;
            final StringBuilder f2 = awg.f("Seasonal(id=", e, ", name=", f, ", activityName=");
            m51.z(f2, g, ", iconResourceId=", h, ", startDateMillis=");
            f2.append(i);
            po.E(f2, ", endDateMillis=", j, ", contentDescriptionResId=");
            f2.append(k);
            f2.append(", alwaysEnable=");
            f2.append(l);
            f2.append(")");
            return f2.toString();
        }
    }
}
