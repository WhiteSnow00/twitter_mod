import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psx implements Runnable
{
    public final /* synthetic */ hnf C0;
    public final /* synthetic */ rsx D0;
    
    public psx(final rsx d0, final hnf c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        if (((zb)this.D0.S0).C0 instanceof zb$b) {
            return;
        }
        try {
            ((Future<Object>)this.C0).get();
            final y9g e = y9g.e();
            final String u0 = rsx.U0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Starting work for ");
            sb.append(this.D0.G0.c);
            e.a(u0, sb.toString());
            final rsx d0 = this.D0;
            d0.S0.q((hnf)d0.H0.d());
        }
        finally {
            final Throwable t;
            this.D0.S0.p(t);
        }
    }
}
