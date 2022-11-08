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

public final class p7y extends y5y
{
    public final Context a;
    
    public p7y(final Context a) {
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
            f7y.a(this.a).b();
        }
        else {
            this.x();
            final whr a = whr.a(this.a);
            final GoogleSignInAccount b2 = a.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.N0;
            if (b2 != null) {
                googleSignInOptions = a.c();
            }
            final Context a2 = this.a;
            Objects.requireNonNull(googleSignInOptions, "null reference");
            final e6c e6c = new e6c(a2, googleSignInOptions);
            if (b2 != null) {
                final d2y h = ((b)e6c).h;
                final Context a3 = ((b)e6c).a;
                if (e6c.l() == 3) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                c7y.a.a("Revoking access", new Object[0]);
                final String e = whr.a(a3).e("refreshToken");
                c7y.b(a3);
                Object d0;
                if (n != 0) {
                    final aag e2 = x5y.E0;
                    if (e == null) {
                        final Status status = new Status(4, null);
                        xd.l(status.r() ^ true, (Object)"Status code must not be SUCCESS");
                        d0 = new s3y((xrm)status);
                        ((BasePendingResult)d0).g(status);
                    }
                    else {
                        final x5y x5y = new x5y(e);
                        new Thread((Runnable)x5y).start();
                        d0 = x5y.D0;
                    }
                }
                else {
                    d0 = new w6y((c)h);
                    h.D0.j(1, (a)d0);
                }
                c2k.a((b2k)d0);
            }
            else {
                e6c.g();
            }
        }
        b = true;
        return b;
    }
    
    public final void x() {
        if (dsv.a(this.a, Binder.getCallingUid())) {
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
