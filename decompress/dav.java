import java.util.Collection;
import tv.periscope.android.api.Invitee;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dav extends ste implements ftb<List<Invitee>, List<? extends Invitee>, fzv>
{
    public static final dav D0;
    
    static {
        D0 = new dav();
    }
    
    public dav() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final List list = (List)o;
        final List list2 = (List)o2;
        czd.e((Object)list2, "result");
        list.addAll(list2);
        return fzv.a;
    }
}
