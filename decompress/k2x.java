import android.os.SystemClock;
import android.os.Handler;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public interface k2x
{
    void D0(final int p0, final long p1);
    
    void L0(final Object p0, final long p1);
    
    void N(final Exception p0);
    
    void V0(final n p0, final rc8 p1);
    
    @Deprecated
    void f1();
    
    void h1(final long p0, final int p1);
    
    void j(final x2x p0);
    
    void k(final String p0);
    
    void l(final String p0, final long p1, final long p2);
    
    void q0(final oc8 p0);
    
    void v0(final oc8 p0);
    
    public static final class a
    {
        public final Handler a;
        public final k2x b;
        
        public a(final Handler a, final k2x b) {
            this.a = a;
            this.b = b;
        }
        
        public final void a(final Object o) {
            if (this.a != null) {
                this.a.post((Runnable)new g2x((Object)this, o, SystemClock.elapsedRealtime(), 0));
            }
        }
    }
}
