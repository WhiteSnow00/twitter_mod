import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cv1
{
    public final g9h<y00> a;
    
    public cv1(final g9h<y00> a) {
        czd.f((Object)a, "metadataFetcher");
        this.a = a;
    }
    
    public final nv1 a(final nv1 nv1, final nv1 nv2) {
        Object o;
        if (nv1 instanceof n6a) {
            final n6a n6a = (n6a)nv1;
            final Set a = n6a.a;
            final List b = n6a.b;
            final boolean d = n6a.d;
            Objects.requireNonNull(n6a);
            czd.f((Object)a, "metadata");
            czd.f((Object)b, "parentMetadata");
            o = new n6a(a, b, nv2, d);
        }
        else if (nv1 instanceof z6a) {
            final z6a z6a = (z6a)nv1;
            final Set a2 = z6a.a;
            final List b2 = z6a.b;
            Objects.requireNonNull(z6a);
            czd.f((Object)a2, "metadata");
            czd.f((Object)b2, "parentMetadata");
            o = new z6a(a2, b2, nv2);
        }
        else if (nv1 instanceof w6a) {
            final w6a w6a = (w6a)nv1;
            final Set a3 = w6a.a;
            final List b3 = w6a.b;
            final long d2 = w6a.d;
            final long e = w6a.e;
            Objects.requireNonNull(w6a);
            czd.f((Object)a3, "metadata");
            czd.f((Object)b3, "parentMetadata");
            o = new w6a(a3, b3, nv2, d2, e);
        }
        else if (nv1 instanceof evg) {
            final evg evg = (evg)nv1;
            final Set a4 = evg.a;
            final List b4 = evg.b;
            final long d3 = evg.d;
            Objects.requireNonNull(evg);
            czd.f((Object)a4, "metadata");
            czd.f((Object)b4, "parentMetadata");
            o = new evg(a4, b4, nv2, d3);
        }
        else {
            o = null;
        }
        return (nv1)o;
    }
    
    public final <T extends f7x> nv1 b(final j0a<T> j0a) {
        czd.f((Object)j0a, "emittedEvent");
        final Set b = this.a.b(j0a.b);
        final ArrayList list = new ArrayList();
        for (final Object next : b) {
            if (next instanceof yse) {
                list.add(next);
            }
        }
        final boolean empty = list.isEmpty();
        final nv1 nv1 = null;
        if (empty) {
            return null;
        }
        final List c = this.a.c(j0a.b);
        final o9a a = j0a.a;
        final f7x f7x = (f7x)a;
        Object o;
        if (f7x instanceof uc4) {
            o = new n6a(b, c, (nv1)null, true);
        }
        else if (f7x instanceof hht) {
            czd.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.ToggledClickEvent");
            o = new n6a(b, c, (nv1)null, ((hht)a).a);
        }
        else if (f7x instanceof ned) {
            czd.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.ImpressionEvent");
            final ned ned = (ned)a;
            o = new w6a(b, c, (nv1)null, ned.a, ned.b);
        }
        else {
            o = nv1;
            if (f7x instanceof hmk) {
                czd.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.PlaybackLapseEvent");
                o = new evg(b, c, (nv1)null, ((hmk)a).a);
            }
        }
        return (nv1)o;
    }
}
