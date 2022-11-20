import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahr
{
    public static final zr2<ahr, ahr.ahr$a> b;
    public final List<nhr> a;
    
    static {
        ahr.b = new ahr.ahr$b();
    }
    
    public ahr(final ahr.ahr$a ahr$a) {
        this.a = gdd.g(ahr$a.a);
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        afe.i("stickers");
        afe.p0();
        for (final nhr nhr : this.a) {
            afe.q0();
            afe.i("sticker_details");
            Objects.requireNonNull(nhr);
            afe.q0();
            afe.V("sticker_id", nhr.a);
            afe.h();
            afe.h();
        }
        afe.f();
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof ahr)) {
                return b2;
            }
            final ahr ahr = (ahr)o;
            final boolean b3 = this == ahr || (ahr != null && c5j.a((Object)this.a, (Object)ahr.a));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return c5j.q((List)this.a);
    }
}
