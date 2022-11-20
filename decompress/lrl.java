import com.twitter.notifications.settings.presenter.PushNotificationsSettingsContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrl
{
    public final rui a;
    public final vui b;
    
    public lrl(final rui a, final vui b) {
        this.a = a;
        this.b = b;
    }
    
    public static void b(final boolean b) {
        final kca q1 = PushNotificationsSettingsContentViewProvider.q1;
        String s;
        if (b) {
            s = "success";
        }
        else {
            s = "failure";
        }
        cbw.b((elm)new af4(vba.f((ica)q1, "read_settings_on_request_complete", "", s)));
    }
    
    public final eaq<vql> a(final boolean b) {
        eaq eaq;
        if (b) {
            eaq = this.a.R((Object)tmi.a);
        }
        else {
            eaq = ((enm)this.b).R((Object)tmi.a);
        }
        return (eaq<vql>)eaq.p((psb)ivt.V0).k((lj6)wgd.P0).m((lj6)ixw.L0);
    }
}
