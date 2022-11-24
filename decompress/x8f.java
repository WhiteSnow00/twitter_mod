import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x8f implements fw1
{
    public final int a;
    public final f9f b;
    
    public x8f(final f9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final f9f b = this.b;
                final wo8 wo8 = (wo8)o;
                final i6 i6 = (i6)o2;
                b.L0.K0.a(wo8.a);
                return;
            }
            case 1: {
                final f9f b2 = this.b;
                final oxj oxj = (oxj)o;
                final i6 i7 = (i6)o2;
                final o44 l0 = b2.L0;
                Objects.requireNonNull(l0);
                t8g.a("CM", "Chat State Changed: Connecting");
                l0.k1.k(j64.G0);
                return;
            }
            case 0: {
                final f9f b3 = this.b;
                final bi2 bi2 = (bi2)o;
                final i6 i8 = (i6)o2;
                b3.T0.J();
                b3.N0.h();
            }
        }
    }
}
