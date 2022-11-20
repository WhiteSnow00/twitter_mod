import tv.periscope.model.chat.c$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9f implements xv1
{
    public final int a;
    public final c9f b;
    
    public b9f(final c9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final c9f b = this.b;
                final shx shx = (shx)o;
                final j6 j6 = (j6)o2;
                final d9f i0 = b.I0;
                final String a = shx.a;
                final c$e b2 = shx.b;
                if (!((ujh)i0).m()) {
                    ((ujh)i0).e.vote(a, b2);
                }
                return;
            }
            case 0: {
                final c9f b3 = this.b;
                final yjc yjc = (yjc)o;
                final j6 j7 = (j6)o2;
                final d9f i2 = b3.I0;
                ((ujh)i2).c.N();
                i2.i = false;
            }
        }
    }
}
