import android.database.CursorWrapper;
import tv.periscope.android.api.PsUser;
import java.util.Iterator;
import java.util.List;
import android.database.Cursor;
import android.database.ContentObserver;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public class uuy
{
    public Object a = a;
    public Object b = b;
    public Object c = c;
    
    public i4e a(final uts uts, final int n) {
        return (i4e)new bld(uts, (s97<? extends nws>)this.a, n);
    }
    
    public final void b() {
        ((ni)this.c).b(0);
        ((ni)this.c).a((Context)this.a, (ocw)this.b);
    }
    
    public final void c() {
        ((ni)this.c).b(2);
        ((ni)this.c).a((Context)this.a, (ocw)this.b);
    }
    
    public final void d(final String s, final String s2, final long n, final String s3, final String s4, final long n2, final boolean b) {
        if (b && !((d9w)this.c).B(s, (String)null)) {
            ((eix)this.a).D(s, s2, n, s3, s4, n2);
        }
        else {
            ((eix)this.a).A(s);
        }
    }
    
    public final i4e e(kyr kyr, final int k0, final ContentObserver contentObserver, final int n, final pws pws) {
        kyr = (kyr)kyr.get();
        try {
            ((Cursor)kyr).getCount();
            if (contentObserver != null) {
                ((Cursor)kyr).registerContentObserver(contentObserver);
            }
            kyr = (kyr)new uts((Cursor)kyr);
            if (k0 >= 0) {
                ((uts)kyr).K0 = k0;
                if (pws != null) {
                    pws.a();
                }
                ((uts)kyr).a();
                if (pws != null) {
                    pws.b();
                }
                ((CursorWrapper)kyr).setNotificationUri((ContentResolver)this.c, (Uri)this.b);
                return this.a((uts)kyr, n);
            }
            throw new IllegalArgumentException("timelineItemLimit must be >= 0");
        }
        catch (final RuntimeException ex) {
            ((Cursor)kyr).close();
            throw ex;
        }
    }
    
    public final void f(final List list) {
        for (final tjt tjt : list) {
            final PsUser b = tjt.b;
            this.d(tjt.a, b.getProfileUrlSmall(), tjt.d, b.username(), b.displayName, tjt.c, tjt.e);
        }
        if (list.size() > 0) {
            ((eix)this.a).K(((p3f)this.b).e().a());
        }
        else {
            ((eix)this.a).p();
        }
    }
    
    public final void g() {
        final List b = ((p3f)this.b).b();
        for (final fp6 fp6 : b) {
            this.d(fp6.i(), fp6.E0, fp6.F0, fp6.C0, fp6.D0, fp6.G0, fp6.H0);
        }
        if (b.size() > 0) {
            ((eix)this.a).K(((p3f)this.b).e().a());
        }
        else {
            ((eix)this.a).p();
        }
    }
}
