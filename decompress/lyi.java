import android.os.Build$VERSION;
import com.twitter.notifications.json.JsonUserDevicesRequest;
import java.io.IOException;
import java.util.Objects;
import com.twitter.notifications.json.JsonNotificationSettingsRequest;
import android.content.Context;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lyi extends d2v<vgh>
{
    public final String j1;
    public final boolean k1;
    public final boolean l1;
    public bu8 m1;
    public final UserIdentifier n1;
    public final String o1;
    public final String p1;
    public final Map<String, String> q1;
    public final Map<String, String> r1;
    public final jyi s1;
    public final jyi t1;
    public final a u1;
    
    public lyi(final Context context, final UserIdentifier n1, final String j1, final String s, final boolean k1, final boolean l1, final String o1, final String p10, final Map<String, String> r1, final Map<String, String> q1) {
        final wxp t1 = new wxp();
        final xxp s2 = new xxp();
        final bu8 m1 = new bu8(context, s);
        final a u1 = new a(m1);
        super(n1, 0);
        this.m1 = m1;
        this.u1 = u1;
        this.n1 = n1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.o1 = o1;
        this.p1 = p10;
        this.r1 = r1;
        this.q1 = q1;
        this.t1 = (jyi)t1;
        this.s1 = (jyi)s2;
    }
    
    public final tqc f0() {
        final JsonNotificationSettingsRequest jsonNotificationSettingsRequest = new JsonNotificationSettingsRequest();
        jsonNotificationSettingsRequest.a = this.n1.getId();
        Objects.requireNonNull(this.m1);
        jsonNotificationSettingsRequest.b = b2v.a;
        final yb yb = null;
        Object d;
        try {
            if (this.k1) {
                jsonNotificationSettingsRequest.c = this.u1.a(this.o1, this.r1);
            }
            if (this.l1) {
                jsonNotificationSettingsRequest.d = this.u1.a(this.p1, this.q1);
            }
            d = new ujr(rih.a((Object)jsonNotificationSettingsRequest), "UTF-8");
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
        final mcv mcv = new mcv();
        ((tqc$a)mcv).m(this.j1);
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).d = (vqc)d;
        return ((tqc$a)mcv).k();
    }
    
    public final asc<vgh, kbv> g0() {
        return (asc<vgh, kbv>)v8g.f((Class)vgh.class);
    }
    
    public final void n0(final xrc<vgh, kbv> xrc) {
        final Object g = xrc.g;
        if (g != null) {
            final vgh vgh = (vgh)g;
            if (this.k1) {
                this.t1.a(vgh.d, this.n1);
                this.t1.i((long)vgh.f, this.n1);
                final oqp b = vgh.b;
                if (b != null) {
                    this.t1.f(b.a, this.n1);
                    this.t1.g(vgh.b.b, this.n1);
                }
            }
            if (this.l1) {
                this.s1.a(vgh.e, this.n1);
                if (!this.k1) {
                    this.s1.i((long)vgh.f, this.n1);
                }
                final oqp c = vgh.c;
                if (c != null) {
                    this.s1.f(c.a, this.n1);
                    this.s1.g(vgh.c.b, this.n1);
                }
            }
        }
    }
    
    public static final class a
    {
        public final bu8 a;
        
        public a(final bu8 a) {
            this.a = a;
        }
        
        public final JsonUserDevicesRequest a(final String e, final Map<String, String> h) {
            final JsonUserDevicesRequest jsonUserDevicesRequest = new JsonUserDevicesRequest();
            Objects.requireNonNull(this.a);
            jsonUserDevicesRequest.a = nb.L();
            String b = this.a.b;
            if (b == null) {
                b = m1f.d().D7().k();
            }
            jsonUserDevicesRequest.b = b;
            jsonUserDevicesRequest.c = v68.A(this.a.a.getResources().getConfiguration().locale);
            jsonUserDevicesRequest.d = this.a.a();
            Objects.requireNonNull(this.a);
            jsonUserDevicesRequest.f = 20;
            jsonUserDevicesRequest.e = e;
            Objects.requireNonNull(this.a);
            jsonUserDevicesRequest.g = String.valueOf(Build$VERSION.SDK_INT);
            jsonUserDevicesRequest.h = h;
            return jsonUserDevicesRequest;
        }
    }
}
