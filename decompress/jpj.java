// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jpj
{
    public static final class a extends jpj
    {
        public final hzj a;
        
        public a(final hzj a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class b extends jpj
    {
        public final n5m a;
        
        public b(final n5m a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class c extends jpj
    {
        public final fko a;
        public final h50 b;
        
        public c(final fko a) {
            this.a = a;
            final float b = jy6.b(a.h);
            final float b2 = jy6.b(a.g);
            final boolean b3 = false;
            final boolean b4 = b == b2 && jy6.b(a.g) == jy6.b(a.f) && jy6.b(a.f) == jy6.b(a.e);
            final boolean b5 = jy6.c(a.h) == jy6.c(a.g) && jy6.c(a.g) == jy6.c(a.f) && jy6.c(a.f) == jy6.c(a.e);
            int n = b3 ? 1 : 0;
            if (b4) {
                n = (b3 ? 1 : 0);
                if (b5) {
                    n = 1;
                }
            }
            Object o;
            if (n == 0) {
                final hzj c = lr0.c();
                ((h50)c).k(a);
                o = c;
            }
            else {
                o = null;
            }
            this.b = (h50)o;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
