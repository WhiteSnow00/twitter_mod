// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Set;
import java.util.Iterator;
import java.util.List;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.topics.browsing.RoomTopicsBrowsingViewModel$2$3", f = "RoomTopicsBrowsingViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<zo2, go6<? super fzv>, Object>
{
    public Object D0;
    public final bho E0;
    
    public d(final bho e0, final go6<? super d> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final d d2 = new d(this.E0, (go6<? super d>)go6);
        d2.D0 = d0;
        return (go6<fzv>)d2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final zo2 zo2 = (zo2)this.D0;
        final bho e0 = this.E0;
        Objects.requireNonNull(e0);
        czd.f((Object)zo2, "response");
        final List<j31> a = zo2.a.a;
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = a.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final j31 next = iterator.next();
            final String a2 = next.a;
            if (a2 == null || a2.length() == 0) {
                b = true;
            }
            if (!(b ^ true)) {
                continue;
            }
            list.add(next);
        }
        final ArrayList list2 = new ArrayList<nfo>(iq4.H((Iterable)list, 10));
        for (final j31 j31 : list) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final List d = j31.d;
            final ArrayList list3 = new ArrayList<cgo>(iq4.H((Iterable)d, 10));
            for (final h31 h31 : d) {
                final Set e2 = e0.E0.e();
                boolean b2 = false;
                Label_0326: {
                    if (!e2.isEmpty()) {
                        for (final AudioSpaceTopicItem audioSpaceTopicItem : e2) {
                            if (czd.a((Object)audioSpaceTopicItem.getCategoryId(), (Object)j31.c) && czd.a((Object)audioSpaceTopicItem.getTopicId(), (Object)h31.a)) {
                                b2 = true;
                                break Label_0326;
                            }
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    atomicBoolean.set(b2);
                }
                list3.add(new cgo(j31.c, h31.a, h31.b, b2, true, false));
            }
            final String b3 = j31.b;
            String a3;
            if ((a3 = j31.a) == null) {
                a3 = "";
            }
            list2.add(new nfo(atomicBoolean.get(), a3, b3, j31.c, (List)list3));
        }
        e0.a((Object)list2);
        return fzv.a;
    }
}
