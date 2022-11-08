// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vuu
{
    public final int a;
    public final long b;
    
    public vuu(final int a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof vuu)) {
            return false;
        }
        final vuu vuu = (vuu)o;
        if (this.a != vuu.a || this.b != vuu.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
    
    public static final class a extends vuu
    {
        public a(final long n, final boolean b) {
            super(4, n);
        }
    }
    
    public static final class b extends vuu
    {
        public final Exception c;
        
        public b(final long n, final boolean b, final Exception c) {
            super(3, n);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b2 = (b)o;
            if (!super.equals(b2) || !w4j.a((Object)this.c, (Object)b2.c)) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return w4j.g((Object)super.hashCode(), (Object)this.c);
        }
    }
    
    public static final class c extends vuu
    {
        public c(final long n, final boolean b) {
            super(0, n);
        }
    }
    
    public static final class d extends vuu
    {
        public d(final long n, final boolean b) {
            super(1, n);
        }
    }
    
    public static final class e extends vuu
    {
        public final long c;
        public mg3 d;
        
        public e(final long n, final mg3 d, final boolean b) {
            final long a = d.a(false);
            super(2, n);
            this.c = a;
            this.d = d;
        }
        
        public e(final long n, final boolean b) {
            super(2, n);
            this.c = -1L;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            if (!super.equals(e) || this.c != e.c || this.d != e.d) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return w4j.h((Object)super.hashCode(), (Object)this.c, (Object)this.d);
        }
    }
}
