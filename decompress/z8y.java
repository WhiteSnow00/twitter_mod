import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.b;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcel;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z8y extends i7y
{
    public final Context a;
    
    public z8y(final Context a) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = a;
    }
    
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) {
        boolean b = false;
        if (n != 1) {
            if (n != 2) {
                return b;
            }
            this.x();
            p8y.a(this.a).b();
        }
        else {
            this.x();
            final mjr a = mjr.a(this.a);
            final GoogleSignInAccount b2 = a.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.Q0;
            if (b2 != null) {
                googleSignInOptions = a.c();
            }
            final Context a2 = this.a;
            Objects.requireNonNull(googleSignInOptions, "null reference");
            final i6c i6c = new i6c(a2, googleSignInOptions);
            if (b2 != null) {
                final n3y h = ((b)i6c).h;
                final Context a3 = ((b)i6c).a;
                if (i6c.l() == 3) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                m8y.a.a("Revoking access", new Object[0]);
                final String e = mjr.a(a3).e("refreshToken");
                m8y.b(a3);
                Object g0;
                if (n != 0) {
                    final lag h2 = h7y.H0;
                    if (e == null) {
                        final Status status = new Status(4, (String)null);
                        iuk.q(status.p() ^ true, (Object)"Status code must not be SUCCESS");
                        g0 = new c5y<Object>((etm)status);
                        ((BasePendingResult)g0).g((etm)status);
                    }
                    else {
                        final h7y h7y = new h7y(e);
                        new Thread((Runnable)h7y).start();
                        g0 = h7y.G0;
                    }
                }
                else {
                    g0 = new g8y(h);
                    h.G0.j(1, (a)g0);
                }
                v2k.a((u2k)g0);
            }
            else {
                i6c.g();
            }
        }
        b = true;
        return b;
    }
    
    public final void x() {
        if (jtv.a(this.a, Binder.getCallingUid())) {
            return;
        }
        final int callingUid = Binder.getCallingUid();
        final StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
