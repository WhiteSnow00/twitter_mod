import android.os.Handler;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public interface w3x
{
    void C0(final int p0, final long p1);
    
    void L0(final Object p0, final long p1);
    
    void M(final Exception p0);
    
    void V0(final n p0, final fd8 p1);
    
    @Deprecated
    void f1();
    
    void h1(final long p0, final int p1);
    
    void j(final j4x p0);
    
    void k(final String p0);
    
    void l(final String p0, final long p1, final long p2);
    
    void p0(final cd8 p0);
    
    void u0(final cd8 p0);
    
    public static final class a
    {
        public final Handler a;
        public final w3x b;
        
        public a(final Handler a, final w3x b) {
            this.a = a;
            this.b = b;
        }
    }
}
