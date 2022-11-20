import java.util.Set;
import java.util.Iterator;
import java.util.List;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.rooms.ui.topics.main.RoomTopicsTaggingViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kho extends ste implements qsb<pho, fzv>
{
    public final RoomTopicsTaggingViewModel D0;
    public final fgo.a E0;
    public final String F0;
    
    public kho(final RoomTopicsTaggingViewModel d0, final fgo.a e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final pho pho = (pho)o;
        czd.f((Object)pho, "state");
        final List p = mq4.P0((Collection)pho.a);
        final RoomTopicsTaggingViewModel d0 = this.D0;
        final fgo.a e0 = this.E0;
        final String f0 = this.F0;
        final ArrayList list = (ArrayList)p;
        final Iterator iterator = list.iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                final cgo cgo = (cgo)iterator.next();
                if (czd.a((Object)cgo.b, (Object)f0) && czd.a((Object)cgo.a, (Object)e0.a)) {
                    if (n >= 0) {
                        final cgo cgo2 = list.get(n);
                        final boolean b = cgo2.d ^ true;
                        if (b) {
                            final List a = pho.a;
                            final ArrayList<cgo> list2 = new ArrayList<cgo>();
                            for (final Object next : a) {
                                if (((cgo)next).d) {
                                    list2.add((cgo)next);
                                }
                            }
                            if (list2.size() >= 3) {
                                return fzv.a;
                            }
                            RoomTopicsTaggingViewModel.W(d0, e0, n + 1, true);
                        }
                        else {
                            RoomTopicsTaggingViewModel.W(d0, e0, n + 1, false);
                        }
                        final RoomTopicsTaggingViewModel.e companion = RoomTopicsTaggingViewModel.Companion;
                        Objects.requireNonNull(d0);
                        final List a2 = pho.a;
                        final ArrayList<cgo> list3 = new ArrayList<cgo>();
                        for (final Object next2 : a2) {
                            if (((cgo)next2).d) {
                                list3.add((cgo)next2);
                            }
                        }
                        final Set r0 = mq4.R0((Iterable)list3);
                        final Set q0 = mq4.Q0((Iterable)r0);
                        if (b) {
                            q0.add(cgo2);
                        }
                        else {
                            q0.remove(cgo2);
                        }
                        list.set(n, cgo.a(cgo2, b, false, 55));
                        final int size = r0.size();
                        if (q0.size() >= 3) {
                            final Iterator iterator4 = list.iterator();
                            int n2 = 0;
                            while (iterator4.hasNext()) {
                                final Object next3 = iterator4.next();
                                if (n2 < 0) {
                                    s9i.E();
                                    throw null;
                                }
                                final cgo cgo3 = (cgo)next3;
                                list.set(n2, cgo.a(cgo3, false, cgo3.d, 47));
                                ++n2;
                            }
                        }
                        else if (size >= 3) {
                            final Iterator iterator5 = list.iterator();
                            int n3 = 0;
                            while (iterator5.hasNext()) {
                                final Object next4 = iterator5.next();
                                if (n3 < 0) {
                                    s9i.E();
                                    throw null;
                                }
                                list.set(n3, cgo.a((cgo)next4, false, true, 47));
                                ++n3;
                            }
                        }
                        final leo o2 = d0.O0;
                        final ArrayList list4 = new ArrayList<AudioSpaceTopicItem>(iq4.H((Iterable)q0, 10));
                        for (final cgo cgo4 : q0) {
                            Objects.requireNonNull(RoomTopicsTaggingViewModel.Companion);
                            list4.add(new AudioSpaceTopicItem(cgo4.b, cgo4.c, cgo4.a));
                        }
                        ((wgm)o2).a((Object)mq4.R0((Iterable)list4));
                    }
                    final RoomTopicsTaggingViewModel d2 = this.D0;
                    o = new jho(p);
                    final RoomTopicsTaggingViewModel.e companion2 = RoomTopicsTaggingViewModel.Companion;
                    d2.Q((qsb)o);
                    return fzv.a;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
}
