import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import tv.periscope.android.api.Invitee;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afv extends ste implements qsb<List<? extends Invitee>, List<? extends zon>>
{
    public static final afv D0;
    
    static {
        D0 = new afv();
    }
    
    public afv() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "invitee");
        final ArrayList list2 = new ArrayList<zon>(iq4.H((Iterable)list, 10));
        for (final Invitee invitee : list) {
            czd.f((Object)invitee, "<this>");
            list2.add(new zon(new uon(invitee.getInviteeId(), invitee.getInviteeDisplayName(), invitee.getInviteeUsername(), invitee.getInviteeImageUrl(), invitee.getInviteeHasNFTAvatar()), false, true));
        }
        final HashSet<String> set = new HashSet<String>();
        final ArrayList<zon> list3 = new ArrayList<zon>();
        for (final zon next : list2) {
            if (set.add(next.a.a)) {
                list3.add(next);
            }
        }
        return list3;
    }
}
