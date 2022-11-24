import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kv1
{
    public final x9h<x00> a;
    
    public kv1(final x9h<x00> a) {
        e0e.f((Object)a, "metadataFetcher");
        this.a = a;
    }
    
    public final vv1 a(final vv1 vv1, final vv1 vv2) {
        Object o;
        if (vv1 instanceof s7a) {
            final s7a s7a = (s7a)vv1;
            final Set a = s7a.a;
            final List b = s7a.b;
            final boolean d = s7a.d;
            Objects.requireNonNull(s7a);
            e0e.f((Object)a, "metadata");
            e0e.f((Object)b, "parentMetadata");
            o = new s7a(a, b, vv2, d);
        }
        else if (vv1 instanceof e8a) {
            final e8a e8a = (e8a)vv1;
            final Set a2 = e8a.a;
            final List b2 = e8a.b;
            Objects.requireNonNull(e8a);
            e0e.f((Object)a2, "metadata");
            e0e.f((Object)b2, "parentMetadata");
            o = new e8a(a2, b2, vv2);
        }
        else if (vv1 instanceof b8a) {
            final b8a b8a = (b8a)vv1;
            final Set a3 = b8a.a;
            final List b3 = b8a.b;
            final long d2 = b8a.d;
            final long e = b8a.e;
            Objects.requireNonNull(b8a);
            e0e.f((Object)a3, "metadata");
            e0e.f((Object)b3, "parentMetadata");
            o = new b8a(a3, b3, vv2, d2, e);
        }
        else if (vv1 instanceof yvg) {
            final yvg yvg = (yvg)vv1;
            final Set a4 = yvg.a;
            final List b4 = yvg.b;
            final long d3 = yvg.d;
            Objects.requireNonNull(yvg);
            e0e.f((Object)a4, "metadata");
            e0e.f((Object)b4, "parentMetadata");
            o = new yvg(a4, b4, vv2, d3);
        }
        else {
            o = null;
        }
        return (vv1)o;
    }
    
    public final <T extends x7x> vv1 b(final l1a<T> l1a) {
        e0e.f((Object)l1a, "emittedEvent");
        final Set b = this.a.b(l1a.b);
        final ArrayList list = new ArrayList();
        for (final Object next : b) {
            if (next instanceof vte) {
                list.add(next);
            }
        }
        final boolean empty = list.isEmpty();
        final vv1 vv1 = null;
        if (empty) {
            return null;
        }
        final List c = this.a.c(l1a.b);
        final uaa a = l1a.a;
        final x7x x7x = (x7x)a;
        Object o;
        if (x7x instanceof xd4) {
            o = new s7a(b, c, (vv1)null, true);
        }
        else if (x7x instanceof ait) {
            e0e.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.ToggledClickEvent");
            o = new s7a(b, c, (vv1)null, ((ait)a).a);
        }
        else if (x7x instanceof nfd) {
            e0e.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.ImpressionEvent");
            final nfd nfd = (nfd)a;
            o = new b8a(b, c, (vv1)null, nfd.a, nfd.b);
        }
        else {
            o = vv1;
            if (x7x instanceof wmk) {
                e0e.d((Object)a, "null cannot be cast to non-null type com.twitter.eventsource.ui.PlaybackLapseEvent");
                o = new yvg(b, c, (vv1)null, ((wmk)a).a);
            }
        }
        return (vv1)o;
    }
}
