import java.util.Iterator;
import java.util.List;
import com.twitter.rooms.ui.topics.browsing.RoomTopicsBrowsingViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgo extends gue implements rtb<mgo, oyv>
{
    public final /* synthetic */ rfo$a C0;
    public final /* synthetic */ RoomTopicsBrowsingViewModel D0;
    
    public lgo(final rfo$a c0, final RoomTopicsBrowsingViewModel d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final mgo mgo = (mgo)next;
        zzd.f((Object)mgo, "state");
        final List a = mgo.a;
        final rfo$a c0 = this.C0;
        final Iterator iterator = a.iterator();
        while (true) {
            do {
                final boolean hasNext = iterator.hasNext();
                final Number n = null;
                if (!hasNext) {
                    next = null;
                    final zeo zeo = (zeo)next;
                    if (zeo != null) {
                        final List e = zeo.e;
                        if (e != null) {
                            final rfo$a c2 = this.C0;
                            final RoomTopicsBrowsingViewModel d0 = this.D0;
                            final Iterator iterator2 = e.iterator();
                            final int n2 = 0;
                            int n3 = 0;
                            while (true) {
                                while (iterator2.hasNext()) {
                                    if (zzd.a((Object)((ofo)iterator2.next()).b, (Object)c2.b)) {
                                        final Integer value = n3;
                                        int n4 = n2;
                                        if (value.intValue() >= 0) {
                                            n4 = 1;
                                        }
                                        Number n5 = n;
                                        if (n4 != 0) {
                                            n5 = value;
                                        }
                                        if (n5 == null) {
                                            return oyv.a;
                                        }
                                        final int intValue = n5.intValue();
                                        if (((ofo)e.get(intValue)).d) {
                                            d0.O0.P(((ofo)e.get(intValue)).b, intValue + 1);
                                            return oyv.a;
                                        }
                                        d0.O0.C(((ofo)e.get(intValue)).b, intValue + 1);
                                        return oyv.a;
                                    }
                                    else {
                                        ++n3;
                                    }
                                }
                                n3 = -1;
                                continue;
                            }
                        }
                    }
                    return oyv.a;
                }
                next = iterator.next();
            } while (!zzd.a((Object)c0.a, (Object)((zeo)next).d));
            continue;
        }
    }
}
