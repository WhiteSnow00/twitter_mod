import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9i extends gue implements rtb<List<? extends z5u>, snj<x8i$d>>
{
    public final /* synthetic */ a9i C0;
    public final /* synthetic */ UserIdentifier D0;
    public final /* synthetic */ snj<x8i$d> E0;
    
    public d9i(final a9i c0, final UserIdentifier d0, final snj<x8i$d> e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object e0) {
        final List list = (List)e0;
        zzd.f((Object)list, "trustedFriendsLists");
        if (list.isEmpty() ^ true) {
            final z5u z5u = (z5u)or4.G1(list);
            String j0;
            if ((j0 = this.C0.e.g(this.D0).getUser().J0) == null) {
                j0 = "";
            }
            e0 = new snj((Object)new x8i$d(z5u.a, z5u.b, j0));
        }
        else {
            e0 = this.E0;
        }
        return e0;
    }
}
