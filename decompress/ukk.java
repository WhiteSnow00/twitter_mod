// 
// Decompiled by Procyon v0.6.0
// 

public final class ukk
{
    public static final ukk a;
    public static final fg4 b;
    public static final fg4 c;
    public static final fg4 d;
    public static final fg4 e;
    public static final fg4 f;
    public static final fg4 g;
    public static final fg4 h;
    public static final fg4 i;
    
    static {
        final dda.a companion = dda.Companion;
        b = new fg4(companion.e("", "", "playable_ads", "playable_webview", "js_bridge_clicked"));
        c = new fg4(companion.e("", "", "playable_ads", "playable_webview", "load_started"));
        d = new fg4(companion.e("", "", "playable_ads", "playable_webview", "load_not_started_wrong_url"));
        e = new fg4(companion.e("", "", "playable_ads", "playable_webview", "js_bridge_load_completed"));
        f = new fg4(companion.e("", "", "playable_ads", "playable_webview", "webview_error_received"));
        g = new fg4(companion.e("", "", "playable_ads", "bottom_bar", "user_clicked"));
        h = new fg4(companion.e("", "", "playable_ads", "install_cta", "user_clicked"));
        i = new fg4(companion.e("", "", "playable_ads", "close_button", "user_clicked"));
    }
    
    public static final fg4 a(final fg4 fg4, final Long n) {
        w3k x0;
        if (n != null) {
            x0 = new w3k(n.longValue());
        }
        else {
            x0 = null;
        }
        fg4.X0 = x0;
        return fg4;
    }
}
