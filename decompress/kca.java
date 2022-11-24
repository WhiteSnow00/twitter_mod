// 
// Decompiled by Procyon v0.6.0
// 

public final class kca extends k5j
{
    public final int b;
    
    public kca(final int b) {
        this.b = b;
    }
    
    public final Object d(final rmp rmp, final int n) {
        switch (this.b) {
            default: {
                e0e.f((Object)rmp, "input");
                return new prg((x99)rmp.B((nmp)x99.Q0), rmp.z());
            }
            case 0: {
                e0e.f((Object)rmp, "input");
                final String c = rmp.C();
                e0e.e((Object)c, "input.readNotNullString()");
                final String c2 = rmp.C();
                e0e.e((Object)c2, "input.readNotNullString()");
                final String c3 = rmp.C();
                e0e.e((Object)c3, "input.readNotNullString()");
                final String c4 = rmp.C();
                e0e.e((Object)c4, "input.readNotNullString()");
                return new jca(c, c2, c3, c4);
            }
        }
    }
    
    public final void f(final smp smp, final Object o) {
        switch (this.b) {
            default: {
                final prg prg = (prg)o;
                e0e.f((Object)smp, "output");
                e0e.f((Object)prg, "mediaAttachment");
                smp.C((Object)prg.b, (nmp)x99.Q0);
                smp.z(prg.a);
                return;
            }
            case 0: {
                final ica ica = (ica)o;
                e0e.f((Object)smp, "output");
                e0e.f((Object)ica, "eventElementPrefix");
                smp.G(((jda)ica).b());
                smp.G(((qda)ica).d());
                smp.G(ica.a());
                smp.G(ica.c());
            }
        }
    }
}
