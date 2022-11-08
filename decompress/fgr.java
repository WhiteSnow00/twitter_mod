import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgr
{
    public static final js2<fgr, a> b;
    public final List<tgr> a;
    
    static {
        fgr.b = new fgr.fgr$b();
    }
    
    public fgr(final a a) {
        this.a = ced.g((List)a.a);
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        tfe.i("stickers");
        tfe.q0();
        for (final tgr tgr : this.a) {
            tfe.r0();
            tfe.i("sticker_details");
            Objects.requireNonNull(tgr);
            tfe.r0();
            tfe.W("sticker_id", tgr.a);
            tfe.h();
            tfe.h();
        }
        tfe.f();
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof fgr)) {
                return b2;
            }
            final fgr fgr = (fgr)o;
            final boolean b3 = this == fgr || (fgr != null && w4j.a((Object)this.a, (Object)fgr.a));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.q((List)this.a);
    }
    
    public static final class a extends h4j<fgr>
    {
        public List<tgr> a;
        
        public final Object i() {
            return new fgr(this);
        }
    }
}
