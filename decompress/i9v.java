import java.util.Collection;
import tv.periscope.android.api.Invitee;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i9v extends gue implements gub<List<Invitee>, List<? extends Invitee>, oyv>
{
    public static final i9v C0;
    
    static {
        C0 = new i9v();
    }
    
    public i9v() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final List list = (List)o;
        final List list2 = (List)o2;
        zzd.e((Object)list2, "result");
        list.addAll(list2);
        return oyv.a;
    }
}
