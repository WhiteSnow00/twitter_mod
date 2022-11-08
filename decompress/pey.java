import android.accounts.AuthenticatorException;
import java.io.IOException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import java.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import android.accounts.AccountManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pey extends dbz
{
    public long E0;
    public String F0;
    public AccountManager G0;
    public Boolean H0;
    public long I0;
    
    public pey(final y7z y7z) {
        super(y7z);
    }
    
    public final boolean i() {
        final Calendar instance = Calendar.getInstance();
        this.E0 = TimeUnit.MINUTES.convert(instance.get(16) + instance.get(15), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        this.F0 = zi.y(language.toLowerCase(english), "-", default1.getCountry().toLowerCase(english));
        return false;
    }
    
    public final long n() {
        ((abz)this).g();
        return this.I0;
    }
    
    public final long o() {
        this.j();
        return this.E0;
    }
    
    public final String p() {
        this.j();
        return this.F0;
    }
    
    public final boolean q() {
        ((abz)this).g();
        Objects.requireNonNull(((abz)this).C0.P0);
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.I0 > 86400000L) {
            this.H0 = null;
        }
        Object h0 = this.H0;
        if (h0 != null) {
            return (boolean)h0;
        }
        if (eo6.a(((abz)this).C0.C0, "android.permission.GET_ACCOUNTS") != 0) {
            ((abz)this).C0.b().L0.a("Permission error checking for dasher/unicorn accounts");
            this.I0 = currentTimeMillis;
            this.H0 = Boolean.FALSE;
            return false;
        }
        if (this.G0 == null) {
            this.G0 = AccountManager.get(((abz)this).C0.C0);
        }
        Label_0240: {
            try {
                h0 = this.G0.getAccountsByTypeAndFeatures("com.google", new String[] { "service_HOSTED" }, (AccountManagerCallback)null, (Handler)null).getResult();
                if (h0 != null && ((Boolean)h0).length > 0) {
                    this.H0 = Boolean.TRUE;
                    this.I0 = currentTimeMillis;
                    return true;
                }
                h0 = this.G0.getAccountsByTypeAndFeatures("com.google", new String[] { "service_uca" }, (AccountManagerCallback)null, (Handler)null).getResult();
                if (h0 != null && ((Boolean)h0).length > 0) {
                    this.H0 = Boolean.TRUE;
                    this.I0 = currentTimeMillis;
                    return true;
                }
                break Label_0240;
            }
            catch (final OperationCanceledException h0) {}
            catch (final IOException h0) {}
            catch (final AuthenticatorException ex) {}
            ((abz)this).C0.b().I0.b("Exception checking account types", h0);
        }
        this.I0 = currentTimeMillis;
        this.H0 = Boolean.FALSE;
        return false;
    }
}
