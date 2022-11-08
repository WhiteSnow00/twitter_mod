import tv.periscope.model.chat.c$a;
import tv.periscope.model.chat.Message;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpo implements apo
{
    public apo C0;
    public ofl D0;
    
    public final void a(final String s, final String s2) {
        final apo c0 = this.C0;
        if (c0 != null) {
            c0.a(s, s2);
        }
        final ofl d0 = this.D0;
        if (d0 != null) {
            final hfv l = d0.l;
            if (l != null) {
                l.H1 = tdy.Y0(l.H1, 4);
                d0.h.onNext((Object)tib$a$d.a);
            }
        }
    }
    
    public final void c(final String s, final String s2, final String s3, final String s4, final Message message, final apo$a apo$a) {
        final apo c0 = this.C0;
        if (c0 != null) {
            c0.c(s, s2, s3, s4, message, apo$a);
        }
        final ofl d0 = this.D0;
        if (d0 != null) {
            final hfv l = d0.l;
            if (l != null) {
                d0.l.H1 = tdy.L0(tdy.Y0(tdy.Y0(l.H1, 1), 2048), 4);
                d0.h.onNext((Object)tib$a$a.a);
            }
        }
    }
    
    public final void d(final Message message, final c$a c$a, final String s) {
        final apo c0 = this.C0;
        if (c0 != null) {
            c0.d(message, c$a, s);
        }
    }
}
