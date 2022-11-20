import com.twitter.onboarding.ocf.NavigationHandler;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import android.content.Intent;
import android.util.Base64;
import android.os.Parcelable$Creator;
import com.google.android.gms.fido.fido2.api.common.b;
import com.twitter.android.onboarding.core.invisiblesubtask.SecurityKeyEnrollmentSubtaskHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibp extends ste implements qsb<bo, fzv>
{
    public final SecurityKeyEnrollmentSubtaskHandler D0;
    public final dbp E0;
    
    public ibp(final SecurityKeyEnrollmentSubtaskHandler d0, final dbp e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bo bo = (bo)o;
        czd.f((Object)bo, "result");
        final SecurityKeyEnrollmentSubtaskHandler d0 = this.D0;
        d0.e = false;
        final int b = bo.b;
        int n = -1;
        if (b != -1) {
            if (b != 0) {
                final dbp e0 = this.E0;
                final StringBuilder sb = new StringBuilder();
                sb.append("invalid result code for fido intent (code: ");
                sb.append(b);
                sb.append(")");
                d0.b(e0, sb.toString());
            }
            else {
                s9g.g("SecurityKeyEnrollmentSubtaskHandler", "fido registration canceled");
                d0.c.b();
            }
        }
        else {
            final dbp e2 = this.E0;
            final Intent c = bo.c;
            if (c == null) {
                d0.b(e2, "fido registration finished with no response data");
            }
            else if (c.hasExtra("FIDO2_ERROR_EXTRA")) {
                final byte[] byteArrayExtra = c.getByteArrayExtra("FIDO2_ERROR_EXTRA");
                czd.c((Object)byteArrayExtra);
                final b b2 = (b)npo.a(byteArrayExtra, (Parcelable$Creator)com.google.android.gms.fido.fido2.api.common.b.CREATOR);
                final ErrorCode d2 = b2.D0;
                if (d2 != null) {
                    n = SecurityKeyEnrollmentSubtaskHandler.d.a[((Enum)d2).ordinal()];
                }
                if (n == 1) {
                    s9g.g("SecurityKeyEnrollmentSubtaskHandler", "fido registration not supported");
                    d0.c.e(((obp)((ssr)e2).b).m);
                }
                else {
                    final ErrorCode d3 = b2.D0;
                    final String e3 = b2.E0;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("fido registration error: (");
                    sb2.append(d3);
                    sb2.append(") ");
                    sb2.append(e3);
                    d0.b(e2, sb2.toString());
                }
            }
            else if (!c.hasExtra("FIDO2_RESPONSE_EXTRA")) {
                d0.b(e2, "fido registration finished with no response data");
            }
            else {
                final byte[] byteArrayExtra2 = c.getByteArrayExtra("FIDO2_RESPONSE_EXTRA");
                czd.c((Object)byteArrayExtra2);
                final o51 o2 = (o51)npo.a(byteArrayExtra2, o51.CREATOR);
                czd.e((Object)o2, "response");
                s9g.g("SecurityKeyEnrollmentSubtaskHandler", "fido registration complete");
                final NavigationHandler c2 = d0.c;
                final ssv k = ((obp)((ssr)e2).b).k;
                final String b3 = rih.b(tkg.n0(new lvj[] { new lvj((Object)"id", (Object)Base64.encodeToString(o2.D0, 11)), new lvj((Object)"type", (Object)"public-key"), new lvj((Object)"response", (Object)tkg.n0(new lvj[] { new lvj((Object)"clientDataJSON", (Object)Base64.encodeToString(o2.E0, 11)), new lvj((Object)"attestationObject", (Object)Base64.encodeToString(o2.F0, 11)) })), new lvj((Object)"clientExtensionResults", (Object)k2a.D0) }));
                czd.e((Object)b3, "serialize(\n             \u2026  )\n                    )");
                c2.d(new pqd(k, (tqd)new cbp(b3)), (String)null);
            }
        }
        return fzv.a;
    }
}
