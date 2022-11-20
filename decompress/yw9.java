// 
// Decompiled by Procyon v0.6.0
// 

public final class yw9 implements h9j
{
    public final int D0;
    public final Object E0;
    
    public yw9(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void k(final d7j d7j) {
        switch (this.D0) {
            default: {
                final rmf rmf = (rmf)this.E0;
                czd.f((Object)rmf, "$listWrapper");
                final rlf$a rlf$a = new rlf$a(d7j);
                rmf.c((rmf$b)rlf$a);
                ((i6j$a)d7j).c((nf3)new k87((Object)rmf, (Object)rlf$a, 2));
                return;
            }
            case 0: {
                final ax9 ax9 = (ax9)this.E0;
                czd.f((Object)ax9, "this$0");
                final ax9$a ax9$a = new ax9$a(d7j);
                ax9.K0.setSpan((Object)ax9$a, ax9.I0.length(), ax9.J0.length() + ax9.I0.length(), 0);
                ((i6j$a)d7j).c((nf3)new k87((Object)ax9, (Object)ax9$a, 1));
            }
        }
    }
}
