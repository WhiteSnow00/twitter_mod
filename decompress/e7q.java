import android.os.BaseBundle;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.app.PendingIntent;
import android.os.IBinder;
import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e7q extends k5c<w4y> implements t4y
{
    public final boolean l1;
    public final lh4 m1;
    public final Bundle n1;
    public final Integer o1;
    
    public e7q(final Context context, final Looper looper, final lh4 m1, final Bundle n1, final c$b c$b, final c$c c$c) {
        super(context, looper, 44, m1, (zh6)c$b, (whj)c$c);
        this.l1 = true;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = m1.i;
    }
    
    public final Bundle B() {
        if (!super.M0.getPackageName().equals(this.m1.f)) {
            ((BaseBundle)this.n1).putString("com.google.android.gms.signin.internal.realClientPackageName", this.m1.f);
        }
        return this.n1;
    }
    
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }
    
    public final void a() {
        try {
            final w4y w4y = (w4y)this.D();
            final Integer o1 = this.o1;
            Objects.requireNonNull(o1, "null reference");
            final int intValue = o1;
            final Parcel s = ((s1y)w4y).s();
            s.writeInt(intValue);
            ((s1y)w4y).x(7, s);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
    
    public final void c() {
        this.n((gm1$c)new gm1.d(this));
    }
    
    public final void e(final u4y u4y) {
        iuk.D((Object)u4y, (Object)"Expecting a valid ISignInCallbacks");
        try {
            Account a = this.m1.a;
            if (a == null) {
                a = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b;
            if ("<<default account>>".equals(a.name)) {
                b = mjr.a(super.M0).b();
            }
            else {
                b = null;
            }
            final Integer o1 = this.o1;
            Objects.requireNonNull(o1, "null reference");
            final h6y h6y = new h6y(a, (int)o1, b);
            final w4y w4y = (w4y)this.D();
            final j5y j5y = new j5y(1, h6y);
            final Parcel s = ((s1y)w4y).s();
            final int a2 = u3y.a;
            s.writeInt(1);
            j5y.writeToParcel(s, 0);
            s.writeStrongBinder((IBinder)u4y);
            ((s1y)w4y).x(12, s);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                u4y.K0(new n5y(1, new bi6(8, (PendingIntent)null, (String)null), null));
            }
            catch (final RemoteException ex2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex);
            }
        }
    }
    
    public final boolean k() {
        return this.l1;
    }
    
    public final void p(final q2d q2d, final boolean b) {
        try {
            final w4y w4y = (w4y)this.D();
            final Integer o1 = this.o1;
            Objects.requireNonNull(o1, "null reference");
            final int intValue = o1;
            final Parcel s = ((s1y)w4y).s();
            final int a = u3y.a;
            s.writeStrongBinder(((IInterface)q2d).asBinder());
            s.writeInt(intValue);
            s.writeInt((int)(b ? 1 : 0));
            ((s1y)w4y).x(9, s);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
    
    public final int r() {
        return 12451000;
    }
    
    public final IInterface x(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface instanceof w4y) {
                o = queryLocalInterface;
            }
            else {
                o = new w4y(binder);
            }
        }
        return (IInterface)o;
    }
}
