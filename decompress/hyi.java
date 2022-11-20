import java.io.IOException;
import java.util.Objects;
import com.twitter.notifications.json.JsonUserDevicesRequest;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyi extends d2v<tmi>
{
    public final bu8 j1;
    public qft k1;
    
    public hyi(final Context context, final UserIdentifier userIdentifier) {
        super(userIdentifier, 0);
        this.j1 = new bu8(context);
    }
    
    public final tqc f0() {
        final mcv b = ib0.B("/1.1/notifications/settings/logout.json", "/");
        final int a = c5j.a;
        ((tqc$a)b).e = arc$b.G0;
        final JsonUserDevicesRequest jsonUserDevicesRequest = new JsonUserDevicesRequest();
        this.j1.a();
        jsonUserDevicesRequest.d = 3;
        Objects.requireNonNull(this.j1);
        jsonUserDevicesRequest.a = nb.L();
        String b2 = this.j1.b;
        if (b2 == null) {
            b2 = m1f.d().D7().k();
        }
        jsonUserDevicesRequest.b = b2;
        final yb yb = null;
        Object d;
        try {
            d = new ujr(rih.a((Object)jsonUserDevicesRequest), "UTF-8");
            try {
                ((yb)d).e("application/json");
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex) {
            d = yb;
        }
        final IOException ex;
        m8a.d((Throwable)ex);
        ((tqc$a)b).d = (vqc)d;
        final int a2 = c5j.a;
        return ((tqc$a)b).k();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)new vge();
    }
    
    public final xrc<tmi, kbv> i0(final xrc<tmi, kbv> xrc) {
        final qft k1 = this.k1;
        if (k1 != null) {
            new myi(k1).a(xrc.b);
        }
        return xrc;
    }
}
