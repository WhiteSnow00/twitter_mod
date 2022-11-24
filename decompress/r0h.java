import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.j$a;
import com.twitter.media.transcode.TranscoderException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r0h implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public r0h(final Object g0, final Object h0, final Object i0, final Object j0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final btg[] array = (btg[])this.G0;
                final qyt qyt = (qyt)this.H0;
                final pyt pyt = (pyt)this.I0;
                final TranscoderException[] array2 = (TranscoderException[])this.J0;
                final int v = b51.v;
                try {
                    Object o;
                    if ("audio/raw".equals(qyt.h())) {
                        o = new lz0(pyt);
                    }
                    else {
                        o = new yy0(qyt, pyt);
                    }
                    array[0] = (btg)o;
                }
                catch (final TranscoderException ex) {
                    array2[0] = ex;
                }
                return;
            }
            case 0: {
                final j$a j$a = (j$a)this.G0;
                ((j)this.H0).l(j$a.a, j$a.b, (c3g)this.I0, (axg)this.J0);
            }
        }
    }
}
