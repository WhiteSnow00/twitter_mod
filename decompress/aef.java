import java.util.regex.Matcher;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.Iterator;
import java.io.File;
import java.util.List;
import android.os.Parcel;
import android.text.TextUtils;
import android.os.Bundle;
import java.util.Objects;
import java.util.HashMap;
import android.os.Looper;
import java.util.ArrayList;
import java.util.ArrayDeque;
import com.twitter.analytics.tracking.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aef implements kdm, hqz, nkj, vvz, pai, gzg
{
    public static aef G0;
    public final Object F0;
    
    public aef() {
        final a b = a.b();
        e0e.e((Object)b, "get()");
        this.F0 = b;
    }
    
    public aef(final int n) {
        if (n == 1) {
            this.F0 = new ArrayDeque();
            return;
        }
        if (n == 2) {
            this.F0 = new ArrayList();
            return;
        }
        if (n == 3) {
            this.F0 = fcc.a(Looper.getMainLooper());
            return;
        }
        if (n == 10) {
            this.F0 = new dbm(100);
            return;
        }
        if (n == 13) {
            this();
            return;
        }
        if (n != 14) {
            this.F0 = new znl();
            return;
        }
        this.F0 = new HashMap();
    }
    
    public aef(final icu f0) {
        e0e.f((Object)f0, "systemClock");
        this.F0 = f0;
    }
    
    public aef(final Object f0) {
        this.F0 = f0;
    }
    
    public aef(final l3d f0) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
    }
    
    public static aef k() {
        synchronized (aef.class) {
            if (aef.G0 == null) {
                aef.G0 = new aef(0);
                afs.a((Class)aef.class);
            }
            return aef.G0;
        }
    }
    
    public final void J(final String s, final Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            ((ahz)this.F0).m("auto", "_err", bundle);
            return;
        }
        Objects.requireNonNull(this.F0);
        m9z.k();
        throw null;
    }
    
    public final yz5 a() {
        return (yz5)i06.F0;
    }
    
    public final void accept(final Object o, Object s) {
        final ies ies = (ies)this.F0;
        final a6y a6y = (a6y)o;
        final rcs rcs = (rcs)s;
        final i5y i5y = (i5y)a6y.D();
        s = ((s1y)i5y).s();
        final int a = u3y.a;
        if (ies == null) {
            ((Parcel)s).writeInt(0);
        }
        else {
            ((Parcel)s).writeInt(1);
            ies.writeToParcel((Parcel)s, 0);
        }
        try {
            ((s1y)i5y).a.transact(1, (Parcel)s, (Parcel)null, 1);
            ((Parcel)s).recycle();
            rcs.b(null);
        }
        finally {
            ((Parcel)s).recycle();
        }
    }
    
    public final void b(final Object o) {
        final dly dly = (dly)this.F0;
        final List list = (List)o;
        final int a = dly.b.a();
        for (final File file : (ArrayList)dly.h()) {
            if (!list.contains(file.getName()) && dly.d(file, true) != a) {
                dly.j(file);
            }
        }
    }
    
    public final File c() {
        return ((vnp)this.F0).e;
    }
    
    public final void close() {
    }
    
    public final File d() {
        return ((vnp)this.F0).a;
    }
    
    public final File e() {
        return ((vnp)this.F0).b;
    }
    
    public final File f() {
        return ((vnp)this.F0).d;
    }
    
    public final File g() {
        return ((vnp)this.F0).f;
    }
    
    public final n3r h(final n3r n3r) {
        final m3r m3r = (m3r)this.F0;
        final int p = isa.p;
        if (n3r != null) {
            final int h = n3r.h();
            if (h != 0 && h != 5 && h != 6 && h != 7) {
                throw new SplitInstallException(-1);
            }
        }
        int n;
        if (n3r == null) {
            n = 1;
        }
        else {
            n = 1 + n3r.g();
        }
        return n3r.b(n, 1, 0, 0L, 0L, m3r.a, new ArrayList<String>());
    }
    
    public final File i() {
        return ((vnp)this.F0).c;
    }
    
    public final boolean isDone() {
        return true;
    }
    
    public final aef j(final m0k m0k) {
        ((List)this.F0).add(m0k);
        return this;
    }
    
    public final aef l(final float n) {
        this.j(new m0k.l(n));
        return this;
    }
    
    public final aef m(final float n, final float n2) {
        this.j(new m0k.e(n, n2));
        return this;
    }
    
    public final boolean n(final CharSequence charSequence, final cdk cdk) {
        final String g0 = cdk.G0;
        final int length = g0.length();
        boolean matches = false;
        if (length == 0) {
            return false;
        }
        final Matcher matcher = ((dbm)this.F0).a(g0).matcher(charSequence);
        if (matcher.lookingAt()) {
            matches = matcher.matches();
        }
        return matches;
    }
    
    public final dwg next() {
        return (dwg)this.F0;
    }
    
    public final aef o(final float n) {
        this.j((m0k)new m0k$r(n));
        return this;
    }
}
