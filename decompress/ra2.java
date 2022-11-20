import android.app.Activity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.bouncer.BouncerWebViewArgs;
import android.content.Intent;
import java.net.URISyntaxException;
import java.net.URI;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ra2 implements qa2
{
    public final t10 a;
    public final f3c b;
    public final ecs c;
    
    public ra2(final t10 a, final f3c b, final ecs c) {
        czd.f((Object)a, "applicationManager");
        czd.f((Object)b, "globalActivityStarter");
        czd.f((Object)c, "taskEndpointRepository");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final Context context, final Uri uri, final adw adw) {
        czd.f((Object)context, "context");
        czd.f((Object)adw, "userInfo");
        boolean i5;
        try {
            i5 = oa2.i5(context, new URI(uri.toString()), adw);
        }
        catch (final URISyntaxException ex) {
            i5 = false;
        }
        return i5;
    }
    
    public final void b(final String s, final boolean b, final String s2) {
        if (!((ar0)this.a).e()) {
            return;
        }
        if (this.a.w() instanceof gqm) {
            return;
        }
        final fmv b2 = asa.b();
        boolean c0 = false;
        if (b2.b("ocf_2fa_enrollment_bouncer_enabled", false)) {
            final Activity w = this.a.w();
            if (w != null) {
                if (w.getIntent() != null) {
                    final acs b3 = dcs.b(w.getIntent());
                    Intent intent;
                    if ((intent = (Intent)((xi1)new udj(w.getIntent())).mIntent.getParcelableExtra("extra_destination_intent")) == null) {
                        intent = w.getIntent();
                    }
                    final jej jej = new jej(intent);
                    final String s3 = null;
                    String s4 = null;
                    Label_0335: {
                        if (b3 != null) {
                            final vbs a = b3.a;
                            if (a != null) {
                                final String a2 = a.a;
                                if (a2 != null && (s4 = this.c.b(a2)) != null) {
                                    break Label_0335;
                                }
                            }
                        }
                        final ncs a3 = jej.a();
                        String b5 = null;
                        Label_0237: {
                            if (a3 != null) {
                                final String b4 = a3.b;
                                if (b4 != null) {
                                    b5 = this.c.b(b4);
                                    break Label_0237;
                                }
                            }
                            b5 = null;
                        }
                        s4 = b5;
                        if (b5 == null) {
                            final vbs vbs = (vbs)dwj.b(((xi1)jej).mIntent, "extra_task", (rlp)vbs.c);
                            String b6 = null;
                            Label_0300: {
                                if (vbs != null) {
                                    final String a4 = vbs.a;
                                    if (a4 != null) {
                                        b6 = this.c.b(a4);
                                        break Label_0300;
                                    }
                                }
                                b6 = null;
                            }
                            s4 = b6;
                            if (b6 == null) {
                                final ncs a5 = jej.a();
                                s4 = s3;
                                if (a5 != null) {
                                    s4 = a5.a;
                                }
                            }
                        }
                    }
                    if (s4 != null) {
                        c0 = zkr.c0((CharSequence)s4, (CharSequence)"/1.1/onboarding/bounce.json", false);
                    }
                }
            }
            if (c0) {
                return;
            }
        }
        this.b.b((ContentViewArgs)new BouncerWebViewArgs(s, b, s2));
    }
}
