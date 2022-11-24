import java.util.Iterator;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceDenyList$DenyListUser;
import java.util.ArrayList;
import java.util.List;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceDenyList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbn extends pue implements stb<GuestServiceDenyList, idq<? extends List<? extends qgv>>>
{
    public final hbn F0;
    
    public jbn(final hbn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final GuestServiceDenyList list = (GuestServiceDenyList)o;
        e0e.f((Object)list, "response");
        final fnw z = this.F0.z;
        final List users = list.getUsers();
        final ArrayList list2 = new ArrayList<Long>(nr4.d1((Iterable)users, 10));
        final Iterator iterator = users.iterator();
        while (iterator.hasNext()) {
            list2.add(Long.parseLong(((GuestServiceDenyList$DenyListUser)iterator.next()).getTwitterId()));
        }
        final t5j take = z.a((List)list2).take(1L);
        e0e.e((Object)take, "usersRepository\n        \u2026                 .take(1)");
        return f.n(take, (Object)h3a.F0);
    }
}
