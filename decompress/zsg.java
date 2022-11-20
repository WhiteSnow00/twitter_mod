import tv.periscope.android.api.PsUser;
import com.twitter.util.user.UserIdentifier;
import java.io.IOException;
import tv.periscope.chatman.api.IdempotenceHeaderMap;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.GetUserResponse;
import tv.periscope.android.api.GetUserRequest;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zsg implements Callable
{
    public final int D0;
    public final String E0;
    public final Object F0;
    public final Object G0;
    public final Object H0;
    
    public zsg(final Object f0, final Object g0, final Object h0, final String e0, final int d0) {
        this.D0 = d0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.E0 = e0;
    }
    
    @Override
    public final Object call() {
        switch (this.D0) {
            default: {
                final mdo mdo = (mdo)this.F0;
                final GetUserRequest getUserRequest = (GetUserRequest)this.G0;
                final wmp wmp = (wmp)this.H0;
                final String e0 = this.E0;
                czd.f((Object)mdo, "this$0");
                czd.f((Object)getUserRequest, "$getUsersRequest");
                czd.f((Object)wmp, "$session");
                czd.f((Object)e0, "$periscopeUserId");
                ynj ynj;
                try {
                    final GetUserResponse getUserResponse = (GetUserResponse)mdo.d.getUser(getUserRequest, wmp.c == 3, (IdempotenceHeaderMap)IdempotenceHeaderMapImpl.Companion.create()).execute().body();
                    PsUser user;
                    if (getUserResponse != null) {
                        user = getUserResponse.user;
                    }
                    else {
                        user = null;
                    }
                    String twitterId;
                    if (user != null) {
                        twitterId = user.twitterId;
                    }
                    else {
                        twitterId = null;
                    }
                    if (user != null) {
                        ((k3e)mdo.c).i(e0, (Object)user);
                    }
                    ynj = ynj.b((Object)twitterId);
                }
                catch (final IOException ex) {
                    final String message = ex.getMessage();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("RoomStreamPresenterImpl#getTwitterUserError ");
                    sb.append(message);
                    s9g.c("ROOM_LOGS", sb.toString());
                    ynj = ynj.b((Object)null);
                }
                return ynj;
            }
            case 0: {
                final atg atg = (atg)this.F0;
                final r89 c = (r89)this.G0;
                final UserIdentifier d = (UserIdentifier)this.H0;
                final String e2 = this.E0;
                final cjh c2 = cjh.c(((np1)atg.a).T());
                final vsg.a a = new vsg.a();
                a.c = c;
                a.d = d;
                a.a = e2;
                return c2.d((Object)a.e());
            }
        }
    }
}
