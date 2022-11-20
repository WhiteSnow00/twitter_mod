import com.twitter.util.user.UserIdentifier;
import com.twitter.report.subsystem.ReportFlowWebViewResultNoAction;
import android.content.Context;
import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import android.net.Uri;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xai implements Runnable
{
    public final yai D0;
    public final boolean E0;
    public final String F0;
    
    public xai(final yai d0, final boolean e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        final yai d0 = this.D0;
        final boolean e0 = this.E0;
        final String f0 = this.F0;
        if (e0) {
            d0.a.a(d0.f.setFlags(603979776));
        }
        final tej e2 = d0.e;
        Objects.requireNonNull(e2);
        czd.f((Object)f0, "url");
        final Uri parse = Uri.parse(f0);
        boolean b = false;
        Label_0598: {
            Label_0596: {
                if (parse != null) {
                    if (czd.a((Object)parse.getPath(), (Object)"/i/safety/report_story_complete")) {
                        final String queryParameter = parse.getQueryParameter("action");
                        if (queryParameter != null) {
                            Label_0160: {
                                if (czd.a((Object)queryParameter, (Object)"mute_words")) {
                                    e2.d.d((ym)new pvh());
                                    e2.b.c((bn6)new ReportFlowWebViewResultForAction(5));
                                }
                                else {
                                    final String queryParameter2 = parse.getQueryParameter("reported_user_id");
                                    if (queryParameter2 == null) {
                                        break Label_0596;
                                    }
                                    final long long1 = Long.parseLong(queryParameter2);
                                    final int hashCode = queryParameter.hashCode();
                                    if (hashCode != -382454902) {
                                        if (hashCode != 3363353) {
                                            if (hashCode == 93832333) {
                                                if (queryParameter.equals("block")) {
                                                    e2.e.f((orc)new t12((Context)e2.a, e2.c, long1, (uil)null, 1));
                                                }
                                            }
                                        }
                                        else if (queryParameter.equals("mute")) {
                                            final trc e3 = e2.e;
                                            final cnb a = e2.a;
                                            final UserIdentifier c = e2.c;
                                            e3.f((orc)new ewh((Context)a, c, long1, vav.c2(c), null));
                                        }
                                    }
                                    else if (queryParameter.equals("unfollow")) {
                                        e2.e.f((orc)new hs8((Context)e2.a, e2.c, long1, (uil)null));
                                    }
                                    switch (queryParameter) {
                                        case "remove_member": {
                                            e2.b.c((bn6)new ReportFlowWebViewResultForAction(4));
                                            break Label_0160;
                                        }
                                        case "block": {
                                            e2.b.c((bn6)new ReportFlowWebViewResultForAction(3));
                                            break Label_0160;
                                        }
                                        case "none": {
                                            e2.b.c((bn6)ReportFlowWebViewResultNoAction.INSTANCE);
                                            break Label_0160;
                                        }
                                        case "mute": {
                                            e2.b.c((bn6)new ReportFlowWebViewResultForAction(2));
                                            break Label_0160;
                                        }
                                        case "unfollow": {
                                            e2.b.c((bn6)new ReportFlowWebViewResultForAction(1));
                                            break Label_0160;
                                        }
                                        default:
                                            break;
                                    }
                                    e2.b.c((bn6)ReportFlowWebViewResultNoAction.INSTANCE);
                                }
                            }
                            b = true;
                            break Label_0598;
                        }
                    }
                }
            }
            b = false;
        }
        if (!b) {
            d0.d.c(f0);
        }
    }
}
