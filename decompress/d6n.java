import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d6n extends ste implements qsb<List<? extends y21>, taj<? extends List<? extends vwp$b>>>
{
    public final RoomAudioSpaceViewModel D0;
    
    public d6n(final RoomAudioSpaceViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "unfilteredContent");
        final ArrayList list2 = new ArrayList<w21>(iq4.H((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((y21)iterator.next()).e);
        }
        final ArrayList list3 = new ArrayList();
        for (final w21 next : list2) {
            if (next instanceof w21$a) {
                list3.add(next);
            }
        }
        final ArrayList list4 = new ArrayList<Long>(iq4.H((Iterable)list3, 10));
        final Iterator iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            list4.add(((w21$a)iterator3.next()).a.getId());
        }
        return ((rpu)this.D0.W0.get()).n2((Iterable)list4).subscribeOn(owo.c()).map((psb)new wtn((qsb)new c6n(list), 3));
    }
}
