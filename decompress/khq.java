import com.twitter.notifications.settings.presenter.PushNotificationsSettingsContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khq
{
    public final ivi a;
    public final mvi b;
    
    public khq(final ivi a, final mvi b) {
        this.a = a;
        this.b = b;
    }
    
    public static void b(final boolean b) {
        final sda s1 = PushNotificationsSettingsContentViewProvider.s1;
        String s2;
        if (b) {
            s2 = "success";
        }
        else {
            s2 = "failure";
        }
        sbw.b((tlm)new fg4(dda.f((qda)s1, "read_settings_on_request_complete", "", s2)));
    }
    
    public final bbq<hrl> a(final boolean b) {
        bbq<Object> bbq;
        if (b) {
            bbq = ((tnm<kni, Object, R>)this.a).S(kni.a);
        }
        else {
            bbq = ((tnm<kni, Object, R>)this.b).S(kni.a);
        }
        return (bbq<hrl>)bbq.p((rtb)zvt.T0).k((rk6)zxw.P0).m((rk6)yxw.L0);
    }
}
