import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.n;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public interface tha extends xwt
{
    void a();
    
    boolean b(final long p0, final pa4 p1, final List<? extends fsg> p2);
    
    int c();
    
    void d();
    
    boolean e(final int p0, final long p1);
    
    boolean f(final int p0, final long p1);
    
    void h();
    
    void j(final float p0);
    
    Object k();
    
    void l();
    
    void n(final long p0, final long p1, final long p2, final List<? extends fsg> p3, final gsg[] p4);
    
    int p(final long p0, final List<? extends fsg> p1);
    
    int q();
    
    n r();
    
    int s();
    
    void t();
    
    public static final class a
    {
        public final swt a;
        public final int[] b;
        public final int c;
        
        public a(final swt a, final int... b) {
            this.a = a;
            this.b = b;
            this.c = 0;
        }
        
        public a(final swt a, final int[] b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface b
    {
        tha[] a(final a[] p0, final xh1 p1, final i$b p2, final e0 p3);
    }
}
