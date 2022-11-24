import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public interface tis
{
    public static final a Companion = a.a;
    
    float a();
    
    tis b(final ptb<? extends tis> p0);
    
    long c();
    
    tis d(final tis p0);
    
    wq2 e();
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public final tis a(final long n) {
            Objects.requireNonNull(sr4.Companion);
            Object a;
            if (n != sr4.g) {
                a = new hs4(n);
            }
            else {
                a = b.a;
            }
            return (tis)a;
        }
    }
    
    public static final class b implements tis
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        @Override
        public final float a() {
            return Float.NaN;
        }
        
        @Override
        public final tis b(final ptb ptb) {
            return i2f.d((tis)this, ptb);
        }
        
        @Override
        public final long c() {
            Objects.requireNonNull(sr4.Companion);
            return sr4.g;
        }
        
        @Override
        public final tis d(final tis tis) {
            return i2f.c((tis)this, tis);
        }
        
        @Override
        public final wq2 e() {
            return null;
        }
    }
}
