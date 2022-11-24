import java.util.Iterator;
import tv.periscope.model.chat.Message;
import tv.periscope.chatman.api.Occupant;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c9f implements fw1
{
    public final int a;
    public final f9f b;
    
    public c9f(final f9f b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final f9f b = this.b;
                final cex cex = (cex)o;
                final i6 i6 = (i6)o2;
                final o44 l0 = b.L0;
                final Message a = ((l7h)cex).a;
                l0.K0.f();
                return;
            }
            case 1: {
                final f9f b2 = this.b;
                final tbe tbe = (tbe)o;
                final i6 i7 = (i6)o2;
                final o44 l2 = b2.L0;
                l2.N0.c(l2.p1);
                return;
            }
            case 0: {
                final f9f b3 = this.b;
                final scj scj = (scj)o;
                final i6 i8 = (i6)o2;
                Objects.requireNonNull(b3);
                if (scj.b) {
                    b3.O0.p(xof.f(b3.P0).j0(), b3.P0.a(), (List)scj.a);
                    for (final Occupant occupant : scj.a) {
                        if (occupant.following || b3.O0.z(occupant.userId, occupant.twitterId)) {
                            b3.N0.l(occupant.userId, occupant.profileImageUrl, occupant.participantIndex, occupant.username);
                        }
                    }
                }
            }
        }
    }
}
