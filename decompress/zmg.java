import android.database.CursorWrapper;
import java.util.concurrent.ScheduledFuture;
import android.database.Cursor;
import android.database.ContentObserver;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public class zmg implements uhj
{
    public final Object F0;
    public final Object G0;
    public Object H0;
    
    public zmg(final ContentResolver h0, final Uri g0, final ca7 f0) {
        this.H0 = h0;
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public zmg(final Context f0, final rpr g0, final yp h0) {
        e0e.f((Object)f0, "context");
        e0e.f((Object)g0, "subscriptionsFeatures");
        e0e.f((Object)h0, "adFreeArticlesDomainManager");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public zmg(final Object f0, final Object g0, final Object h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public zmg(final List h0) {
        this.H0 = h0;
        this.F0 = new ArrayList(h0.size());
        this.G0 = new ArrayList(h0.size());
        for (int i = 0; i < h0.size(); ++i) {
            ((List)this.F0).add(((ymg)h0.get(i)).b.g());
            ((List)this.G0).add(((ymg)h0.get(i)).c.g());
        }
    }
    
    public zmg(final kax g0, final mkx h0) {
        e0e.f((Object)g0, "viewModelCache");
        e0e.f((Object)h0, "weaverFactory");
        this.G0 = g0;
        this.H0 = h0;
        this.F0 = new ArrayList();
    }
    
    public zmg(final s0b[] array) {
        this.F0 = array[0];
        this.G0 = array[1];
        this.H0 = array[2];
    }
    
    public final void a(final UserIdentifier userIdentifier) {
        ((tsc)this.H0).f(new z47((Context)this.F0, (UserIdentifier)this.G0, userIdentifier.getId(), (gjl)null));
    }
    
    public p4e b(final evs evs, final int n) {
        return (p4e)new fld(evs, (ca7)this.F0, n);
    }
    
    public final void c(final UserIdentifier userIdentifier) {
        ((tsc)this.H0).f(new nt8((Context)this.F0, (UserIdentifier)this.G0, userIdentifier.getId(), (gjl)null));
    }
    
    public final p4e d(yzr yzr, final int n0, final ContentObserver contentObserver, final int n2, final xxs xxs) {
        yzr = (yzr)yzr.get();
        try {
            ((Cursor)yzr).getCount();
            if (contentObserver != null) {
                ((Cursor)yzr).registerContentObserver(contentObserver);
            }
            yzr = (yzr)new evs((Cursor)yzr);
            if (n0 >= 0) {
                ((evs)yzr).N0 = n0;
                if (xxs != null) {
                    xxs.a();
                }
                ((evs)yzr).a();
                if (xxs != null) {
                    xxs.b();
                }
                ((CursorWrapper)yzr).setNotificationUri((ContentResolver)this.H0, (Uri)this.G0);
                return this.b((evs)yzr, n2);
            }
            throw new IllegalArgumentException("timelineItemLimit must be >= 0");
        }
        catch (final RuntimeException ex) {
            ((Cursor)yzr).close();
            throw ex;
        }
    }
    
    public final void q(final mcs mcs) {
        final smo smo = (smo)this.F0;
        final String s = (String)this.G0;
        final ScheduledFuture scheduledFuture = (ScheduledFuture)this.H0;
        synchronized (smo.a) {
            smo.a.remove((Object)s);
            monitorexit(smo.a);
            scheduledFuture.cancel(false);
        }
    }
}
