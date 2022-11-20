import java.util.concurrent.Callable;
import com.twitter.ui.adapters.inject.ItemObjectGraph$b;
import com.twitter.app.database.collection.di.ErrorTimelineItemBinderObjectGraph$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w8a extends xmd<u8a>
{
    public final vav f;
    public final gwo g;
    public final nm6 h;
    public final xk0 i;
    public final qbu j;
    public final xkp k;
    
    public w8a(final ErrorTimelineItemBinderObjectGraph$b errorTimelineItemBinderObjectGraph$b, final vav f, final gwo g, final nm6 h, final xk0 i, final qbu j) {
        czd.f((Object)f, "timelineDatabaseHelper");
        czd.f((Object)g, "ioScheduler");
        czd.f((Object)h, "contentUriNotifier");
        czd.f((Object)i, "appConfig");
        czd.f((Object)j, "appPreferences");
        super((Class)u8a.class, (ItemObjectGraph$b)errorTimelineItemBinderObjectGraph$b, (qsb)new wmd(2131624417, false));
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = new xkp();
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final u8a u8a = (u8a)o;
        czd.f((Object)v7x, "viewHolder");
        czd.f((Object)u8a, "item");
        super.k(v7x, (Object)u8a, xbm);
        this.i.t();
        this.k.b(((eaq)new fbq((lcq)eaq.t((Callable)new v8a((Object)this, (Object)u8a, 0)).I(this.g), (lj6)new tg((qsb)new x8a(this), 11))).D());
        xbm.i((oj)new tm(this.k, 0));
    }
}
