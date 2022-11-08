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

public final class jby extends abz
{
    public Boolean D0;
    public cby E0;
    public Boolean F0;
    
    public jby(final y7z y7z) {
        super(y7z, 0);
        this.E0 = (cby)rp2.H1;
    }
    
    public static final long A() {
        return (long)fzy.e.a((Object)null);
    }
    
    public static final long h() {
        return (long)fzy.E.a((Object)null);
    }
    
    public final String i(String s) {
        try {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            xd.t((Object)s);
            return s;
        }
        catch (final InvocationTargetException ex) {
            super.C0.b().H0.b("SystemProperties.get() threw an exception", (Object)ex);
        }
        catch (final IllegalAccessException ex2) {
            super.C0.b().H0.b("Could not access SystemProperties.get()", (Object)ex2);
        }
        catch (final NoSuchMethodException ex3) {
            super.C0.b().H0.b("Could not find SystemProperties.get() method", (Object)ex3);
        }
        catch (final ClassNotFoundException ex4) {
            super.C0.b().H0.b("Could not find SystemProperties class", (Object)ex4);
        }
        return "";
    }
    
    public final double j(String w, final azy azy) {
        if (w == null) {
            return (double)azy.a((Object)null);
        }
        w = this.E0.w(w, azy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (double)azy.a((Object)null);
        }
        try {
            return (double)azy.a((Object)Double.parseDouble(w));
        }
        catch (final NumberFormatException ex) {
            return (double)azy.a((Object)null);
        }
    }
    
    public final int k(final String s) {
        return this.o(s, fzy.I, 500, 2000);
    }
    
    public final int l() {
        final xoz b = super.C0.B();
        final Boolean g0 = ((abz)b).C0.z().G0;
        if (b.l0() < 201500 && (g0 == null || g0)) {
            return 25;
        }
        return 100;
    }
    
    public final int m(final String s) {
        return this.o(s, fzy.J, 25, 100);
    }
    
    public final int n(String w, final azy azy) {
        if (w == null) {
            return (int)azy.a((Object)null);
        }
        w = this.E0.w(w, azy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (int)azy.a((Object)null);
        }
        try {
            return (int)azy.a((Object)Integer.parseInt(w));
        }
        catch (final NumberFormatException ex) {
            return (int)azy.a((Object)null);
        }
    }
    
    public final int o(final String s, final azy azy, final int n, final int n2) {
        return Math.max(Math.min(this.n(s, azy), n2), n);
    }
    
    public final void p() {
        Objects.requireNonNull(super.C0);
    }
    
    public final long q(String w, final azy azy) {
        if (w == null) {
            return (long)azy.a((Object)null);
        }
        w = this.E0.w(w, azy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (long)azy.a((Object)null);
        }
        try {
            return (long)azy.a((Object)Long.parseLong(w));
        }
        catch (final NumberFormatException ex) {
            return (long)azy.a((Object)null);
        }
    }
    
    public final Bundle r() {
        try {
            if (super.C0.C0.getPackageManager() == null) {
                super.C0.b().H0.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            final ApplicationInfo a = ntx.a(super.C0.C0).a(super.C0.C0.getPackageName(), 128);
            if (a == null) {
                super.C0.b().H0.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            super.C0.b().H0.b("Failed to load metadata: Package name not found", (Object)ex);
            return null;
        }
    }
    
    public final Boolean s(final String s) {
        xd.q(s);
        final Bundle r = this.r();
        if (r == null) {
            super.C0.b().H0.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!((BaseBundle)r).containsKey(s)) {
            return null;
        }
        return r.getBoolean(s);
    }
    
    public final boolean t(String w, final azy azy) {
        if (w == null) {
            return (boolean)azy.a((Object)null);
        }
        w = this.E0.w(w, azy.a);
        if (TextUtils.isEmpty((CharSequence)w)) {
            return (boolean)azy.a((Object)null);
        }
        return (boolean)azy.a((Object)"1".equals(w));
    }
    
    public final boolean u(final String s) {
        return "1".equals(this.E0.w(s, "gaia_collection_enabled"));
    }
    
    public final boolean v() {
        final Boolean s = this.s("google_analytics_automatic_screen_reporting_enabled");
        return s == null || s;
    }
    
    public final boolean x() {
        Objects.requireNonNull(super.C0);
        final Boolean s = this.s("firebase_analytics_collection_deactivated");
        return s != null && s;
    }
    
    public final boolean y(final String s) {
        return "1".equals(this.E0.w(s, "measurement.event_sampling_enabled"));
    }
    
    public final boolean z() {
        if (this.D0 == null && (this.D0 = this.s("app_measurement_lite")) == null) {
            this.D0 = Boolean.FALSE;
        }
        return this.D0 || !super.C0.G0;
    }
}
