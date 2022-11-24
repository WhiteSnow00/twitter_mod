import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffo extends lhm<Set<? extends AudioSpaceTopicItem>>
{
    public ffo() {
        super((Object)null, 1, (wg8)null);
    }
    
    public final Set<String> g() {
        final Set<AudioSpaceTopicItem> h = this.h();
        final ArrayList list = new ArrayList<String>(nr4.d1((Iterable)h, 10));
        final Iterator<Object> iterator = h.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getTopicId());
        }
        return rr4.n2((Iterable)list);
    }
    
    public final Set<AudioSpaceTopicItem> h() {
        return (Set)this.e((Object)r3a.F0);
    }
}
