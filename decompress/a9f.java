import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a9f implements fw1
{
    public final int a;
    public final f9f b;
    
    public a9f(final f9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final f9f b = this.b;
                final mkh mkh = (mkh)o;
                final i6 i6 = (i6)o2;
                b.L0.M(((l7h)mkh).a);
                return;
            }
            case 1: {
                final f9f b2 = this.b;
                final rbm rbm = (rbm)o;
                final i6 i7 = (i6)o2;
                b2.L0.Y();
                return;
            }
            case 0: {
                final f9f b3 = this.b;
                final yxj yxj = (yxj)o;
                final i6 i8 = (i6)o2;
                Objects.requireNonNull(b3);
                final boolean b4 = yxj.d ^ true;
                if (!b4 || yxj.c) {
                    b3.O0.d(b3.P0.a(), yxj.a, yxj.b, b4);
                }
            }
        }
    }
}
