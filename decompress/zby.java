import android.os.BaseBundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import java.util.Objects;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zby extends pbz
{
    public Boolean E0;
    public sby F0;
    public Boolean G0;
    
    public zby(final n8z n8z) {
        super(n8z, 0);
        this.F0 = (sby)jee.k1;
    }
    
    public static final long A() {
        return (long)uzy.e.a((Object)null);
    }
    
    public static final long h() {
        return (long)uzy.E.a((Object)null);
    }
    
    public final String i(String s) {
        try {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            eli.q(s);
            return s;
        }
        catch (final InvocationTargetException ex) {
            super.D0.b().I0.b("SystemProperties.get() threw an exception", (Object)ex);
        }
        catch (final IllegalAccessException ex2) {
            super.D0.b().I0.b("Could not access SystemProperties.get()", (Object)ex2);
        }
        catch (final NoSuchMethodException ex3) {
            super.D0.b().I0.b("Could not find SystemProperties.get() method", (Object)ex3);
        }
        catch (final ClassNotFoundException ex4) {
            super.D0.b().I0.b("Could not find SystemProperties class", (Object)ex4);
        }
        return "";
    }
    
    public final double j(String w, final qzy qzy) {
        if (w == null) {
            return (double)qzy.a((Object)null);
        }
        w = this.F0.w(w, qzy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (double)qzy.a((Object)null);
        }
        try {
            return (double)qzy.a((Object)Double.parseDouble(w));
        }
        catch (final NumberFormatException ex) {
            return (double)qzy.a((Object)null);
        }
    }
    
    public final int k(final String s) {
        return this.o(s, uzy.I, 500, 2000);
    }
    
    public final int l() {
        final lpz b = super.D0.B();
        final Boolean h0 = ((pbz)b).D0.z().H0;
        if (b.l0() < 201500 && (h0 == null || h0)) {
            return 25;
        }
        return 100;
    }
    
    public final int m(final String s) {
        return this.o(s, uzy.J, 25, 100);
    }
    
    public final int n(String w, final qzy qzy) {
        if (w == null) {
            return (int)qzy.a((Object)null);
        }
        w = this.F0.w(w, qzy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (int)qzy.a((Object)null);
        }
        try {
            return (int)qzy.a((Object)Integer.parseInt(w));
        }
        catch (final NumberFormatException ex) {
            return (int)qzy.a((Object)null);
        }
    }
    
    public final int o(final String s, final qzy qzy, final int n, final int n2) {
        return Math.max(Math.min(this.n(s, qzy), n2), n);
    }
    
    public final void p() {
        Objects.requireNonNull(super.D0);
    }
    
    public final long q(String w, final qzy qzy) {
        if (w == null) {
            return (long)qzy.a((Object)null);
        }
        w = this.F0.w(w, qzy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (long)qzy.a((Object)null);
        }
        try {
            return (long)qzy.a((Object)Long.parseLong(w));
        }
        catch (final NumberFormatException ex) {
            return (long)qzy.a((Object)null);
        }
    }
    
    public final Bundle r() {
        try {
            if (super.D0.D0.getPackageManager() == null) {
                super.D0.b().I0.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            final ApplicationInfo a = dux.a(super.D0.D0).a(super.D0.D0.getPackageName(), 128);
            if (a == null) {
                super.D0.b().I0.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            super.D0.b().I0.b("Failed to load metadata: Package name not found", (Object)ex);
            return null;
        }
    }
    
    public final Boolean s(final String s) {
        eli.n(s);
        final Bundle r = this.r();
        if (r == null) {
            super.D0.b().I0.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!((BaseBundle)r).containsKey(s)) {
            return null;
        }
        return r.getBoolean(s);
    }
    
    public final boolean t(String w, final qzy qzy) {
        if (w == null) {
            return (boolean)qzy.a((Object)null);
        }
        w = this.F0.w(w, qzy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (boolean)qzy.a((Object)null);
        }
        return (boolean)qzy.a((Object)"1".equals(w));
    }
    
    public final boolean u(final String s) {
        return "1".equals(this.F0.w(s, "gaia_collection_enabled"));
    }
    
    public final boolean v() {
        final Boolean s = this.s("google_analytics_automatic_screen_reporting_enabled");
        return s == null || s;
    }
    
    public final boolean x() {
        Objects.requireNonNull(super.D0);
        final Boolean s = this.s("firebase_analytics_collection_deactivated");
        return s != null && s;
    }
    
    public final boolean y(final String s) {
        return "1".equals(this.F0.w(s, "measurement.event_sampling_enabled"));
    }
    
    public final boolean z() {
        if (this.E0 == null && (this.E0 = this.s("app_measurement_lite")) == null) {
            this.E0 = Boolean.FALSE;
        }
        return this.E0 || !super.D0.H0;
    }
}
