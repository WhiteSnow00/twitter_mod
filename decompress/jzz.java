import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzz implements Runnable
{
    public final int D0;
    public final Object E0;
    
    public jzz(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final f000 d = f000.d((Context)this.E0);
                synchronized (d) {
                    d.f = true;
                    d.b();
                    return;
                }
                break;
            }
            case 0: {
                final fol fol = (fol)this.E0;
                final nx1 j = idy.j;
                final nrz e0 = fvz.E0;
                fol.a(j, (List)swz.G0);
            }
        }
    }
}
