import com.google.android.gms.common.api.internal.BasePendingResult;
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

public final class f8y extends o6y
{
    public final Context a;
    
    public f8y(final Context a) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = a;
    }
    
    @Override
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) {
        boolean b = false;
        if (n != 1) {
            if (n != 2) {
                return b;
            }
            this.x();
            v7y.a(this.a).b();
        }
        else {
            this.x();
            final qir a = qir.a(this.a);
            final GoogleSignInAccount b2 = a.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.O0;
            if (b2 != null) {
                googleSignInOptions = a.c();
            }
            final Context a2 = this.a;
            Objects.requireNonNull(googleSignInOptions, "null reference");
            final g5c g5c = new g5c(a2, googleSignInOptions);
            if (b2 != null) {
                final t2y h = g5c.h;
                final Context a3 = g5c.a;
                if (g5c.l() == 3) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                s7y.a.a("Revoking access", new Object[0]);
                final String e = qir.a(a3).e("refreshToken");
                s7y.b(a3);
                Object e2;
                if (n != 0) {
                    final q9g f0 = n6y.F0;
                    if (e == null) {
                        final Status status = new Status(4, (String)null);
                        eli.i(status.r() ^ true, "Status code must not be SUCCESS");
                        e2 = new i4y((psm)status);
                        ((BasePendingResult)e2).g((psm)status);
                    }
                    else {
                        final n6y n6y = new n6y(e);
                        new Thread((Runnable)n6y).start();
                        e2 = n6y.E0;
                    }
                }
                else {
                    e2 = new m7y((c)h);
                    h.E0.j(1, (a)e2);
                }
                f2k.a((e2k)e2);
            }
            else {
                g5c.g();
            }
        }
        b = true;
        return b;
    }
    
    public final void x() {
        if (ysv.a(this.a, Binder.getCallingUid())) {
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
