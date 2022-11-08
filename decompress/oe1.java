// 
// Decompiled by Procyon v0.6.0
// 

public final class oe1 implements rij
{
    public boolean C0;
    public ap6<? super oyv> D0;
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final Object a(final ap6<? super oyv> ap6) {
        Object o = null;
        Label_0047: {
            if (ap6 instanceof oe1$a) {
                final cp6 cp6 = (oe1$a)ap6;
                final int g0 = cp6.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    cp6.G0 = g0 + Integer.MIN_VALUE;
                    o = cp6;
                    break Label_0047;
                }
            }
            o = new cp6(ap6) {
                public oe1 C0;
                public ap6 D0;
                public /* synthetic */ Object E0;
                public final /* synthetic */ oe1 F0;
                public int G0;
                
                public final Object invokeSuspend(final Object e0) {
                    this.E0 = e0;
                    this.G0 |= Integer.MIN_VALUE;
                    return this.F0.a((ap6<? super oyv>)this);
                }
            };
        }
        final Object e0 = ((oe1$a)o).E0;
        final zy6 c0 = zy6.C0;
        final int g2 = ((oe1$a)o).G0;
        ap6 d0;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0 = ((oe1$a)o).D0;
            kq9.b1(e0);
        }
        else {
            kq9.b1(e0);
            if (this.C0) {
                return oyv.a;
            }
            final qoo d2 = this.D0;
            ((oe1$a)o).C0 = this;
            ((oe1$a)o).D0 = (ap6)d2;
            ((oe1$a)o).G0 = 1;
            final qoo d3 = new qoo(asy.Z((ap6)o));
            this.D0 = d3;
            if (d3.a() == c0) {
                return c0;
            }
            d0 = (ap6)d2;
        }
        if (d0 != null) {
            d0.resumeWith((Object)oyv.a);
        }
        return oyv.a;
    }
    
    public final void j(final sve sve) {
        if (!this.C0) {
            this.C0 = true;
            final qoo d0 = this.D0;
            if (d0 != null) {
                d0.resumeWith((Object)oyv.a);
            }
            this.D0 = null;
        }
    }
}
