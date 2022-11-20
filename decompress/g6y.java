import java.util.Iterator;
import com.google.android.gms.common.api.c;
import java.util.Objects;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.app.Activity;
import com.google.android.gms.common.api.a$g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a$a;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g6y extends b<r7y> implements g6q
{
    public static final a$a<h6y, r7y> l;
    public static final a<r7y> m;
    public final String k;
    
    static {
        m = new a<r7y>("Auth.Api.Identity.SignIn.API", (a.a$a<C, r7y>)(g6y.l = new d6y()), (a.a$g<C>)new a$g());
    }
    
    public g6y(final Activity activity, final r7y r7y) {
        super(activity, (a)g6y.m, (a.d)r7y, b.a.c);
        this.k = j6y.a();
    }
    
    public final k6q a(final Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.K0);
        }
        final Parcelable$Creator creator = Status.CREATOR;
        final byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        final k6q k6q = null;
        Object a;
        if (byteArrayExtra == null) {
            a = null;
        }
        else {
            a = npo.a(byteArrayExtra, creator);
        }
        final Status status = (Status)a;
        if (status == null) {
            throw new ApiException(Status.M0);
        }
        if (!status.r()) {
            throw new ApiException(status);
        }
        final Parcelable$Creator creator2 = k6q.CREATOR;
        final byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        Object a2;
        if (byteArrayExtra2 == null) {
            a2 = k6q;
        }
        else {
            a2 = npo.a(byteArrayExtra2, creator2);
        }
        final k6q k6q2 = (k6q)a2;
        if (k6q2 != null) {
            return k6q2;
        }
        throw new ApiException(Status.K0);
    }
    
    public final ubs<jv1> b(final hv1 hv1) {
        new hv1$b(false);
        new hv1$a(false, (String)null, (String)null, true, (String)null, (List)null);
        final hv1$a e0 = hv1.E0;
        Objects.requireNonNull(e0, "null reference");
        final hv1$b d0 = hv1.D0;
        Objects.requireNonNull(d0, "null reference");
        final hv1 hv2 = new hv1(d0, e0, this.k, hv1.G0);
        final ybs.a a = new ybs.a();
        a.c = new yra[] { i6y.a };
        a.a = (ycm<A, zbs<ResultT>>)new y2c((Object)this, (Object)hv2);
        a.b = false;
        a.d = 1553;
        return this.k(0, (ybs)a.a());
    }
    
    public final ubs<Void> g() {
        super.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        final Iterator<c> iterator = c.g().iterator();
        while (iterator.hasNext()) {
            iterator.next().m();
        }
        r4c.a();
        final ybs.a a = new ybs.a();
        a.c = new yra[] { i6y.b };
        a.a = new epe(this, 4);
        a.b = false;
        a.d = 1554;
        return this.k(0, (ybs)a.a());
    }
}
