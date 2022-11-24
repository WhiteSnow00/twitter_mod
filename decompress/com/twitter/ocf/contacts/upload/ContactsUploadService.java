// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ocf.contacts.upload;

import java.nio.ByteBuffer;
import java.util.Map;
import android.content.Context;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import android.app.IntentService;

public class ContactsUploadService extends IntentService
{
    public static final int G0 = 0;
    public final tah F0;
    
    public ContactsUploadService() {
        final tah d = o6f.d();
        super("ab_upload_service");
        this.F0 = d;
    }
    
    public final void onHandleIntent(final Intent intent) {
        if (intent == null) {
            r9a.d((Throwable)new NullPointerException("ContactsUploadService intent is null"));
            return;
        }
        final boolean booleanExtra = intent.getBooleanExtra("extra_is_live_sync_experience", false);
        final String stringExtra = intent.getStringExtra("scribe_page_term");
        final tah f0 = this.F0;
        final UserIdentifier current = UserIdentifier.getCurrent();
        final int h = nah.h;
        final j71 z0 = j71.Z0;
        final int q = zat.q;
        final String m = wjg.m("TimingMetric", "contacts:timing:total:upload_contacts");
        wjg wjg;
        if ((wjg = f0.b(m)) == null) {
            wjg = f0.f((wjg)new zat("contacts:timing:total:upload_contacts", (nah$b)z0, m, (oah)f0));
            ((nah)wjg).e = current;
        }
        final zat zat = (zat)wjg;
        final sbw a = sbw.a();
        final int a2 = ida.a;
        Objects.requireNonNull(jda.Companion);
        e0e.f((Object)stringExtra, "page");
        final kda kda = new kda(stringExtra);
        final sl6 sl6 = new sl6(a, (jda)kda, zat);
        final yk6 d1 = ((vl6)cgw.a().c((Class)vl6.class)).D1();
        final c4g a3 = c4g.a((Context)this);
        final ul6 ul6 = new ul6(d1, booleanExtra, a3, sl6);
        nag.a("ab_upload", "Starting AB Upload..");
        final Map<String, ByteBuffer> e = d1.e();
        if (!d1.f()) {
            d1.b();
        }
        if (!booleanExtra && e.isEmpty()) {
            sl6.a(0, 0);
        }
        else {
            final int size = e.size();
            sl6.a(size, n2v.b(size, ul6.I0));
            ((wjg)zat).h();
            d1.c(e, (tl6)ul6, booleanExtra);
        }
        ((wjg)zat).i();
        final fg4 fg4 = new fg4();
        ((o1p)fg4).q(new String[] { ((jda)kda).b(), "follow_friends::forward_lookup:request" });
        ((o1p)fg4).s((long)sl6.c);
        a.c((tlm)fg4);
        final fg4 fg5 = new fg4();
        ((o1p)fg5).q(new String[] { ((jda)kda).b(), "follow_friends::forward_lookup:failure" });
        ((o1p)fg5).s((long)sl6.d);
        a.c((tlm)fg5);
        final fg4 fg6 = new fg4();
        ((o1p)fg6).q(new String[] { ((jda)kda).b(), "import_addressbook", ":import:done" });
        ((o1p)fg6).s(((nah)zat).f);
        a.c((tlm)fg6);
        final g5s a4 = nq1.a;
        fcu.c().i().c("fft", System.currentTimeMillis()).e();
        a3.c(new Intent("upload_success_broadcast").putExtra("lookup_complete", true));
    }
}
