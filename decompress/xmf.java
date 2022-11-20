import java.util.Iterator;
import com.twitter.media.transcode.TranscoderException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xmf implements Runnable
{
    public final int D0;
    public final int E0;
    public final Object F0;
    public final Object G0;
    
    public xmf(final CopyOnWriteArraySet f0, final int e0, final ymf$a g0) {
        this.D0 = 0;
        this.F0 = f0;
        this.E0 = e0;
        this.G0 = g0;
    }
    
    public xmf(final mw0 f0, final nwt g0, final int e0) {
        this.D0 = 1;
        this.F0 = f0;
        this.G0 = g0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final mw0 mw0 = (mw0)this.F0;
                final nwt nwt = (nwt)this.G0;
                final int e0 = this.E0;
                Objects.requireNonNull(mw0);
                try {
                    nwt.d(e0);
                    final nw0 b = mw0.b;
                    b.a.onNext((Object)b.g);
                    final nw0 b2 = mw0.b;
                    b2.b.onNext((Object)b2.m.f());
                }
                catch (final TranscoderException ex) {
                    mw0.b.g((Exception)ex);
                }
                return;
            }
            case 0: {
                final CopyOnWriteArraySet set = (CopyOnWriteArraySet)this.F0;
                final int e2 = this.E0;
                final ymf$a ymf$a = (ymf$a)this.G0;
                for (final ymf$c ymf$c : set) {
                    if (!ymf$c.d) {
                        if (e2 != -1) {
                            ymf$c.b.a(e2);
                        }
                        ymf$c.c = true;
                        ymf$a.invoke(ymf$c.a);
                    }
                }
            }
        }
    }
}
