import java.util.ArrayList;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.List;
import com.google.android.exoplayer2.n;
import android.os.Looper;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o9h extends e implements Handler$Callback
{
    public final d9h O0;
    public final m9h P0;
    public final Handler Q0;
    public final h9h R0;
    public c9h S0;
    public boolean T0;
    public boolean U0;
    public long V0;
    public long W0;
    public x8h X0;
    
    public o9h(final m9h p2, final Looper looper) {
        final d9h$a a = d9h.a;
        super(5);
        this.P0 = p2;
        Handler q0;
        if (looper == null) {
            q0 = null;
        }
        else {
            final int a2 = imw.a;
            q0 = new Handler(looper, (Handler$Callback)this);
        }
        this.Q0 = q0;
        this.O0 = (d9h)a;
        this.R0 = new h9h();
        this.W0 = -9223372036854775807L;
    }
    
    @Override
    public final void C() {
        this.X0 = null;
        this.W0 = -9223372036854775807L;
        this.S0 = null;
    }
    
    @Override
    public final void E(final long n, final boolean b) {
        this.X0 = null;
        this.W0 = -9223372036854775807L;
        this.T0 = false;
        this.U0 = false;
    }
    
    @Override
    public final void I(final n[] array, final long n, final long n2) {
        this.S0 = this.O0.f(array[0]);
    }
    
    public final void K(final x8h x8h, final List<x8h$b> list) {
        int n = 0;
        while (true) {
            final x8h$b[] c0 = x8h.C0;
            if (n >= c0.length) {
                break;
            }
            final n r0 = c0[n].r0();
            if (r0 != null && this.O0.e(r0)) {
                final c9h f = this.O0.f(r0);
                final byte[] y3 = x8h.C0[n].y3();
                Objects.requireNonNull(y3);
                ((DecoderInputBuffer)this.R0).q();
                ((DecoderInputBuffer)this.R0).s(y3.length);
                final ByteBuffer e0 = ((DecoderInputBuffer)this.R0).E0;
                final int a = imw.a;
                e0.put(y3);
                ((DecoderInputBuffer)this.R0).t();
                final x8h o = f.o(this.R0);
                if (o != null) {
                    this.K(o, list);
                }
            }
            else {
                list.add(x8h.C0[n]);
            }
            ++n;
        }
    }
    
    public final boolean b() {
        return true;
    }
    
    public final int e(final n n) {
        if (this.O0.e(n)) {
            int n2;
            if (n.g1 == 0) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            return k1b.c(n2);
        }
        return k1b.c(0);
    }
    
    public final boolean f() {
        return this.U0;
    }
    
    public final String getName() {
        return "MetadataRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.P0.h((x8h)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final void v(final long n, final long n2) {
        int i = 1;
        while (i != 0) {
            if (!this.T0 && this.X0 == null) {
                ((DecoderInputBuffer)this.R0).q();
                final v53 b = this.B();
                final int j = this.J(b, (DecoderInputBuffer)this.R0, 0);
                if (j == -4) {
                    if (((vq2)this.R0).j(4)) {
                        this.T0 = true;
                    }
                    else {
                        final h9h r0 = this.R0;
                        r0.K0 = this.V0;
                        ((DecoderInputBuffer)r0).t();
                        final c9h s0 = this.S0;
                        final int a = imw.a;
                        final x8h o = s0.o(this.R0);
                        if (o != null) {
                            final ArrayList list = new ArrayList<x8h$b>(o.C0.length);
                            this.K(o, (List<x8h$b>)list);
                            if (!list.isEmpty()) {
                                this.X0 = new x8h((List)list);
                                this.W0 = ((DecoderInputBuffer)this.R0).G0;
                            }
                        }
                    }
                }
                else if (j == -5) {
                    final n n3 = (n)b.E0;
                    Objects.requireNonNull(n3);
                    this.V0 = n3.R0;
                }
            }
            final x8h x0 = this.X0;
            int n4;
            if (x0 != null && this.W0 <= n) {
                final Handler q0 = this.Q0;
                if (q0 != null) {
                    q0.obtainMessage(0, (Object)x0).sendToTarget();
                }
                else {
                    this.P0.h(x0);
                }
                this.X0 = null;
                this.W0 = -9223372036854775807L;
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            i = n4;
            if (this.T0) {
                i = n4;
                if (this.X0 != null) {
                    continue;
                }
                this.U0 = true;
                i = n4;
            }
        }
    }
}
