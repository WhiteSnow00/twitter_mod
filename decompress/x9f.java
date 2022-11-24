// 
// Decompiled by Procyon v0.6.0
// 

public final class x9f implements fw1
{
    public final int a;
    public final z9f b;
    
    public x9f(final z9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final z9f b = this.b;
                final qlw qlw = (qlw)o;
                final i6 i6 = (i6)o2;
                ((jkh)b.K0).j(qlw.a);
                return;
            }
            case 0: {
                final z9f b2 = this.b;
                final sm sm = (sm)o;
                final i6 i7 = (i6)o2;
                final aaf k0 = b2.K0;
                final String a = sm.a;
                if (!((jkh)k0).m()) {
                    ((jkh)k0).e.activeJuror(a);
                }
            }
        }
    }
}
