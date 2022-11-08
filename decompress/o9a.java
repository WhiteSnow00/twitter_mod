import java.util.concurrent.Callable;
import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.app.database.collection.di.ErrorTimelineItemBinderObjectGraph$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o9a extends und<m9a>
{
    public final aav f;
    public final qvo g;
    public final hn6 h;
    public final cl0 i;
    public final xau j;
    public final gkp k;
    
    public o9a(final ErrorTimelineItemBinderObjectGraph$b errorTimelineItemBinderObjectGraph$b, final aav f, final qvo g, final hn6 h, final cl0 i, final xau j) {
        zzd.f((Object)f, "timelineDatabaseHelper");
        zzd.f((Object)g, "ioScheduler");
        zzd.f((Object)h, "contentUriNotifier");
        zzd.f((Object)i, "appConfig");
        zzd.f((Object)j, "appPreferences");
        super((Class)m9a.class, (ItemObjectGraph$b)errorTimelineItemBinderObjectGraph$b, (rtb)new tnd(2131624417, false));
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = new gkp();
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final m9a m9a = (m9a)o;
        zzd.f((Object)c7x, "viewHolder");
        zzd.f((Object)m9a, "item");
        super.k(c7x, (Object)m9a, ibm);
        this.i.t();
        this.k.b(((n9q)new oaq((ubq)n9q.t((Callable)new n9a(this, m9a, 0)).I(this.g), (fk6)new sna((rtb)new p9a(this), 11))).D());
        ibm.i((rj)new aq1((Object)this.k, 8));
    }
}
