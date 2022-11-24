// 
// Decompiled by Procyon v0.6.0
// 

public final class js extends zhk
{
    public final long G0;
    public final kl6 H0;
    
    public js(final kl6 h0, final long g0, final f63 f63) {
        super(f63);
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void i(final boolean b, final btc btc) {
        if (b) {
            this.H0.a.i().c("previous_attempt_contacts_reupload_after_ms", this.G0).e();
        }
        super.i(b, btc);
    }
}
